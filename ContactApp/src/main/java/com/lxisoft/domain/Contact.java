package com.lxisoft.domain;
// import com.lxisoft.controllers.*;
// import com.lxisoft.models.*;
// import com.lxisoft.view.*;
import java.util.*;
import java.io.*;
public class Contact 
{
	private String id;
	private String fName;
	private String lName;
	private String contactNo;
 
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


	public void setContactNo(String contactNo)
	{
		this.contactNo=contactNo;
	}
	
	public String getContactNo()
	{
		return contactNo;
	}

	// public int compareTo(Contact c)
	// {
	// 	return this.name.compareTo(c.getName());
	// }
}