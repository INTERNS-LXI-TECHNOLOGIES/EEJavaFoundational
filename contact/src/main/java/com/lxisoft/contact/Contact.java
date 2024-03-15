package com.lxisoft.contact;
public class Contact
{
private String name;
private long contactNumber;

public void setName(String name)
{
    this.name = name;
}

public String getName()
{
    return name;
}

public void setContactNumber(long contactNumber)
{
    this.contactNumber = contactNumber;
}

public long getContactNumber()
{
    return contactNumber;
}

public String toString()
{
    String toString = name+""+contactNumber;
    return toString;
}
}
