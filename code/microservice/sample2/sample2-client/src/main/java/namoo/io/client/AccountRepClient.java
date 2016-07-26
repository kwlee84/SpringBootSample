package namoo.io.client;

import namoo.io.entity.Account;
import namoo.io.rep.AccountRepService;

public class AccountRepClient implements AccountRepService{
	// TODO client util 생성
	
	public AccountRepClient() {
		// TODO 주입
	}
	
	@Override
	public Account findAccount(String id) {
		// TODO client 객체를 통해 resource 요청
		return null;
	}

}
