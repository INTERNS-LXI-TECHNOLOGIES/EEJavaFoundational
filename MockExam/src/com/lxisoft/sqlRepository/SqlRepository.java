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
		qry="create table if not exists exam(slno int not null unique auto_increment,qn varchar(250),opt1 varchar(25),opt2 varchar(25),ans varchar(25))";
		ps=con.prepareStatement(qry);
		ps.execute();
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
}
}