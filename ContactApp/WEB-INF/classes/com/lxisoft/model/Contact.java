package com.lxisoft.model;

public class Contact
{
	private String firstName;
	private String lastName;
	private String email;
	private String contactNumber;

	public void setFirstName(String firstName)
	{
		this.firstName=firstName;
	}
	public void setLastName(String lastName)
	{
		this.lastName=lastName;
	}
	public void setEmail(String email)
	{
		this.email=email;
	}
	public void setContactNumber(String contactNumber)
	{
		this.contactNumber=contactNumber;
	}
	public String getFirstName()
	{
		return firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public String getEmail()
	{
		return email;
	}
	public String getContactNumber()
	{
		return contactNumber;
	}
}