package namoo.nara.town.sc.springsecurity;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import namoo.nara.town.entity.User;

public class LoginUser implements UserDetails {

    /**  */
    private static final long serialVersionUID = -2595715921664866768L;

    private User user; 
    
    @Autowired
    private PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
    
    public LoginUser(User user) {
        //
        this.user=user;
    }
    
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        //
        return null;
    }

    @Override
    public String getPassword() {
        //
        //return passwordEncoder.encode(user.getPassword());
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        //
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        //
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        //
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        //
        return true;
    }

    @Override
    public boolean isEnabled() {
        //
        return true;
    }

    public User getUser() {
        return user;
    }
}
