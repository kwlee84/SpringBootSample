package namoo.io.da.mysql.document;

import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import namoo.io.entity.Account;

@Entity
@Table(name="account")
public class AccountDoc {

	@Id
	private String id;
    
	@Column(name = "name", nullable = false)
	private String name;
	
	@Column(name = "age")
	private Integer age;
	
	public AccountDoc(){
		
	}
	
	public static AccountDoc newInstance(Account account) {
		AccountDoc accountDoc = new AccountDoc();
		accountDoc.setId(account.getId());
		accountDoc.setName(account.getName());
		accountDoc.setAge(account.getAge());
		
		return accountDoc;
	}
	
	public Account toDomain() {
		Account account = new Account();
		account.setId(id);
		account.setName(name);
		account.setAge(age);
		
		return account;
	}
	
	public static List<Account> toDomains(List<AccountDoc> accountDocuments) {
        //
        return accountDocuments.stream()
                .map(AccountDoc::toDomain)
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