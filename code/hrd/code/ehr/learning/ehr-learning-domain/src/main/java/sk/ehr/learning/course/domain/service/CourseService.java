package sk.ehr.learning.course.domain.service;

import java.util.List;

import sk.ehr.learning.course.domain.entity.Course;

public interface CourseService {
	//
	void register(Course course);
	Course find(String usid);
	List<Course> findAll();
	void modify(Course course);
	void remove(String usid);
}
