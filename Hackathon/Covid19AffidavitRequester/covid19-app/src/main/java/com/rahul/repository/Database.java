package com.rahul.repository;
import com.rahul.model.Model;
import com.rahul.model.User;
import java.io.*;
import java.sql.*;
import java.util.*;
public class Database
{
	Connection con = null;
	PreparedStatement ps = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	public void createDbConnection()
	{
		try
		{
			if(con == null)
			{
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println("Connecting to DataBase..........");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/covid19","root","root");
			
			}
				
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}

	}

	public ArrayList<Model> getAffidavitData(ArrayList<Model> d)
	{
		createDbConnection();
		try{
		String sql = "select * from affidavitdb";
		stmt = con.createStatement();
		rs = stmt.executeQuery(sql);
		int i=0;
		while(rs.next())
		{
			d.add(i,new Model());
			d.get(i).setIdRmp(rs.getInt("id"));
			d.get(i).setNameRmp(rs.getString("name"));
			d.get(i).setCopassengerRmp(rs.getString("companionName"));
			d.get(i).setRelationRmp(rs.getString("relation"));
			d.get(i).setReasonRmp(rs.getString("reason"));
			d.get(i).setPhnoRmp(rs.getString("phno"));
			d.get(i).setAddressRmp(rs.getString("address"));
			d.get(i).setVehicleNoRmp(rs.getString("vehicleRegNo)"));
			d.get(i).setVehivleTypeRmp(rs.getString("vehicleType"));
			d.get(i).setStartLocRmp(rs.getString("source"));
			d.get(i).setEndLocRmp(rs.getString("Destination"));
			d.get(i).setStartDateRmp(rs.getString("startDate"));
			d.get(i).setEndDateRmp(rs.getString("returnDate"));
			d.get(i).setStartTimeRmp(rs.getString("startTime"));
			d.get(i).setEndTimeRmp(rs.getString("endTime"));
			

			i++;
		}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return d;
	}
	public void insertData(Model data)
	{
		createDbConnection();
		try
		{
			ps = con.prepareStatement("insert into affidavitdb(name,address,phno,companionName,relation,reason,source,Destination,startDate,returnDate,startTime,endTime,vehicleType,vehicleRegNo,status) values('"+data.getNameRmp()+"','"+data.getAddressRmp()+"','"+ data.getPhnoRmp()+"','"+data.getCopassengerRmp()+"','"+data.getRelationRmp()+"','"+data.getReasonRmp()+"','"+data.getStartLocRmp()+"','"+data.getEndLocRmp()+"','"+data.getStartDateRmp()+"','"+data.getEndDateRmp()+"','"+data.getStartTimeRmp()+"','"+data.getEndTimeRmp()+"','"+data.getVehivleTypeRmp()+"','"+data.getVehicleNoRmp()+"','"+data.getApprovedRmp()+"')");
			ps.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	
	public void insertUserRecord(User user)
	{
		createDbConnection();
		try
		{
			ps = con.prepareStatement("insert into users(username,password) values('"+user.getUserName()+"','"+user.getPassword()+"')");
			ps.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	public void insertUserRoles(User user)
	{
		createDbConnection();
		try
		{
			ps = con.prepareStatement("insert into user_roles(username,rolename) values('"+user.getUserName()+"','"+user.getRole()+"')");
			ps.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}

	public ArrayList<User>  getUserRecord(ArrayList<User> user)
	{
		createDbConnection();
		try
		{
			String sql = "select * from users";
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			int i=0;
			while(rs.next())
			{
				user.add(i,new User());
				user.get(i).setUserName(rs.getString("username"));
				user.get(i).setPassword(rs.getString("password"));
				i++;
			} 
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return user;
	}
	public void deleteQuestionRecord(int id)
	{
		createDbConnection();
		try
		{
			String sql = "delete from  mockexamdb where id ='"+id+"'";
			stmt = con.createStatement();
			stmt.executeUpdate(sql); 
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}	
	public String getUserRole(String username)
	{
		String userRole = " ";
		createDbConnection();
		try
		{
			String sql = "select rolename from user_roles where username = '"+ username+"' ";
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next())
			{
				userRole = rs.getString("rolename");
			} 
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return userRole; 
	}	

	public ArrayList<Model> check(ArrayList<Model> a, String no)
	{
		int i=0;
		createDbConnection();
		try
		{
			String sql = "select * from affidavitdb where phno = '"+ no+"' ";
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next())
			{
			a.add(i,new Model());
			a.get(i).setIdRmp(rs.getInt("id"));
			a.get(i).setNameRmp(rs.getString("name"));
			a.get(i).setCopassengerRmp(rs.getString("companionName"));
			a.get(i).setRelationRmp(rs.getString("relation"));
			a.get(i).setReasonRmp(rs.getString("reason"));
			a.get(i).setPhnoRmp(rs.getString("phno"));
			a.get(i).setAddressRmp(rs.getString("address"));
			a.get(i).setVehicleNoRmp(rs.getString("vehicleRegNo)"));
			a.get(i).setVehivleTypeRmp(rs.getString("vehicleType"));
			a.get(i).setStartLocRmp(rs.getString("source"));
			a.get(i).setEndLocRmp(rs.getString("Destination"));
			a.get(i).setStartDateRmp(rs.getString("startDate"));
			a.get(i).setEndDateRmp(rs.getString("returnDate"));
			a.get(i).setStartTimeRmp(rs.getString("startTime"));
			a.get(i).setEndTimeRmp(rs.getString("endTime"));
			a.get(i).setApprovedRmp(rs.getInt("status"));
			} 
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return a; 
	}	

	

}

