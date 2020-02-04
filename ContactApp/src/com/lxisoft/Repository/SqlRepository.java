package com.lxisoft.Repository;
import java.sql.*;
import java.util.ArrayList;
import java.io.*;
import com.lxisoft.model.ContactModel;
import com.lxisoft.Repository.Repository;
public class SqlRepository implements Repository
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
			String qry = "CREATE TABLE IF NOT EXISTS Contacts(Id int NOT NULL UNIQUE AUTO_INCREMENT,ContactName varchar(20),PhoneNumber VARCHAR(15))";
			ps = con.prepareStatement(qry);
			ps.execute();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	public void insertContact(ArrayList<ContactModel> contacts)
	{
		try
		{
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
	public ArrayList<ContactModel> readContact(ArrayList<ContactModel> contacts) throws Exception
	{
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
	public ArrayList<ContactModel> searchContact(String searchName,ArrayList<ContactModel> contacts) throws Exception
	{
		
		String qry = "SELECT * FROM contacts WHERE contactName LIKE '%"+searchName+"%'";
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
		return contacts;
	}
}