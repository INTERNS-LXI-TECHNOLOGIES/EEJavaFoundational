package com.lxisoft.repository;
import com.lxisoft.models.*;
import java.sql.*;
import java.util.*;
import java.io.*;
 
public class SqlRepository 
{
	List<Question>questionList=new ArrayList<Question>();
	// Question q=new Question();
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

	// public SqlRepository()
	// {
	// 	q=new Question();
	// }

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

 	public Question findQuestionByQno(String d)
	{
		Question q=new Question();
		List<Question>qstn=getAllQuestion();
		for(int i=0;i<qstn.size();i++)
		{
			if((qstn.get(i).getQno()).equals(d))
			{
				q=qstn.get(i);
			}
		}
		return q;
	}

 	public List<Question> getAllQuestion()
	{
		try
		{
			Statement smt=conn.createStatement(); 
			rs=smt.executeQuery("select * from question");
			questionList.clear();
			while(rs.next())
			{
				Question q=new Question();
				q.setQno(String.valueOf(rs.getInt("Qno")));
				q.setQuestion(rs.getString("Question"));
				q.setOption1(rs.getString("Option1"));	
				q.setOption2(rs.getString("Option2"));
				q.setOption3(rs.getString("Option3"));
				q.setOption4(rs.getString("Option4"));
				q.setAnswer(rs.getString("Answer"));
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

	public void insertQuestion(Question q)
 	{
 		try
 		{
	 		stmt=conn.prepareStatement("insert into question(Question,Option1,Option2,Option3,Option4,Answer)values(?,?,?,?,?,?)");
	 		stmt.setString(1,q.getQuestion());
	 		stmt.setString(2,q.getOption1());
	 		stmt.setString(3,q.getOption2());
	 	    stmt.setString(4,q.getOption3());
	 	    stmt.setString(5,q.getOption4());
	 	    stmt.setString(6,q.getAnswer());
	 		stmt.executeUpdate();
	 		System.out.println("Successfully Inserted");
 		}
 		catch(Exception e)
 		{
 			e.printStackTrace();
 			System.out.println("Insert Failed"+e);
 		}
 	}

 	public void deleteQuestion(String i)
	{
		try
		{
			stmt=conn.prepareStatement("delete from question where Qno=?");
			stmt.setString(1,i);
			stmt.execute();
			System.out.println("Delete Successfully");
		}
		catch(SQLException e)
		{
			System.out.println("Delete Failed"+e);
		}
	}


	public Question updateQuestions(Question q,String ii)
 	{
 		try
 		{
	 		stmt=conn.prepareStatement("update question set Question= ? ,Option1= ?,Option2= ?,Option3= ?,Option4= ?, Answer=? where Qno=?");
	 		stmt.setString(1, q.getQuestion());
	 		stmt.setString(2, q.getOption1());
	 		stmt.setString(3, q.getOption2());
	 		stmt.setString(4, q.getOption3());
	 		stmt.setString(5, q.getOption4());
	 		stmt.setString(6, q.getAnswer());
	 		int i=Integer.parseInt(ii);
	 		stmt.setInt(7, i);
	 	    stmt.executeUpdate();
	 	   
	 		System.out.println("Successfully Updated");
 		}
 		catch(Exception e)
 		{
 			System.out.println("Updation Failed"+e);
 		}
 		return q;
 	}
}