package com.lxisoft.contact;
import java.util.*;
public class Contact implements Comparable<Contact> 
{
	private String name;
	private String id;
	private String phone;
	//	String[] details=new String[2];
	public void setId(String id)
	{
		this.id=id;
	}
	public String getId()
	{
		return this.id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return this.name;
	}
	public void setNumber(String number)
	{
		this.phone=number;
	}
	public String getNumber()
	{
		return this.phone;
	}
	public int compareTo(Contact c) 
    { 
        return name.compareTo(c.getName());
    } 
}