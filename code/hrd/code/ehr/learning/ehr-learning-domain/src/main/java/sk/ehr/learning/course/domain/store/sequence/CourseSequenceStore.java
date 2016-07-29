package sk.ehr.learning.course.domain.store.sequence;

import sk.ehr.learning.course.domain.entity.sequence.CourseDomain;
import sk.ehr.learning.course.domain.entity.sequence.CourseSequence;

/**
 * Created by hjkwon@nextree.co.kr on 2016. 07. 27..
 */
public interface CourseSequenceStore {
	//
	void create(CourseSequence courseSequence);
	CourseSequence retrieve(CourseDomain courseDomain);
	long retrieveNext(CourseDomain courseDomain);
}
