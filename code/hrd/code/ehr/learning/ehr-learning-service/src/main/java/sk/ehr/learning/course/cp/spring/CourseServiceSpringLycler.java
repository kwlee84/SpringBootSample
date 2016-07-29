package sk.ehr.learning.course.cp.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sk.ehr.learning.course.domain.service.CourseService;
import sk.ehr.learning.course.domain.service.CourseServiceLycler;

@Component
public class CourseServiceSpringLycler implements CourseServiceLycler {
	//
	@Autowired
	private CourseService courseService;
	
	@Override
	public CourseService requestCourseService() {
		//
		return courseService;
	}
	
}
