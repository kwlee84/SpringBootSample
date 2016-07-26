package namoo.nara.sample1.cp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import namoo.nara.sample1.store.Sample1StoreLycler;
import namoo.nara.sample1.store.UserStore;


@Component
public class Sample1StoreSpringLycler implements Sample1StoreLycler {

	@Autowired
	private UserStore userStore;
	
	@Override
	public UserStore requestUserStore() {
		return userStore;
	}
}
