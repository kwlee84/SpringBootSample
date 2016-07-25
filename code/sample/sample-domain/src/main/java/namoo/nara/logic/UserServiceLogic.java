package namoo.nara.logic;


import java.util.List;

import namoo.nara.entity.User;
import namoo.nara.service.UserService;
import namoo.nara.store.SampleStoreLycler;
import namoo.nara.store.UserStore;

public class UserServiceLogic implements UserService {
	//
	private UserStore userStore;
	
	public UserServiceLogic(SampleStoreLycler sampleStoreLycler){
		this.userStore = sampleStoreLycler.requestUserStore();
	}

	@Override
	public void create(User user) {
	    //
		userStore.create(user);
	}

	@Override
	public void modify(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public User find(String id) {
	    //
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
