package com.lxisoft.facegram.repo;
import java.util.*;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
import com.lxisoft.facegram.Model.*;
public class Repo
{
	PreparedStatement ps;
	Connection con;
	ResultSet rs = null;
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
				  
	              
	              
	             String insertQuery="insert into user(name,email,bio,password) values(?,?,?,?)";
	             ps=con.prepareStatement(insertQuery);
			     ps.setString(1,user.getName());
			     ps.setString(2,user.getEmail());
			     ps.setString(3,user.getBio());
			     ps.setString(4,user.getPassword());
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
	  
	  public void add(InputStream b, String name) {
			String insertQuery="insert into image(name,photo) values(?,?)";
	        try {
	        	ps=con.prepareStatement(insertQuery);
				 ps.setString(1,name);
			     ps.setBlob(2,b);
			     ps.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		    
		}
	  public UserDetails read(String username) {
		  String readQuery="select * from user where name = '"+username+"'";
		  UserDetails u = new UserDetails();
		  try {
			ps = con.prepareStatement(readQuery);
			rs = ps.executeQuery();
			while (rs.next()) {
				
				u.setName(rs.getString("name"));
				u.setEmail(rs.getString("email"));
				u.setPassword(rs.getString("password"));
				u.setBio(rs.getString("bio"));
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  return u;
	  }
	}
