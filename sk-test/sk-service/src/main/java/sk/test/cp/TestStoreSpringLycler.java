package sk.test.cp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sk.test.domain.store.TestStoreLycler;
import sk.test.domain.store.UserStore;

@Component
public class TestStoreSpringLycler implements TestStoreLycler {

	@Autowired
	private UserStore userStore;
	
	@Override
	public UserStore requestUserStore() {
		return userStore;
	}
}
