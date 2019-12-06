package com.lxisoft.models;
	/**
	 * class contact model to set and get contact id and name
	 */
public class ContactModel
{
	/**
	 * instance variables name and id.
	 */
	private String name;
	private int id;
	/**
	 * setid of contact
	 *@param id
	 */
	public void setId(int id)
	{
		this.id=id;
	}
	/**
	 * set name of contact
	 *@param name.
	 */
	public void setName(String name)
	{
		this.name=name;
	}
	/**
	 * getname of contact
	 *@return name
	 */
	public String getName()
	{
		return this.name;
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