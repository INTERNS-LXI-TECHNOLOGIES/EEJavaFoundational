package com.lxisoft.Domain;
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
	private String firstName;
	private String lastName;
	private String fullName=firstName+" "+lastName;
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
	 * set first name in contacts
	 * @param firstname contactname
	 */
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
		if(this.fullName.equals(contact.getFullName()))
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
		return this.getFullName().compareTo(contact.getFullName()); 
	}
}