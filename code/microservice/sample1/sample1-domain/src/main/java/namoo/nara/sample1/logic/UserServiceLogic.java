package namoo.nara.sample1.logic;


import java.util.List;

import namoo.io.entity.Account;
import namoo.nara.sample1.entity.User;
import namoo.nara.sample1.proxy.Sample1ProxyLycler;
import namoo.nara.sample1.proxy.Sample2Proxy;
import namoo.nara.sample1.service.UserService;
import namoo.nara.sample1.store.Sample1StoreLycler;
import namoo.nara.sample1.store.UserStore;

public class UserServiceLogic implements UserService {
	//
	private UserStore userStore;
	private Sample2Proxy sample2Proxy;
	
	public UserServiceLogic(
	        Sample1StoreLycler sample1StoreLycler,
	        Sample1ProxyLycler sample1ProxyLycler
	        ){
		this.userStore = sample1StoreLycler.requestUserStore();
		this.sample2Proxy = sample1ProxyLycler.requestSample2Proxy();
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
	    Account account = sample2Proxy.retrieveAccountByUserID(id);
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
