package com.lxisoft.Contact.repositoryImpl;

import java.io.*;


import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Map.Entry;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import javax.sql.DataSource;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FilenameUtils;

import javax.servlet.Servlet;

import com.lxisoft.Contact.model.ContactModel;
import com.lxisoft.Contact.repositoryImpl.RepositoryImpl;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class RepoDataSource{
	public static DataSource getMySQLDataSource() {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		//InputStream input = classLoader.getResourceAsStream("DB.properties");
		Properties props = new Properties();
		FileInputStream fis=null;
		MysqlDataSource mysqlDS = null;
		try {
			fis = new FileInputStream("C://Users/Lenovo/Desktop/project/contactServlet/resource/DB.properties");
		
			props.load(fis);
			System.out.println(props.stringPropertyNames());
			mysqlDS = new MysqlDataSource();
			mysqlDS.setURL(props.getProperty("MYSQL_DB_URL"));
			mysqlDS.setUser(props.getProperty("MYSQL_DB_USERNAME"));
			mysqlDS.setPassword(props.getProperty("MYSQL_DB_PASSWORD"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return mysqlDS;
	}
}
