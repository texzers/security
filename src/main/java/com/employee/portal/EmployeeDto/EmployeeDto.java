package com.employee.portal.EmployeeDto;

import com.employee.portal.Entities.Address;
import com.employee.portal.Entities.Companies;
import com.employee.portal.Entities.Task;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EmployeeDto {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;
    private String name;
    private String dop;
    private String mobile;
    private Address address;
    private List<TaskDto> task;
    private Set<CompaniesDto> companies = new HashSet<>();

    public EmployeeDto(int id, String name, String dop, String mobile, Address address, List<TaskDto> task, Set<CompaniesDto> companies) {
        this.id = id;
        this.name = name;
        this.dop = dop;
        this.mobile = mobile;
        this.address = address;
        this.task = task;
        this.companies = companies;
    }

    public EmployeeDto() {
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

    public List<TaskDto> getTask() {
        return task;
    }

    public void setTask(List<TaskDto> task) {
        this.task = task;
    }

    public Set<CompaniesDto> getCompanies() {
        return companies;
    }

    public void setCompanies(Set<CompaniesDto> companies) {
        this.companies = companies;
    }
}
