package com.lxisoft.Model;
public class ContactModel
{
	private String contactName;
	private int id;
	private long phoneNumber;
	private ArrayList<ContactModel> contacts=new ArrayList<ContactModel>();
	public void setName(String name)
	{
		this.contactName=contactName;
	}
	public String getName()
	{
		return contactName;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setPhoneNumber(long phoneNumber)
	{
		this.phoneNumber=phoneNumber;
	}
	public long getPhoneNumber()
	{
		return phoneNumber;
	}
	public void setContacList(Contact contacts)
	{
		this.contactList.add(contacts);
	}
	public ArrayList<ContactModel> getContacts()
	{
		return this.contactList;
	}	
}