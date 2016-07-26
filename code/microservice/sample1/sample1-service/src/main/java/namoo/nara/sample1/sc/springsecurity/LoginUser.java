package namoo.nara.sample1.sc.springsecurity;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import namoo.nara.sample1.entity.User;



public class LoginUser implements UserDetails {
    //
    /**  */
    private static final long serialVersionUID = -2595715921664866768L;

    private User user; 
    
    public LoginUser(User user) {
        //
        this.user=user;
    }
    
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        //
      //TODO
        return null;
    }

    @Override
    public String getPassword() {
        //
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        //
        return user.getName();
    }

    @Override
    public boolean isAccountNonExpired() {
        //
      //TODO
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        //
      //TODO
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        //
        //TODO
        return true;
    }

    @Override
    public boolean isEnabled() {
        //
      //TODO
        return true;
    }

    public User getUser() {
        return user;
    }
}
