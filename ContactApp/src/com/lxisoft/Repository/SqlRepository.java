package com.lxisoft.Repository;
import java.sql.*;
import java.util.*;
import java.io.*;
import com.lxisoft.model.ContactModel;
public class SqlRepository
{
	private static Connection con = null;
	private static PreparedStatement ps = null;
	public void databaseConnectionEstablishment()
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
	public void createTable()
	{
		try
		{
			this.databaseConnectionEstablishment();
			String qry = "CREATE TABLE IF NOT EXISTS Contacts(Id int NOT NULL UNIQUE AUTO_INCREMENT,ContactName varchar(20),PhoneNumber VARCHAR(15))";
			ps = con.prepareStatement(qry);
			ps.execute();
			//con.close();
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
			this.databaseConnectionEstablishment();
			this.createTable();
			String qry = "INSERT INTO Contacts values(?,?)";
			ps = con.prepareStatement(qry);
			for(int i=0;i<contacts.size();i++)
			{
				ps.setString(1,contacts.get(i).getName());
				ps.setString(2,Long.toString((contacts.get(i)).getPhoneNumber()));
				ps.execute();
			}
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}