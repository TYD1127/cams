package com.winsoar.cams.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;

/**
 * Created by echisan on 2018/6/23
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JwtUser implements UserDetails {

    private String account;
    private String username;
    private String password;
    private Collection<? extends GrantedAuthority> authorities;

    // 写一个能直接使用user创建jwtUser的构造器
    public JwtUser(User user) {
        account = user.getAccount();
        username = user.getUsername();
        password = user.getPassword();
        authorities = Collections.singleton(new SimpleGrantedAuthority("user"));
    }


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }


    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }



}
