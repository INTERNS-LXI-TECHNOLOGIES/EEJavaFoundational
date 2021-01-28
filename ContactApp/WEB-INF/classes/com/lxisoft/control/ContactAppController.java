package com.lxisoft.control;
import com.lxisoft.model.Contact;
import com.lxisoft.repositry.MysqlRepositry;
import java.util.*;
import java.sql.*;

public class ContactAppController
{
	MysqlRepositry repo = new MysqlRepositry();

	public void addContact(String fname,String lname,String email,String phno)
	{
		repo.addtoDatabase(fname,lname,email,phno);
	}
	public void updateContact(String id,String fname,String lname,String email,String phno)
	{
		repo.updateContacts(id,fname,lname,email,phno);

	}
	public void deleteContact(String delete)
	{
		repo.deleteContacts(delete);
	}
	public void printDatabases(ArrayList<Contact> contactList)
	{
		repo.printDatabase(contactList);
	}
	public void createConnection()
	{
		repo.createDatabaseConnection();
	}
	public void searchContacts(String name,ArrayList<Contact>searchContact)
	{
		repo.searchDatabase(name,searchContact);
	}
}