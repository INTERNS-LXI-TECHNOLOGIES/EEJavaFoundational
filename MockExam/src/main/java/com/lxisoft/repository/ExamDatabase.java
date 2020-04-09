package com.lxisoft.repository;
import com.lxisoft.model.*;
import com.lxisoft.servlet.*;
import java.io.*;
import java.sql.*;
import java.util.*;
public class ExamDatabase
{
	Connection con = null;
	ResultSet rs= null;
	Statement stmt = null;
	PreparedStatement ps = null;;
	int row;
	
	public void createDatabaseConnection()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			try{
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mockexam","root","root");	
			}catch(SQLException e)
			{	e.printStackTrace();	}
			
		}catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}

	public int addToDatabase(Problem problem)
	{
		createDatabaseConnection();
		try
		{
			ps = con.prepareStatement("insert into Questions(question,option1,option2,option3,option4,answer) values('"+problem.getQuestion()+"','"+problem.getOption1()+"','"+problem.getOption2()+"','"+problem.getOption3()+"','"+problem.getOption4()+"','"+problem.getAnswer()+"')");
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

	public ArrayList<Problem> viewDatabase(ArrayList<Problem> questions)
	{
		createDatabaseConnection();
		try
		{
			String sql  = "select * from Questions" ;
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			int i = 0;
			while(rs.next())
			{
				questions.add(i,new Problem());
				questions.get(i).setId(rs.getInt("id"));
				questions.get(i).setQuestion(rs.getString("question"));
				questions.get(i).setOption1(rs.getString("option1"));
				questions.get(i).setOption2(rs.getString("option2"));
				questions.get(i).setOption3(rs.getString("option3"));
				questions.get(i).setOption4(rs.getString("option4"));
				questions.get(i).setAnswer(rs.getString("answer"));
				i++;		
			}
		}
		catch(SQLException e)
		{		e.printStackTrace();	}
		return questions;
	}

		public void deletRecord(int deleteId)
	{
		createDatabaseConnection();
		try
		{
			String sql = "delete from Questions where id ='"+deleteId+"'";
			stmt = con.createStatement();
			stmt.executeUpdate(sql);
			System.out.println("Record Sucessfully Deleted");
			stmt.close();
			con.close();
		}catch(SQLException e)
		{
			System.out.println(e);
		}
	}


public ArrayList<User> viewUserDatabase(ArrayList<User> users)
	{
		createDatabaseConnection();
		try
		{
			String sql  = "select * from persons" ;
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			int i = 0;
			while(rs.next())
			{
				users.add(i,new User());
				users.get(i).setId(rs.getInt("id"));
				users.get(i).setName(rs.getString("name"));
				users.get(i).setPassword(rs.getString("password"));
				users.get(i).setRole(rs.getString("role"));
			
				i++;		
			}
		}
		catch(SQLException e)
		{		e.printStackTrace();	}
		return users;
	}
}