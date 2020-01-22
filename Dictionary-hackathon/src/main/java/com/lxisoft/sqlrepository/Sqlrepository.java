package com.lxisoft.sqlrepository;
import com.lxisoft.model.*;
import java.util.*;
import com.lxisoft.servlet.*;
import java.sql.*;
import java.io.*;
public class Sqlrepository
{
	ArrayList <Word> wordlist = new ArrayList<Word>();
	Connection con; 
	ResultSet rs ;
	PreparedStatement stmnt; 
	{
		sqlrepository();
	}

	public void sqlrepository()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");  
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abhijith","root","root");
        }  
        catch(Exception e)
        {
        	System.out.println(e);
        }                             
	}
	
	public void write(Word word)
	{
		
		try
		{
			
	     	stmnt = con.prepareStatement("insert into dictionary (word,meaning)values(?,?)");
			stmnt.setString(1,word.getWord());
			stmnt.setString(2,word.getMeaning());
			
			stmnt.executeUpdate();
		
	    }
	    catch(Exception e)
	    {
	    	System.out.println(e);
	    }
	}
	public ArrayList <Word> read()
	{
		try
		{
			wordlist.clear();
			Statement s = con.createStatement();
			 rs = s.executeQuery("select * from dictionary");
			while(rs.next())
			{
				Word word= new Word();
				word.setWord(rs.getString("word"));
				word.setMeaning(rs.getString("meaning"));
				
				wordlist.add(word);

			}
			s.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return wordlist;
	}
		
}