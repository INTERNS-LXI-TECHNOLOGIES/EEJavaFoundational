package com.lxisoft.Domain;

public class Contact implements Comparable<Contact>
{
	private int id;
	private String name;
	private String phno;
	public void setName(String name)
	{
		this.name=name;
	}
	public void setNo(String phno)
	{
		this.phno=phno;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public String getName()
	{
		return name;
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
		if(this.name.equals(c.getName()))
			return true;
		else return false;
	}
	public int compareTo(Contact c)
	{
		return ((this.getName()).compareTo(c.getName()));
	}

	public String toString() 
	{
			return this.name;
	}
}