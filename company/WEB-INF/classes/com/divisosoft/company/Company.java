package com.divisosoft.company ;

public class Company
{
    private String name ;
    private String address;
    private String location;
    private int phone;
    private String ceoName;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public int getPhone() {
        return phone;
    }
    public void setPhone(int phone) {
        this.phone = phone;
    }
    public String getCeoName() {
        return ceoName;
    }
    public void setCeoName(String ceoName) {
        this.ceoName = ceoName;
    }
    @Override
    public String toString() {
        return "Company name = " + name + ", address = " + address + ", location = " + location + ", phone = " + phone
                + ", ceoName = " + ceoName ;
    }

}