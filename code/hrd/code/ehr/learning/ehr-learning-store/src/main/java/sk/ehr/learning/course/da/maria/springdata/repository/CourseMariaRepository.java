package sk.ehr.learning.course.da.maria.springdata.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import sk.ehr.learning.course.da.maria.springdata.document.CourseDoc;

/**
 * Created by hjkwon@nextree.co.kr on 2016. 07. 27..
 */
public interface CourseMariaRepository extends PagingAndSortingRepository<CourseDoc, String>{
	//
}
