package com.lxisoft.contactapp.Domain;
import  java.lang.Comparable;
/**
 * pojo : Contact class for set and get contact details that implements Comparable
 */
public class Contact implements Comparable<Contact>
{
	/**
	 * instance variables id name and number.
	 */
	private int id;
	private String name;
	private String phno;
	/**
	 * set id in contacts
	 * @param id contactid
	 */
	public void setId(int id)
	{
		this.id=id;
	}
	/**
	 * set name in contacts
	 * @param name contactname
	 */
	public void setName(String name)
	{ 
		this.name=name;
	}
	/**
	 * set number in contacts
	 * @param phno contactnumber
	 */
	public void setNo(String phno)
	{
		this.phno=phno;
	}
	/**
	 * get id in contacts
	 * @return id
	 */
	public int getId()
	{
		return this.id;
	}

	/**
	 * get name in contacts
	 * @return name
	 */
	public String getName()
	{
		return this.name;
	}
	/**
	 * get number in contacts
	 * @return number
	 */
	public String getNo()
	{
		return this.phno;
	}
	/**
	 * equal method to check whether object equals or not
	 *@param obj object reference
	 * @return boolean 
	 */
	public boolean equals(Object obj)
	{
		Contact contact=(Contact)obj;
		if(this.name.equals(contact.getName()))
			return true;
		else return false;
	}
	/**
	 * compareTo method to check whether object equals or not
	 *@param contact contact
	 * @return int value
	 */
	public int compareTo(Contact contact)
	{
		return this.getName().compareTo(contact.getName()); 
	}
}