package namoo.nara.sample1.cp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import namoo.nara.sample1.service.Sample1ServiceLycler;
import namoo.nara.sample1.service.UserService;


@Component
public class Sample1ServiceSpringLycler implements Sample1ServiceLycler {

	@Autowired
	private UserService userService;
	
	@Override
	public UserService requestUserService() {
		return userService;
	}

}
