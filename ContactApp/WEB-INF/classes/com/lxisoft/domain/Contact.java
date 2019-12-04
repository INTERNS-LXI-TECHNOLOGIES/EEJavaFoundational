package com.lxisoft.domain;

public class Contact implements Comparable<Contact>
{
	private String id;
	private String name;
	private String number;

	public void setId(String id)
	{
		this.id=id;
	} 

	public String getId()
	{
		return id;
	} 

	public void setName(String name)
	{
		this.name=name;
	} 

	public void setNumber(String number)
	{
		this.number=number;
	} 

	public String getName()
	{
		return name;
	}

	public String getNumber()
	{
		return number;
	}

	public int compareTo(Contact contact)
	{
		return this.name.compareTo(contact.getName());
	}
}