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
	public ArrayList<MockExamModel> readFromDatabase(ArrayList<MockExamModel> model)
	{
		try
		{
			String qry = "select Questions.Id,Questions.Questions,Answers.Answers from Questions inner join Answers on Questions.Id = Answers.Id;";
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
}