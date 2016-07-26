package namoo.io.sample2.cp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import namoo.io.service.AccountService;
import namoo.io.service.Sample2ServiceLycler;

@Component
public class Sample2ServiceSpringLycler implements Sample2ServiceLycler {

	@Autowired
	private AccountService accountService;
	
	@Override
	public AccountService requestAccountService() {
		return accountService;
	}

}
