package com.lxisoft.repository;
import java.sql.*;
import com.lxisoft.domain.*;
import java.Util.*;

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
			s=connection.createStatement();		
			s.executeUpdate("CREATE TABLE IF NOT EXISTS word(id INT PRIMARY KEY AUTO_INCREMENT,element VARCHAR(30),meaning VARCHAR(30))");
		}
		catch(ClassNotFoundException|SQLException e)
		{
			System.out.println(e);
		}	
	}

	public String readAll()
	{
		try
		{
			// s.executeUpdate("INSERT INTO word(element,meaning) VALUES('a','a')");
			ResultSet rs=s.executeUpdate("SELECT * FROM word");
			ArrayList<Word> wordList=new ArrayList<Word>();
			while(rs.next())
			{
				Word word=new Word();
				word.setElement(rs.getString(2));
				word.setMeaning(rs.getString(3));
				System.out.println(rs.getString(2)+"   mean "+rs.getString(3));
			}
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
		return "yes";
	}

}
