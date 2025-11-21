package com.employee.portal.Security;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;

public class AppUserPojo
{
    private String userName;
    private String password;

    private String Role;

    public AppUserPojo(String userName, String password, String role) {
        this.userName = userName;
        this.password = password;
        Role = role;
    }

    public AppUserPojo() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }
}
