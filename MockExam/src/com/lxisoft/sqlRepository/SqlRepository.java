package com.lxisoft.sqlRepository;
import com.lxisoft.model.Model;
import java.util.*;
import java.io.*;
import java.sql.*;
public class SqlRepository
{
	Connection con=null;
	PreparedStatement ps=null;
	ResultSet rs=null; 
	public void databaseConnectionEstablish()
	{
	
	try
		{
			if(con==null)
			{
				Class.forName("com.mysql.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mockexam","root","root");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void createTable()
	{
		try
		{
			databaseConnectionEstablish();
		String qry;
		qry="create table if not exists exam(slno int not null unique auto_increment,qn varchar(25),opt1 varchar(250),opt2 varchar(25),opt3 varchar(25),opt4 varchar(25),ans int)";
		ps=con.prepareStatement(qry);
		ps.execute();
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
}
public void insertInto(Model model)
{
	try
	{
		createTable();
		String qry;
		qry="insert into exam(qn,opt1,opt2,opt3,opt4,ans)values(?,?,?,?,?,?)";
		ps=con.prepareStatement(qry);
		ps.setString(1,model.getQn());
		ps.setString(2,model.getOpt1());
		ps.setString(3,model.getOpt2());
		ps.setString(4,model.getOpt3());
		ps.setString(5,model.getOpt4());
		ps.setInt(6,model.getAns());
		ps.execute();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
public ArrayList<Model> selectFrom(ArrayList<Model> model)
{
	try
	{
		databaseConnectionEstablish();
		String qry;
		qry="select * from exam";
		ps=con.prepareStatement(qry);
		rs=ps.executeQuery(qry);
		while(rs.next())
		{
			model.add(new Model());
			for(int i=0;i<model.size();i++)
			{
				if(model.get(i).getQn()==null)
				{
				model.get(i).setSlno(rs.getInt(1));
				model.get(i).setQn(rs.getString(2));
				model.get(i).setOpt1(rs.getString(3));
				model.get(i).setOpt2(rs.getString(4));
				model.get(i).setOpt3(rs.getString(5));
				model.get(i).setOpt4(rs.getString(6));
				model.get(i).setAns(rs.getInt(7));

				}
			}
			
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}return model;
}
public void delete(String count)
{
	try
	{
	databaseConnectionEstablish();
		String qry;
		qry="delete from exam where slno="+count;
		ps=con.prepareStatement(qry);
		ps.execute();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}