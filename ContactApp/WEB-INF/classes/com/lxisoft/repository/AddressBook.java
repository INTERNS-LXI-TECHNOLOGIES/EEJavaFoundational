package com.lxisoft.repository;
//import com.lxisoft.control.*;
import com.lxisoft.modal.*;
import com.lxisoft.view.*;
import java.sql.*;
import java.util.Collections;
import java.io.*;
import java.util.ArrayList;


public class AddressBook 
{

	
	Connection con = null;
	ResultSet rs= null;
	Statement stmt = null;
	PreparedStatement ps = null;
	int row;
			ArrayList<Contact> contact=new ArrayList<Contact>();

	public ArrayList<Contact> read()
   {         System.out.println("...........");
             ArrayList<Contact> datas=new ArrayList<Contact>(); 
	         ResultSet rs;
			 try{
	         ps=con.prepareStatement("select * from contact");
             rs=ps.executeQuery();			 
             while(rs.next())
			 {	
              Contact cm=new Contact();
              cm.setName(rs.getString("name"));
			  cm.setNumber(rs.getString("number"));
			  cm.setEmail(rs.getString("email"));
			  datas.add(cm);
			  System.out.println("..........."+cm);
              System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
			 }
			 }catch(Exception e){
				 e.printStackTrace();
			 }
			 return datas;
   }


	public void addToDatabase(String name,String number,String email)

	{	
	Contact contact=new Contact();	     		    try
		   	{

		    Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contact","root","Karthik1996$");
			Statement stmt = con.createStatement();
			//out.println("Succesfull"+"\n");

			
           PreparedStatement ps=con.prepareStatement("insert into contact(NAME,Number,Email) values(?,?,?)");
		     ps.setString(1,contact.getName());
		     ps.setString(2,contact.getNumber());
		     ps.setString(3,contact.getEmail());
		  			
			int a=ps.executeUpdate();
		
         

		}catch(Exception e)
		{
		}
	}
	public void updateDatabse(String newname,String name)
	{
	try{
	 	Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contact","root","Karthik1996$");
			Statement stmt = con.createStatement();
				String updateQuery="UPDATE contact SET name = '"+newname+"' where name= '"+name+"'";
				PreparedStatement ps=con.prepareStatement(updateQuery);
				ps.executeUpdate();
		   }
		catch(Exception e)
		{}
	}
		/*public void database(ArrayList<Contact> contact)
		{
					databaseConnection();
					try
					{
					stmt=con.createStatement();
					rs=stmt.executeQuery("select * from contact");
					while(rs.next())
					{
						System.out.println("Name"+rs.getString("Name")+""+rs.getInt("Number")+""+rs.getString("Email"));
					}
				}catch(Exception e)
				{
								e.printStackTrace();

				}
		}*/
		public void delete(String name)
		{
					try{
	 Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contact","root","Karthik1996$");
			Statement stmt = con.createStatement();

	 String query="delete from contact where name=?";
	  PreparedStatement ps=con.prepareStatement(query);
	  ps.setString(1,name);
	  ps.executeUpdate();
	       	

	   }
	 catch(Exception e){

	}
		}

	
	
}