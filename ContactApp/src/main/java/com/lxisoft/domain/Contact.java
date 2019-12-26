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
 /**
 * set contact id
 */
  /**
 * @param id contact id
 */
	public void setId(String id)
	{
		this.id=id;
	}
	 /**
 * get contct id
 */
	  /**
 * @return contact id
 */
	public String getId()
	{
		return id;
	}
	 /**
 *set contact name 
 `	  /**
 * @param name contact name
 */
	public void setFName(String fName)
	{
		this.fName=fName;
	}
	 /**
 * get contact name
 */
	  /**
 * @return contact name
 */
	public String getFName()
	{
		return fName;
	}
	public void setLName(String name)
	{
		this.lName=lName;
	}
	 /**
 * get contact name
 */
	  /**
 * @return contact name
 */
	public String getLName()
	{
		return lName;
	}
	 /**
 * set contact number
 */
	  /**
 * @param contactNo contact number
 */
	public void setContactNo(String contactNo)
	{
		this.contactNo=contactNo;
	}
	 /**
 * get contact number
 */
	  /**
 * @return contact number
 */
	public String getContactNo()
	{
		return contactNo;
	}

	// public int compareTo(Contact c)
	// {
	// 	return this.name.compareTo(c.getName());
	// }
}