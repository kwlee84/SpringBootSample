package namoo.nara.sample.sc.springsecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import namoo.nara.entity.User;
import namoo.nara.service.UserService;


@Component
public class SampleUserDetailService implements UserDetailsService {
    //
    @Autowired
    private UserService userService;
    
    @Override
    public UserDetails loadUserByUsername(String id) throws UsernameNotFoundException {
        //
        User user = userService.find(id);
        //TODO
        return new LoginUser(user);
    }

}
