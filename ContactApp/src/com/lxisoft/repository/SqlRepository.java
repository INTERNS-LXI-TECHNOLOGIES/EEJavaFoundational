package com.lxisoft.repository;
import java.util.*;
import java.io.*;
import java.sql.*;
import com.lxisoft.model.ContactModel;
public class SqlRepository
{
	Connection con=null;
	PreparedStatement ps=null;
	public void databaseConnectionEstablish()
	{
		try
		{
			if(con==null)
			{
				Class.forName("com.mysql.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/contacts","root","root");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void createTable()
	{
		try
		{
			databaseConnectionEstablish();
		String qry;
		qry="create table if not exists contacts(id int not null unique auto_increment,name varchar(25),mob varchar(15))";
		ps=con.prepareStatement(qry);
		ps.execute();
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
}
public void insertInto(ContactModel contacts)
{
	try
	{
		createTable();
		String qry;
		qry="insert into contacts(name,mob)values(?,?)";
		ps=con.prepareStatement(qry);
		ps.setString(1,contacts.getName());
		ps.setString(2,String.valueOf(contacts.getMob()));
		ps.execute();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}