package com.lxisoft.repository;
import java.util.*;
import java.io.*;
import java.sql.*;
import com.lxisoft.repository.SqlRepositoryAmr;
import com.lxisoft.model.CovidAmrModel;
public class SqlRepositoryAmr
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
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Covid19","root","root");										
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
			String qry="create table if not exists Covid19(Id int primary key auto_increment,nameAmr varchar(25),addressAmr varchar(25),phnoAmr varchar(25),vehicleNoAmr varchar(25),vehicleTypeAmr varchar(25),locationAmr varchar(25),destinationAmr varchar(25),coPassengerAmr varchar(25),relationAmr varchar(25),reasonAmr varchar(25),timeAmr varchar(15))";
			ps=con.prepareStatement(qry);
			ps.execute();
	
		}
		catch(Exception e)
		{
			System.out.println("sssssss"+e);
		}
	}	
 	
	public void insertIntoDatabase(CovidAmrModel modelAmr)
	{
		try
		{
			dataBaseConnectionEstablish();
			String qry = "insert into Covid19(nameAmr,addressAmr,phnoAmr,vehicleNoAmr,vehicleTypeAmr,locationAmr,destinationAmr,coPassengerAmr,relationAmr,reasonAmr,timeAmr) values(?,?,?,?,?,?,?,?,?,?,?)";
			ps = con.prepareStatement(qry);
			ps.setString(1,modelAmr.getNameAmr());
			ps.setString(2,modelAmr.getAddressAmr());
			ps.setString(3,modelAmr.getPhnoAmr());
			ps.setString(4,modelAmr.getVehicleNoAmr());
			ps.setString(5,modelAmr.getVehicleTypeAmr());
			ps.setString(6,modelAmr.getLocationAmr());
			ps.setString(7,modelAmr.getDestinationAmr());
			ps.setString(8,modelAmr.getCoPassengerAmr());
			ps.setString(9,modelAmr.getRelationAmr());
			ps.setString(10,modelAmr.getReasonAmr());
			ps.setString(11,modelAmr.getTimeAmr());
			ps.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println("ddddddd"+e);
		}
	}
	public void updateIntoDatabase(CovidAmrModel modelAmr)
	{
		try
		{
			dataBaseConnectionEstablish();
			String qry="update Covid19 set nameAmr=?,addressAmr=?,phnoAmr=?,vehicleNoAmr=?,vehicleTypeAmr=?,locationAmr=?,destinationAmr=?,coPassengerAmr=?,relationAmr=?,reasonAmr=?,timeAmr=? where Id=?";
			ps=con.prepareStatement(qry);
			ps.setString(1,modelAmr.getNameAmr());
			ps.setString(2,modelAmr.getAddressAmr());
			ps.setString(3,modelAmr.getPhnoAmr());
			ps.setString(4,modelAmr.getVehicleNoAmr());
			ps.setString(5,modelAmr.getVehicleTypeAmr());
			ps.setString(6,modelAmr.getLocationAmr());
			ps.setString(7,modelAmr.getDestinationAmr());
			ps.setString(8,modelAmr.getCoPassengerAmr());
			ps.setString(9,modelAmr.getRelationAmr());
			ps.setString(10,modelAmr.getReasonAmr());
			ps.setString(11,modelAmr.getTimeAmr());
	 		ps.setInt(12,modelAmr.getId());
	 		ps.execute();
		}
		catch(SQLException e)
		{
			System.out.println("eeeeeeeeeee"+e);
		}
	}	
	
	public ArrayList<CovidAmrModel> readFromDatabase(ArrayList<CovidAmrModel> modelAmr)
	{
		try
		{
			this.dataBaseConnectionEstablish();
			String qry = "select * from Covid19";
			ps = con.prepareStatement(qry);
			rs = ps.executeQuery(qry);
			while(rs.next())
			{
				modelAmr.add(new CovidAmrModel());
				for(int i=0;i<models.size();i++)
				{
					if((modelAmr.get(i)).getId()==0)
					{
						modelAmr.get(i).setId(rs.getInt(1));
						modelAmr.get(i).setNameAmr(rs.getString(2));
						modelAmr.get(i).setAddressAmr(rs.getString(3));						
						modelAmr.get(i).setPhnoAmr(rs.getLong(4));
						modelAmr.get(i).setVehicleNoAmr(rs.getString(5));
						modelAmr.get(i).setVehicleTypeAmr(rs.getString(6));
						modelAmr.get(i).setLocationAmr(rs.getString(7));
						modelAmr.get(i).setDestinationAmr(rs.getString(8));
						modelAmr.get(i).setCoPassengerAmr(rs.getString(9));
						modelAmr.get(i).setRelationAmr(rs.getString(10));
						modelAmr.get(i).setReasonAmr(rs.getString(11));
						modelAmr.get(i).setTimeAmr(rs.getString(12));
			
			
					}
				}
			}			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return models;
	}
	public String selectUser(String username)
	{	
		String s=null;
		try
		{
			dataBaseConnectionEstablish();
			String qry="select rolename from users_roles where username='"+username+"'";
			ps=con.prepareStatement(qry);
			rs=ps.executeQuery(qry);
			while(rs.next())
			{
				s=rs.getString(1);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return s;
	}	


	public void addNewUser(String username,String password)
	{
		try
		{
			dataBaseConnectionEstablish();
			String qry = "Insert into users(username,password) values('"+username+"','"+password+"')";
			ps = con.prepareStatement(qry);
			ps.execute();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void userRoles(String username,String password)
	{
		try
		{
			this.addNewUser(username,password);
			String qry = "Insert into users_roles(username,rolename) values('"+username+"','user')";
			ps = con.prepareStatement(qry);
			ps.execute();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}	







