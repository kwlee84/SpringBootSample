package namoo.nara.da.mysql.document;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import namoo.nara.entity.User;

@Entity
public class UserDoc implements Serializable {

	@Id
	private String id;
    
	@Column(name = "name", nullable = false)
	private String name;
	
	@Column(name = "age")
	private Integer age;
	
	public UserDoc(){
		
	}
	
	public static UserDoc newInstance(User user) {
		UserDoc userDoc = new UserDoc();
		userDoc.setId(user.getId());
		userDoc.setName(user.getName());
		userDoc.setAge(user.getAge());
		
		return userDoc;
	}
	
	public User toDomain() {
		User user = new User();
		user.setId(id);
		user.setName(name);
		user.setAge(age);
		
		return user;
	}
	
	public static List<User> toDomains(List<UserDoc> userDocuments) {
        //
        return userDocuments.stream()
                .map(UserDoc::toDomain)
                .collect(Collectors.toList());
    }


	public String getId() {
        return id;
    }

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

    public void setId(String id) {
        this.id = id;
    }
}