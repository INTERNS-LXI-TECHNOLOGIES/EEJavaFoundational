package com.lxi.yadhu.wktwo.employee.model;

public class Employee{

  private String employeeId; 
  private String firstName; 
  private String lastName; 
  private String email; 
  private String phoneNumber; 
  private String hireDate; 
  private String salary; 
  private String jobTitle; 
  private String department;
public Employee(String employeeId, String firstName, String lastName, String email, String phoneNumber, String hireDate,
        String salary, String jobTitle, String department) {
    this.employeeId = employeeId;
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.phoneNumber = phoneNumber;
    this.hireDate = hireDate;
    this.salary = salary;
    this.jobTitle = jobTitle;
    this.department = department;
}
public Employee() {
}
public String getEmployeeId() {
    return employeeId;
}
public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
}
public String getFirstName() {
    return firstName;
}
public void setFirstName(String firstName) {
    this.firstName = firstName;
}
public String getLastName() {
    return lastName;
}
public void setLastName(String lastName) {
    this.lastName = lastName;
}
public String getEmail() {
    return email;
}
public void setEmail(String email) {
    this.email = email;
}
public String getPhoneNumber() {
    return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
}
public String getHireDate() {
    return hireDate;
}
public void setHireDate(String hireDate) {
    this.hireDate = hireDate;
}
public String getSalary() {
    return salary;
}
public void setSalary(String salary) {
    this.salary = salary;
}
public String getJobTitle() {
    return jobTitle;
}
public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
}
public String getDepartment() {
    return department;
}
public void setDepartment(String department) {
    this.department = department;
}
@Override
public String toString() {
    return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
            + email + ", phoneNumber=" + phoneNumber + ", hireDate=" + hireDate + ", salary=" + salary + ", jobTitle="
            + jobTitle + ", department=" + department + "]";
}


  

}
