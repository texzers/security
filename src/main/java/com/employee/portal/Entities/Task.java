package com.employee.portal.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name = "task")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    private String taskName;
    private String taskDesc;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name= "task_id")
    @JsonBackReference
    private Employee employee;

    public Task() {
    }

    public Task(String taskName, String taskDesc, Employee employee) {
        this.taskName = taskName;
        this.taskDesc = taskDesc;
        this.employee = employee;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDesc() {
        return taskDesc;
    }

    public void setTaskDesc(String taskDesc) {
        this.taskDesc = taskDesc;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
