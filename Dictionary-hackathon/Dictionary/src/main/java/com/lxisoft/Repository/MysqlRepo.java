package com.lxisoft.Repository;
import java.util.*;
import java.sql.*;

import com.lxisoft.Domain.*;

 public class MysqlRepo
 {
 	static
 	{
 		setConnection();
 	}
 	static String driverName="com.mysql.jdbc.Driver";
	static String connectionName="jdbc:mysql://localhost:3306/Dictionary";
 	static Connection con =null;
	static PreparedStatement stmt=null;
	static ResultSet rs=null;
	static Statement stm=null;
	ArrayList<Word> words=new ArrayList<Word> (); 
	
 	 public static void setConnection()
 	 {
 	 	try
 	 	{
 	 		Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dictionary","root","root");
			
 	 	}catch(Exception e)
 	 	{
 	 		System.out.println("error in connection "+e);
 	 	}
 	 }
 	 public void addWord(String word, String means)
 	 {
 	 	try
 	 	{
 	 	stmt=con.prepareStatement("insert into dict values(?,?)");
 	 	stmt.setString(1,word);
 	 	stmt.setString(2,means);
 	 	stmt.executeUpdate();
 		}catch(Exception e)
 	 	{
 	 		System.out.println("error in adding "+e);
 	 	}
 	 }
 	 public ArrayList<Word> getWords()
 	 {
 	 	words.clear();
 	 	try
 	 	{
	 	 	rs=stmt.executeQuery("select * from dict");
			while(rs.next())
			{
 	 			System.out.println(rs.getString("word") +rs.getString(" meaning"));
				Word one=new Word();
				one.setWord(rs.getString("word"));
				one.setMeaning(rs.getString("meaning"));
				words.add(one);
			}


 		}catch(Exception e)
 	 	{
 	 		System.out.println("error in getting "+e);
 	 	}
 	 	return words;
 	 }
 }