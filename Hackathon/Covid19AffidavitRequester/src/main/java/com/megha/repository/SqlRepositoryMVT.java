package com.megha.repository;
import com.megha.models.*;
import java.sql.*;
import java.util.*;
import java.io.*;
 
public class SqlRepositoryMVT 
{
	List<RequestMVT>requestList=new ArrayList<RequestMVT>();
	ResultSet rs=null;
	PreparedStatement stmt=null;
	Connection conn=null;
	{
		try
		{
			connectionDB();
		}
		catch(Exception e)
		{
			System.out.println("not connected");	
		}
	}

	public void connectionDB()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/vehicle","root","root");	
 	    }
 	    catch(Exception e)
 	    {
 	    	System.out.println("Database not connected");
 	    }
 	}

 	public List<RequestMVT> getAllRequests()
	{
		try
		{
			Statement smt=conn.createStatement(); 
			rs=smt.executeQuery("select * from request");
			requestList.clear();
			while(rs.next())
			{
				RequestMVT rmvt=new RequestMVT();
				rmvt.setId(String.valueOf(rs.getInt("Id")));
				rmvt.setName(rs.getString("Name"));
				rmvt.setPhnNo(rs.getString("PhnNo"));	
				rmvt.setAddress(rs.getString("Address"));
				rmvt.setVehicleNo(rs.getString("VehicleNo"));	
				rmvt.setVehicleType(rs.getString("VehicleType"));
				rmvt.setStartingLocation(rs.getString("StartingLocation"));
				rmvt.setDestination(rs.getString("Destination"));
				rmvt.setStartingTime(rs.getString("StartingTime"));
				rmvt.setStartingDate(rs.getString("StartingDate"));
				rmvt.setEndingTime(rs.getString("EndingTime"));
				rmvt.setEndingDate(rs.getString("EndingDate"));
				rmvt.setCoPassengerName(rs.getString("CoPassengerName"));
				rmvt.setRelation(rs.getString("Relation"));
				rmvt.setReason(rs.getString("Reason"));
				requestList.add(rmvt);
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			System.out.println("List is empty.......");
		}
		return requestList; 
	}

	public void insertRequest(RequestMVT rmvt)
 	{
 		try
 		{
	 		stmt=conn.prepareStatement("insert into request(Name,PhnNo,Address,VehicleNo,VehicleType,StartingLocation,Destination,StartingTime,StartingDate,EndingTime,EndingDate,CoPassengerName,relation,Reason)values(?,?,?,?,?,?,?,?,?,?,?,?)");
	 		stmt.setString(1,rmvt.getName());
	 		stmt.setString(2,rmvt.getPhnNo());
	 		stmt.setString(3,rmvt.getAddress());
	 		stmt.setString(4,rmvt.getVehicleNo());
	 		stmt.setString(5,rmvt.getVehicleType());
	 	    stmt.setString(6,rmvt.getStartingLocation());
	 	    stmt.setString(7,rmvt.getDestination());
	 	    stmt.setString(8,rmvt.getStartingTime());
	 	    stmt.setString(9,rmvt.getStartingDate());
	 	    stmt.setString(10,rmvt.getEndingTime());
	 	    stmt.setString(11,rmvt.getEndingDate());
	 	    stmt.setString(12,rmvt.getCoPassengerName());
	 	    stmt.setString(13,rmvt.getRelation());
	 	    stmt.setString(14,rmvt.getReason());
	 		stmt.executeUpdate();
	 		System.out.println("Successfully Inserted");
 		}
 		catch(Exception e)
 		{
 			e.printStackTrace();
 			System.out.println("Insert Failed"+e);
 		}
 	}
 }