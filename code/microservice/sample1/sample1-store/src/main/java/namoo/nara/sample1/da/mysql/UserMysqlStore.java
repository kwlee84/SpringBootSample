package namoo.nara.sample1.da.mysql;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import namoo.nara.sample1.da.mysql.document.UserDoc;
import namoo.nara.sample1.da.mysql.springdata.UserRepository;
import namoo.nara.sample1.entity.User;
import namoo.nara.sample1.store.UserStore;


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
	public User retrieve(String id) {
		//
	    //TODO
		//return userRepository.findOne(id).toDomain();
	    return User.getExample();
	}

	@Override
	public List<User> retrieveAll() {
		
		return UserDoc.toDomains(userRepository.findAll());
	}
}
