package com.lxisoft.repository;
import com.lxisoft.model.*;
import java.sql.*;
import java.util.*;
public class DatabaseRepo
{
	private Connection con;
	private Statement s;
	private ResultSet r;
	public  void createDatabaseConnection()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mockexam","root","root");
		}
		catch( Exception e)
		{
			e.printStackTrace();
		}
	}

	public void addToDatabase(Question q)
	{
		createDatabaseConnection();
		try
		{
			s=con.createStatement();
			s.executeUpdate("insert into questions values('"+q.question+"','"+q.answer+"','"+q.option1+"','"+q.option2+"','"+q.option3+"')");	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

	public ArrayList<Question> PrintDatabase()
	{
		ArrayList<Question> questions= new ArrayList<Question>();
		int i = 0;
		createDatabaseConnection();
		try
		{
			s = con.createStatement();
			r = s.executeQuery("select * from questions");
			while(r.next())
			{
				questions.add(i,new Question());
				questions.get(i).setQuestion(r.getString("questions"));
				questions.get(i).setAnswer(r.getString("answere"));
				questions.get(i).setOption1(r.getString("option1"));
				questions.get(i).setOption2(r.getString("option2"));
				questions.get(i).setOption3(r.getString("option3"));
				i++;		
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();			
		}
		return questions;
	}

	public void updateDatabase(ArrayList<Question> questions)
	{
		createDatabaseConnection();
		try
			{
				s=con.createStatement();
				s.executeUpdate("truncate table questions");	
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		for(Question q : questions)
		{
			try
			{
				s=con.createStatement();
				s.executeUpdate("insert into questions values('"+q.question+"','"+q.answer+"','"+q.option1+"','"+q.option2+"','"+q.option3+"')");	
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}

	}

	public void addUser(String name , String regno)
	{
		createDatabaseConnection();
		try
		{
			s=con.createStatement();
			s.executeUpdate("insert into userinfo(name , regno) values('"+name+"','"+regno+"')");	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	
	public void addResult(String regno , int mark)
	{
		createDatabaseConnection();
		try
		{
			s=con.createStatement();
			s.executeUpdate("update userinfo set mark = " + mark +" where regno = '" + regno +"'");

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}