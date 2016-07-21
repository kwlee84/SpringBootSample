package sk.test.domain.store;

import java.util.List;

import sk.test.domain.entity.User;

public interface UserStore {

	public void create(User user);
	public User retrieve(Long id);
	List<User> retrieveAll();
}
