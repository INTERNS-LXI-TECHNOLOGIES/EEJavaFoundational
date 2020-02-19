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
 	public ArrayList<ExamModel> readFromDatabase(ArrayList<ExamModel> emodels)
	{
		try
		{
			this.dataBaseConnectionEstablish();
			String qry = "select * from mockexam";
			ps = con.prepareStatement(qry);
			rs = ps.executeQuery(qry);
			while(rs.next())
			{
				emodels.add(new ExamModel());
				for(int i=0;i<emodels.size();i++)
				{
					if((emodels.get(i)).getQuestionNumber()==0)
					{
						emodels.get(i).setQuestionNumber(rs.getInt(1));
						emodels.get(i).setQuestion(rs.getString(2));
						emodels.get(i).setOpt1(rs.getString(3));
						emodels.get(i).setOpt2(rs.getString(4));
						emodels.get(i).setOpt3(rs.getString(5));
						emodels.get(i).setOpt4(rs.getString(6));
					}
				}
			}			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return emodels;
	}
		
}	


      