package sk.test.da.mysql.document;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class User implements Serializable {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
    
	@Column(name = "name", nullable = false)
	private String name;
	@Column(name = "name", nullable = false)
	private Integer age;

	public Long getId() {
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

	public void setId(Long id) {
		this.id = id;
	}

}