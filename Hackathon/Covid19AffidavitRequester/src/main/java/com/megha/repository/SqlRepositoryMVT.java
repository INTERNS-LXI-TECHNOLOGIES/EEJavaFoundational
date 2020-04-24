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

 	public List<RequestMVT> getAllRequestsMVT()
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
				rmvt.setNameMVT(rs.getString("Name"));
				rmvt.setPhnNoMVT(rs.getString("PhnNo"));	
				rmvt.setAddressMVT(rs.getString("Address"));
				rmvt.setVehicleNoMVT(rs.getString("VehicleNo"));	
				rmvt.setVehicleTypeMVT(rs.getString("VehicleType"));
				rmvt.setStartingLocationMVT(rs.getString("StartingLocation"));
				rmvt.setDestinationMVT(rs.getString("Destination"));
				rmvt.setStartingTimeMVT(rs.getString("StartingTime"));
				rmvt.setStartingDateMVT(rs.getString("StartingDate"));
				rmvt.setEndingTimeMVT(rs.getString("EndingTime"));
				rmvt.setEndingDateMVT(rs.getString("EndingDate"));
				rmvt.setCoPassengerNameMVT(rs.getString("CoPassengerName"));
				rmvt.setRelationMVT(rs.getString("Relation"));
				rmvt.setReasonMVT(rs.getString("Reason"));
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

	public void insertRequestMVT(RequestMVT rmvt)
 	{
 		try
 		{
	 		stmt=conn.prepareStatement("insert into request(Name,PhnNo,Address,VehicleNo,VehicleType,StartingLocation,Destination,StartingTime,StartingDate,EndingTime,EndingDate,CoPassengerName,relation,Reason)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
	 		stmt.setString(1,rmvt.getNameMVT());
	 		stmt.setString(2,rmvt.getPhnNoMVT());
	 		stmt.setString(3,rmvt.getAddressMVT());
	 		stmt.setString(4,rmvt.getVehicleNoMVT());
	 		stmt.setString(5,rmvt.getVehicleTypeMVT());
	 	    stmt.setString(6,rmvt.getStartingLocationMVT());
	 	    stmt.setString(7,rmvt.getDestinationMVT());
	 	    stmt.setString(8,rmvt.getStartingTimeMVT());
	 	    stmt.setString(9,rmvt.getStartingDateMVT());
	 	    stmt.setString(10,rmvt.getEndingTimeMVT());
	 	    stmt.setString(11,rmvt.getEndingDateMVT());
	 	    stmt.setString(12,rmvt.getCoPassengerNameMVT());
	 	    stmt.setString(13,rmvt.getRelationMVT());
	 	    stmt.setString(14,rmvt.getReasonMVT());
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