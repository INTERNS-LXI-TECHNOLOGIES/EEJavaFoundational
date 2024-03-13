package com.divisosoft.version2;

public class Company
{
    private String name;
    private String address;
    private String location;
    private long phone;
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
    public long getPhone() {
        return phone;
    }
    public void setPhone(long phone) {
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
        return "Company [name=" + name + ", address=" + address + ", location=" + location + ", phone=" + phone
                + ", ceoName=" + ceoName + "]";
    }

    
}