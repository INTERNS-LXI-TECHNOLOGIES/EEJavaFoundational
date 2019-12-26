package com.lxisoft.models;
// import com.lxisoft.controllers.*;
public class ContactModel
{
	private String id;
	private String fName;
	private String lName;
 /**
 * set id
 */
  /**
 * @param id contact id
 */
	public void setId(String id)
	{
		this.id=id;
	}
	 /**
 * get id
 */
	  /**
 * @return contact id
 */
	public String getId()
	{
		return id;
	}
	 /**
 * set contact name
 */
	  /**
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
	public void setLName(String fName)
	{
		this.fName=fName;
	}
	public String getLName()
	{
		return fName;
	}
}