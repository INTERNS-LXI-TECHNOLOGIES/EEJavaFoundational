package com.lxisoft.model;
import com.lxisoft.model.*;
import com.lxisoft.repository.*;
import com.lxisoft.servlet.*;
public  class Contact
{
	private String name;
	private String lastname;
	private String email;
	private String number;
	private int id;


   public void setID(int id)
   {
      id = id;
   }
   public int getID()
   {
      return id;
   }
	public void setFirstName(String name)
	{
		this.name = name;
	}
	public String getFirstName()
	{
		return name;
	}
	public void setLastName(String lastname)
	{
		this.lastname = lastname;
	}
	public String getLastName()
	{
		return lastname;
	}
	public void setMailId(String email)
	{
		this.email = email;
	}
	public String getMailId()
	{
		return email;
	}
	public void setNumber(String number)
	{
		this.number = number;
	}
	public String getNumber()
	{
		return number;
	}
	
		public String toString()
	{
		return "\n"+"firstname :"+name+"    lastname :"+lastname+"  email :"+email+"    number :"+number+"\n";
	}
}