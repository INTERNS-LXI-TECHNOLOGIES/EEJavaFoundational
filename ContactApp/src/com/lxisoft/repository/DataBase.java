package com.lxisoft.repository;
import java.io.*;
import java.sql.*;
import java.util.*;
import com.lxisoft.model.*;
import com.lxisoft.servlet.*;
public class DataBase
{
	Connection con = null;
	PreparedStatement ps = null;
	Statement stmt = null;
	ResultSet rs = null;

	public void createDbConnection()
	{
		try
		{
			try
			{
				Class.forName("com.mysql.jdbc.Driver");	
			}
			catch(ClassNotFoundException e)
			{
			e.printStackTrace();
			}
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contactApp","root","root");
		}
		catch(SQLException e)
		{
			e.printStackTrace();	
		}
	}
	public void addToDatabase(Contact contact)
	{
		createDbConnection();
		try
		{
			ps = con.prepareStatement("insert into contactdb(firstname,lastname,phoneno) values('"+contact.getFirstName()+"','"+contact.getLastName()+"','"+contact.getPhoneNum()+"')");
			ps.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	public ArrayList<Contact> getAllContacts(ArrayList<Contact> contactList)
	{
		createDbConnection();
		try
		{
			String sql = "select * from contactdb";
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			int i=0;
			while(rs.next())
			{
				contactList.add(i,new Contact());
				contactList.get(i).setId(rs.getInt("id"));
				contactList.get(i).setFirstName(rs.getString("firstname"));
				contactList.get(i).setLastName(rs.getString("lastname"));
				contactList.get(i).setPhoneNum(rs.getString("phoneno"));
				i++;
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return contactList;
	}

}