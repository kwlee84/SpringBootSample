package namoo.io.da.mysql;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import namoo.io.entity.Account;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = AccountMysqlStoreTest.class)
@EnableAutoConfiguration
@ComponentScan(basePackages = "namoo.io.da.mysql")
@DirtiesContext(classMode= DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
public class AccountMysqlStoreTest {
   //
	@Autowired
	private AccountMysqlStore userMysqlStore;

	@Test
	public void createTest() {
		Account account = new Account("9999", "hjkwon", new Integer(30));
		userMysqlStore.create(account);
	}

}
