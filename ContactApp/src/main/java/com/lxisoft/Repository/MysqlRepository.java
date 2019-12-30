package com.lxisoft.Repository;
import com.lxisoft.Repository.*;
import com.lxisoft.Models.*;
import com.lxisoft.Domain.*;

import java.sql.*;
import java.util.*;

public class MysqlRepository implements Repository
{
	static Connection con =null;
	static PreparedStatement stmt=null;
	static ResultSet rs=null;
	static int id=0;
	static Statement stm=null;
	ArrayList<Contact> contacts=new ArrayList<Contact> (); 
	
	{
		try
		{
			contacts=getAllContacts();
			setId();
			connection(true);
			// System.out.println("static block mysql");
		}catch(Exception p)
		{
			System.out.println("error"+p);
		}
	}
	public  void connection(boolean newsql)throws SQLException,ClassNotFoundException
	{
		try
		{
			if(newsql)
			{	Class.forName(driverName);
				con = DriverManager.getConnection(connectionName,"root","root");
				stm=con.createStatement();
				// System.out.println("Connection registered");
				checkDatabase();
				checkTable();
			}
			else
			{
				Class.forName(driverName);
				con = DriverManager.getConnection(connectionName,"root","root");
				con.setCatalog(dataBase);
				
							
			}
	//System.out.println(connectionName+dataBase);

		}
		catch(ClassNotFoundException e)
		{
		System.out.println("error connection");
		}
	}
	public  void checkDatabase()throws SQLException,ClassNotFoundException
	{
		try
		{
			boolean exist=false;
			if(con != null)
			{
				
				// System.out.println("check if a database exists using java");
				rs = con.getMetaData().getCatalogs();
				while(rs.next())
				{
					String catalogs = rs.getString(1);
					// System.out.println(catalogs+ " catalog..");
					if(dataBase.equals(catalogs))exist=true;
				}
					if(exist)
					{
						// System.out.println("the database "+dataBase+ exist);
						Class.forName(driverName);
						con = DriverManager.getConnection(connectionName,"root","root");
						con.setCatalog(dataBase);
					}
					
					else
					{
						int Result = stm.executeUpdate("CREATE DATABASE "+dataBase);
						
					}	
					// System.out.println("the d"+ exist);
						// Statement s=con.createStatement();
						// s.executeQuery("use contact");
						// s.excecute();
			}
		}catch(Exception e)
		{

		}
	}
	public  void checkTable()
	{
		boolean exist=false;
		try
		{
			rs=con.getMetaData().getTables(null,null,"tab",null);
			if(rs.next())
			{
				exist=true;
			}
			// System.out.println(" exist"+exist);
			// if(exist)
			// {
			// 	System.out.println("Table exist");
			// }
			else
			{
				stmt=con.prepareStatement("create table tab(ID int(4), FIRSTNAME  varchar(20),LASTNAME varchar(20), NUMBER varchar(50))");
				stmt.execute();
				// System.out.println("Table created succesfully");
			}connection(false);
		}catch(Exception e)
		{
				System.out.println(e+"Table creation errror");

		}
	}
	public void writeNewContact(Contact contact,boolean write)
	{
		try
		{
			// stmt=con.prepareStatement("use tab");
			// setId();
		// System.out.println("erroro"+contact.getName());
			if (write)
			{
				stmt=con.prepareStatement("insert into tab values(?,?,?,?)");
				stmt.setInt(1,id);
				stmt.setString(2,contact.getFirstName());
				stmt.setString(3,contact.getLastName());
				stmt.setString(4,contact.getNo());
				stmt.executeUpdate();
				// System.out.println(" added");
				id++;
			}
			else
			{
				stmt=con.prepareStatement("insert into tab values(?,?,?,?)");
				stmt.setInt(1,contact.getId());
				stmt.setString(2,contact.getFirstName());
				stmt.setString(3,contact.getLastName());
				stmt.setString(4,contact.getNo());
				stmt.executeUpdate();
				
				// System.out.println("contact");
			}
			
		}catch(Exception p)
		{
			System.out.println("Error "+p);
		}
	}
	public ArrayList<Contact> getAllContacts()throws SQLException, ClassNotFoundException
	{
		contacts.clear();
		try
		{
			stmt=con.prepareStatement("use tab");
			rs=stmt.executeQuery("select * from tab");
			while(rs.next())
			{
				Contact contact=new Contact();
				contact.setId(rs.getInt("ID"));
				contact.setFirstName(rs.getString("FIRSTNAME"));
				contact.setLastName(rs.getString("LASTNAME"));
				contact.setNo(rs.getString("NUMBER"));
				contacts.add(contact);
			}
		}
		catch(Exception p)
		{
			System.out.println(p+"  error");
		}
		// for(Contact a: contacts)
		// System.out.println(a.getName());
		return contacts;
	}
	public void editContact(Contact contact, int i)
	{
		try
		{
			stmt=con.prepareStatement("update tab set firstname=?, lastname=?, number=? where id=?");
			stmt.setString(1,contact.getFirstName());
			stmt.setString(2,contact.getLastName());
			stmt.setString(3,contact.getNo());
			stmt.setInt(4,contact.getId());
			stmt.executeUpdate();
			// System.out.println("contact added");
		}catch(Exception p)
		{
			System.out.println(p);
		}
	}
	public  void setId()throws SQLException, ClassNotFoundException
	{
	
		id=0;
		
		// if(contacts.size()!=0)
		// {
		// 	id=contacts.get(contacts.size()-1).getId();
		for(Contact a: contacts)
		{
			if(a.getId()>id)
				{
					id=a.getId();
				}
		// System.out.println(" id==i "+a.getId());
		}
		id++; 
		
		// System.out.println(contacts.size()+"===size id=="+id);
		
		
	}
	public void deleteContact(Contact c)throws SQLException, ClassNotFoundException
	{
		try
		{
			contacts=getAllContacts();
			stmt=con.prepareStatement("delete from tab where id=?");
			stmt.setInt(1,c.getId());
			stmt.executeUpdate();
		}catch(Exception p)
		{
			System.out.println(p);
		}
	}
	public void clearAllContacts()throws SQLException, ClassNotFoundException
	{
		try
		{
			id=0;
			stmt=con.prepareStatement("truncate table tab");
			stmt.executeUpdate();
		}catch(Exception p)
		{
			System.out.println(p);
		}
	}
	public void sortByFirstName()throws SQLException, ClassNotFoundException
  	{
  		try
		{
			contacts.clear();
			rs=stmt.executeQuery("select * from tab order by firstname");
			while(rs.next())
			{
				Contact contact=new Contact();
				contact.setId(rs.getInt("ID"));
				contact.setFirstName(rs.getString("FIRSTNAME"));
				contact.setLastName(rs.getString("LASTNAME"));
				contact.setNo(rs.getString("NUMBER"));
				contacts.add(contact);
			}
			clearAllContacts();
			resetDataBase();
		}catch(Exception e)
		// System.out.println("     "+a.getName());			
		{

		}


  	}
  	public void sortByLastName()throws SQLException, ClassNotFoundException
  	{
  		try
		{
			contacts.clear();
			rs=stmt.executeQuery("select * from tab order by lastname");
			while(rs.next())
			{
				Contact contact=new Contact();
				contact.setId(rs.getInt("ID"));
				contact.setFirstName(rs.getString("FIRSTNAME"));
				contact.setLastName(rs.getString("LASTNAME"));
				contact.setNo(rs.getString("NUMBER"));
				contacts.add(contact);
			}
			clearAllContacts();
			resetDataBase();	
		}catch(Exception e)
		// System.out.println("     "+a.getName());			
		{

		}


  	}
  	
