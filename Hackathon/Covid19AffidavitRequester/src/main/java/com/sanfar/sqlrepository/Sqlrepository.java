package com.sanfar.sqlrepository;
import java.sql.*;  
import java.util.*;
import com.sanfar.model.Model;
public class Sqlrepository
{
	Connection con=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	Statement st =null;
	private static Sqlrepository sqlReppo = null;
	public void connection()
	{
		
	 try{
			if (con==null)
			{
				Class.forName("com.mysql.jdbc.Driver");  
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sanfar","root","root");
						
			}
		}catch(Exception e)
			{
			 	e.printStackTrace();
			 	System.out.println(e);
			} 
	}

	public ArrayList<Model> readRequests(ArrayList<Model> requests)
	{
		requests.clear();
		try{
			connection();
			st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from Covid19");
			Model model=null;
			while (rs.next())
			{
				model=new Model();
				model.setId(rs.getInt("ID"));
				model.setName(rs.getString("Name"));
				model.setPhoneNumber(rs.getString("PhoneNumber"));
				model.setAddress(rs.getString("Address"));
				model.setVehicleNumber(rs.getString("VehicleNumber"));
				model.setVehicleType(rs.getString("VehicleType "));
				model.setStartingLocation(rs.getString("StartingLocation"));
				model.setDestination(rs.getString("Destination "));
				model.setStartingDate(rs.getString("StartingDate"));
				model.setStartingTime(rs.getString("StartingTime"));
				model.setEndingDate(rs.getString("EndingDate"));
				model.setEndingtime(rs.getString("EndingTime"));
				model.setCopassengername(rs.getString("CopassengerName"));
				model.setRelation(rs.getString("Relation"));
				model.setReason(rs.getString("Reason"));
				requests.add(model);
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return requests;
	}
	public void writeRequest(Model model)
	{
		try{
			connection();
			String query="insert into mockexam(Name,PhoneNumber,Address,VehicleNumber,VehicleType,StartingLocation,Destination,StartingDate,StartingTime,EndingDate,EndingTime,CopassengerName,Relation,Reason,values(?,?,?,?,?)";
				ps=con.prepareStatement(query);
			 		ps.setString(1,model.getName());
			 		ps.setString(2,model.getPhoneNumber());
				 	ps.setString(3,model.getVehicleNumber());
				 	ps.setString(4,model.getVehicleType());
				 	ps.setString(5,model.getStartingLocation());
				 	ps.setString(1,model.getDestination());
			 		ps.setString(2,model.getStartingDate());
				 	ps.setString(3,model.getStartingTime());
				 	ps.setString(4,model.getEndingDate());
				 	ps.setString(5,model.getEndingtime());
				 	ps.setString(1,model.getCopassengername());
			 		ps.setString(2,model.getRelation());
				 	ps.setString(3,model.getReason());
				 	ps.execute();
		}catch(Exception e)
			{
				e.printStackTrace();
				System.out.println(e);
			} 
	}

public static Sqlrepository getInstance()
	{
		if(sqlReppo == null)
			sqlReppo = new Sqlrepository();

		return sqlReppo;
	}
	public void approval(String app)
	{
		try{
			connection();
			String query="insert into mockexam(approval,values(?)";
				ps=con.prepareStatement(query);
			 		ps.setString(1,app);
			 		
		}catch(Exception e)
			{
				e.printStackTrace();
				System.out.println(e);
			} 
	}


	public void userRoles(String username,String password)
	{
		try
		{
			connection();
			this.addUser(username,password);
			String qry = "Insert into users_roles(username,rolename) values('"+username+"','user')";
			ps = con.prepareStatement(qry);
			ps.execute();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public String authenticate(String userName)
	{
			String user="";
		try{
			connection();
			String  qry = "select rolename from users_roles where username = '"+userName+"'";
			//st = con.createStatement();
			ps = con.prepareStatement(qry);
			// ps.setString(1,userName);
			rs=ps.executeQuery(qry);
			while (rs.next())
			{
				user=rs.getString(1);	
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return user;
	}
	
	public void addUser(String username,String password)
	{
		try
		{
			connection();
			String qry = "Insert into users(username,password) values('"+username+"','"+password+"')";
			ps = con.prepareStatement(qry);
			ps.execute();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}