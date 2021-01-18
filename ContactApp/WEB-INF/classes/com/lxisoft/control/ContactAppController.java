package com.lxisoft.control;
import com.lxisoft.model.Contact;
import com.lxisoft.repositry.MysqlRepositry;
import java.util.*;
import java.sql.*;

public class ContactAppController
{
	MysqlRepositry repo = new MysqlRepositry();

	public void AddContact()
	{
		repo.addtoDatabase();
	}
	public void updateContact()
	{
		repo.updateContacts();

	}
	public void deleteContact()
	{
		repo.deleteContacts();
	}
	public void printDatabase()
	{
		repo.printDatabase();
	}
}