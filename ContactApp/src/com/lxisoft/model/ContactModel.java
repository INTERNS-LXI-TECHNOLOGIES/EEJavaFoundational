package com.lxisoft.model;
public class ContactModel
{
	private String name;
	private int iD;
	private Long phoneNumber;

	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public void setId(int iD)
	{
		this.iD = iD;
	}
	public int getId()
	{
		return iD;
	}
	public void setPhoneNumber(long phoneNumber)
	{
		this.phoneNumber=phoneNumber;
	}
	public Long getPhoneNumber()
	{
		return phoneNumber;
	}
}