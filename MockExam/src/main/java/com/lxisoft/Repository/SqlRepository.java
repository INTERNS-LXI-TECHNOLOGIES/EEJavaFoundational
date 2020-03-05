package com.lxisoft.Repository;
import java.sql.*;
import java.io.*;
import com.lxisoft.Model.MockExamModel;
import java.util.ArrayList;
public class SqlRepository
{
	private static SqlRepository sqlReppo = null;
	private Connection con = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;

	public SqlRepository()
	{
		if(con == null)
		{
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MockExam","root","root");
				System.out.println("con created");		
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}	
	}
	public static SqlRepository getInstance()
	{
		if(sqlReppo == null)
			sqlReppo = new SqlRepository();

		return sqlReppo;
	}
	public void createTable()
	{
		try
		{

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public ArrayList<MockExamModel> readFromDatabase(ArrayList<MockExamModel> model)
	{
		try
		{
			String qry = "Select * from MockExam";
			ps = con.prepareStatement(qry);
			rs = ps.executeQuery(qry);
			while(rs.next())
			{
				model.add(new MockExamModel());
				for(int i=0;i<model.size();i++)
				{
					if(model.get(i).getId()==0)
					{
						model.get(i).setId(rs.getInt(1));
						model.get(i).getQuestion().setQuestion(rs.getString(2));
						model.get(i).getAnswer().setAnswer(rs.getString(3));
						model.get(i).getOption1().setOption(rs.getString(4));
						model.get(i).getOption2().setOption(rs.getString(5));
						model.get(i).getOption3().setOption(rs.getString(6));
						model.get(i).getOption4().setOption(rs.getString(7));
					}
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return model;
	}
	public void insertDataToDatabase(MockExamModel model)
	{
		try
		{
			//this.createTable();
			String qry = "insert into MockExam(Question,Answer,Option1,Option2,Option3,Option4)values(?,?,?,?,?,?)";
			ps = con.prepareStatement(qry);
			ps.setString(1,model.getQuestion().getQuestion());
			ps.setString(2,model.getAnswer().getAnswer());
			ps.setString(3,model.getOption1().getOption());
			ps.setString(4,model.getOption2().getOption());
			ps.setString(5,model.getOption3().getOption());
			ps.setString(6,model.getOption4().getOption());
			ps.execute();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void update(MockExamModel model)
	{
		try
		{
			int id = model.getId();
			String qry ="update MockExam set Question = ?,Answer = ?,Option1 = ?,Option2 = ?,Option3 = ?,Option4 = ? where Id = ?";
			ps = con.prepareStatement(qry);
			ps.setString(1,model.getQuestion().getQuestion());
			ps.setString(2,model.getAnswer().getAnswer());
			ps.setString(3,model.getOption1().getOption());
			ps.setString(4,model.getOption2().getOption());
			ps.setString(5,model.getOption3().getOption());
			ps.setString(6,model.getOption4().getOption());
			ps.setInt(7,model.getId());
			ps.execute();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void delete(int iD)
	{
		try
		{
			String qry = "delete from MockExam where Id ="+iD;
			ps = con.prepareStatement(qry);
			ps.execute();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}