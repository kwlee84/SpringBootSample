package namoo.io.da.mysql;

import javax.sql.DataSource;

import org.dbunit.IDatabaseTester;
import org.h2.jdbcx.JdbcDataSource;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = AccountMysqlStoreTest.class)
@EnableAutoConfiguration
@ComponentScan(basePackages = "namoo.io.da.mysql")
@DirtiesContext(classMode= DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
public abstract class AbstractSample2StoreTests {
	//
	protected IDatabaseTester iDatabaseTester;
	protected static DataSource dataSource;
	
	public abstract void setUp() throws Exception;
	public abstract void tearDown() throws Exception;
	
	protected static DataSource getDataSources() {
		//
		if(dataSource == null) {
			JdbcDataSource jdbcDataSource = new JdbcDataSource();
			jdbcDataSource.setUrl("jdbc:h2:mem:test;MODE=MYSQL");
			jdbcDataSource.setUser("sa");
			
			dataSource = jdbcDataSource;
		}
		
		return dataSource;
	}
}
