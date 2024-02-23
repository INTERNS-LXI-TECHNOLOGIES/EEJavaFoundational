package com.lxisoft.company.model;
public class Product
{
    private String name;
    private String id;
    private String cost;
    private String mfDate;
    private String lsDate;

public Product()
{}

    public Product(String name,String id,String cost,String mfDate,String lsDate)
    {
        this.name= name;
        this.id = id;
        this.cost = cost;
        this.mfDate = mfDate;
        this.lsDate = lsDate;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public  String getName()
    {
        return name;
    }
   
    public void setId(String id)
    {
        this.id = id;
    }

    public  String getId()
    {
        return id;
    }
    
    public void setCost(String cost)
    { 
        this.cost =cost;
    }

    public  String getCost()
    {
        return cost;
    }
    
    public void setMfDate(String mfDate)
    {
        this.mfDate = mfDate;
    }

    public  String getMfDate()
    {
        return mfDate;
    }

    public void setLsDate(String lsDate)
    {
        this.lsDate = lsDate;
    }

    public  String getLsDate()
    {
        return lsDate;
    }

    public String toString()
    {
        String toString= name+""+id+""+cost+""+mfDate+""+lsDate+"";
        return toString;
    }
}