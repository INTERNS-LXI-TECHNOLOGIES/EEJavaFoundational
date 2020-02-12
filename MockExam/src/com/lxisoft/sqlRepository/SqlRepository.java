package com.lxisoft.sqlRepository;
import java.util.*;
import java.io.*;
import java.sql.*;
public class sqlRepository
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
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mockexam","root","root");
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
		qry="create table if not exists exam(slno int not null unique auto_increment,name varchar(25),qn varchar(250),opt1 varchar(25),opt2 varchar(25),ans varchar(25))";
		ps=con.prepareStatement(qry);
		ps.execute();
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
}
public void insertInto(String name)
{
	try
	{
		createTable();
		String qry;
		qry="insert into contacts(name)values(?)";
		ps=con.prepareStatement(qry);
		ps.setString(1,name);
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
		qry="select name from contacts";
		ps=con.prepareStatement(qry);
		rs=ps.executeQuery(qry);
		// while(rs.next())
		// {
		// 	contacts.add(new ContactModel());
		// 	for(int i=0;i<contacts.size();i++)
		// 	{	
		// 		if(contacts.get(i).getName()==null)
		// 		{
		// 		contacts.get(i).setId(rs.getInt(1));
		// 		contacts.get(i).setName(rs.getString(2));
		// 		contacts.get(i).setMob(Long.parseLong(rs.getString(3)));
		// 		}
		// 	}
		// }
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}return contacts;
}
}