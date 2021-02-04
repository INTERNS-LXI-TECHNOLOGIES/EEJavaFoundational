package com.lxisoft.repositry;
import com.lxisoft.model.Contact;
import com.lxisoft.servlet.*;
import java.util.*;
import java.sql.*;
import java.io.*;

public class MysqlRepositry
{
	Connection connection=null;
	Statement statement=null;
	ResultSet result =null;
	PreparedStatement preparedStatement=null;
	int row;
	ArrayList<Contact> contactList=new ArrayList<Contact>();
	public void createDatabaseConnection()
	{
		String jdbcURL="jdbc:mysql://localhost:3306/ContactApp"	;
		String jdbcUserName="root";
		String jdbcPassword="root";

		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			try
			{
				connection=DriverManager.getConnection(jdbcURL,jdbcUserName,jdbcPassword);
				
			}
			catch(SQLException e)
			{
				System.out.println(e);
			}
		}

		catch(ClassNotFoundException e)
		{
			System.out.println(e);
		}
	}
	public void addtoDatabase(Contact contact)
	{
		
		createDatabaseConnection();
		try
		{
		preparedStatement = connection.prepareStatement("INSERT INTO ContactInfo (First_Name,Last_Name,Email,Contact_Number) VALUES ('"+contact.getFirstName()+"','"+contact.getLastName()+"','"+contact.getEmail()+"','"+contact.getContactNumber()+"')");
		row = preparedStatement.executeUpdate();
		preparedStatement.close();
		connection.close();
		}
	catch(SQLException e)
		{
			System.out.println(e);
		}
	}
	public void updateContacts(Contact contact)
	{
		
		createDatabaseConnection();
		try
		{

		preparedStatement=connection.prepareStatement("UPDATE ContactInfo SET First_Name ='"+contact.getFirstName()+"',Last_Name='"+contact.getLastName()+"', Email='"+contact.getEmail()+"', Contact_Number='"+contact.getContactNumber()+"' WHERE ID='"+contact.getIndex()+"' ");
		row = preparedStatement.executeUpdate();
		preparedStatement.close();
		connection.close();
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}

	}
	public void deleteContacts(String delete)
	{
		Contact contact=new Contact();
		createDatabaseConnection();
	
		try
		{
			statement = connection.createStatement();
			statement.executeUpdate("delete from ContactInfo where First_Name='"+delete+"'");
			statement.close();
			connection.close();	
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
	}
	public ArrayList<Contact> printDatabase()
	{
		createDatabaseConnection();	
		contactList.clear();
		try
		{
		
		statement = connection.createStatement();
		preparedStatement =connection.prepareStatement("SELECT * FROM  ContactInfo");
		result = preparedStatement.executeQuery();
		while(result.next())
			{
			Contact contact = new Contact();	
			contact.setIndex(result.getString(1));
			contact.setFirstName(result.getString(2));	
			contact.setLastName(result.getString(3));
			contact.setEmail(result.getString(4));
			contact.setContactNumber(result.getString(5));
			contactList.add(contact);
			
			}
		statement.close();
	}
		catch(SQLException e)
		{
			System.out.println(e);
		}
	return contactList;

	}	
	public ArrayList<Contact> searchDatabase(String name)
	{
		
		createDatabaseConnection();
		contactList.clear();
		try
		{
		String sql  = "SELECT ID,First_Name,Last_Name,Email,Contact_Number FROM  ContactInfo where First_Name like'%"+name+"%'" ;
		statement = connection.createStatement();
		result = statement.executeQuery(sql);
		while(result.next())
			{
			 
			 Contact contact=new Contact();
			 contact.setIndex(result.getString(1));
			 contact.setFirstName(result.getString(2));	
		 	 contact.setLastName(result.getString(3));
			 contact.setEmail(result.getString(4));
			 contact.setContactNumber(result.getString(5));			 
			 contactList.add(contact);
			 
			
			}
			connection.close();
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
		return contactList;
	}
}