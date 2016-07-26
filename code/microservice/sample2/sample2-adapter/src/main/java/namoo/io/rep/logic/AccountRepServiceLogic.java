package namoo.io.rep.logic;

import namoo.io.entity.Account;
import namoo.io.rep.AccountRepService;
import namoo.io.service.AccountService;
import namoo.io.service.Sample2ServiceLycler;

public class AccountRepServiceLogic implements AccountRepService {
	//
	private AccountService accountService;
	
	public AccountRepServiceLogic(Sample2ServiceLycler serviceLycler) {
		//
		accountService = serviceLycler.requestAccountService();
	}
	
	@Override
	public Account findAccount(String id) {
		//
		return accountService.find(id);
	}
}
