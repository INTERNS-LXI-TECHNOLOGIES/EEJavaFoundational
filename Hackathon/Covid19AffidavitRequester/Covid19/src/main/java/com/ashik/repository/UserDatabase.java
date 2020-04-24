package com.ashik.repository;
import com.ashik.model.*;
import com.ashik.servlet.*;
import java.io.*; 
import java.sql.*;
import java.util.*;
public class UserDatabase
{
	Connection con = null;
	ResultSet rs= null;
	Statement stmt = null;
	PreparedStatement ps = null;
	int row;
	
	public void createDatabaseConnection()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			try{
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/covid19","root","root");	
			}catch(SQLException e)
			{	e.printStackTrace();	}
			
		}catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}

	public int addToDatabase(User model)
	{
		createDatabaseConnection();
		try
		{
			ps = con.prepareStatement("insert into users(name,phone,adress,vhno,vhtype,sstartl,stopl,sdate,edate,copsnger,relation,reason,flag) values('"+model.getNameAFS()+"','"+model.getPhnumberAFS()+"','"+model.getAdressAFS()+"','"+model.getVhnumberAFS()+"','"+model.getVhtypeAFS()+"','"+model.getStartinglAFS()+"','"+model.getDestinationAFS()+"','"+model.getSdateAFS()+"','"+model.getEdateAFS()+"','"+model.getPassengerAFS()+"','"+model.getRelationAFS()+"','"+model.getReasonAFS()+"','"+model.getFlagAFS()+"')");
			row = ps.executeUpdate();
			ps.close();
			con.close();
		}
		catch(SQLException e)                                                                                    
		{
			e.printStackTrace();
		}
		return row;                                                                   
	}


}	