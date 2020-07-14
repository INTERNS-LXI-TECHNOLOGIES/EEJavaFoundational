package com.lxisoft.repository;
import com.lxisoft.model.*;
import java.sql.*;
import java.util.*;
public class DatabaseRepo
{
	private Connection con;
	private Statement s;
	private ResultSet r;
	public  void createDatabaseConnection()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mockexam","root","root");
		}
		catch( Exception e)
		{
			e.printStackTrace();
		}
	}

	public void addToDatabase(Question q)
	{
		createDatabaseConnection();
		try
		{
			s=con.createStatement();
			s.executeUpdate("insert into questions values('"+q.question+"','"+q.answer+"','"+q.option1+"','"+q.option2+"','"+q.option3+"')");	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}