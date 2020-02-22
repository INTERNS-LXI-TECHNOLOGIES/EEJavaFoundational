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
					if((models.get(i)).getQuestionNumber()==0)
					{
						models.get(i).setQuestionNumber(rs.getInt(1));
						models.get(i).setQuestion(rs.getString(2));
						models.get(i).setOpt1(rs.getString(3));
						models.get(i).setOpt2(rs.getString(4));
						models.get(i).setOpt3(rs.getString(5));
						models.get(i).setOpt4(rs.getString(6));
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
		
}	


      