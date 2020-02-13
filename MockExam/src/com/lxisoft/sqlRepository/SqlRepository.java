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
		qry="create table if not exists exam(slno int not null unique auto_increment,name varchar(25),qn varchar(250),opt1 varchar(25),opt2 varchar(25),ans varchar(25))";
		ps=con.prepareStatement(qry);
		ps.execute();
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
}
public void insertInto(String name)
{
	try
	{
		createTable();
		String qry;
		qry="insert into contacts(name)values(?)";
		ps=con.prepareStatement(qry);
		ps.setString(1,name);
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
				}
			}
			
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}return model;
}
}