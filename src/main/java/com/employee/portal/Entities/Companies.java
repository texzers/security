package com.employee.portal.Entities;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Companies {

    @Id
    private int Id;
    private String companyName;
    private String address;
    private String contact;

    @ManyToMany(mappedBy = "companies")
    private Set<Employee> employee = new HashSet<>();


    public Companies() {
    }

    public Companies(String companyName, String address, String contact, Set<Employee> employee) {
        this.companyName = companyName;
        this.address = address;
        this.contact = contact;
        this.employee = employee;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Companies(int id, String companyName, String address, String contact, Set<Employee> employee) {
        Id = id;
        this.companyName = companyName;
        this.address = address;
        this.contact = contact;
        this.employee = employee;
    }

    public Set<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(Set<Employee> employee) {
        this.employee = employee;
    }
}
