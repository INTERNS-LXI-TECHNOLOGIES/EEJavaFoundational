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
	Contact contact=new Contact();

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
	public void addtoDatabase(String fname, String lname,String email, String contactNumber)
	{
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
	public void updateContacts(String id,String fname,String lname,String email,String phno)
	{
		createDatabaseConnection();
		contact.setIndex(id);
		contact.setFirstName(fname);
		contact.setLastName(lname);
		contact.setEmail(email);
		contact.setContactNumber(phno);
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
	public void printDatabase()
	{
		createDatabaseConnection();
		try
		{
		String sql  = "SELECT * FROM  ContactInfo" ;
		statement = connection.createStatement();
		result = statement.executeQuery(sql);
		while(result.next())
			{
		
			String fname = result.getString(2);	
			String lname = result.getString(3);
			String email = result.getString(4);
			String contactNumber = result.getString(5);
			contact.setFirstName(fname);
			contact.setLastName(lname);
			contact.setEmail(email);
			contact.setContactNumber(contactNumber);
			connection.close();
		}
	}
		catch(SQLException e)
		{
			System.out.println(e);
		}

	}
	public void searchDatabase(String name)
	{
		createDatabaseConnection();
		try
		{
		String sql  = "SELECT First_Name,Last_Name,Email,Contact_Number FROM  ContactInfo where First_Name='"+name+"'" ;
		statement = connection.createStatement();
		result = statement.executeQuery(sql);
		while(result.next())
			{
			
			String fname = result.getString(1);	
		 	String lname = result.getString(2);
			String email = result.getString(3);
			String phno = result.getString(4);
			contact.setFirstName(fname);
			contact.setLastName(lname);
			contact.setEmail(email);
			contact.setContactNumber(phno);
			connection.close();
		}
			
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
	}
}