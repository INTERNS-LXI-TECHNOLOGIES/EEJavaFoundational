package com.lxisoft.repository;
// import com.lxisoft.repository.*;
import com.lxisoft.domain.*;
import com.lxisoft.models.*;
import java.sql.*;
import java.util.*;
import java.io.*;
 /**
 * Repository for Database operation
 */
public class MysqlRepository 
{
	List<Contact>contactList=new ArrayList<Contact>();
	Contact c;
	ResultSet rs=null;
	PreparedStatement stmt=null;
	Connection conn=null;
	{
		try
		{
			connectionDB();
		}
		catch(Exception e)
		{
			System.out.println("not connected");	
		}
	}
	public MysqlRepository()
	{
		c=new Contact();
	}

public Contact findContactById(String d)
	{
		Contact c=new Contact();
		List<Contact>cont=getAllContact();
		for(int i=0;i<cont.size();i++)
		{
			if((cont.get(i).getId()).equals(d))
			{
				c=cont.get(i);
			}
		}
		return c;
	}

	  /**
 * connect to database 
 */
	public void connectionDB()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/contact","root","root");	
 	    }
 	    catch(Exception e)
 	    {
 	    	System.out.println("Database not connected");
 	    }
 	}
 	public void create()
 	{
 		try
 		{ 
 			String cr="CREATE TABLE contactlist(ID int,Name varchar(25),Number varchar(25))";
			stmt.execute();
 		}
 		catch(SQLException e)
 		{
 			e.printStackTrace();
 		}
 	}
	
	  /**
 * get all contact 
 */
	   /**
 * @return contactList 
 */
	public List<Contact> getAllContact()
	{
		try
		{
			contactList.clear();
			Statement smt=conn.createStatement();
			// ResultSet 
			rs=smt.executeQuery("select * from contactlist");
			while(rs.next())
			{
				Contact c=new Contact();
				c.setId(String.valueOf(rs.getInt("ID")));
				c.setFName(rs.getString("First_Name"));
				c.setLName(rs.getString("Last_Name"));	
				c.setContactNo(rs.getString("Number"));
				contactList.add(c);
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			System.out.println("Contact list empty!!!!");
		}
		return contactList; 
	}
	  /**
 * add contact 
 */
 	public void insertContact(Contact c)
 	{
 		try
 		{
	 		stmt=conn.prepareStatement("insert into contactlist(First_Name,Last_Name,Number)values(?,?,?)");
	 		// stmt.setInt(1,Integer.parseInt(c.getId()));
	 		stmt.setString(1,c.getFName());
	 		stmt.setString(2,c.getLName());
	 	    stmt.setString(3,c.getContactNo());
	 		stmt.executeUpdate();
	 		System.out.println("Successfully Inserted");
 		}
 		catch(Exception e)
 		{
 			e.printStackTrace();
 			System.out.println("Insert Failed"+e);
 		}
 		// return contactList;
 	}
  /**
 * Edit contact 
 */
  	public Contact updateContact(String d,Contact c)
 	{
 		try
 		{
	 		stmt=conn.prepareStatement("update contactlist set First_Name= ? ,Last_Name= ?, Number=? where ID=?");
	 		stmt.setString(1, c.getFName());
	 		stmt.setString(2, c.getLName());
	 		stmt.setString(3, c.getContactNo());
	 		stmt.setString(4, d);
	 		 // c.setId(d);
	 	    stmt.executeUpdate();
	 	   
	 		System.out.println("Successfully Updated");
 		}
 		catch(Exception e)
 		{
 			System.out.println("Updation Failed"+e);
 		}
 		return c;
 	}
 	  /**
 * delete contact 
 */
 	public void deleteContact(String d)
	{
		try
		{
			stmt=conn.prepareStatement("delete from Contactlist where ID=?");
			stmt.setString(1,d);
			stmt.execute();
			System.out.println("Delete Successfully");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	// public void searchContact(String d)
	// {
	// 	try
	// 	{
	// 		// Statement smt=conn.createStatement();
	// 		// ResultSet 
	// 		rs=stmt.executeQuery("select Name,Number from contactlist where ID=?");
	// 		stmt.setString(1,d);
	// 		c.setName(rs.getString("Name"));
	// 		c.setContactNo(rs.getString("Number"));	
	// 	}
	// 	catch(SQLException e)
	// 	{
	// 		e.printStackTrace();
	// 	}
	// 	// return contactList;
	// }

	  /**
 * sort id 
 */
	   /**
 * @return contactList 
 */
	// public List<Contact> idSort()
 //  	{
 //  		contactList=getAllContact();
 //  		Collections.sort(contactList,new IdComparator());
	// 	// resetFile();
	// 	return contactList;
 //  	}
 //      /**
 // * sort name 
 // */
 //       /**
 // * @return contactList 
 // */
  	public List<Contact> nameSort()
  	{
  		contactList=getAllContact();
  		Collections.sort(contactList,new NameComparator());
		return contactList;
  	}
 //      /**
 // * sort number 
 // */
 //       /**
 // * @return contactList 
 // */
  	public List<Contact> numberSort()
  	{
  		contactList=getAllContact();
  		Collections.sort(contactList,new NoComparator());
		// resetFile();
		return contactList;
  	}
}