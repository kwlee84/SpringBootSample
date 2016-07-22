package namoo.nara.sample.cp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import namoo.nara.store.SampleStoreLycler;
import namoo.nara.store.UserStore;

@Component
public class SampleStoreSpringLycler implements SampleStoreLycler {

	@Autowired
	private UserStore userStore;
	
	@Override
	public UserStore requestUserStore() {
		return userStore;
	}
}
