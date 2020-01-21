package com.lxisoft.model;
package com.lxisoft.model;
public class ContactModel
{
	private String name;
	private int iD;
	private Long phoneNumber;

	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public void setiD(int iD)
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
	public void getPhoneNumber()
	{
		return phoneNumber;
	}
}