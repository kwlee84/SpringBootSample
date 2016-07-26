package namoo.nara.sample1.da.mysql;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import namoo.nara.sample1.entity.User;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = UserMysqlStoreTest.class)
@EnableAutoConfiguration
@ComponentScan(basePackages = "namoo.nara.sample1.da.mysql")
@DirtiesContext(classMode= DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
public class UserMysqlStoreTest {
    //
	@Autowired
	private UserMysqlStore userMysqlStore;

	@Test
	public void createTest() {
		User user = new User("9999", "hjkwon", new Integer(30));
		userMysqlStore.create(user);
	}

}
