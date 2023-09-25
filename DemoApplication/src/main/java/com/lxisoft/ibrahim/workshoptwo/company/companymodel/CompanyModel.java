package com.lxisoft.ibrahim.workshoptwo.company.companymodel;

public class CompanyModel{ 
private String company_name ;
private long employee_count ;
private String location ;
private String ceo_name;
private long phone_number;

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public long getEmployee_count() {
        return employee_count;
    }

    public void setEmployee_count(long employee_count) {
        this.employee_count = employee_count;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCeo_name() {
        return ceo_name;
    }

    public void setCeo_name(String ceo_name) {
        this.ceo_name = ceo_name;
    }

    public long getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(long phone_number) {
        this.phone_number = phone_number;
    }
}