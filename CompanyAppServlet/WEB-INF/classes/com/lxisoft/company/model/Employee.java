package com.lxisoft.company.model;

public class Employee
{
private String name;
private String id;
private String age;
private String phoneNumber;
private String address;

public Employee()
{}

public Employee(String name,String id, String age,String phoneNumber,String address)
{
    this.name = name;
    this.id = id;
    this.age = age;
    this.phoneNumber = phoneNumber;
    this.address = address;
}

public void setName(String name)
{
this.name = name;
}

public String getName()
{
return name;
}

public void setId(String id)
{
this.id = id;
}

public String getId()
{
    return id;
}

public void setAge(String age)
{
this.age = age;
}

public String getAge()
{
    return age;
}

public void setPhoneNumber(String phoneNumber)
{
this.phoneNumber = phoneNumber;
}


public String getPhoneNumber()
{
    return phoneNumber;
}

public void setAddress(String address)
{
this.address = address;
}

public String getAddress()
{
    return address;
}

}