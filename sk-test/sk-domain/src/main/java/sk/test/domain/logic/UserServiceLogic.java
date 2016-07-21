package sk.test.domain.logic;

import java.util.List;

import sk.test.domain.entity.User;
import sk.test.domain.service.UserService;
import sk.test.domain.store.TestStoreLycler;
import sk.test.domain.store.UserStore;

public class UserServiceLogic implements UserService {
	
	private UserStore userStore;
	
	public UserServiceLogic(TestStoreLycler testStoreLycler){
		this.userStore = testStoreLycler.requestUserStore();
	}

	@Override
	public void create(User user) {
		userStore.create(user);

	}

	@Override
	public void modify(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public User find(Long id) {
		return userStore.retrieve(id);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userStore.retrieveAll();
	}

}
