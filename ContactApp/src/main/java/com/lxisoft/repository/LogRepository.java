package com.lxisoft.repository;
import com.lxisoft.models.*;
import java.sql.*;
import java.util.*;
import java.io.*;

public class LogRepository
{
	List<UserLogin> login=new ArrayList<UserLogin>();
	UserLogin uLogin=new UserLogin();
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

	public void connectionDB()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/contact","root","root");	
 	    }
 	    catch(Exception e)
 	    {
 	    	System.out.println("Database not connected");
 	    }
 	}

 	public void insertLogin(UserLogin uLogin)
 	{
 		try
 		{
	 		stmt=conn.prepareStatement("insert into contactlist(User_Name,PassWord)values(?,?)");
	 		stmt.setString(1,uLogin.getUname());
	 		stmt.setString(2,uLogin.getPwd());
	 		stmt.executeUpdate();
	 		System.out.println("Successfully Inserted");
 		}
 		catch(Exception e)
 		{
 			e.printStackTrace();
 			System.out.println("Insert Failed"+e);
 		}
 	}
}