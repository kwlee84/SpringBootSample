package namoo.io.logic;


import java.util.List;

import namoo.io.entity.Account;
import namoo.io.service.AccountService;
import namoo.io.store.AccountStore;
import namoo.io.store.Sample2StoreLycler;

public class AccountServiceLogic implements AccountService {
	//
	private AccountStore accountStore;
	
	public AccountServiceLogic(Sample2StoreLycler sampleStoreLycler){
		this.accountStore = sampleStoreLycler.requestAccountStore();
	}

	@Override
	public void create(Account account) {
	    //
		accountStore.create(account);
	}

	@Override
	public void modify(Account account) {
		// TODO Auto-generated method stub

	}

	@Override
	public Account find(String id) {
	    //
		return accountStore.retrieve(id);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Account> findAll() {
		// TODO Auto-generated method stub
		return accountStore.retrieveAll();
	}

}
