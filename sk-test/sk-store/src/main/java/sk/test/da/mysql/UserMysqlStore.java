package sk.test.da.mysql;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import sk.test.da.mysql.springdata.UserRepository;
import sk.test.domain.entity.User;
import sk.test.domain.store.UserStore;

@Repository
public class UserMysqlStore implements UserStore {

	@Autowired
	private UserRepository userRepository;
	@Override
	public void create(User user) {
		userRepository.save(user);
	}

	@Override
	public User retrieve(Long id) {
		return userRepository.findOne(id);
	}

	@Override
	public List<User> retrieveAll() {
		return userRepository.findAll();
	}
}
