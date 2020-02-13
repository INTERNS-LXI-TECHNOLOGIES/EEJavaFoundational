package com.lxisoft.Repository;
import com.lxisoft.Repository.SqlRepository;
import java.util.Scanner;
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
			databaseConnectionEstablish();
			String qry;
			qry="create table if not exists mockexam(id int not null unique auto_increment,question varchar(250),opt1 varchar(25),opt2 varchar(25),opt3 varchar(25),opt4 varchar(25),ans varchar(25))";
			ps=con.prepareStatement(qry);
			ps.execute();
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
	}
 	
	public void insertQuestion()
 	{
 		try
 		{
 			databaseConnectionEstablish();
			String qry;
			qry==conn.prepareStatement"insert into mockexam(question,opt1,opt2,opt3,opt4,ans)values(?,?,?,?)";
	 		ps.executeUpdate();
	 	}
 		catch(Exception e)
 		{
 			System.out.println(e);
 		}
 	}
}

