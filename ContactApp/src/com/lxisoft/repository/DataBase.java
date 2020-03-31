<<<<<<< HEAD
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
	public boolean checkForDataBase()
	{
		boolean databaseExists = false;
		try
		{
			String nameOfDb = "contactapp";
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Creating DataBase..........");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
			rs = con.getMetaData().getCatalogs();
			while (rs.next()); 
			{
				String dbName = rs.getString(1);
				if(dbName.equals(nameOfDb))
				{
					databaseExists = true;
				}
				else
				{
					databaseExists = false;
				}				
			}			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

		return databaseExists;
	}
	public boolean checkForTable()
	{
		boolean tableExists = false;
		try
		{
			String tName = "contactdb";
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Creating DataBase..........");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
			DatabaseMetaData metadata = con.getMetaData();
			rs = metadata.getTables(null,null,"contactdb",null);
			while (rs.next()); 
			{
				String tableName = rs.getString("TABLE_NAME");
				System.out.println(tableName);
				if((tableName!=null) && tableName.equals(tName))
				{
					tableExists = true;
				}
				else 
				{
					tableExists = false;
				}				
			}			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return tableExists;	
	}
	public void createDbConnection()
	{
		boolean status = checkForDataBase();
		if(status == true)
		{
			System.out.println("DataBase Already Exists...");
			createConnection();
			boolean tableStatus = checkForTable();
			if(tableStatus == false)
			{
				useDataBase();
				createTable();
			}
			else
			{
				System.out.println("Table Already Exists...");
			}
		}
		else
		{
			createDataBase();
			useDataBase();
			createTable();
		}
	}
	public void createDataBase()
	{
		try
		{
			String sql = "CREATE DATABASE contactapp";
			stmt = con.createStatement();
			stmt.executeUpdate(sql);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	public void useDataBase()
	{
		try
		{
			String sql = "use contactapp";
			stmt = con.createStatement();
			stmt.executeUpdate(sql);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	public void createTable()
	{
		try
		{
			String sql ="create table contactdb(id int not null auto_increment,firstname varchar(25) not null,lastname varchar(25) not null,fullname varchar(25) not null,phoneno varchar(25) not null,primary key(id,phoneno))";
			stmt = con.createStatement();
			stmt.executeUpdate(sql);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}	
	}
	public void createConnection()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");	
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contactapp","root","root");
		}
		catch(Exception e)
		{
			e.printStackTrace();	
		}
	}
	public void addToDatabase(Contact contact)
	{
		createDbConnection();
		try
		{
			ps = con.prepareStatement("insert into contactdb(firstname,lastname,fullname,phoneno) values('"+contact.getFirstName()+"','"+contact.getLastName()+"','"+contact.getFullName()+"','"+contact.getPhoneNum()+"')");
			ps.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	public ArrayList<Contact> getAllContacts(ArrayList<Contact> contactList)
	{
		contactList.clear();
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
	public void updateDb(Contact contact)
	{
		createDbConnection();
		try
		{
			ps = con.prepareStatement("update contactdb set firstname='"+contact.getFirstName()+"',lastname ='"+contact.getLastName()+"',fullname = '"+contact.getFullName()+"', phoneno='"+contact.getPhoneNum()+"' where id='"+contact.getId()+"'");
			ps.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	public void deleteFromDb(int id)
	{
		createDbConnection();
		try
		{
			System.out.println(id);
			String sql = "delete from contactdb where id='"+id+"'";
			stmt = con.createStatement();
			stmt.executeUpdate(sql);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	public ArrayList<Contact> searchDbByName(ArrayList<Contact> contactList,String name)
	{
		createDbConnection();
		try
		{
			System.out.println(name);
			String sql = "select * from contactdb where fullname  like '"+name.charAt(0)+"%'";
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
=======
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
	public boolean checkForDataBase()
	{
		boolean databaseExists = false;
		try
		{
			String nameOfDb = "contactapp";
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Creating DataBase..........");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
			rs = con.getMetaData().getCatalogs();
			while (rs.next()); 
			{
				String dbName = rs.getString(1);
				if(dbName.equals(nameOfDb))
				{
					databaseExists = true;
				}
				else
				{
					databaseExists = false;
				}				
			}			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

		return databaseExists;
	}
	public boolean checkForTable()
	{
		boolean tableExists = false;
		try
		{
			String tName = "contactdb";
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Creating DataBase..........");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
			DatabaseMetaData metadata = con.getMetaData();
			rs = metadata.getTables(null,null,"contactdb",null);
			while (rs.next()); 
			{
				String tableName = rs.getString("TABLE_NAME");
				System.out.println(tableName);
				if((tableName!=null) && tableName.equals(tName))
				{
					tableExists = true;
				}
				else 
				{
					tableExists = false;
				}				
			}			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return tableExists;	
	}
	public void createDbConnection()
	{
		boolean status = checkForDataBase();
		if(status == true)
		{
			System.out.println("DataBase Already Exists...");
			createConnection();
			boolean tableStatus = checkForTable();
			if(tableStatus == false)
			{
				useDataBase();
				createTable();
			}
			else
			{
				System.out.println("Table Already Exists...");
			}
		}
		else
		{
			createDataBase();
			useDataBase();
			createTable();
		}
	}
	public void createDataBase()
	{
		try
		{
			String sql = "CREATE DATABASE contactapp";
			stmt = con.createStatement();
			stmt.executeUpdate(sql);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	public void useDataBase()
	{
		try
		{
			String sql = "use contactapp";
			stmt = con.createStatement();
			stmt.executeUpdate(sql);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	public void createTable()
	{
		try
		{
			String sql ="create table contactdb(id int not null auto_increment,firstname varchar(25) not null,lastname varchar(25) not null,fullname varchar(25) not null,phoneno varchar(25) not null,primary key(id,phoneno))";
			stmt = con.createStatement();
			stmt.executeUpdate(sql);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}	
	}
	public void createConnection()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");	
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contactapp","root","root");
		}
		catch(Exception e)
		{
			e.printStackTrace();	
		}
	}
	public void addToDatabase(Contact contact)
	{
		createDbConnection();
		try
		{
			ps = con.prepareStatement("insert into contactdb(firstname,lastname,fullname,phoneno) values('"+contact.getFirstName()+"','"+contact.getLastName()+"','"+contact.getFullName()+"','"+contact.getPhoneNum()+"')");
			ps.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	public ArrayList<Contact> getAllContacts(ArrayList<Contact> contactList)
	{
		contactList.clear();
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
	public void updateDb(Contact contact)
	{
		createDbConnection();
		try
		{
			ps = con.prepareStatement("update contactdb set firstname='"+contact.getFirstName()+"',lastname ='"+contact.getLastName()+"', phoneno='"+contact.getPhoneNum()+"' where id='"+contact.getId()+"'");
			ps.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	public void deleteFromDb(int id)
	{
		createDbConnection();
		try
		{
			System.out.println(id);
			String sql = "delete from contactdb where id='"+id+"'";
			stmt = con.createStatement();
			stmt.executeUpdate(sql);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	public ArrayList<Contact> searchDbByFullName(ArrayList<Contact> contactList,String fullname)
	{
		createDbConnection();
		try
		{
			String sql = "select * from contactdb where fullname ='"+fullname+"'";
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
>>>>>>> b81f6fd2e67710b4348ee6ebc133966c3528ddee
}