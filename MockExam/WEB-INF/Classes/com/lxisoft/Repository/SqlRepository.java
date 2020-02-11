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
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mockexam","root","root");		
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
		
	}
}