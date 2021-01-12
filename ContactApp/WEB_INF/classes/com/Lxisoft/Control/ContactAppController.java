package com.Lxisoft.Control;
import com.Lxisoft.Model.Contact;
import com.Lxisoft.Repositry.MysqlRepositry;
import java.util.*;
import java.sql.*;

public class ContactAppController
{
	ArrayList<Contact> data = new ArrayList<Contact>();
	MysqlRepositry repo = new MysqlRepositry();

	public void AddContacts(ArrayList<Contact> databaseConnection)
	{
		repo.addContacts(data);
	}
	public void updateContacts(ArrayList<Contact> databaseConnection)
	{
		repo.updateContacts(data);

	}
	public void deleteContacts(ArrayList<Contact> databaseConnection)
	{
		repo.deleteContacts(data);
	}
	public void printDatabase(ArrayList<Contact> databaseConnection)
	{
		repo.printDatabase(data);
	}
}