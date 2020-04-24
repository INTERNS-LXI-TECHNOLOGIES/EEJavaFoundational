package com.lxisoft.models;
// import com.lxisoft.controllers.*;
public class ContactModel
{
	private String id;
	private String name;
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
}