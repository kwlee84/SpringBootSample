package namoo.nara.town.sc.springsecurity;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import namoo.nara.town.entity.User;

@Component
public class NaraUserDetailService implements UserDetailsService {
    //
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //
        //find user
        User user = new User();
        user.setName(username);
        user.setUsid("kwlee");
        user.setPassword("123123");
        
        return new LoginUser(user);
    }

}
