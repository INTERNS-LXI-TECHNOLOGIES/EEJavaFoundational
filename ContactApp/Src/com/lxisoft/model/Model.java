package com.lxisoft.model;
public class Model
{
	private String name;
	private int id;
	private String phone;
	String[] details=new String[2];
	public void setDetails(String name,String number)
	{
		this.name=name;
		this.phone=number;
		
		details[0]=this.name;
		details[1]=this.phone;
	}
	public String[] getDetails()
	{
		return details;
	}
}