package com.lxisoft.repository;
import com.lxisoft.model.*;
import com.lxisoft.servlet.*;
import java.io.*;
import java.sql.*;
import java.util.*;
public class ContactDatabase
{
	Connection con = null;
	ResultSet rs= null;
	Statement stmt = null;
	PreparedStatement ps = null;;
	int row;
	
	public void createDatabaseConnection()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			try{
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contactdb","root","root");	
			}catch(SQLException e)
			{	e.printStackTrace();	}
			
		}catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}
	public int addToDatabase(Contact model)
	{
		createDatabaseConnection();
		try
		{
			ps = con.prepareStatement("insert into contactapp(FirstName,LastName,number) values('"+model.getFirstname()+"','"+model.getLastname()+"','"+model.getNumber()+"')");
			row = ps.executeUpdate();
			ps.close();
			con.close();
		}
		catch(SQLException e)                                                                                    
		{
			e.printStackTrace();
		}
		return row;                                                                   
	}
	public ArrayList<Integer> getIdFromDatabase(ArrayList<Integer> idList)
	{                                                                
		createDatabaseConnection();
		try
		{
			String sql = "select id from contactapp";
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);                                             
			while(rs.next())
			{
				idList.add(rs.getInt(1)); 
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return idList;
	}
	
	// public ArrayList<Contact> searchDatabase(ArrayList<Contact> contactList,int searchId)
	// {
	// 	createDatabaseConnection();
	// 	try
	// 	{
	// 		String sql = "select * from contactapp where id = '"+searchId+"'";
	// 		stmt = con.createStatement();
	// 		rs = stmt.executeQuery(sql);
	// 		int i = 0;
	// 		while(rs.next())
	// 		{
	// 			contactList.add(i,new Contact());
	// 			contactList.get(i).setId(rs.getInt("id"));
	// 			contactList.get(i).setfirstname(rs.getString("FirstName"));
	// 			contactList.get(i).setlastname(rs.getString("LastName"));
	// 			contactList.get(i). setnumber(rs.getString("number"));
	// 		}
	// 	}catch(SQLException e)
	// 	{
	// 		System.out.println(e);
	// 	}
	// 	return contactList;
	// }
	// public void deletRecord(int deleteId)
	// {
	// 	try
	// 	{
	// 		String sql = "delete from contactapp where id ='"+deleteId+"'";
	// 		stmt = con.createStatement();
	// 		stmt.executeUpdate(sql);
	// 		System.out.println("Record Sucessfully Deleted");
	// 		stmt.close();
	// 		con.close();
	// 	}catch(SQLException e)
	// 	{
	// 		System.out.println(e);
	// 	}
	// }



	public ArrayList<Contact> viewDatabase(ArrayList<Contact> contactList)
	{
		createDatabaseConnection();
		try
		{
			String sql  = "select * from contactapp" ;
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			int i = 0;
			while(rs.next())
			{
				contactList.add(i,new Contact());
				contactList.get(i).setId(rs.getInt("id"));
				contactList.get(i).setFirstname(rs.getString("FirstName"));
				contactList.get(i).setLastname(rs.getString("LastName"));
				contactList.get(i).setNumber(rs.getString("number"));
				i++;		
			}
		}
		catch(SQLException e)
		{		e.printStackTrace();	}
		return contactList;
	}
}