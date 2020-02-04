package com.lxisoft.Repository;
import java.util.*;
import java.io.*;
import java.sql.*;
import com.lxisoft.Control.ContactControl;
import com.lxisoft.Model.ContactModel;
import com.lxisoft.View.ContactView;
public class SqlRepository implements Repository
{
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs=null;
	public void dataBaseConnectionEstablish()
	{
		if (con == null)
		{
			try
			{				
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Contacts","root","root");										
			}
			catch (Exception e)
			{
				System.out.println("eeeeeeeeeeee "+e);
			}	
		}	
	}
	public void createTable()
	{
		try 
		{
			dataBaseConnectionEstablish();
			String qry;
			qry="create table if not exists contacts(Id int primary key auto_increment,contactname varchar(25),phonenumber varchar(15))";
			ps = con.prepareStatement(qry);
			ps.execute();			    
		}
		catch (SQLException e)
		{		
			System.out.println("rrrr");	
			e.printStackTrace();
		}		
	}
	public void  writeToDatabase(ArrayList<ContactModel> contacts)
	{
		try
		{
			dataBaseConnectionEstablish();
			String sql;
			sql = "insert into contacts(contactname,phonenumber) values(?,?)";
			ps = con.prepareStatement(sql);
			for(int i=0;i<contacts.size();i++)
			{
				ps.setString(1,contacts.get(i).getName());
				ps.setLong(2,contacts.get(i).getPhoneNumber());
				ps.executeUpdate();
			}			
		}
		catch (SQLException e)
		{
			System.out.println("qqqqqqqqq"+e);
			e.printStackTrace();
		}		
	}	
	public ArrayList<ContactModel> readFromDatabase(ArrayList<ContactModel> contacts)
	{
		try
		{
			System.out.println("Sql Repository");
			dataBaseConnectionEstablish();
			String sql;
			sql = "select * from contacts";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery(sql);
			//System.out.printf("%-20.30s %-20.30s %-20.30s%n","ID","Name","Number");
			while(rs.next())
			{
				contacts.add(new ContactModel());
				for(int i=0;i<contacts.size();i++)
				{
					if(contacts.get(i).getName()==null)
					{
						contacts.get(i).setId(rs.getInt(1));
						contacts.get(i).setName(rs.getString(2));
						contacts.get(i).setPhoneNumber(rs.getLong(3));
					}
				}	
			}
		}
		catch(SQLException e)
		{
			System.out.println("fffffffffffff");
		}	
		return contacts;
	}
	public void deleteQuery(ContactModel contact)
	{
		try
		{
			dataBaseConnectionEstablish();
			int id = contact.getId();
			String sql;
			sql="delete from contacts where Id="+id;
			ps=con.prepareStatement(sql);
			ps.execute();
		}
		catch(SQLException e)
		{
			System.out.println("dddddddddd");
		}
	}
	public void updateContactName(ContactModel contact)
	{
		try
		{
			dataBaseConnectionEstablish();
			int id= contact.getId();
			String sql;
			sql = "update contacts set contactname='"+contact.getName()+"' where id="+id;
			ps = con.prepareStatement(sql);
			ps.execute();	
			
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
	}	
	public void updateContactNumber(ContactModel contact)
	{
		try
		{
			dataBaseConnectionEstablish();
			int id = contact.getId();
			String sql = "update contacts set phonenumber = '"+contact.getPhoneNumber()+"' where Id ="+id;
			ps = con.prepareStatement(sql);
			ps.execute();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}	
	}
	public void clearTable()
	{
		try
		{
			dataBaseConnectionEstablish();
			String sql = "truncate table contact";
			ps = con.prepareStatement(sql);
			ps.execute();
		}
		catch(SQLException e)
		{
			System.out.println("ssssssss");
		}
	}
	
}	