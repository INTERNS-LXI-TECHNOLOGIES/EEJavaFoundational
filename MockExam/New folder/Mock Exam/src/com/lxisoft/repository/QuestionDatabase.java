package com.lxisoft.repository;
import com.lxisoft.model.*;
import com.lxisoft.servlet.*;
import java.io.*;
import java.sql.*;
import java.util.*;
public class QuestionDatabase
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
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/questiondb","root","root");	
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
			ps = con.prepareStatement("insert into questions(question,option1,option2,option3,option4,answer) values('"+problem.getQuestion()+"','"+problem.getOption1()+"','"+problem.getOption2()+"','"+problem.getOption3()+"','"+problem.getOption4()+"','"+problem.getAnswer()+"')");
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

		public void deletRecord(int deleteId)
	{
		createDatabaseConnection();
		try
		{
			String sql = "delete from Questions where id ='"+deleteId+"'";
			stmt = con.createStatement();
			stmt.executeUpdate(sql);
			//System.out.println("Record Sucessfully Deleted");
			stmt.close();
			con.close();
		}catch(SQLException e)
		{
			System.out.println(e);
		}
	}

}
