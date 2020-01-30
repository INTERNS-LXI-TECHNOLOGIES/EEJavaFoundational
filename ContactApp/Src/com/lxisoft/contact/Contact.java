package com.lxisoft.contact;
public class Contact
{
	private String name;
	private int id;
	private String phone;
	String[] details=new String[2];
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
}