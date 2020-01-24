package com.lxisoft.model;
import java.util.Collections;
public class ContactModel implements Comparable<ContactModel>
{
	private String name;
	private int iD;
	private Long phoneNumber;
	private ContactModel contact;


	public int compareTo(ContactModel contact)
	{
		//contact.name= "";
		return this.contact.name.compareTo(contact.name);
	}
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