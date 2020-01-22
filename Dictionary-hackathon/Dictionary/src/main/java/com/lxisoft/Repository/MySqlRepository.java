package com.lxisoft.Repository;
import com.lxisoft.model.*;
import com.lxisoft.Domain;
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
		dB_Connection();
	}
	ArrayList<Dictionary> dictionary=new ArrayList<Dictionary>();
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
	 public ArrayList<Dictionary> getAllWords()throws SQLException
	 {
		dictionary.clear();
		try{
			stmt=con.prepareStatement("use Dictionary");
			rs = stmt.executeQuery("select * from Dictionary");
			while(rs.next()) 
			{ 
				Dictionary dict=new Dictionary();
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
}
