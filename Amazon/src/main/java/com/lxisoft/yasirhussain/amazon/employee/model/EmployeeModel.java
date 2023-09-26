package com.lxisoft.yasirhussain.amazon.employee.model;

public class EmployeeModel {
    private String employeeId;
    private String department;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public EmployeeModel() {
    }

    @Override
    public String toString() {
        return "EmployeeModel" + employeeId + "Department" + department + "";
    }
}