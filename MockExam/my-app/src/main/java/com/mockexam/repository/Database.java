package com.mockexam.repository;
import java.io.*;
import java.sql.*;
import java.util.*;
import com.mockexam.model.*;
public class Database
{
	Connection con = null;
	PreparedStatement ps = null;
	Statement stmt = null;
	ResultSet rs = null;
	public boolean checkForDataBase()
	{
		boolean databaseExists = false;
		try
		{
			String nameOfDb = "mockexam";
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Creating DataBase..........");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
			rs = con.getMetaData().getCatalogs();
			while (rs.next()); 
			{
				String dbName = rs.getString(1);
				if(dbName.equals(nameOfDb))
				{
					databaseExists = true;
				}
				else
				{
					databaseExists = false;
				}				
			}			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

		return databaseExists;
	}
	public boolean checkForTable()
	{
		boolean tableExists = false;
		try
		{
			String tName = "contactdb";
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Creating DataBase..........");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
			DatabaseMetaData metadata = con.getMetaData();
			rs = metadata.getTables(null,null,"mockexamdb",null);
			while (rs.next()); 
			{
				String tableName = rs.getString("TABLE_NAME");
				System.out.println(tableName);
				if((tableName!=null) && tableName.equals(tName))
				{
					tableExists = true;
				}
				else 
				{
					tableExists = false;
				}				
			}			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return tableExists;	
	}
	public void createDbConnection()
	{
		boolean status = checkForDataBase();
		if(status == true)
		{
			System.out.println("DataBase Already Exists...");
			createConnection();
			boolean tableStatus = checkForTable();
			if(tableStatus == false)
			{
				useDataBase();
				createTable();
			}
			else
			{
				System.out.println("Table Already Exists...");
			}
		}
		else
		{
			createDataBase();
			useDataBase();
			createTable();
		}
	}
	public void createDataBase()
	{
		try
		{
			String sql = "CREATE DATABASE mockexam";
			stmt = con.createStatement();
			stmt.executeUpdate(sql);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	public void useDataBase()
	{
		try
		{
			String sql = "use mockexam";
			stmt = con.createStatement();
			stmt.executeUpdate(sql);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	public void createTable()
	{
		try
		{
			String sql ="create table mockexamdb(id int not null auto_increment,question varchar(30) not null,answer varchar(25) not null,attempted boolean not null,mark varchar(20) not null,primary key(id))";
			stmt = con.createStatement();
			stmt.executeUpdate(sql);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}	
	}
	public void createConnection()
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
	// public void insertData()
	// {
	// 	createDbConnection()
	// 	ps = con.prepareStatement("insert into mockexamdb(question,answer,attempted,mark) values()");
	// 	ps.executeUpdate();
	// }
	public ArrayList<Model> getMockExamData(ArrayList<Model> examQA)
	{
		try{
		String sql = "select * from mockexamdb";
		stmt = con.createStatement();
		rs = stmt.executeQuery(sql);
		int i=0;
		while(rs.next())
		{
			examQA.add(i,new Model());
			examQA.get(i).setId(rs.getInt("id"));
			examQA.get(i).setQuestion(rs.getString("question"));
			examQA.get(i).setOpt1(rs.getString("opt1"));
			examQA.get(i).setOpt2(rs.getString("opt2"));
			examQA.get(i).setOpt3(rs.getString("opt3"));
			examQA.get(i).setOpt4(rs.getString("opt4"));
			examQA.get(i).setQuestion(rs.getString("answer"));
			examQA.get(i).setAttempted(rs.getBoolean("attempted"));
			examQA.get(i).setMark(rs.getInt("mark"));
			i++;
		}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return examQA;
	}
}

