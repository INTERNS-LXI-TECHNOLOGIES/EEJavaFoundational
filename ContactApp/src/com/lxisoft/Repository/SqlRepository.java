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
	ResultSet rs=null;
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
			qry="create table if not exists contact(Id int primary key auto_increment,contactname varchar(25),phonenumber varchar(15))";
			ps = con.prepareStatement(qry);
			ps.execute();
			    
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
			sql = ("insert into contact(contactname,phonenumber) values(?,?)");
			ps = con.prepareStatement(sql);
			for(int i=0;i<contacts.size();i++)
			{
				//ps.setInt(1,contacts.get(i).getId());
				ps.setString(1,contacts.get(i).getName());
				ps.setLong(2,contacts.get(i).getPhoneNumber());
				ps.executeUpdate();
			}
			
		}
		catch (SQLException e)
		{
			System.out.println("qqqqqqqqq"+e);
			e.printStackTrace();
		}		
	}	
	public void updateQuery()
	{
		try
		{
			dataBaseConnectionEstablish();
			String sql;
			sql = ("update contact set contactname='am' where id=1");
			ps = con.prepareStatement(sql);
			ps.execute();	
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
	}	
	public void clearTable()
	{
		try
		{
			dataBaseConnectionEstablish();
			String sql = ("truncate table contact");
			ps = con.prepareStatement(sql);
			ps.execute();
		}
		catch(SQLException e)
		{
			System.out.println("ssssssss");
		}

	}
	public void showTable()
	{
		try
		{
			dataBaseConnectionEstablish();
			String sql;
			sql = ("select * from contact");
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery(sql);
			System.out.printf("%-20.30s %-20.30s %-20.30s%n","ID","Name","Number");
			while(rs.next())
			{
				System.out.printf("%-20.30s %-20.30s %-20.30s%n",rs.getInt(1),rs.getString(2),rs.getLong(3));
			}
		}
		catch(SQLException e)
		{
			System.out.println("fffffffffffff");
		}	
	}
}	