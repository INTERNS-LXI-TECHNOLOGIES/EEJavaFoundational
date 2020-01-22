package com.lxisoft.repository;
import com.lxisoft.models.*;
import java.sql.*;
import java.util.*;
import java.io.*;

public class LogRepository
{
	List<UserLogin> login=new ArrayList<UserLogin>();
	UserLogin uLogin;
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
	public LogRepository()
	{
		uLogin=new UserLogin();
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
	 		stmt=conn.prepareStatement("insert into login(User_Name,PassWord)values(?,?)");
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

 	public List<UserLogin> getAllContact()
	{
		try
		{
			login.clear();
			Statement smt=conn.createStatement(); 
			rs=smt.executeQuery("select * from login");
			while(rs.next())
			{
				uLogin.setUname(rs.getString("User_Name"));
				uLogin.setPwd(rs.getString("PassWord"));	
				login.add(uLogin);
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			System.out.println("list empty!!!!");
		}
		return login; 
	}
}