package namoo.nara.sample1.store;

import java.util.List;

import namoo.nara.sample1.entity.User;

public interface UserStore {
    //
	public void create(User user);

	public User retrieve(String id);

	List<User> retrieveAll();
}
