package sk.ehr.learning.course.cp.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sk.ehr.learning.course.domain.store.CourseStore;
import sk.ehr.learning.course.domain.store.CourseStoreLycler;
import sk.ehr.learning.course.domain.store.sequence.CourseSequenceStore;

@Component
public class CourseStoreSpringLycler implements CourseStoreLycler {
	//
	@Autowired
	private CourseStore courseStore;
	@Autowired
	private CourseSequenceStore courseSequenceStore;
	
	@Override
	public CourseStore requestCourseStore() {
		//
		return courseStore;
	}

	@Override
	public CourseSequenceStore requestCourseSequenceStore() {
		//
		return courseSequenceStore;
	}

}
