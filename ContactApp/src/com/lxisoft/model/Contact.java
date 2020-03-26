package com.lxisoft.model;
public class  Contact
{
	private int id;
	private String firstName;
	private String lastName;
	private String fullName;
	private String phoneNum;

	public void setId(int id)
	{
		this.id = id;
	}
	public int getId()
	{
		return id;
	}
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	public String getFirstName()
	{
		return firstName;
	}
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public String getFullName()
	{
		return firstName+" "+lastName;
	}
	public void setPhoneNum(String phoneNum)
	{
		this.phoneNum = phoneNum;
	}
	public String getPhoneNum()
	{
		return phoneNum;
	}
	

}