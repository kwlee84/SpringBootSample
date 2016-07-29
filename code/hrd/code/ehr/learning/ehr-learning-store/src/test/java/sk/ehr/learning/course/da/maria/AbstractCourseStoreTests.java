package sk.ehr.learning.course.da.maria;

import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by hjkwon@nextree.co.kr on 2016. 07. 27..
 */
@RunWith(SpringJUnit4ClassRunner.class)
@EnableAutoConfiguration
@ComponentScan(basePackages = "sk.ehr.learning.course.da.maria.springdata")
//@ComponentScan(basePackages = "sk.ehr.learning.course.da.maria.mybatis")
@DirtiesContext(classMode= DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
public abstract class AbstractCourseStoreTests {
	//
	public abstract void setUp() throws Exception;
	public abstract void tearDown() throws Exception;
}
