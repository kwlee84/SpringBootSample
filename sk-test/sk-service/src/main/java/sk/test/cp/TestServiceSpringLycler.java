package sk.test.cp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sk.test.domain.service.TestServiceLycler;
import sk.test.domain.service.UserService;

@Component
public class TestServiceSpringLycler implements TestServiceLycler {

	@Autowired
	private UserService userService;
	
	@Override
	public UserService requestUserService() {
		return userService;
	}

}
