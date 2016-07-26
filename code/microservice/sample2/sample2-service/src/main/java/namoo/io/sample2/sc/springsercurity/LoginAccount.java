package namoo.io.sample2.sc.springsercurity;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import namoo.io.entity.Account;

public class LoginAccount implements UserDetails {
    //
    private static final long serialVersionUID = -2595715921664866768L;

    private Account account; 
    
    public LoginAccount(Account account) {
        //
        this.account=account;
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
        return account.getPassword();
    }

    @Override
    public String getUsername() {
        //
        return account.getName();
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

    public Account getUser() {
        return account;
    }
}
