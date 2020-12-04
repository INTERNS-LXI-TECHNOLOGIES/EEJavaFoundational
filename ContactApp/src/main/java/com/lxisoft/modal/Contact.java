package com.lxisoft.modal;
import com.lxisoft.repository.*;
public class Contact
{
	private String name;
	private String email;
	private String number;
	private int ID;

	
public int getID() {
      return ID;
   }
   public void setID(int id) {
      ID = id;
   }
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setNumber(String number)
	{
		this.number=number;
	}
	public String getNumber()
	{
		return number;
	}
	public void setEmail(String email)
	{
		this.email=email;
	}
	public String getEmail()
	{
		return email;
	}
	public String toString()
	{
		return "\n"+"name :"+name+"    number :"+number+"  email :"+email+"\n";
	}
}