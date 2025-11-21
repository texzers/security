package com.employee.portal.Security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomUserDetailServices implements UserDetailsService {

    @Autowired
    AppUserRepo appUserRepo;

    private static Logger logger = LoggerFactory.getLogger( CustomUserDetailServices.class);

    @Override
    public UserDetails loadUserByUsername(String username) {
        logger.info("Reached load users");
        AppUser user = appUserRepo.findByUserName(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));

        return new CustomUserDetails(
                user.getUserName(),
                user.getPassword(),
                user.getRole()
        );
    }

    public String addUser(AppUserPojo appUserPojo) {
        AppUser appUser = new AppUser(appUserPojo.getUserName(),appUserPojo.getPassword(),appUserPojo.getRole());
        appUserRepo.save(appUser);
        return "user is created";
    }
}

