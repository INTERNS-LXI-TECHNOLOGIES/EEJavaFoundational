package com.lxisoft.contacts.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.lxisoft.contacts.domain.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

@Repository
public class repoController 
{
	Connection con=null;
	PreparedStatement stmt=null;
	ResultSet rs=null;
	ArrayList<Contact> contacts=new ArrayList<Contact>();
	
	
	 public void setConnection()
 	 {
 	 	try
 	 	{
 	 		Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/contact","root","root");
			// stm.executeUpdate("CREATE DATABASE "+dataBase)
			
 	 	}catch(Exception e)
 	 	{
 	 		System.out.println("error in connection "+e);
 	 	}
 	 }
	 
	 public ArrayList<Contact> getWords()
 	 {
		 setConnection();
 	 	contacts.clear();
 	 	try
 	 	{
 	 		Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/contact","root","root");
			
			stmt=con.prepareStatement("use tab");
			rs=stmt.executeQuery("select * from tab");
			while(rs.next())
			{
				Contact contact=new Contact();
				contact.setId(rs.getInt("ID"));
				contact.setFirstName(rs.getString("FIRSTNAME"));
				contact.setLastName(rs.getString("LASTNAME"));
				contact.setNo(rs.getString("NUMBER"));
				contacts.add(contact);
			}

			con.close();
 		}catch(Exception e)
 	 	{
 	 		System.out.println("error in getting "+e);
 	 	}
 	 	
 	 	return contacts;
 	 }
	

}
