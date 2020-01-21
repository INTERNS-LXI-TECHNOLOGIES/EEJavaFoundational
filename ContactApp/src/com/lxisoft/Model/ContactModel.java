package com.lxisoft.Model;
import java.util.*;
import com.lxisoft.Model.ContactModel;
public class ContactModel
{
	private String contactName;
	private int id;
	private long phoneNumber;
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