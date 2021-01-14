package com.lxisoft.control;
import com.lxisoft.model.Contact;
import com.lxisoft.repositry.MysqlRepositry;
import java.util.*;
import java.sql.*;

public class ContactAppController
{
	Contact contact=new Contact();
	ArrayList<Contact> data = new ArrayList<Contact>();
	MysqlRepositry repo = new MysqlRepositry();

	public void addContacts()
	{
		repo.addtoDatabase();
	}
	public void updateContact(ArrayList<Contact> data)
	{
		repo.updateContacts(data);

	}
	public void deleteContacts(ArrayList<Contact> data)
	{
		repo.deleteContacts(data);
	}
	public void printDatabase()
	{
		repo.createDatabaseConnection();
		repo.printDatabase();

	}
}