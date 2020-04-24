package com.lxisoft.Model;
import java.util.*;
import com.lxisoft.Model.ContactModel;
/**
	* This is Model class it's like a mould
*/
public class ContactModel implements Comparable <ContactModel>
{
	private String contactName;
	private int id;
	private long phoneNumber;
	public int compareTo(ContactModel contact)
	{
		return this.contactName.compareTo(contact.contactName);
	}
	public void setName(String contactName)
	{
		this.contactName = contactName;
	}
	public String getName()
	{
		return contactName;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public int getId()
	{
		return id;
	}
	public void setPhoneNumber(long phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}
	public long getPhoneNumber()
	{
		return phoneNumber;
	}
	
}




