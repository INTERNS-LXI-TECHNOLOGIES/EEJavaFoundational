package com.lxisoft.Repository;
import java.sql.*;
import java.util.*;
import java.io.*;
import com.lxisoft.model.ContactModel;
public class SqlRepository
{
	private static SqlRepository sqlReppo = null;
	private Connection con = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	private SqlRepository()
	{
		if(con == null)
		{
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ContactApp","root","root");		
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}	
	}
	public static SqlRepository getInstance()
	{
		if(sqlReppo == null)
			sqlReppo = new SqlRepository();

		return sqlReppo;
	}
	public void createTable()
	{
		try
		{
			//this.databaseConnectionEstablishment();
			String qry = "CREATE TABLE IF NOT EXISTS Contacts(Id int NOT NULL UNIQUE AUTO_INCREMENT,ContactName varchar(20),PhoneNumber VARCHAR(15))";
			ps = con.prepareStatement(qry);
			ps.execute();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	public void insertDataIntoTable(ArrayList<ContactModel> contacts)
	{
		try
		{
			//this.databaseConnectionEstablishment();
			this.createTable();
			String qry = "INSERT INTO Contacts(ContactName,PhoneNumber) values(?,?)";
			ps = con.prepareStatement(qry);
			for(int i=0;i<contacts.size();i++)
			{
				ps.setString(1,contacts.get(i).getName());
				ps.setString(2,Long.toString((contacts.get(i)).getPhoneNumber()));
				ps.execute();
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public ArrayList<ContactModel> readFromDatabase(ArrayList<ContactModel> contacts)
	{
		try
		{
			//this.databaseConnectionEstablishment();
			String qry = "select * from Contacts";
			ps = con.prepareStatement(qry);
			rs = ps.executeQuery(qry);
			while(rs.next())
			{
				contacts.add(new ContactModel());
				for(int i=0;i<contacts.size();i++)
				{
					if(contacts.get(i).getName()==null)
					{
						contacts.get(i).setId(rs.getInt(1));
						contacts.get(i).setName(rs.getString(2));
						contacts.get(i).setPhoneNumber(Long.parseLong(rs.getString(3)));
					}
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return contacts;
	}
	public void deleteContact(ContactModel contact)
	{
		try
		{
			int id = contact.getId();
			String qry = "DELETE FROM Contacts where Id = "+id;
			ps = con.prepareStatement(qry);
			ps.execute(); 
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	// public void updateContact(ContactModel contact)
	// {
	// 	try
	// 	{
	// 		int id = contact.getId();
	// 		int selectedcontact = 0;
	// 		String qry=null;
	// 		switch(selectedcontact)
	// 		{
	// 			case 1:
	// 				qry = "UPDATE contacts set ContactName = fhfgh where Id ="+id;
	// 				break;
	// 			case 2:
	// 				qry = "UPDATE contaccts set phoneNumber = 7657657 where Id ="+id;
	// 				break;
	// 			default :
	// 				System.out.println("Select Options From Above");
	// 				break;
	// 		}
	// 		ps = con.prepareStatement(qry);
	// 		ps.execute();
	// 	}
	// 	catch(Exception e)
	// 	{
	// 		e.printStackTrace();
	// 	}
	// }
	public void updateContactName(ContactModel contact)
	{
		try
		{
			int id = contact.getId();
			String qry = "UPDATE contacts set ContactName = '"+contact.getName()+"' where Id ="+id;
			ps = con.prepareStatement(qry);
			ps.execute();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void updateContactNumber(ContactModel contact)
	{
		try
		{
			int id = contact.getId();
			String qry = "UPDATE contacts set PhoneNumber = '"+contact.getPhoneNumber()+"' where Id ="+id;
			ps = con.prepareStatement(qry);
			ps.execute();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}	
	}
}