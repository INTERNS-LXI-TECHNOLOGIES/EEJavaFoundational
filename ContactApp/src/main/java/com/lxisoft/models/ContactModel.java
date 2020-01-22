package com.lxisoft.models;
// import com.lxisoft.controllers.*;
public class ContactModel
{
	private String id;
	private String fName;
	private String lName;
 
	public void setId(String id)
	{
		this.id=id;
	}
	public String getId()
	{
		return id;
	}


	public void setFName(String fName)
	{
		this.fName=fName;
	}
	public String getFName()
	{
		return fName;
	}


	public void setLName(String lName)
	{
		this.lName=lName;
	}
	public String getLName()
	{
		return lName;
	}
}