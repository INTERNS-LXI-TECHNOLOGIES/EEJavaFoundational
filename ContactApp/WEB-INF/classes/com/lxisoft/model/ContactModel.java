package com.lxisoft.model;					
/**
 *model class:contact model with contact id and contact name
 */
public class ContactModel
{
	/**
	 *instance variable id and name
	 */
	private int id;
	private String name;
	/**
	 *to set id for contact
	 *
	 *@param id contact id
	 */
	public void setId(int id)
	{
		this.id=id;
	}
	/**
	 *to get id for contact
	 *
	 *@return id
	 */
	public int getId()
	{
		return id;
	}
	/**
	 *to set name for contact
	 *@param name contact name
	 */
	public void setName(String name)
	{
		this.name=name;
	}
	/**
	 *@return contact name
	 */
	public String getName()
	{
		return name;
	}

}