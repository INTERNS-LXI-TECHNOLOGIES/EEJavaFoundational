package com.lxisoft.repository;
import java.sql.*;
import com.lxisoft.domain.*;

public class Mysql
{
	Connection connection;
	Statement s;
	Word word=new Word();

	{		
		makeConnection();
	}

	public void makeConnection()
	{
		try
		{			
			Class.forName("com.mysql.jdbc.Driver"); 
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/dictionary","root","root");
		}
		catch(ClassNotFoundException|SQLException e)
		{
			System.out.println(e);
		}	
	}

	public void read()
	{
		s=connection.createStatement();
		s.excecuteQuery("CREATE TABLE IF NOT EXISTS word(INT id PRIMARY KEY,VARCHAR(30) element,VARCHAR(30) meaning)");
		s.excecuteUpdate();
	}

}
