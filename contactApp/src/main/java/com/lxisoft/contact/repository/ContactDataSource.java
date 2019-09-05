package com.lxisoft.contact.repository;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.*;
import java.sql.SQLException;
import java.util.Properties;
import javax.sql.DataSource;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class ContactDataSource
{
		public static DataSource getMySQLDataSource() {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		InputStream input = classLoader.getResourceAsStream("db.properties");
		Properties props = new Properties();
		MysqlDataSource mysqlDS = null;
		try {
			props.load(input);
			mysqlDS = new MysqlDataSource();
			mysqlDS.setURL(props.getProperty("MYSQL_DB_URL"));
			mysqlDS.setUser(props.getProperty("MYSQL_DB_USERNAME"));
			mysqlDS.setPassword(props.getProperty("MYSQL_DB_PASSWORD"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return mysqlDS;
		/*	MysqlDataSource mysqlDS = null;
		try {
			Properties props = new Properties();
			ClassLoader cLoader = Thread.currentThread().getContextClassLoader();
			FileInputStream fis = cLoader.getResourceAsStream("db.properties");
			 
			props.load(fis);
			mysqlDS = new MysqlDataSource();
			mysqlDS.setURL(props.getProperty("MYSQL_DB_URL"));
			mysqlDS.setUser(props.getProperty("MYSQL_DB_USERNAME"));
			mysqlDS.setPassword(props.getProperty("MYSQL_DB_PASSWORD"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return mysqlDS;*/
	}
}
	