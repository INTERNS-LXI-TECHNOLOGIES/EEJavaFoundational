package com.lxisoft.model;

public class Contact {
     private String firstName,lastName,phNumber,email;
	private int id;

	public void setFirstName(String firstName)
	{
		this.firstName= firstName;
	}      
	public String getFirstName()
	{
		return this.firstName;
	}
	public void setLastName(String lastName)
	{
		this.lastName= lastName;
	}      
	public String getLastName()
	{
		return this.lastName;
	}
	public void setPhNumber(String number)
	{
		this.phNumber= number; 
	}
	public String getPhNumber()
	{
		return this.phNumber;
	}
     public void setEmail(String mail)
	{
		this.email= mail; 
	}
	public String getEmail()
	{
		return this.email;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public int getId()
	{
		return this.id;
	}
}
