package com.Lxisoft.Repositry;
import com.Lxisoft.Repositry.*;
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
	public void addtoDatabase(ArrayList<Contact> data)
	{
		createDatabaseConnection();
		try
		{
		preparedstatement = connection.prepareStatement("INSERT INTO ContactInfo (First_Name,Last_Name,Email,Contact_Number) VALUES ('"+data.get(0).setFirstName()+"','"+data.get(0).setLastName()+"','"+data.get(0).setEmail()+"','"+data.get(0).setContactNumber()+"')");
		row = preparedstatement.executeUpdate();
		preparedstatement.close();
		connection.close();
		}
	catch(SQLException e)
		{
			System.out.println(e);
		}
	}
	public void updateContacts(ArrayList<Contact> data)
	{
		createDatabaseConnection();
		try
		{
		preparedStatement=connection.prepareStatement("UPDATE ContactInfo SET First_Name='"+data.get(0).setFirstName()+"',  Last_Name='"+data.get(0).setFirstName()+"', Email='"+data.get(0).setFirstName()+"', Contact_Number='"+data.get(0).setFirstName()+"' WHERE id ='"+j+"'");
		row = preparedstatement.executeUpdate();
		preparedstatement.close();
		connection.close();
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}

	}
	public void deleteContacts(ArrayList<Contact> data)
	{
		createDatabaseConnection();
		try
		{
			statement = connection.createStatement();
			statement.executeUpdate("delete from ContactInfo where ID='"+delete+"'");
			statement.close();
			connection.close();	
		}
		catch(SQLException e)
		{
			System.out.println(e)
		}
	}
	public void printDatabase(ArrayList<Contact> data)
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
		catch(SQLException e)
		{
			System.out.println(e)
		}

	}
}