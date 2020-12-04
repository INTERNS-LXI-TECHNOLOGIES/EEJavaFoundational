package com.lxisoft.repository;
import com.lxisoft.modal.*;
import java.sql.*;
import java.util.Collections;
import java.io.*;
import java.util.ArrayList;


public class AddressBookRepository 
{

	
	Connection con = null;
	PreparedStatement ps = null;
	int row;
	   	ArrayList<Contact> contactList=new ArrayList<Contact>(); 

			
    public ArrayList<Contact> read()
	{
		try
		{

			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contact","root","Karthik1996$");

									contactList.clear();

			Statement stmt = con.createStatement();
	
           PreparedStatement ps=con.prepareStatement("select * from contact");
             ResultSet rs=ps.executeQuery();			 
		
			while(rs.next())
			{
				Contact contact=new Contact();

				contact.setID(rs.getInt("id"));
				contact.setName(rs.getString("name"));
				contact.setNumber(rs.getString("number"));
				contact.setEmail(rs.getString("email"));
				contactList.add(contact);
			}
			stmt.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return contactList;
	}
	public void edit(String id,String name,String number,String email)
	{ 
		try
		{

			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contact","root","Karthik1996$");
			Statement stm = con.createStatement();
		  ps = con.prepareStatement("update contact set NAME=?,Number=?,Email=? where ID =?");
		  ps.setString(1,name);
		     ps.setString(2,number);
		     ps.setString(3,email);
		     		  ps.setString(4,id);


		ps.executeUpdate();
		}
		catch(Exception e)
		{

		}
		
	}


	public void addToDatabase(String name,String number,String email)

	{	
	Contact contact=new Contact();	     		
	    try
		   	{

		    Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contact","root","Karthik1996$");
			Statement stmt = con.createStatement();

			
           PreparedStatement ps=con.prepareStatement("insert into contact(NAME,Number,Email) values(?,?,?)");
		     ps.setString(1,name);
		     ps.setString(2,number);
		     ps.setString(3,email);
		  			
			int a=ps.executeUpdate();
		
         

		}catch(Exception e)
		{
		}
	}
	public void updateName(String newname,String name)
	{
	try{
	 	Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contact","root","Karthik1996$");
			Statement stmt = con.createStatement();
				String updateQuery="UPDATE contact SET name = '"+newname+"' where name= '"+name+"'";
				PreparedStatement ps=con.prepareStatement(updateQuery);
				ps.executeUpdate();
		   }
		catch(Exception e)
		{}
	}
	
		
		public void deleteName(String name)
		{
					try{
	 Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contact","root","Karthik1996$");
			Statement stmt = con.createStatement();

	 String query="delete from contact where name=?";
	   ps=con.prepareStatement(query);
	  ps.setString(1,name);
	  ps.executeUpdate();
	 


	   }
	 catch(Exception e){

	}
		}

	
	
}