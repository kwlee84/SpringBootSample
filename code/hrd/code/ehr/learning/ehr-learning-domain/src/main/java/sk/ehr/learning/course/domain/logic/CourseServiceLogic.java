package sk.ehr.learning.course.domain.logic;

import java.util.List;

import sk.ehr.learning.course.domain.entity.Course;
import sk.ehr.learning.course.domain.entity.sequence.CourseDomain;
import sk.ehr.learning.course.domain.service.CourseService;
import sk.ehr.learning.course.domain.store.CourseStore;
import sk.ehr.learning.course.domain.store.CourseStoreLycler;
import sk.ehr.learning.course.domain.store.sequence.CourseSequenceStore;

public class CourseServiceLogic implements CourseService {
	//
	private CourseStore courseStore;
	
	private CourseSequenceStore courseSequenceStore;
	
	public CourseServiceLogic(CourseStoreLycler storeLycler) {
		//
		this.courseStore = storeLycler.requestCourseStore();
		this.courseSequenceStore = storeLycler.requestCourseSequenceStore();
	}
	
	@Override
	public void register(Course course) {
		//
		long seq = courseSequenceStore.retrieveNext(CourseDomain.Course);
		String usid = String.format(course.getIdFormat(), CourseDomain.Course.code(), seq);
		course.setUsid(usid);
		courseStore.create(course);
	}

	@Override
	public Course find(String usid) {
		//
		return courseStore.retrieve(usid);
	}

	@Override
	public List<Course> findAll() {
		//
		return courseStore.retrieveAll();
	}
	
	@Override
	public void modify(Course course) {
		//
		courseStore.update(course);
	}

	@Override
	public void remove(String usid) {
		//
		courseStore.delete(usid);
	}
}
