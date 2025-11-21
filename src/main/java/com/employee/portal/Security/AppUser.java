package com.employee.portal.Security;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name="app_user")
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    @Column(name = "user_name", length = 250)
    @NotNull
    private String userName;
    @Column(name="password", length = 250)
    @NotNull
    private String password;
    @Column(name="role")
    @NotNull
    private String Role;

    public AppUser() {
    }

    public AppUser(String userName, String password, String role) {
        this.userName = userName;
        this.password = password;
        Role = role;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
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
