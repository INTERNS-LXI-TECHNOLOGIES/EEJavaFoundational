package com.lxisoft.contactapp.model;

import com.lxisoft.contactapp.model.*;
import com.lxisoft.contactapp.Domain.*;
import java.io.*;
import java.util.*;
/**
 * class contactsListModel to create an arraylist based on contactmodel class
 */
public class ContactsListModel
{
/**
 * instance variable arraylist based on contact model
 */
	public ArrayList<ContactModel> contact=new ArrayList<ContactModel>();
	/**
	 * setAll contacts based on contactModel class
	 */
	public void setAllContacts(ContactModel contactmodel)
	{
			contact.add(contactmodel);
	}
	/**
	 * getAll contacts based on contactModel class
	 */
	public ArrayList<ContactModel> getAllContacts()
	{
		return contact;
	}
}