package com.lxisoft.repository;
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
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/mockexam","root","root");
		}
		catch( Exception e)
		{
			e.printStackTrace();
		}
	}

	public void addToDatabase(Question q)
	{
		createDatabaseConnection();
		s.executeUpdate("insert into questions values('"+q.question+"','"+q.answere+"','"+q.option1+"','"+q.option2+"','"+q.option3+"')");

	}
}