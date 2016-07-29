package sk.ehr.learning.course.sp.springweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sk.ehr.learning.course.domain.entity.Course;
import sk.ehr.learning.course.domain.service.CourseService;
import sk.ehr.learning.course.domain.service.CourseServiceLycler;

@RestController
@RequestMapping("course")
public class CourseResource {
	//
	private CourseService courseService;
	
	@Autowired
	public CourseResource(CourseServiceLycler serviceLycler) {
		//
		this.courseService = serviceLycler.requestCourseService();
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public void registerCourse(Course course) {
		//
		courseService.register(course);
	}
	
	@RequestMapping(value = "{usid}", method = RequestMethod.GET)
    public Course findCourse(
    		@PathVariable("usid") String usid
    		) {
        //
		Course course = courseService.find(usid);
        return course;
    }
	
	@RequestMapping(method = RequestMethod.PUT)
	public void modifyCourse(Course course) {
		//
		courseService.modify(course);
	}
	
	@RequestMapping(value = "{usid}", method = RequestMethod.DELETE)
	public void removeCourse(
			@PathVariable("usid") String usid
			) {
		//
		courseService.remove(usid);
	}
}
