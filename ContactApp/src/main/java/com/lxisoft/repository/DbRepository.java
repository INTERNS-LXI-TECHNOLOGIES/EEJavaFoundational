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
			s.executeUpdate("create table if not exists contactList (ID int,NAME varchar(25),NUMBER varchar(15))");
			ps=connection.prepareStatement("insert into contactList (ID,NAME,NUMBER) values(?,?,?)");
			ResultSet rs=ps.executeQuery("select * from contactList");

			while(rs.next())
			{
				Contact contact=new Contact();
				contact.setId(rs.getString("ID"));
				contact.setName(rs.getString("NAME"));
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
			ps.setString(2,contact.getName());
			ps.setString(3,contact.getNumber());
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
			ArrayList<Contact> contactList=findAll();
			for(int i=0;i<contactList.size();i++)
			{
				if(contactList.get(i).getName().equals(contact.getName()))
				{
					System.out.println("deleting conatact "+contactList.get(i).getName());
					pd.setString(1,contactList.get(i).getId());
					pd.executeUpdate();
				}
			}
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}	
	}
	
	public void edit(EditModel editModel,String[] tempEdit)
	{
		System.out.println("updating conatact "+editModel.getContact().getName());
		try
		{
			pu=connection.prepareStatement("update contactList set NAME=?,NUMBER=? where ID=?");
			ArrayList<Contact> contactList=findAll();
			for(int i=0;i<contactList.size();i++)
			{
				if(contactList.get(i).getName().equals(editModel.getContact().getName()))
				{
					System.out.println("updating conatact "+editModel.getContact().getName());
					pu.setString(1,tempEdit[0]);
					pu.setString(2,tempEdit[1]);
					pu.setString(3,contactList.get(i).getId());
					pu.executeUpdate();
				}
			}
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


}



// public void table()
	// {
	// 	try
	// 	{
	// 		String[] t=new View().newTable();
	// 		String q="create table if not exists xyz("+t[0]+" varchar(20),"+t[1]+" varchar(20),"+t[2]+" varchar(20 ))";
	// 		Statement s=connection.createStatement();
	// 		s.executeUpdate(q);
	// 		s.executeUpdate("drop table ashiq");
	// 		'"+c1.NAME+"','"+c1.EMAILID+"','"+c1.MOB+"'
	// 		PreparedStatement pt=connection.prepareStatement("create table if not exists ashiq(? int,? varchar(25),? varchar(15))");	
	// 		pt.setString(1,t[0]);
	// 		pt.setString(2,t[1]);
	// 		pt.setString(3,t[2]);
	// 		pt.executeUpdate();
	// 	}
	// 	catch(SQLException e)
	// 	{
	// 		System.out.println(e);
	// 	}
	// }