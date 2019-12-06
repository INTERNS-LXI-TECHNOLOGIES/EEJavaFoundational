package com.lxisoft.domain;
// import com.lxisoft.controllers.*;
// import com.lxisoft.models.*;
// import com.lxisoft.view.*;
import java.util.*;
import java.io.*;
public class Contact 
{
	private String id;
	private String name;
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
	public void setName(String name)
	{
		this.name=name;
	}
	 /**
 * get contact name
 */
	  /**
 * @return contact name
 */
	public String getName()
	{
		return name;
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