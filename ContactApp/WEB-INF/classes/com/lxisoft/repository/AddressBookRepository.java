package com.lxisoft.repository;
//import com.lxisoft.control.*;
import com.lxisoft.modal.*;
//import com.lxisoft.view.*;
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
			//PreparedStatement ps;
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contact","root","Karthik1996$");
			Statement stmt = con.createStatement();
	
           PreparedStatement ps=con.prepareStatement("select * from contact");
             ResultSet rs=ps.executeQuery();			 
		
			while(rs.next())
			{
				Contact contact=new Contact();
				contact.setName(rs.getString("name"));
				contact.setNumber(rs.getString("number"));
				contact.setEmail(rs.getString("email"));
				contactList.add(contact);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return contactList;
	}


	public void addToDatabase(String name,String number,String email)

	{	
	Contact contact=new Contact();	     		
	    try
		   	{

		    Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contact","root","Karthik1996$");
			Statement stmt = con.createStatement();
			System.out.println("Succesfull"+"\n");

			
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
	public void updateNumber(String newnumber,String number)
	{
	try{
	 	Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contact","root","Karthik1996$");
			Statement stmt = con.createStatement();
				String updateQuery="UPDATE contact SET number = '"+newnumber+"' where number= '"+number+"'";
				PreparedStatement ps=con.prepareStatement(updateQuery);
				ps.executeUpdate();
		   }
		catch(Exception e)
		{}
	}
	public void updateEmail(String newmail,String mail)
	{
	try{
	 	Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contact","root","Karthik1996$");
			Statement stmt = con.createStatement();
				String updateQuery="UPDATE contact SET email = '"+newmail+"' where email= '"+mail+"'";
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
	  PreparedStatement ps=con.prepareStatement(query);
	  ps.setString(1,name);
	  ps.executeUpdate();
	  System.out.println("<html><body><table><tr><td>Username</td></tr></table></body>");
	  System.out.println("testing");


	   }
	 catch(Exception e){

	}
		}

	
	
}