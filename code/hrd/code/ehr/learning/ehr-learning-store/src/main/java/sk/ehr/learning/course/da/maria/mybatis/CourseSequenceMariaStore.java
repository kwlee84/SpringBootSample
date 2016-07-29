package sk.ehr.learning.course.da.maria.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import sk.ehr.learning.course.da.maria.mybatis.mapper.CourseSequenceMapper;
import sk.ehr.learning.course.domain.entity.sequence.CourseDomain;
import sk.ehr.learning.course.domain.entity.sequence.CourseSequence;
import sk.ehr.learning.course.domain.store.sequence.CourseSequenceStore;

/**
 * Created by hjkwon@nextree.co.kr on 2016. 07. 27..
 */
//@Repository
public class CourseSequenceMariaStore implements CourseSequenceStore {
	//
	@Autowired
	private CourseSequenceMapper courseSequenceMapper;
	
	@Override
	public void create(CourseSequence courseSequence) {
		//
		courseSequenceMapper.insertCourseSequence(courseSequence);
	}

	@Override
	public CourseSequence retrieve(CourseDomain courseDomain) {
		//
		return courseSequenceMapper.selectCourseSequence(courseDomain);
	}

	@Override
	public long retrieveNext(CourseDomain courseDomain) {
		//
		CourseSequence courseSequence = courseSequenceMapper.selectCourseSequence(courseDomain);
		if(courseSequence == null) {
			courseSequence = new CourseSequence();
			courseSequence.setCourseDomain(courseDomain);
			courseSequence.setSequence(0L);
			courseSequenceMapper.insertCourseSequence(courseSequence);
		}
		courseSequence.setSequence(courseSequence.getSequence()+1);
		courseSequenceMapper.updateCourseSequence(courseSequence);;
		
		return courseSequence.getSequence();
	}
}
