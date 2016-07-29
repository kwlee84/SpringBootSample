package sk.ehr.learning.course.domain.store;

import sk.ehr.learning.course.domain.store.sequence.CourseSequenceStore;

/**
 * Created by hjkwon@nextree.co.kr on 2016. 07. 27..
 */
public interface CourseStoreLycler {
	//
	CourseSequenceStore requestCourseSequenceStore();
	CourseStore requestCourseStore();
}
