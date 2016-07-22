package namoo.nara.store;

import java.util.List;

import namoo.nara.entity.User;

public interface UserStore {

	public void create(User user);

	public User retrieve(String id);

	List<User> retrieveAll();
}
