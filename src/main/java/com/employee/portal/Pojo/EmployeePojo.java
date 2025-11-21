package com.employee.portal.Pojo;

import com.employee.portal.Entities.Address;
import com.employee.portal.Entities.Companies;
import com.employee.portal.Entities.Task;

import java.util.List;
import java.util.Set;


public class EmployeePojo {

    private String name;
    private String dop;
    private String mobile;
    private Address address;
    private List<Task> task;
    private Set<Companies> companies;

    public EmployeePojo(String name, String dop, String mobile, Address address, List<Task> task, Set<Companies> companies) {
        this.name = name;
        this.dop = dop;
        this.mobile = mobile;
        this.address = address;
        this.task = task;
        this.companies = companies;
    }

    public Set<Companies> getCompanies() {
        return companies;
    }

    public void setCompanies(Set<Companies> companies) {
        this.companies = companies;
    }

    public EmployeePojo() {
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


}
