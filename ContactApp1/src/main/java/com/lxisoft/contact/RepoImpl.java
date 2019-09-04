package com.lxisoft.contact;
import java.util.*;
import java.io.*;
import java.sql.*;
import javax.sql.DataSource;
import org.apache.log4j.Logger;

public class RepoImpl
{
 	Connection con;	
	ResultSet rs;
	
	public ArrayList<Contact> contactList=new ArrayList<Contact>();
	final static Logger logger = Logger.getLogger(RepoImpl.class);
	//public static final Logger log = Logger.getLogger(Log.class.getName());
	
	public void registration(String username,String password)
	{
		try
		{
			logger.info("***Entered Registration method***");
			DataSource ds=RepoDataSource.getMySQLDataSource();
			Connection con=ds.getConnection();
			int x=0;
			PreparedStatement ps;
			String sq="select * from registration";
			ps=con.prepareStatement(sq);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				String rsname=rs.getString("username");
				if(rsname.equals(username))
				{
					String rspassword=rs.getString("password");
					if(rspassword.equals(password))
					{
						x++;
					}
				}
			}
			if(x==0)
			{
				String sql="insert into registration(username,password) values(?,?)";
				ps=con.prepareStatement(sql);
				ps.setString(1,username);
				ps.setString(2,password);
				ps.executeUpdate();
			}
		}
		catch(Exception e){e.printStackTrace();}
	}

	public int login (String username,String password)throws ClassNotFoundException, SQLException
	{
		// try
		// {
			logger.info("***Entered Login method***");

			DataSource ds=RepoDataSource.getMySQLDataSource();
			Connection con=ds.getConnection();
			int y=0;
			PreparedStatement ps;
			ps=con.prepareStatement("select * from registration where username= '"+username+"'");
			rs=ps.executeQuery();
			while(rs.next())
				{
					String rspassword=rs.getString("password");
					if(rspassword.equals(password))
					{
						 y++;
					}
				}
				return y;
		
			// catch(Exception e){e.printStackTrace();}
				//return false;
	}
	public int createContact(Contact contact,String username)
	{
		logger.info("***Entered CreateContact method***");
		int status=0;
		try
		{
			DataSource ds=RepoDataSource.getMySQLDataSource();
			Connection con=ds.getConnection();
			PreparedStatement ps;
			String sql="INSERT INTO CONTACTLIST(Name,Contact_No,username) VALUES(?,?,?)";
			ps=con.prepareStatement(sql);
			ps.setString(1,contact.getName());
			ps.setString(2,contact.getNumber());
			ps.setString(3,username);
			status=ps.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println("Creating database......Exception");
			e.printStackTrace(); 
		}
		return status;
	}

	public ArrayList<Contact> viewContact(String username)
	{
		try
		{
			logger.info("***Entered ViewContact method***");
			DataSource ds=RepoDataSource.getMySQLDataSource();
			Connection con=ds.getConnection();
			PreparedStatement ps;
			String sql="SELECT * FROM CONTACTLIST WHERE username='"+username+"'";
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next())
			{
				Contact contact=new Contact();
				contact.setId(rs.getInt("id"));
				contact.setName(rs.getString("Name"));
				contact.setNumber(rs.getString("Contact_No"));
				contactList.add(contact);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return contactList;
	}

	//public void updateContact(int idn,String newName,String newNumber)
	public void updateContact(int id,Contact contact)
	{
		try
		{
			logger.info("***Entered UpdateContact method***");
			DataSource ds=RepoDataSource.getMySQLDataSource();
			Connection con=ds.getConnection();
			PreparedStatement ps;
			String sql="UPDATE CONTACTLIST SET Name=?,Contact_No=? WHERE id="+id+"";
			ps=con.prepareStatement(sql);
			//ps.setInt(1,idn);
			// ps.setString(1,newName);
			// ps.setString(2,newNumber);
			ps.setString(1,contact.getName());
			ps.setString(2,contact.getNumber());
			ps.executeUpdate();
		}
		catch(SQLException es)
		{
			es.printStackTrace();
		}
	}

	public void deleteContact( int id)
	{
		try
		{
			logger.info("***Entered DeleteContact method***");
			DataSource ds=RepoDataSource.getMySQLDataSource();
			Connection con=ds.getConnection();
			PreparedStatement ps;
			String sql="DELETE FROM CONTACTLIST WHERE id="+id+"";
			ps=con.prepareStatement(sql);
			ps.executeUpdate();
		}
		catch(SQLException es)
		{
			es.printStackTrace();
		}
	}

	public ArrayList<Contact> searchContact(String user,String name)
	{
		try
		{
			logger.info("***Entered SearchContact method***");
			DataSource ds=RepoDataSource.getMySQLDataSource();
			Connection con=ds.getConnection();
			System.out.println("Entering");
			PreparedStatement ps;
			ps=con.prepareStatement("SELECT * FROM CONTACTLIST WHERE Name= '"+name+"'");
			rs=ps.executeQuery();
			while(rs.next())
			{
				if(rs.getString("username").equals(user))
				{
					Contact contact=new Contact();
					// contact.setId(rs.getInt("id"));
					contact.setName(rs.getString("Name"));
					contact.setNumber(rs.getString("Contact_No"));
					contactList.add(contact);
				}
				return contactList;
			}
 		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return contactList;
	}

	public ArrayList<Contact> getAllDB(int pageid,int total,String username)
	{
		try
		{
			logger.info("***Entered GetAllDB method***");
			DataSource ds=RepoDataSource.getMySQLDataSource();
			Connection con=ds.getConnection();
			PreparedStatement ps;
			ps=con.prepareStatement("select * from contactlist limit "+(pageid-1)+","+total);
			rs=ps.executeQuery();
			while(rs.next())
			{
				Contact contact=new Contact();
				contact.setId(rs.getInt("id"));
				contact.setName(rs.getString("Name"));
				contact.setNumber(rs.getString("Contact_No"));
				contactList.add(contact);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return contactList;
	
	}
}












/*public  RepoImpl()
	{
		try
		{
			DataSource ds=RepoDataSource.getMySQLDataSource();
			Connection con=ds.getConnection();
			// Class.forName("com.mysql.jdbc.Driver");
			// System.out.println("Connecting to a selected database...");
			// con=DriverManager.getConnection("jdbc:mysql://localhost:3306/contact_db","root","root");
			// System.out.println("Creating database......");
			// System.out.println(con);
		}
		catch(Exception se)
		{
			se.printStackTrace();
   		}
	}*/