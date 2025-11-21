package com.employee.portal.Security;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AppUserRepo extends JpaRepository<AppUser,Integer> {
    Optional<AppUser> findByUserName(String userName);
}

