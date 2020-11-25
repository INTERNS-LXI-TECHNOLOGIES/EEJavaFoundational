package com.lxisoft.repository;
import com.lxisoft.control.*;
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

	public void databaseConnection() 
	{
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
			try{
				 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contact?useSSL=false&serverTimezone=Asia/Shanghai","root","Karthik1996$");

			}catch(SQLException e)
			{
				e.printStackTrace();		
			}
			
		}catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}
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


	public String addToDatabase(String name,String number,String email)

	{		     		     System.out.println(name+number);


		databaseConnection();

		int status=0;

		  try
		   {
		   	
		     System.out.println(name+number);
		     		

			
            ps=con.prepareStatement("insert into contact(NAME,Number,Email) values(?,?,?)");
		     ps.setString(1,name);
		     ps.setString(2,number);
		     ps.setString(3,email);
		  

			 System.out.println("before executed");
			int a=ps.executeUpdate();
			System.out.println("inserted :"+a);
           }
		   catch(Exception e)
		   { 
		   System.out.println(e);
				return "failed";
		   } 
		return "success";		   
    }
		public void database(ArrayList<Contact> contact)
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
		}
		public void delete(ArrayList<Contact> contact)
		{
					databaseConnection();
					try
					{
									stmt = con.createStatement();

    String sql = "delete from contact where ID=1";
stmt.executeUpdate(sql);
      System.out.println("Record deleted successfully");
			
					
				}catch(Exception e)
				{
								e.printStackTrace();

				}
		}

	
	
}