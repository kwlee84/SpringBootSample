package namoo.io.service;

import java.util.List;

import namoo.io.entity.Account;

public interface AccountService {
    //
	public void create(Account account);

	public void modify(Account user);

	public Account find(String id);

	public void delete(Long id);

	List<Account> findAll();

}
