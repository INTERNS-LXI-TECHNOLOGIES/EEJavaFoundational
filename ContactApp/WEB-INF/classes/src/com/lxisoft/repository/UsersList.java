package com.lxisoft.repository;
import com.lxisoft.model.*;
import com.lxisoft.servlets.*;
import java.util.*;
import java.sql.*;

public class UsersList{
	Connection con = null;
	Statement stmnt = null;
	ResultSet rs = null;
	PreparedStatement ps = null;
	int row;

	public void databaseConnection(){
		try{
		    Class.forName("com.mysql.cj.jdbc.Driver");
	    	try{
		        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contactapp","root","abi@1003"); 
		    }
		    catch(SQLException e){
		        e.printStackTrace();
		    }
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
	public void addToUserDatabase(String name,String password){
		this.databaseConnection();
		try{
			ps = con.prepareStatement("insert into users(name,password) values('"+name+"','"+password+"')");
			row = ps.executeUpdate();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	public void checkUser(String name,String password){
		this.databaseConnection();
		try{
			stmnt = con.createStatement();
	    	rs = stmnt.executeQuery("select * from users where name='"+name+"'");
		    if (rs.next()) {
			    if(rs.getString(3).equals(password)){
				    respose.sendRedirect("Home.jsp");
				    System.out.println("Welcome ");
			    }
			    else{
			    	respose.sendRedirect("index.jsp");
				    System.out.println("Wrong password");
			    }
		    }
		    else{
			    System.out.println("UserName or the Password is wrong");
		    }
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
}