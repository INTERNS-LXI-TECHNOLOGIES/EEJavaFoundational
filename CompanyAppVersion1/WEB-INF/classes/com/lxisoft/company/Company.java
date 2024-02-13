package com.lxisoft.company;
public class Company
{
    private String name;
    private String id;
    private String coName;
    private String location;
    private String contactNumber;

    public Company(String name,String id,String coName,String location,String contactNumber)
    {
        this.name= name;
        this.id = id;
        this.coName = coName;
        this.location = location;
        this.contactNumber = contactNumber;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public  String getName()
    {
        return name;
    }
   
    public void setCoName(String coName)
    {
        this.coName = coName;
    }

    public  String getCoName()
    {
        return coName;
    }
    
    public void setId(String id)
    { 
        this.id =id;
    }

    public  String getId()
    {
        return id;
    }
    
    public void setLocation(String location)
    {
        this.location = location;
    }

    public  String getLocation()
    {
        return location;
    }

    public void setContactNumber(String contactNumber)
    {
        this.contactNumber = contactNumber;
    }

    public  String getContactNumber()
    {
        return contactNumber;
    }

    public String toString()
    {
        String toString= name+""+coName+""+id+""+location+""+contactNumber+"";
        return toString;
    }

}