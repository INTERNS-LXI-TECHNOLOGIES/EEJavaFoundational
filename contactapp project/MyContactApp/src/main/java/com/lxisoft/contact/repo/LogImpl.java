package com.lxisoft.contact.repo;
import java.util.*;
import java.sql.*;

import java.io.*;



import javax.sql.DataSource;


import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class LogImpl 
//implements ContactRepository
{
	DataSource dataSource=MyDataSourceFactory.getMySQLDataSource();
	
Statement st;
ResultSet rs;
	


public void registerValidation(String userName,String password)
{
    try{
		Connection con=dataSource.getConnection();
	PreparedStatement ps;
	String sql="insert into userdb (username,password) values(?,?)";
	ps=con.prepareStatement(sql);
	ps.setString(1,userName);
	ps.setString(2,password);
	ps.executeUpdate();
	}
	catch(Exception e){//System.out.println(e);
	e.printStackTrace();}
	
}



}


