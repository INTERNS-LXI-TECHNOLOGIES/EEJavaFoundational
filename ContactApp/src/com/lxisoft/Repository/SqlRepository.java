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
		if (con == null)
		{
			try
			{
				
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Contacts","root","root");	
									
			}

			catch (Exception e)
			{
				System.out.println("eeeeeeeeeeee "+e);
			}	
		}	
	}
	public void createTable()
	{
		try 
		{
			dataBaseConnectionEstablish();
			String qry;
			qry="create table if not exists contact(Id int primary key auto_increment,contactname varchar(15),phonenumber int)";
			ps = con.prepareStatement(qry);
			ps.execute();
			//con.close();			     
		}
		catch (SQLException e)
		{		
			System.out.println("rrrr");	
			e.printStackTrace();
		}		
	}
	public void insertQuery(ArrayList<ContactModel> contacts)
	{
		try
		{
			dataBaseConnectionEstablish();
			String sql;
			sql = ("insert into contact(Id,contactname,phonenumber) values(?,?,?)");
			ps = con.prepareStatement(sql);
			for(int i=0;i<contacts.size();i++)
			{
				ps.setInt(1,contacts.get(i).getId());
				ps.setString(2,contacts.get(i).getName());
				ps.setLong(3,contacts.get(i).getPhoneNumber());
				ps.executeUpdate();
			}
			con.close();
		}
		catch (Exception e)
		{
			System.out.println("qqqqqqqqq"+e);
			e.printStackTrace();
		}		
	}		
}	