package com.lxisoft.repositry;
import com.lxisoft.model.Contact;
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
	public void addtoDatabase()
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
	public void updateContacts()
	{
		createDatabaseConnection();
		String id =contact.getIndex();
		try
		{
		preparedStatement=connection.prepareStatement("UPDATE ContactInfo SET First_Name='"+contact.getFirstName()+"',  Last_Name='"+contact.getLastName()+"', Email='"+contact.getEmail()+"', Contact_Number='"+contact.getContactNumber()+"' WHERE id ='"+id+"'");
		row = preparedStatement.executeUpdate();
		preparedStatement.close();
		connection.close();
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}

	}
	public void deleteContacts()
	{
		
		createDatabaseConnection();
		String delete=contact.getDeleteId();
		try
		{
			statement = connection.createStatement();
			statement.executeUpdate("delete from ContactInfo where ID='"+delete+"'");
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
		try
		{
		String sql  = "SELECT * FROM  ContactInfo" ;
		statement = connection.createStatement();
		result = statement.executeQuery(sql);
		while(result.next())
			{
			
			String id = result.getString(1);
			String fname = result.getString(2);	
			String lname = result.getString(3);
			String email = result.getString(4);
			String contactNumber = result.getString(5);
			connection.close();
		}
	}
		catch(SQLException e)
		{
			System.out.println(e);
		}

	}
}