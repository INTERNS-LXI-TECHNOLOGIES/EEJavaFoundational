package com.lxisoft.repositry;
import com.lxisoft.model.*;
//import com.lxisoft.servlet.*;
import java.util.*;
import java.sql.*;
import java.io.*;

public class CovidDatabase
{
	Connection connection=null;
	Statement statement=null;
	ResultSet result =null;
	PreparedStatement preparedStatement=null;
	int row;
	ArrayList<CovidForm> covidFormList =new ArrayList<CovidForm>();	
	
	public void createDatabaseConnection()
	{
		String jdbcURL="jdbc:mysql://localhost:3306/CovidForm"	;
		String jdbcUserName="root";
		String jdbcPassword="root";
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			try
			{
				connection=DriverManager.getConnection(jdbcURL,jdbcUserName,jdbcPassword);
				
			}
			catch(SQLException e)
			{
				System.out.println(e);
			}
		}

		catch(ClassNotFoundException e)
		{
			System.out.println(e);
		}
	}
	public void addtoDatabase(CovidForm covidform)
	{
		
		createDatabaseConnection();
		try
		{
		preparedStatement = connection.prepareStatement("INSERT INTO CovidApplications (Name,PhoneNumber,Function_Type,Address,Number_Of_Peoples) VALUES ('"+covidform.getName()+"','"+covidform.getPhoneNumber()+"','"+covidform.getFunctionType()+"','"+covidform.getAddress()+"','"+covidform.getNumberOfPeople()+"')");
		row = preparedStatement.executeUpdate();
		preparedStatement.close();
		connection.close();
		}
	catch(SQLException e)
		{
			System.out.println(e);
		}
	}
	public void updateContacts(CovidForm covidform)
	{
		
		createDatabaseConnection();
		try
		{

		preparedStatement=connection.prepareStatement("UPDATE CovidApplications SET Name ='"+covidform.getName()+"',PhoneNumber='"+covidform.getPhoneNumber()+"', Function_Type='"+covidform.getFunctionType()+"', Address='"+covidform.getAddress()+"', Number_Of_Peoples='"+covidform.getNumberOfPeople()+"' WHERE ID='"+covidform.getPhoneNumber()+"' ");
		row = preparedStatement.executeUpdate();
		preparedStatement.close();
		connection.close();
		}
		catch(SQLException e)
		{
			System.out.println(e);
	
		}
	}
	public void deleteContacts(String delete)
	{
		CovidForm covidform=new CovidForm();
		createDatabaseConnection();
	
		try
		{
			statement = connection.createStatement();
			statement.executeUpdate("delete from CovidApplications where PhoneNumber='"+delete+"'");
			statement.close();
			connection.close();	
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
	}
	public ArrayList<CovidForm> printDatabase()
	{
		createDatabaseConnection();	
		covidFormList.clear();
		try
		{
		
		statement = connection.createStatement();
		preparedStatement =connection.prepareStatement("SELECT * FROM  CovidApplications");
		result = preparedStatement.executeQuery();
		while(result.next())
			{
			CovidForm covidform=new CovidForm();
			covidform.setName(result.getString(2));	
			covidform.setPhoneNumber(result.getString(3));
			covidform.setFunctionType(result.getString(4));
			covidform.setAddress(result.getString(5));
			covidform.setNumberOfPeople(result.getString(6));
			covidFormList.add(covidform);
			
			}
		statement.close();
	}
		catch(SQLException e)
		{
			System.out.println(e);
		}
	return covidFormList;

	}	
	public ArrayList<CovidForm> searchDatabase(String phno)
	{
		
		createDatabaseConnection();
		covidFormList.clear();
		try
		{
		String sql  = "SELECT Name,PhoneNumber,Function_Type,Address,Number_Of_Peoples FROM  CovidApplications where PhoneNumber like'%"+phno+"%'" ;
		statement = connection.createStatement();
		result = statement.executeQuery(sql);
		while(result.next())
			{
			 
			
			CovidForm covidform=new CovidForm();
			covidform.setName(result.getString(2));	
			covidform.setPhoneNumber(result.getString(3));
			covidform.setFunctionType(result.getString(4));
			covidform.setAddress(result.getString(5));
			covidform.setNumberOfPeople(result.getString(6));
			covidFormList.add(covidform);
			 
			
			}
			connection.close();
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
		return covidFormList;
	}

	

}