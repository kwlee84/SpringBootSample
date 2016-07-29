package sk.ehr.learning.course.da.maria.springdata.repository;

import org.springframework.data.repository.CrudRepository;

import sk.ehr.learning.course.da.maria.springdata.document.sequence.CourseSequenceDoc;
import sk.ehr.learning.course.domain.entity.sequence.CourseDomain;

/**
 * Created by hjkwon@nextree.co.kr on 2016. 07. 27..
 */
public interface CourseSequenceMariaRepository extends CrudRepository<CourseSequenceDoc, CourseDomain>{
	//
}
