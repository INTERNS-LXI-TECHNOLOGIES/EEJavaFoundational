package com.lxisoft.model;
public  class Contact
{
	private String fname;
	private String lname;
	private String mailid;
	private String number;

	public void setFirstName(String fname)
	{
		this.fname = fname;
	}
	public String getFirstName()
	{
		return fname;
	}
	public void setLastName(String lname)
	{
		this.lname = lname;
	}
	public String getLastName()
	{
		return lname;
	}
	public void setNumber(String number)
	{
		this.number = number;
	}
	public String getNumber()
	{
		return number;
	}
	public void setMailId(String mailid)
	{
		this.mailid = mailid;
	}
	public String getMailId()
	{
		return mailid;
	}
		public String toString()
	{
		return "\n"+"firstname :"+fname+"    lastname :"+lname+"    number :"+number+"  email :"+mailid+"\n";
	}
}