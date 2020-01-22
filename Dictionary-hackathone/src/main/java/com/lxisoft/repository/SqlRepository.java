package com.lxisoft.repository;
import com.lxisoft.domain.*;
import java.sql.*;
import java.util.*;
import java.io.*;
 
public class SqlRepository 
{
	List<Word>wordList=new ArrayList<Word>();
	Word w;
	ResultSet rs=null;
	PreparedStatement stmt=null;
	Connection conn=null;
	{
		try
		{
			connectionDB();
		}
		catch(Exception e)
		{
			System.out.println("not connected");	
		}
	}
	public SqlRepository()
	{
		w=new Word();
	}

public Word findWordById(String id)
	{
		Word w=new Word();
		List<Word>word=getAllWords();
		for(int i=0;i<word.size();i++)
		{
			if((word.get(i).getId()).equals(id))
			{
				w=word.get(i);
			}
		}
		return w;
	}

	public void connectionDB()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/dictionary","root","root");	
 	    }
 	    catch(Exception e)
 	    {
 	    	System.out.println("Database not connected");
 	    }
 	}
	
	 
	public List<Word> getAllWords()
	{
		try
		{
			wordList.clear();
			Statement smt=conn.createStatement(); 
			rs=smt.executeQuery("select * from wordlist");
			while(rs.next())
			{
				Word w=new Word();
				w.setId(String.valueOf(rs.getInt("ID")));
				w.setWord(rs.getString("Word"));
				w.setMeaning(rs.getString("Meaning"));	
				wordList.add(w);
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			System.out.println("Dictionary is empty");
		}
		return wordList; 
	}
	 
 	public void insertWord(Word w)
 	{
 		try
 		{
	 		stmt=conn.prepareStatement("insert into wordlist(Word,Meaning)values(?,?)");
	 		stmt.setString(1,w.getWord());
	 		stmt.setString(2,w.getMeaning());
	 		stmt.executeUpdate();
	 		System.out.println("Successfully Inserted");
 		}
 		catch(Exception e)
 		{
 			e.printStackTrace();
 			System.out.println("Insertion Failed"+e);
 		}
 	}
  }