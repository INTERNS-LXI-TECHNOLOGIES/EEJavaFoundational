package com.lxisoft.Repository;
import java.util.*;
import java.io.*;
import java.sql.*;
import com.lxisoft.Repository.SqlRepository;
import com.lxisoft.Model.ExamModel;
public class SqlRepository
{
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs=null;
	public void dataBaseConnectionEstablish()
	{
		if (con == null)
		{
			try
			{				
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MockExam","root","root");										
			}
			catch (Exception e)
			{
				System.out.println("eeeeeeeeeeee "+e);
			}	
		}	
	}	
	public void createTable()
	{
		try
		{
			dataBaseConnectionEstablish();
			String qry="create table if not exists mockexam(Id int primary key auto_increment,question varchar(250),opt1 varchar(25),opt2 varchar(25),opt3 varchar(25),opt4 varchar(25),ans varchar(25))";
			ps=con.prepareStatement(qry);
			ps.execute();
		}
		catch(Exception e)
		{
			System.out.println("sssssss"+e);
		}
	}	
 	public ArrayList<ExamModel> readFromDatabase(ArrayList<ExamModel> models)
	{
		try
		{
			this.dataBaseConnectionEstablish();
			String qry = "select * from mockexam";
			ps = con.prepareStatement(qry);
			rs = ps.executeQuery(qry);
			while(rs.next())
			{
				models.add(new ExamModel());
				for(int i=0;i<models.size();i++)
				{
					if((models.get(i)).getId()==0)
					{
						models.get(i).setId(rs.getInt(1));
						models.get(i).setQuestion(rs.getString(2));
						models.get(i).setOpt1(rs.getString(3));
						models.get(i).setOpt2(rs.getString(4));
						models.get(i).setOpt3(rs.getString(5));
						models.get(i).setOpt4(rs.getString(6));
						models.get(i).setAnswer(rs.getString(7));
					}
				}
			}			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return models;
	}
	public void insertIntoDatabase(ExamModel models)
	{
		try
		{
			dataBaseConnectionEstablish();
			String qry = "insert into mockexam(question,opt1,opt2,opt3,opt4,ans) values(?,?,?,?,?,?)";
			ps = con.prepareStatement(qry);
			ps.setString(1,models.getQuestion());
			ps.setString(2,models.getOpt1());
			ps.setString(3,models.getOpt2());
			ps.setString(4,models.getOpt3());
			ps.setString(5,models.getOpt4());
			ps.setString(6,models.getAnswer());
			ps.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println("ddddddd"+e);
		}
	}
	public void updateQuestion(ExamModel models)
	{
		try
		{
			//int id=models.getId();
			dataBaseConnectionEstablish();
			String qry="update mockexam set question=?,opt1=?,opt2=?,opt3=?,opt4=?,ans=? where Id=?";
			ps=con.prepareStatement(qry);
			ps.setString(1,models.getQuestion());
			ps.setString(2, models.getOpt1());
	 		ps.setString(3, models.getOpt2());
	 		ps.setString(4, models.getOpt3());
	 		ps.setString(5, models.getOpt4());
	 		ps.setString(6, models.getAnswer());
	 		ps.setInt(7,models.getId());
	 		//System.out.println("update mockexam set question="+models.getQuestion()+"Option1"+models.getOpt1()+"Option2="+models.getOpt2()+"Option3="+models.getOpt3()+"Option4="+models.getOpt4()+"Answer="+models.getAnswer()+"where id="+models.getId());
	 		ps.execute();
		}
		catch(SQLException e)
		{
			System.out.println("eeeeeeeeeee"+e);
		}
	}	
	public void deleteQuestion(int id)
	{
		try
		{
			this.dataBaseConnectionEstablish();
			String qry = "delete from mockexam where Id ="+id;
			ps = con.prepareStatement(qry);
			ps.execute();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
		
}	





