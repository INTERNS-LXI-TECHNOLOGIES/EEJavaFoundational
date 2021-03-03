package com.lxisoft.model;
public  class Userdetails
{
    private String name;
	private String age;
	private String address;
	private String email;
	private String number;
    private String blood;
	private int id;


   public void setID(int id)
   {
     this.id = id;
   }
   public int getID()
   {
      return id;
   }
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public void setAge(String age)
	{
		this.age = age;
	}
	public String getAge()
	{
		return age;
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
	
	public void setAddress(String address)
	{
		this.address = address;
	}
	public String getAddress()
	{
		return address;
	}
	public void setBloodGroup(String blood)
	{
		this.blood = blood;
	}
	public String getBloodGroup()
	{
		return blood;
	}

}