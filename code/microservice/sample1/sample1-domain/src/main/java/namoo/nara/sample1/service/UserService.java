package namoo.nara.sample1.service;

import java.util.List;

import namoo.nara.sample1.entity.User;

public interface UserService {
    //
	public void create(User user);

	public void modify(User user);

	public User find(String id);

	public void delete(Long id);

	List<User> findAll();

}
