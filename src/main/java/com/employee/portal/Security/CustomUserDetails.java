package com.employee.portal.Security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@Component
public class CustomUserDetails implements UserDetails {

    private String userName;
    private String password;
    private List<GrantedAuthority> roles;   // FIXED name

    public CustomUserDetails() {
    }

    public CustomUserDetails(String userName, String password, String role) {
        this.userName = userName;
        this.password = password;
        this.roles = Arrays.stream(role.split(","))
                .map(String::trim)
                .map(SimpleGrantedAuthority::new)
                .map(auth -> (GrantedAuthority) auth)   // important conversion
                .toList();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return roles;   // MUST return roles
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return userName;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;   // safer defaults
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
