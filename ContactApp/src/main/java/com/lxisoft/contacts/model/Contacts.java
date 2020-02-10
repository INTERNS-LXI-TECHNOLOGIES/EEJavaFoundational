package com.lxisoft.contacts.model;



public class Contacts 
{
	private int id;
	private String fName;
	private String lName;
	private String number;
	
	public void setId(int i)
	{
		this.id=i;
	}
	public int getId()
	{
		return id;
	}
	
	public void setFName(String na)
	{
		this.fName=na;
	}
	public void setLName(String na)
	{
		this.lName=na;
	}
	public String getfName()
	{
		return fName;
	}
	public String getLName()
	{
		return lName;
	}
	public void setNumber(String num)
	{
		this.number=num;
	}
	public String getNumber()
	{
		return number;
	}

}
