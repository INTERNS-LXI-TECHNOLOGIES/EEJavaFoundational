package com.mockexam.repository;
import java.io.*;
import java.sql.*;
import java.util.*;
import com.mockexam.model.*;
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
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Connecting to DataBase..........");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mockexam","root","root");
			
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
	public ArrayList<Model> getMockExamData(ArrayList<Model> examQA)
	{
		createDbConnection();
		try{
		String sql = "select * from mockexamdb";
		stmt = con.createStatement();
		rs = stmt.executeQuery(sql);
		int i=0;
		while(rs.next())
		{
			examQA.add(i,new Model());
			examQA.get(i).setId(rs.getInt("id"));
			examQA.get(i).setQuestion(rs.getString("question"));
			examQA.get(i).setOpt1(rs.getString("opt1"));
			examQA.get(i).setOpt2(rs.getString("opt2"));
			examQA.get(i).setOpt3(rs.getString("opt3"));
			examQA.get(i).setOpt4(rs.getString("opt4"));
			examQA.get(i).setAnswer(rs.getString("answer"));
			i++;
		}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return examQA;
	}
	public void updateMockExamData(Model m)
	{
		createDbConnection();
		try{
		ps = con.prepareStatement("update mockexamdb set question='"+m.getQuestion()+"',opt1='"+m.getOpt1()+"',opt2='"+m.getOpt2()+"',opt3='"+m.getOpt3()+"',opt4='"+m.getOpt4()+"',answer='"+m.getAnswer()+"'");
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
			ps = con.prepareStatement("insert into users(username,password,role) values('"+user.getUserName()+"','"+user.getPassword()+"','"+user.getRole()+"')");
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
				user.get(i).setId(rs.getInt("id"));
				user.get(i).setUserName(rs.getString("username"));
				user.get(i).setPassword(rs.getString("password"));
				user.get(i).setRole(rs.getString("role"));
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

	public ArrayList<Model> searchQuestion(ArrayList<Model> questionData,int searchId)
	{
		int i=0;
		try
		{
			String sql = "select * from mockexamdb where id = '"+searchId+"'";
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next())
			{
				questionData.add(i,new Model());
				questionData.get(i).setId(rs.getInt("id"));
				questionData.get(i).setQuestion(rs.getString("question"));
				questionData.get(i).setOpt1(rs.getString("opt1"));
				questionData.get(i).setOpt2(rs.getString("opt2"));
				questionData.get(i).setOpt3(rs.getString("opt3"));
				questionData.get(i).setOpt4(rs.getString("opt4"));
				questionData.get(i).setAnswer(rs.getString("answer"));
				i++;
			}

		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return questionData;
	}

	

}

