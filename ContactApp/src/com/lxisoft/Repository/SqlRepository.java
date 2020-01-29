package com.lxisoft.Repository;
import java.util.*;
import java.io.*;
import java.sql.*;
import com.lxisoft.Control.ContactControl;
import com.lxisoft.Model.ContactModel;
import com.lxisoft.View.ContactView;
public class SqlRepository
{
	Connection con = null;
	PreparedStatement ps = null;
	public void dataBaseConnectionEstablish()
	{
	
		try
		{
			if (con == null)
			{
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Contacts","root","root");	
			}					
		}
		catch (Exception e)
		{
			System.out.println("eeeeeeeeeeee"+e);
			}		
	}
	public void createTable()
	{
		try 
		{
			dataBaseConnectionEstablish();
			String qry;
			qry="create table contact(Id int,contactname varchar(15),phonenumber int)";
			ps = con.prepareStatement(qry);
			ps.execute();			     
		}
		catch (SQLException e)
		{			
			e.printStackTrace();
		}		
	}
		
}	