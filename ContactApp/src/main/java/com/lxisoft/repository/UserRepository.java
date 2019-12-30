package com.lxisoft.repository;
import java.sql.*;
import java.util.*;
import com.lxisoft.domain.User;
/**
 *class: repository for user register operation
 */
public class UserRepository
{
	List <User> userLists=new ArrayList<User>();
	Connection con=null;
	PreparedStatement ps=null;
	{
		try
		{
			databaseConnection();
			createStorage();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 *to get database connection
	 */
	public void databaseConnection()
	{
		try
		{  
			Class.forName("com.mysql.jdbc.Driver");  
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/contact","root","root");

			// con.close();
		}
		catch(SQLException|ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	} 
	/**
	 *to create table
	 */
	public void createStorage()
	{
		try
		{
			Statement s=con.createStatement();
			s.executeUpdate("create table if not exists UserList(USER_NAME varchar(20),PASSWORD varchar(20))");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	/**
	 *to write user in to database
	 *
	 *@param user user containing user name and password
	 */
	public User saveUser(User user)
	{
		try
		{
			ps=con.prepareStatement("insert into UserList(USER_NAME,PASSWORD) values(?,?)");
			ps.setString(1,user.getUserName());
			ps.setString(2,user.getPassword());
			int x=ps.executeUpdate();
			System.out.println(""+x);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return user;
	}
	/**
	 *to read all user details from database
	 *
	 *@return arraylist of user
	 */
	public List<User> findAllUser()
	{
		try
		{
			userLists.clear();
			Statement s=con.createStatement();
			ResultSet rs=s.executeQuery("select * from UserList");
			while(rs.next())
			{
				User u=new User();
				u.setUserName(rs.getString("USER_NAME"));			
				u.setPassword(rs.getString("PASSWORD"));
				userLists.add(u);				
			}
			s.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return userLists; 
	}
}