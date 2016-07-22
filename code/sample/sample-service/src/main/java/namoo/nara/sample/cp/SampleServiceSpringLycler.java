package namoo.nara.sample.cp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import namoo.nara.service.SampleServiceLycler;
import namoo.nara.service.UserService;

@Component
public class SampleServiceSpringLycler implements SampleServiceLycler {

	@Autowired
	private UserService userService;
	
	@Override
	public UserService requestUserService() {
		return userService;
	}

}
