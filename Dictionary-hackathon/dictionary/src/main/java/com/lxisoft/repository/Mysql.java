package com.lxisoft.repository;
import java.sql.*;
import com.lxisoft.domain.*;
import java.util.*;

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

	public ArrayList<Word> readAll()
	{
		ArrayList<Word> wordList=new ArrayList<Word>();
		try
		{
			// s.executeUpdate("INSERT INTO word(element,meaning) VALUES('a','a')");
			ResultSet rs=s.executeQuery("SELECT * FROM word");
			while(rs.next())
			{
				Word word=new Word();
				word.setElement(rs.getString("element"));
				word.setMeaning(rs.getString("meaning"));
				wordList.add(word);
				System.out.println(rs.getString("element")+"   mean "+rs.getString("meaning"));
			}
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
		return wordList;
	}

}
