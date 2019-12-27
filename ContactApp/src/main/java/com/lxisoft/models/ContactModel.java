package com.lxisoft.models;
	/**
	 * class contact model to set and get contact id and name
	 */
public class ContactModel
{
	/**
	 * instance variables name and id.
	 */
	private String firstName;
	private String lastName;
	private String fullName=firstName+" "+lastName;
	private int id;
	/**
	 * setid of contact
	 *@param id
	 */
	public void setId(int id)
	{
		this.id=id;
	}
	public void setFirstName(String firstName)
	{ 
		this.firstName=firstName;
	}
	/**
	 * set last name in contacts
	 * @param lastname contactname
	 */
	public void setLastName(String lastName)
	{ 
		this.lastName=lastName;
	}
	/**
	 * set last name in contacts
	 * @param fullname contactname
	 */
	public void setFullName(String fullName)
	{ 
		this.fullName=fullName;
	}
		/**
	 * get firstname in contacts
	 * @return name
	 */
	public String getFirstName()
	{
		return this.firstName;
	}
	/**
	 * get lastname in contacts
	 * @return name
	 */
	public String getLastName()
	{
		return this.lastName;
	}
	/**
	 * get fullname in contacts
	 * @return name
	 */
	public String getFullName()
	{
		return this.fullName;
	}
	/**
	 * getid of contact
	 *@return id
	 */
	public int getId()
	{
		return this.id;
	}
}