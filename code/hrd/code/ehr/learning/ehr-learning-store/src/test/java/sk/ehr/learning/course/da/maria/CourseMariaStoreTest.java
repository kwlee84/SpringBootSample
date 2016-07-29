package sk.ehr.learning.course.da.maria;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DatabaseOperation;
import com.github.springtestdbunit.annotation.DatabaseSetup;

import sk.ehr.learning.course.domain.entity.Course;
import sk.ehr.learning.course.domain.entity.sequence.CourseDomain;
import sk.ehr.learning.course.domain.store.CourseStore;
import sk.ehr.learning.course.domain.store.sequence.CourseSequenceStore;

/**
 * Created by hjkwon@nextree.co.kr on 2016. 07. 27..
 */
@SpringApplicationConfiguration(classes = CourseMariaStoreTest.class)
@TestExecutionListeners({DependencyInjectionTestExecutionListener.class,
    DirtiesContextTestExecutionListener.class,
    TransactionalTestExecutionListener.class,
    DbUnitTestExecutionListener.class})
@DatabaseSetup(value = "/dataSet/course.xml",  type = DatabaseOperation.CLEAN_INSERT)
public class CourseMariaStoreTest extends AbstractCourseStoreTests{
	//
	@Autowired
	private CourseStore courseStore;
	
	@Autowired
	private CourseSequenceStore courseSequenceStore;
	
	@Before
	@Override
	public void setUp() throws Exception {
		//
	}

	@After
	@Override
	public void tearDown() throws Exception {
		//
	}
	
	@Test
	public void createTest() {
		//
		long usid = courseSequenceStore.retrieveNext(CourseDomain.Course);
		
		Course course = new Course("java script 기초", 50.0, "KOSTA");
		course.setStartDay("2016.05.07");
		course.setEndDay("2016.05.12");
		String createUsid = String.format(course.getIdFormat(), CourseDomain.Course.code(), usid);
		course.setUsid(createUsid);
		
		courseStore.create(course);
		
		Course createCourse = courseStore.retrieve(createUsid);
		assertNotNull(createCourse);
	}
	
	@Test
	public void retrieveTest() {
		//
		String usid = "CS0002";
		Course resultCourse = courseStore.retrieve(usid);
		
		assertNotNull(resultCourse);
	}
	
	@Test
	public void retrieveAllTest() {
		//
		List<Course> resultCourses = courseStore.retrieveAll();
		
		assertEquals(3, resultCourses.size());
	}
	
	@Test
	public void updateTest() {
		//
		String usid = "CS0003";
		Course updateCourse = courseStore.retrieve(usid);
		
		String updateTitle = "CI/CD 구축";
		updateCourse.setTitle(updateTitle);
		
		courseStore.update(updateCourse);
		Course updateResultCourse = courseStore.retrieve(usid);
		
		assertEquals(updateTitle, updateResultCourse.getTitle());
	}
	
	@Test
	public void deleteTest() {
		//
		String deleteUsid = "CS0003";
		courseStore.delete(deleteUsid);

		Course deleteCourse = courseStore.retrieve(deleteUsid);
		
		assertNull(deleteCourse);
	}
}
