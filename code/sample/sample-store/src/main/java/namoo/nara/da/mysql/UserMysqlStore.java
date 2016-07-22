package namoo.nara.da.mysql;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import namoo.nara.da.mysql.document.UserDoc;
import namoo.nara.da.mysql.springdata.UserRepository;
import namoo.nara.entity.User;
import namoo.nara.store.UserStore;

@Repository
public class UserMysqlStore implements UserStore {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void create(User user) {
		UserDoc userDoc = UserDoc.newInstance(user);
		userRepository.save(userDoc);
		
	}

	@Override
	public User retrieve(Long id) {
		// TODO Auto-generated method stub
		return userRepository.findOne(id).toDomain();
	}

	@Override
	public List<User> retrieveAll() {
		
		return UserDoc.toDomains(userRepository.findAll());
	}
}
