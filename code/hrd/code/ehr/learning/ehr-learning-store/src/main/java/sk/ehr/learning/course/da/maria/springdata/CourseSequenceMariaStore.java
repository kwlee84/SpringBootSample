package sk.ehr.learning.course.da.maria.springdata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import sk.ehr.learning.course.da.maria.springdata.document.sequence.CourseSequenceDoc;
import sk.ehr.learning.course.da.maria.springdata.repository.CourseSequenceMariaRepository;
import sk.ehr.learning.course.domain.entity.sequence.CourseDomain;
import sk.ehr.learning.course.domain.entity.sequence.CourseSequence;
import sk.ehr.learning.course.domain.store.sequence.CourseSequenceStore;

/**
 * Created by hjkwon@nextree.co.kr on 2016. 07. 27..
 */
@Repository
public class CourseSequenceMariaStore implements CourseSequenceStore{
	//
	@Autowired
	private CourseSequenceMariaRepository courseSequenceMariaRepository;
	
	@Override
	public void create(CourseSequence courseSequence) {
		//
		CourseSequenceDoc courseSequenceDoc = CourseSequenceDoc.newInstance(courseSequence);
		courseSequenceMariaRepository.save(courseSequenceDoc);
	}
	
	@Override
	public CourseSequence retrieve(CourseDomain courseDomain) {
		//
		CourseSequenceDoc courseSequenceDoc = courseSequenceMariaRepository.findOne(courseDomain);
		if(courseSequenceDoc == null) {
			return null;
		}
		
		return courseSequenceDoc.toDomain();
	}

	@Override
	public long retrieveNext(CourseDomain courseDomain) {
		//
		CourseSequenceDoc courseSequenceDoc = courseSequenceMariaRepository.findOne(courseDomain);
		
		if(courseSequenceDoc == null) {
			courseSequenceDoc = new CourseSequenceDoc();
			courseSequenceDoc.setCourseDomain(courseDomain);
			courseSequenceDoc.setSequence(0L);
			courseSequenceMariaRepository.save(courseSequenceDoc);
		}
		
		courseSequenceDoc.setSequence(courseSequenceDoc.increseSequence());
		courseSequenceMariaRepository.save(courseSequenceDoc);
		
		return courseSequenceDoc.getSequence();
	}
}
