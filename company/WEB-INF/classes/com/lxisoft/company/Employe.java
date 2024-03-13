package com.lxisoft.company;
public class Employe
{
private String name;
private String id;
private String number;
private String dob;
private String address;

    public void setName(String a)
    {
        this.name = a;
    }
    public String getName()
    {
        return name;
    }

    public void setId (String b)
    {
        this.id = b;
    }
    public String getId()
    {
        return id;
    }

    public void setNumber(String c)
    {
        this.number = c;
    }
    public String getNumber()
    {
        return number;
    }

    public void setDob(String d)
    {
        this.dob = d;
    }
    public String getDob()
    {
        return dob;
    }

    public void setAddress(String e)
    {
        this.address = e;
    }
    public String getAddress()
    {
        return address;
    }
    public String toString()
    {
        String toString="";
        toString=name+"";
        toString=id+"";
        toString=number+"";
        toString=dob+"";
        toString=address+"";

        return toString;
    }


}