package com.lxisoft.repository;
import java.io.*;
import com.lxisoft.model.*;
import com.lxisoft.domain.*;
import java.util.*;
import com.lxisoft.repository.*;
import java.sql.*;

public class DbRepository implements Repository
{
	Connection connection;
	PreparedStatement ps;
	PreparedStatement pd;
	PreparedStatement pu;
	Statement smt;
	{		
		makeConnection();
	}

	public void makeConnection()
	{
		try
		{			
			Class.forName("com.mysql.jdbc.Driver"); 
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/contact","root","root");
		}
		catch(ClassNotFoundException|SQLException e)
		{
			System.out.println(e);
		}	
	}

	public ArrayList<Contact> findAll()
	{
		ArrayList<Contact> contactList=new ArrayList<Contact>();
		Set<Contact> contactsSet=new TreeSet<Contact>();
		try
		{			
			Statement s=connection.createStatement();
			s.executeUpdate("create table if not exists contactList (ID int,FIRST_NAME varchar(25),LAST_NAME varchar(25),NUMBER varchar(15))");
			ps=connection.prepareStatement("insert into contactList (ID,FIRST_NAME,LAST_NAME,NUMBER) values(?,?,?,?)");
			ResultSet rs=ps.executeQuery("select * from contactList");

			while(rs.next())
			{
				Contact contact=new Contact();
				contact.setId(rs.getString("ID"));
				contact.setFName(rs.getString("FIRST_NAME"));
				contact.setLName(rs.getString("LAST_NAME"));
				contact.setNumber(rs.getString("NUMBER"));
				contactsSet.add(contact);
			}
			contactList.addAll(contactsSet);
			
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}	
		return contactList;
	}

	public void save(Contact contact) 
	{
		int id=index();
		++id;
		try
		{
			ps.setString(1,id+"");
			ps.setString(2,contact.getFName());
			ps.setString(3,contact.getLName());
			ps.setString(4,contact.getNumber());
			ps.executeUpdate();
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}	
	}

	public int index()
	{
		ArrayList<Contact> contactList=findAll();
		int n=0,x=0;
		for(int i=0;i<contactList.size();i++)
		{
			x=Integer.parseInt(contactList.get(i).getId());
			if(n<x)
				n=x;
		}
		return n;
	}

	public void delete(Contact contact)
	{
		try
		{
			pd=connection.prepareStatement("delete from contactList where ID=?");
			pd.setString(1,contact.getId());
			pd.executeUpdate();
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}	
	}
	
	public void edit(EditModel editModel,String[] tempEdit)
	{
		try
		{
			pu=connection.prepareStatement("update contactList set FIRST_NAME=?,LAST_NAME=?,NUMBER=? where ID=?");
			System.out.println("updating conatact "+editModel.getContact().getFName()+" "+editModel.getContact().getLName());
			pu.setString(1,tempEdit[0]);
			pu.setString(2,tempEdit[1]);
			pu.setString(3,tempEdit[2]);
			pu.setString(4,editModel.getContact().getId());
			pu.executeUpdate();
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}	
	}

	public void clear()
	{
		try
		{
			smt=connection.createStatement();
			smt.executeUpdate("truncate contactList");
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}	
	}

	public ArrayList<Contact> search(String searchName)
	{
		ArrayList<Contact> searchList=new ArrayList<Contact>();
		try
		{
			Statement s=connection.createStatement();
			Set<Contact> contactsSet=new TreeSet<Contact>();
			ResultSet rs=s.executeQuery("SELECT * FROM contactList WHERE concat(FIRST_NAME,' ',LAST_NAME) LIKE '%"+searchName+"%'");
			while(rs.next())
			{
				Contact contact=new Contact();
				contact.setId(rs.getString("ID"));
				contact.setFName(rs.getString("FIRST_NAME"));
				contact.setLName(rs.getString("LAST_NAME"));
				contact.setNumber(rs.getString("NUMBER"));
				contactsSet.add(contact);
			}
			searchList.addAll(contactsSet);
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}	
		return searchList;
	}

	public ArrayList<Contact> sort(String type)
	{
		ArrayList<Contact> sortList=new ArrayList<Contact>();
		try
		{
			Statement s=connection.createStatement();
			Set<Contact> contactsSet=new TreeSet<Contact>();
			String nameType=null;
			if(type.equals("f"))
			{
				nameType="FIRST_NAME";
			}
			else if(type.equals("l"))
			{
				nameType="LAST_NAME";
			}
			ResultSet rs=s.executeQuery("SELECT * FROM contactList ORDER BY "+nameType);
			while(rs.next())
			{
				Contact contact=new Contact();
				contact.setId(rs.getString("ID"));
				contact.setFName(rs.getString("FIRST_NAME"));
				contact.setLName(rs.getString("LAST_NAME"));
				contact.setNumber(rs.getString("NUMBER"));
				sortList.add(contact);
			}
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}	
		return sortList;
	}

	
}