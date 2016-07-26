package namoo.io.sample2.cp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import namoo.io.store.AccountStore;
import namoo.io.store.Sample2StoreLycler;

@Component
public class Sample2StoreSpringLycler implements Sample2StoreLycler {

	@Autowired
	private AccountStore accountStore;
	
	@Override
	public AccountStore requestAccountStore() {
		return accountStore;
	}
}
