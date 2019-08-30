package com.lxisoft.contact;
import java.util.*;
import java.io.*;
import java.sql.*;
//import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import javax.sql.DataSource;

import com.mysql.cj.jdbc.MysqlDataSource;
//import com.mysql.jdbc.Driver;

public class RepoDataSource
{
	public static MysqlDataSource getMySQLDataSource()
	{
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		InputStream input = classLoader.getResourceAsStream("DB.properties");
		Properties props = new Properties();
		MysqlDataSource mysqlDS = null;
		try
		{
			// fis = new FileInputStream("DB.properties");
			// props.load(fis);
			props.load(input);
			mysqlDS = new MysqlDataSource();
			mysqlDS.setURL(props.getProperty("MYSQL_DB_URL"));
			mysqlDS.setUser(props.getProperty("MYSQL_DB_USERNAME"));
			mysqlDS.setPassword(props.getProperty("MYSQL_DB_PASSWORD"));
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
		return mysqlDS;
	}
}