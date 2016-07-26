package namoo.io.da.mysql;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import namoo.io.da.mysql.document.AccountDoc;
import namoo.io.da.mysql.springdata.AccountRepository;
import namoo.io.entity.Account;
import namoo.io.store.AccountStore;

@Repository
public class AccountMysqlStore implements AccountStore {

	@Autowired
	private AccountRepository accountRepository;

	@Override
	public void create(Account account) {
		AccountDoc accountDoc = AccountDoc.newInstance(account);
		accountRepository.save(accountDoc);
		
	}

	@Override
	public Account retrieve(String id) {
		//
	    //TODO
		//return userRepository.findOne(id).toDomain();
	    return Account.getExample();
	}

	@Override
	public List<Account> retrieveAll() {
		
		return AccountDoc.toDomains(accountRepository.findAll());
	}
}
