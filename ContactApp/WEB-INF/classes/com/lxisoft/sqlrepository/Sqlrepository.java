package com.lxisoft.sqlrepository;
import com.lxisoft.model.*;
import java.util.*;
import com.lxisoft.repository.*;
import com.lxisoft.servlet.*;
import java.sql.*;
import java.io.*;
public class Sqlrepository implements Repository
{
	ArrayList <Contact> contactList = new ArrayList<Contact>();
	Connection con; 
	ResultSet rs ;
	PreparedStatement stmnt; 
	{
		sqlrepository();
	}

	public void sqlrepository()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");  
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abhijith","root","root");
        }  
        catch(Exception e)
        {
        	System.out.println(e);
        }                             
	}
	public void write(Contact contact, boolean isTrue)
	{
		
		try
		{
			
	     	stmnt = con.prepareStatement("insert into contact (name,number)values(?,?)");
			stmnt.setString(1,contact.getName());
			stmnt.setString(2,contact.getNumber());
			stmnt.executeUpdate();
		
	    }
	    catch(Exception e)
	    {
	    	System.out.println(e);
	    }
		
		
	}
	public ArrayList <Contact> read()
	{
		try
		{
			contactList.clear();
			Statement s = con.createStatement();
			 rs = s.executeQuery("select * from contact");
			while(rs.next())
			{
				Contact contact = new Contact();
				contact.setId(rs.getInt("id"));
				contact.setName(rs.getString("name"));
				contact.setNumber(rs.getString("number"));
				contactList.add(contact);

			}
			s.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return contactList;
	}
	public void edit(Contact contact)
	{ 
		try
		{
		stmnt = con.prepareStatement("update contact set name=?,number=? where id =?");
		stmnt.setString(1,contact.name);
		stmnt.setString(2,contact.number);
		stmnt.setInt(3,contact.id);
		stmnt.executeUpdate();
		}
		catch(Exception e)
		{

		}
		
	}
	public void delete(int id)
	{
		try
		{
		stmnt = con.prepareStatement("delete from contact where id = ? ");
		stmnt.setInt(1,id);
		stmnt.executeUpdate();

		}
		catch(Exception ee)
		{

		}
	}
	public void clear()
	{
		try
		{
			stmnt= con.prepareStatement("TRUNCATE TABLE contact");
			stmnt.executeUpdate();
		}
		catch(Exception ee)
		{
			System.out.println(ee);
		}
	}
	
}