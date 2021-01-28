package com.lxisoft.repositry;
import com.lxisoft.model.Contact;
import java.util.*;
import java.sql.*;

public class MysqlRepositry
{
	Connection connection=null;
	Statement statement=null;
	ResultSet result =null;
	PreparedStatement preparedStatement=null;
	int row;
	
	public void createDatabaseConnection()
	{
		Contact contact=new Contact();
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
	public void addtoDatabase(String fname, String lname,String email, String contactNumber)
	{
		Contact contact=new Contact();
		createDatabaseConnection();
		contact.setFirstName(fname);
		contact.setLastName(lname);
		contact.setEmail(email);
		contact.setContactNumber(contactNumber);
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
	public void updateContacts(String id, String fname, String lname, String email, String phno)
	{
		Contact contact=new Contact();
		createDatabaseConnection();
		try
		{

		preparedStatement=connection.prepareStatement("UPDATE ContactInfo SET First_Name ='"+fname+"',Last_Name='"+lname+"', Email='"+email+"', Contact_Number='"+phno+"' WHERE ID='"+id+"' ");
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
	public void printDatabase(ArrayList<Contact> contactList)
	{
		
		createDatabaseConnection();
		try
		{
		String sql  = "SELECT * FROM  ContactInfo" ;
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
			contactList.add(new Contact());
			
		}
		connection.close();
	}
		catch(SQLException e)
		{
			System.out.println(e);
		}

	}
	public void searchDatabase(String name, ArrayList<Contact> searchContact)
	{
		Contact contact=new Contact();
		createDatabaseConnection();
		try
		{
		String sql  = "SELECT ID,First_Name,Last_Name,Email,Contact_Number FROM  ContactInfo where First_Name like'%"+name+"%'" ;
		statement = connection.createStatement();
		result = statement.executeQuery(sql);
		while(result.next())
			{
			 
			 contact.setIndex(result.getString(1));
			 contact.setFirstName(result.getString(2));	
		 	 contact.setLastName(result.getString(3));
			 contact.setEmail(result.getString(4));
			 contact.setContactNumber(result.getString(5));			 
			 searchContact.add( new Contact());
			 
			
		}
			connection.close();
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
	}
}