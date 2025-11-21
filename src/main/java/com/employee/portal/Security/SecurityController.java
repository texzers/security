package com.employee.portal.Security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/security")
public class SecurityController {

    @Autowired
    private CustomUserDetailServices customUserDetailServices;

    @PostMapping
    public ResponseEntity<?> addUser(@RequestBody AppUserPojo appPojo){
        System.out.println("Security Controller");
        return ResponseEntity.ok(customUserDetailServices.addUser(appPojo));

    }
}
