package com.lxisoft.sqlrepository;
import java.sql.*;  
import java.util.*;
public class Sqlrepository
{
	Connection con=null;
	PreparedStatement ps=null;

	public void connection()
	{
	 try{
			if (con==null)
			{
				Class.forName("com.mysql.jdbc.Driver");  
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/contacts","root","root");
						
			}
		}catch(Exception e)
			{
			 	e.printStackTrace();
			 	System.out.println(e);
			} 
	}

	public void readquestion()
	{
		connection();
			 	String query="select question from mockexam where id=?";
			 	ps.setInt(1);
			 	ResultSet rs = st.executeQuery(query);

}