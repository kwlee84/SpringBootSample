package namoo.nara.sample1.entity;

public class User {
    //
	private String id;
	private String name;
	private String password;
	private Integer age;
	
	public User() {
		
	}
	public User(String id, String name, Integer age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public static User getExample() {
	    //
	    User user = new User();
	    user.setId("kwlee");
	    user.setName("이기왕");
	    user.setAge(33);
	    user.setPassword("123");
	    return user;
	}
	
	public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
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
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
	
	
	
}
