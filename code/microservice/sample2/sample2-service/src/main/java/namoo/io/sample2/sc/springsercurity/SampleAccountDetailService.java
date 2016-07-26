package namoo.io.sample2.sc.springsercurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import namoo.io.entity.Account;
import namoo.io.service.AccountService;


@Component
public class SampleAccountDetailService implements UserDetailsService {
    //
    @Autowired
    private AccountService accountService;
    
    @Override
    public UserDetails loadUserByUsername(String id) throws UsernameNotFoundException {
        //
        Account account = accountService.find(id);
        //TODO
        return new LoginAccount(account);
    }

}
