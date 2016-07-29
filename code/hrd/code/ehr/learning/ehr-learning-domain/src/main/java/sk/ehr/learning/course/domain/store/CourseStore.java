package sk.ehr.learning.course.domain.store;

import java.util.List;

import sk.ehr.learning.course.domain.entity.Course;

/**
 * Created by hjkwon@nextree.co.kr on 2016. 07. 27..
 */
public interface CourseStore {
	//
	void create(Course course);
	Course retrieve(String usid);
	List<Course> retrieveAll();
	void update(Course course);
	void delete(String usid);
}
