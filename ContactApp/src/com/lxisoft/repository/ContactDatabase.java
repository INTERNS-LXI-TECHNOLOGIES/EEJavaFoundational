package com.lxisoft.repository;
import com.lxisoft.model.*;
import com.lxisoft.servlet.*;
import java.io.*;
import java.sql.*;
import java.util.*;
public class ContactDatabase
{
	Contact model = new Contact();
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
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contactapp","root","abi@1003");	
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
			ps = con.prepareStatement("insert into contacts(name,number,email) values('"+model.getName()+"','"+model.getNumber()+"','"+model.getEmail()+"')");
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
	/*public ArrayList<Integer> getIdFromDatabase(ArrayList<Integer> idList)
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
	*/
	
	public void deletRecord(int deleteId)
	{
		createDatabaseConnection();
		try
		{
			String sql = "delete from contacts where id ='"+deleteId+"'";
			stmt = con.createStatement();
			stmt.executeUpdate(sql);
			System.out.println("Record Sucessfully Deleted");
			stmt.close();
			con.close();
		}catch(SQLException e)
		{
			System.out.println(e);
		}
	}



	public ArrayList<Contact> viewDatabase(ArrayList<Contact> contactList)
	{
		createDatabaseConnection();
		try
		{
			String sql  = "select * from contacts" ;
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			int i = 0;
			while(rs.next())
			{
				contactList.add(new Contact());
				contactList.get(i).setId(rs.getInt("id"));
				contactList.get(i).setName(rs.getString("name"));
				contactList.get(i).setNumber(rs.getString("number"));
				contactList.get(i).setEmail(rs.getString("email"));
				i++;		
			}
		}
		catch(SQLException e)
		{		e.printStackTrace();	}
		return contactList;
	}



	public void editList(Contact contact)
	{
		createDatabaseConnection();
		try
		{
			ps = con.prepareStatement("update contacts set name = '"+contact.getName()+"', number ='"+contact.getNumber()+"', email='"+contact.getEmail()+"' where id='"+contact.getId()+"'");
			ps.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
}