package sk.ehr.learning.course.cp.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Propagation;

import sk.ehr.learning.course.domain.logic.CourseServiceLogic;
import sk.ehr.learning.course.domain.store.CourseStoreLycler;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class CourseSpringService extends CourseServiceLogic {
	//
	@Autowired
	public CourseSpringService(CourseStoreLycler storeLycler) {
		super(storeLycler);
	}
}
