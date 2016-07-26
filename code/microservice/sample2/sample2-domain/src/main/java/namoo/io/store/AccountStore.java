package namoo.io.store;

import java.util.List;

import namoo.io.entity.Account;

public interface AccountStore {
    //
	public void create(Account account);

	public Account retrieve(String id);

	List<Account> retrieveAll();
}
