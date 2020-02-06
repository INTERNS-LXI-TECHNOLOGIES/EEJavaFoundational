package com.lxisoft.repository;
import java.util.*;
import java.io.*;
import java.sql.*;
import com.lxisoft.model.ContactModel;
public class SqlRepository
{
	Connection con=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
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
public ArrayList<ContactModel> selectFrom(ArrayList<ContactModel> contacts)
{
	try
	{
		databaseConnectionEstablish();
		String qry;
		qry="select * from contacts";
		ps=con.prepareStatement(qry);
		rs=ps.executeQuery(qry);
		while(rs.next())
		{
			contacts.add(new ContactModel());
			for(int i=0;i<contacts.size();i++)
			{	
				if(contacts.get(i).getName()==null)
				{
				contacts.get(i).setId(rs.getInt(1));
				contacts.get(i).setName(rs.getString(2));
				contacts.get(i).setMob(Long.parseLong(rs.getString(3)));
				}
			}
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}return contacts;
}
public void delete(ContactModel contacts)
{
	try
	{
	databaseConnectionEstablish();
		String qry;
		qry="delete from contacts where id="+contacts.getId();
		ps=con.prepareStatement(qry);
		ps.execute();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
public void updateName(ContactModel contacts)
{
	try
	{
		databaseConnectionEstablish();
		String qry;
		qry="update contacts set name ='"+contacts.getName()+"'where id="+contacts.getId();
		ps=con.prepareStatement(qry);
		ps.execute();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
public void updateMob(ContactModel contacts)
{
	try
	{
		databaseConnectionEstablish();
		String qry;
		qry="update contacts set mob='"+contacts.getMob()+"' where id="+contacts.getId();
		ps=con.prepareStatement(qry);
		ps.execute();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
public ArrayList<ContactModel> searchContact(String a,ArrayList<ContactModel> contacts)
{
		try
	{
		databaseConnectionEstablish();
		String qry;
		qry="select * from contacts where name like '%"+a+"%'";
		ps=con.prepareStatement(qry);
		rs=ps.executeQuery(qry);
		while(rs.next())
		{
			contacts.add(new ContactModel());
			for(int i=0;i<contacts.size();i++)
			{	
				if(contacts.get(i).getName()==null)
				{
				contacts.get(i).setId(rs.getInt(1));
				contacts.get(i).setName(rs.getString(2));
				contacts.get(i).setMob(Long.parseLong(rs.getString(3)));
				}
			}
		}
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}return contacts;
}
}