  	public void sortById()throws SQLException, ClassNotFoundException
  	{
  		try
		{
			contacts.clear();
			rs=stmt.executeQuery("select * from tab order by id");
			while(rs.next())
			{
				Contact contact=new Contact();
				contact.setId(rs.getInt("ID"));
				contact.setFirstName(rs.getString("FIRSTNAME"));
				contact.setLastName(rs.getString("LASTNAME"));
				contact.setNo(rs.getString("NUMBER"));
				contacts.add(contact);
			}
			clearAllContacts();
			resetDataBase();
		}catch(Exception e)
		{

		}


  	}
  	public void sortByNumber()throws SQLException, ClassNotFoundException
  	{
  		try
		{
			contacts.clear();
			rs=stmt.executeQuery("select * from tab order by number");
			while(rs.next())
			{
				Contact contact=new Contact();
				contact.setId(rs.getInt("ID"));
				contact.setFirstName(rs.getString("FIRSTNAME"));
				contact.setLastName(rs.getString("LASTNAME"));
				contact.setNo(rs.getString("NUMBER"));
				contacts.add(contact);
			}
			clearAllContacts();
			resetDataBase();
		}catch(Exception e)
		{

		}

	}
	public void resetDataBase()throws SQLException, ClassNotFoundException
	{
		try
		{
		// for(Contact a: contacts)
			for (int i=0;i<contacts.size();i++) 
			{
				// System.out.println(contacts.size()+"=size "+i+"i  "+contacts.get(i).getName());			
				writeNewContact(contacts.get(i),false);
			}
		}catch(Exception e)
		{

		}setId();
	}
	public boolean loginValidate(String username, String password)throws Exception
	{
		
		boolean login=false;
		String name=null;
		String pass=null;
			System.out.println(name+pass);
			PreparedStatement st=con.prepareStatement("select * from log");
			ResultSet r=st.executeQuery();

		while(r.next())
		{
			name=r.getString("USERNAME");
			pass=r.getString("PASSWORD");
			System.out.println(name+pass);
			if(username.equals(name) && password.equals(pass))
			{
				login=true;
			}
		}
		return login;
	}
  	
}