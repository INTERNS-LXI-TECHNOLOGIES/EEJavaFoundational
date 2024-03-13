package com.lxisoft.company;
public class Company {
    private String name;
    private String ceo;
    private String address;
    private String number;
    private String noOfEmployees;

    public Company(String name, String ceo, String address, String number, String noOfEmployees) {
        this.name = name;
        this.ceo = ceo;
        this.address = address;
        this.number = number;
        this.noOfEmployees = noOfEmployees;
    }
    public Company(){};

    public void setName(String a) {
        this.name = a;
    }

    public String getName() {
        return name;
    }

    public void setCeo(String b) {
        this.ceo = b;
    }

    public String getCeo() {
        return ceo;
    }

    public void setAddress(String c) {
        this.address = c;
    }

    public String getAddress() {
        return address;
    }

    public void setNumber(String d) {
        this.number = d;
    }

    public String getNumber() {
        return number;
    }

    public void setNoOfEmployes(String e) {
        this.noOfEmployees = e;
    }

    public String getNoOfEmployees() {return noOfEmployees;}

    public String toString() {
        String toString = "";
        toString = name + "";
        toString = ceo + "";
        toString = address + "";
        toString = number + "";
        toString = noOfEmployees + "";

        return toString;
    }
}