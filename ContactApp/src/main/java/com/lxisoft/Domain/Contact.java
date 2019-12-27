package com.lxisoft.Domain;

public class Contact implements Comparable<Contact>
{
	private int id;
	private String firstName;
	private String lastName;
	private String fullName;
	private String phno;
	public void setFirstName(String name)
	{
		this.firstName=name;
	}public void setLastName(String name)
	{
		this.lastName=name;
	}

	public void setNo(String phno)
	{
		this.phno=phno;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public String getFirstName()
	{
		return firstName;
	}public String getLastName()
	{
		return lastName;
	}
	public String getFullName()
	{
		return firstName+" "+lastName;
	}
	public String getNo()
	{
		return phno;
	}
	public int getId()
	{
		return id;
	}
	public boolean equals(Object o)
	{
		Contact c=(Contact)o;
		if(this.fullName.equals(c.getFullName()))
			return true;
		else return false;
	}
	public int compareTo(Contact c)
	{
		return ((this.getFullName()).compareTo(c.getFullName()));
	}

	public String toString() 
	{
			return this.fullName;
	}
}