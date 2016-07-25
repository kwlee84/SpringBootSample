package namoo.nara.service;

import java.util.List;

import namoo.nara.entity.User;

public interface UserService {
    //
	public void create(User user);

	public void modify(User user);

	public User find(String id);

	public void delete(Long id);

	List<User> findAll();

}
