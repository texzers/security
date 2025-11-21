package com.employee.portal.Entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Employee {

    @Id
    @GeneratedValue
    private int id;
    @NotNull
    private String name;
    @NotNull
    private String dop;
    private String mobile;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id" )
    private Address address;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Task> task;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "companies_list", joinColumns = @JoinColumn(name = "emp_id"),
     inverseJoinColumns = @JoinColumn(name="company_id"))
    private Set<Companies> companies = new HashSet<>();

    public Employee() {
    }

    public Employee(String name, String dop, String mobile, Address address, List<Task> task, Set<Companies> companies) {
        this.name = name;
        this.dop = dop;
        this.mobile = mobile;
        this.address = address;
        this.task = task;
        this.companies = companies;
    }

    public Employee(int id, String name, String dop, String mobile, Address address, List<Task> task, Set<Companies> companies) {
        this.id = id;
        this.name = name;
        this.dop = dop;
        this.mobile = mobile;
        this.address = address;
        this.task = task;
        this.companies = companies;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDop() {
        return dop;
    }

    public void setDop(String dop) {
        this.dop = dop;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Task> getTask() {
        return task;
    }

    public void setTask(List<Task> task) {
        this.task = task;
    }

    public Set<Companies> getCompanies() {
        return companies;
    }

    public void setCompanies(Set<Companies> companies) {
        this.companies = companies;
    }
}
