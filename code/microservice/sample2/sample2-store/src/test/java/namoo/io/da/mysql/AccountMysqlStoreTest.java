package namoo.io.da.mysql;

import java.io.InputStream;

import org.dbunit.DataSourceDatabaseTester;
import org.dbunit.JdbcDatabaseTester;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.dbunit.operation.DatabaseOperation;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import namoo.io.entity.Account;

public class AccountMysqlStoreTest extends AbstractSample2StoreTests{
	//
	@Autowired
	private AccountMysqlStore userMysqlStore;
	
	@Before
	@Override
	public void setUp() throws Exception{
		iDatabaseTester = new DataSourceDatabaseTester(this.getDataSources());
		
		InputStream is = AccountMysqlStoreTest.class.getResourceAsStream("/dataSet/account.xml");
		IDataSet iDataSet = new FlatXmlDataSetBuilder().build(is);
		
		iDatabaseTester.setDataSet(iDataSet);
		iDatabaseTester.setSetUpOperation(DatabaseOperation.CLEAN_INSERT);
		iDatabaseTester.setTearDownOperation(DatabaseOperation.DELETE_ALL);
		
		iDatabaseTester.onSetup();
	}

	@After
	@Override
	public void tearDown() throws Exception{
		iDatabaseTester.onTearDown();
	}

	@Test
	public void createTest() {
		Account account = new Account("9999", "hjkwon", new Integer(30));
		userMysqlStore.create(account);
	}
	
	@Test
	public void findTest() {
		
	}
}
