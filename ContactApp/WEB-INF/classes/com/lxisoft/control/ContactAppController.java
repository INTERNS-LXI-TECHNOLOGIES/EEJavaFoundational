package com.lxisoft.control;
import com.lxisoft.model.contact;
import com.lxisoft.repositry.MysqlRepositry;
import java.util.*;
import java.sql.*;

public class ContactAppController
{
	ArrayList<Contact> data = new ArrayList<Contact>();
	MysqlRepositry repo = new MysqlRepositry();

	public void AddContact(ArrayList<Contact> data)
	{
		repo.addContacts(data);
	}
	public void updateContact(ArrayList<Contact> data)
	{
		repo.updateContacts(data);

	}
	public void deleteContact(ArrayList<Contact> data)
	{
		repo.deleteContacts(data);
	}
	public void printDatabase(ArrayList<Contact> data)
	{
		repo.printDatabase(data);
	}
}