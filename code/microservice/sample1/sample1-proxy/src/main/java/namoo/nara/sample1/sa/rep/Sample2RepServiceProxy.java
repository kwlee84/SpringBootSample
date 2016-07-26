package namoo.nara.sample1.sa.rep;

import namoo.io.entity.Account;
import namoo.io.rep.AccountRepService;
import namoo.nara.sample1.proxy.Sample2Proxy;

public class Sample2RepServiceProxy implements Sample2Proxy {
    //
    private AccountRepService accountRepService;
    
    public Sample2RepServiceProxy(AccountRepService accountRepService) {
        //
        this.accountRepService = accountRepService;
    }
    
    @Override
    public Account retrieveAccountByUserID(String usid) {
        //
        return accountRepService.findAccount(usid);
    }
}
