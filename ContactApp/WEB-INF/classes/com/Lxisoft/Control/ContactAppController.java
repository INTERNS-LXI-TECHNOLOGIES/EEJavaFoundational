package com.Lxisoft.Control;
import com.Lxisoft.Model.Contact;
import com.Lxisoft.Repositry.MysqlRepositry;
import java.util.*;
import java.sql.*;

public class ContactAppController
{
	ArrayList<Contact> data = new ArrayList<Contact>();
	MysqlRepositry repo = new MysqlRepositry();

	public void AddContacts(ArrayList<Contact> data)
	{
		repo.addContacts(data);
	}
	public void updateContacts(ArrayList<Contact> data)
	{
		repo.updateContacts(data);

	}
	public void deleteContacts(ArrayList<Contact> data)
	{
		repo.deleteContacts(data);
	}
	public void printDatabase(ArrayList<Contact> data)
	{
		repo.printDatabase(data);
	}
}