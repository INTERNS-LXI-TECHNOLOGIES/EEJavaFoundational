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
		qry="create table contacts(id int,name varchar(25),mob varchar(15))";
		ps=con.prepareStatement(qry);
		ps.execute();
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
}
}