package sk.ehr.learning.course.da.maria.springdata;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import sk.ehr.learning.course.da.maria.springdata.document.CourseDoc;
import sk.ehr.learning.course.da.maria.springdata.repository.CourseMariaRepository;
import sk.ehr.learning.course.domain.entity.Course;
import sk.ehr.learning.course.domain.store.CourseStore;

/**
 * Created by hjkwon@nextree.co.kr on 2016. 07. 27..
 */
@Repository
public class CourseMariaStore implements CourseStore {
	//
	@Autowired
	private CourseMariaRepository courseMariaRepository;

	@Override
	public void create(Course course) {
		//
		CourseDoc courseDoc = CourseDoc.newInstance(course);
		courseMariaRepository.save(courseDoc);
	}

	@Override
	public Course retrieve(String usid) {
		//
		CourseDoc courseDoc = courseMariaRepository.findOne(usid);
		if(courseDoc == null) {
			return null;
		}
		return courseDoc.toDomain();
	}

	@Override
	public List<Course> retrieveAll() {
		//
		List<CourseDoc> courseDocs = (List<CourseDoc>) courseMariaRepository.findAll();
		if (courseDocs == null) {
			return null;
		}

		List<Course> courses = new ArrayList<>(courseDocs.size());
		for (CourseDoc courseDoc : courseDocs) {
			courses.add(courseDoc.toDomain());
		}

		return courses;
	}

	@Override
	public void update(Course course) {
		//
		CourseDoc courseDoc = CourseDoc.newInstance(course);
		courseMariaRepository.save(courseDoc);
	}

	@Override
	public void delete(String usid) {
		//
		courseMariaRepository.delete(usid);
	}
}
