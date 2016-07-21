package sk.test.domain.service;

import java.util.List;

import sk.test.domain.entity.User;

public interface UserService {
	
	public void create(User user);
	public void modify(User user);
	public User find(Long id);
	public void delete(Long id);
	List<User> findAll();

}
