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

	public int addToDatabaseAFS(User model)
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


public String checkRequestAFS(String phnumber)
	{
		createDatabaseConnection();
		String flag = "";
		try
		{
			String qry = "select flag from users where phone = '"+phnumber+"'";
			ps = con.prepareStatement(qry);
			rs = ps.executeQuery(qry);
			while(rs.next())
			{
				flag = rs.getString(1);
			}

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return flag;
	}
	

public ArrayList<User> viewDatabase(ArrayList<User> userAFS)
	{
		createDatabaseConnection();
		try
		{
			String sql  = "select * from users" ;
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			int i = 0;
			while(rs.next())
			{
				userAFS.add(i,new User());
				userAFS.get(i).setIdAFS(rs.getInt("id"));
				userAFS.get(i).setNameAFS(rs.getString("name"));
				userAFS.get(i).setPhnumberAFS(rs.getString("phone"));
				userAFS.get(i).setAdressAFS(rs.getString("adress"));
				userAFS.get(i).setVhnumberAFS(rs.getString("vhno"));
				userAFS.get(i).setVhtypeAFS(rs.getString("vhtype"));
				userAFS.get(i).setStartinglAFS(rs.getString("sstartl"));
				userAFS.get(i).setDestinationAFS(rs.getString("stopl"));
				userAFS.get(i).setSdateAFS(rs.getString("sdate"));
				userAFS.get(i).setEdateAFS(rs.getString("edate"));
				userAFS.get(i).setPassengerAFS(rs.getString("copsnger"));
				userAFS.get(i).setRelationAFS(rs.getString("relation"));
				userAFS.get(i).setReasonAFS(rs.getString("reason"));
				userAFS.get(i).setFlagAFS(rs.getInt("flag"));
				i++;		
			}
		}
		catch(SQLException e)
		{		e.printStackTrace();	}
		return userAFS;
	}


		public void setResponce(int id,int flag)
	{
		createDatabaseConnection();
		try
		{
			ps = con.prepareStatement("update users set flag = '"+flag+"'where id='"+id+"'");
			ps.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}



}	