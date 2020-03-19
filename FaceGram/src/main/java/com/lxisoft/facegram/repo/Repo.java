package com.lxisoft.facegram.repo;
import java.util.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import com.lxisoft.facegram.Model.*;
public class Repo
{
	PreparedStatement ps;
	Connection con;
	public Repo(){
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/facegram","root","root");
		}catch(Exception e){
			System.out.println("connection not created");
			e.printStackTrace();
		}
	}
	
	  public String addUser(UserDetails user)
		{
			//int status=0;
			  try
			   {
			     //System.out.println("qqqqq"+name+"kkkkk"+number);
				  
	              
	              
	             String insertQuery="insert into user(name,address) values(?,?)";
	             ps=con.prepareStatement(insertQuery);
			     ps.setString(1,user.getName());
			     ps.setString(2,user.getAddress());
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
	}
