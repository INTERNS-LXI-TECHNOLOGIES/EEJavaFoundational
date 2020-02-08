package com.lxisoft.repository;
import com.lxisoft.models.*;
import java.sql.*;
import java.util.*;
import java.io.*;
 
public class SqlRepository 
{
	List<Question>questionList=new ArrayList<Question>();
	Question q;
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

	public SqlRepository()
	{
		q=new Question();
	}

	public void connectionDB()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mockexam","root","root");	
 	    }
 	    catch(Exception e)
 	    {
 	    	System.out.println("Database not connected");
 	    }
 	}

 	public List<Question> getAllQuestion()
	{
		try
		{
			questionList.clear();
			Statement smt=conn.createStatement(); 
			rs=smt.executeQuery("select * from questionlist");
			while(rs.next())
			{
				q.setQno(String.valueOf(rs.getInt("Qno")));
				q.setQuestion(rs.getString("Question"));
				q.setOption1(rs.getString("Option1"));	
				q.setOption2(rs.getString("Option2"));
				q.setOption2(rs.getString("Option3"));
				q.setOption2(rs.getString("Option4"));
				q.setOption2(rs.getString("Answer"));
				questionList.add(q);
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			System.out.println("List is empty.......");
		}
		return questionList; 
	}
}