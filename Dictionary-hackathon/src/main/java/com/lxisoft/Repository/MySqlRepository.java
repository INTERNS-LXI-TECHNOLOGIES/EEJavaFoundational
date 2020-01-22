package com.lxisoft.Repository;
import com.lxisoft.model.*;
import com.lxisoft.Domain.*;
import java.sql.*;
import java.util.*;
import java.io.*;

public class MySqlRepository 
{  
	Connection con=null; 
	Statement stm=null;
	PreparedStatement stmt=null;
	ResultSet rs=null;

	{
		try
		{
		dB_Connection();
		}catch(Exception e)
		{
			System.out.println("error "+e);
		}
	}
	ArrayList<W_Dictionary>dictionary=new ArrayList<W_Dictionary>();
	public void dB_Connection() throws SQLException,ClassNotFoundException
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Dictionary","root","root");
			System.out.println("DB Connection created successfully");
			System.out.println("DB set");
				
		}catch(SQLException ex) 
		{ 
	   		ex.printStackTrace();
		}
	}
	 public ArrayList<W_Dictionary> getAllWords()throws SQLException,ClassNotFoundException
	 {
		dictionary.clear();
		try{
			stmt=con.prepareStatement("use Dictionary");
			rs = stmt.executeQuery("select * from Dictionary");
			while(rs.next()) 
			{ 
				W_Dictionary dict=new W_Dictionary();
				dict.setWord(rs.getString("Word"));
				dict.setMeaning(rs.getString("meaning"));
				dictionary.add(dict);
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}	
		return dictionary;
	}
	public void insertDetails(W_Dictionary dict)throws SQLException
	{	
			
		try
		{
				stmt=con.prepareStatement("insert into Dictionary values(?,?)");  
				stmt.setString(1,dict.getWord());
				stmt.setString (2,dict.getMeaning());
				stmt.executeUpdate();
		}catch(SQLException ex) 
		{ 
	   		System.out.println(ex);
	   		ex.printStackTrace();
		}
	}
}
