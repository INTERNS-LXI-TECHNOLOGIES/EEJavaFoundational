package com.lxisoft.repository;
import com.lxisoft.model.*;
import com.lxisoft.servlet.*;
import java.io.*;
import java.sql.*;
import java.util.*;

public class UsersDatabase{
	Connection con = null;
	PreparedStatement ps =null;
	ResultStatement rs = null;
	Statement stmnt = null;

	public void createDatabaseConnection()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			try{
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contactapp","root","abi@1003");	
			}catch(SQLException e)
			{	e.printStackTrace();	}
			
		}catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}

	public void addUsers(){
		createDatabaseConnection();
		try{
			ps = con.prepareStatement("insert into users(name,password) values('"+model.getName()+"','"+model.getNumber()+"','"+model.getEmail()+"')");
			row = ps.executeUpdate();
			ps.close();
			con.close();
		}
		catch(SQLException e)                                                                                    
		{
			e.printStackTrace();
		}
		//return row;                                                                   
	}

}