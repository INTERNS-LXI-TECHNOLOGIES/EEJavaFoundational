package com.lxisoft.repository;
import com.lxisoft.model.*;
import com.lxisoft.servlets.*;
import java.util.*;
import java.sql.*;

public class ContactList{
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
	public void addToContactDatabase(String name,String number, String mail){
		this.databaseConnection();
		try{
			ps = con.prepareStatement("insert into contacts(name,number,email) values('"+name+"','"+number+"','"+mail+"')");
			row = ps.executeUpdate();
			response.sendRedirect("ViewContacts.jsp");
			System.out.println("Contact Added");
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}