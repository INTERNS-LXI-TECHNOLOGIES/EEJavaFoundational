package com.lxisoft.Repository;
import java.util.*;
import java.io.*;
import java.sql.*;
import com.lxisoft.Control.ContactControl;
import com.lxisoft.Model.ContactModel;
import com.lxisoft.View.ContactView;
/**
	* This is a SqlRepository class used connect with database  
*/
public class SqlRepository implements Repository
{
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs=null;
	/**
		* This method for connecting database
	*/
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
	/**
		* This method to create table skeleton of table
	*/
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
	/**
		* This method to insert data to table 
		* @param contacts to get datas from arraylist 
	*/
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

	/**
        * This method for display datas from the table 
		* @return contacts to display data
		* @param contacts display data */	
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
	/**
		* This method for delete a row 
		* @param contact to get a contact
	*/
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
	/**
		* This method to update contact name
		* @param contact to update contact name
	*/
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
	/**
		* This method to update contact number
		* @param contact to update contact number
	*/	
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
	/**
		* This method to clear table data
	*/
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
	/**
		* This method to search contact 
	*/
	public void searchQuery()
	{
		try
		{
			String sql = "select * from contacts where contactName like '%";
			ps = con.prepareStatement(sql);
			ps.execute(sql);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}	
}	