package com.lxisoft.airport;

public class Airport
{
private int slNo;
private String name;
private String gpsCode;
private int id;

public void setSlNo(int slNo)
{
this.slNo = slNo;
}

public int getSlNo()
{
    return slNo;
}

public void setName(String name)
{
this.name = name;
}

public String getName()
{
    return name;
}

public void setGpsCode(String gpsCode)
{
    this.gpsCode = gpsCode;
}

public String getGpsCode()
{
    return gpsCode;
}

public void setId(int id)
{
    this.id = id;
}

public int getId()
{
    return id;
}

public String toString()
{
    String toString=slNo+""+name+""+gpsCode+""+id;
    return toString;
}

}