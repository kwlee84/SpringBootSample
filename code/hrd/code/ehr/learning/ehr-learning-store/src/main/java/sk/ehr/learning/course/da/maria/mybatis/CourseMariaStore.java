package sk.ehr.learning.course.da.maria.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import sk.ehr.learning.course.da.maria.mybatis.mapper.CourseMapper;
import sk.ehr.learning.course.domain.entity.Course;
import sk.ehr.learning.course.domain.store.CourseStore;

/**
 * Created by kwlee@nextree.co.kr on 2016. 07. 28..
 */
//@Repository
public class CourseMariaStore implements CourseStore {
	//
	@Autowired
	private CourseMapper courseMapper;
	
	@Override
	public void create(Course course) {
		//
		courseMapper.insertCourse(course);
	}

	@Override
	public Course retrieve(String usid) {
		//
		return courseMapper.selectCourse(usid);
	}

	@Override
	public List<Course> retrieveAll() {
		//
		return courseMapper.selectAllCourses();
	}

	@Override
	public void update(Course course) {
		//
		courseMapper.updateCourse(course);
	}

	@Override
	public void delete(String usid) {
		//
		courseMapper.deleteCourse(usid);
	}
	//
}
