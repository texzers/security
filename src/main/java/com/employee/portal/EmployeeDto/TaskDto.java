package com.employee.portal.EmployeeDto;

public class TaskDto {
    private String taskName;
    private String taskDesc;

    public TaskDto(String taskName, String taskDesc) {
        this.taskName = taskName;
        this.taskDesc = taskDesc;
    }

    public TaskDto() {
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
}
