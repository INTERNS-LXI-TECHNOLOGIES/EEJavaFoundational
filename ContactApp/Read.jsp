<!DOCTYPE html>
<html>
<head>
	<title>Read</title>
</head>
<body>
	<%@page import="java.sql.*"%>
<h3>Name</h3>
<%
	
try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/contact","root","root");	
			Statement smt=conn.createStatement();
		  
			ResultSet rs=smt.executeQuery("select * from contactlist");
			while(rs.next())
			{
			
%>
<h2><%out.println("Welcome");%>
<%
 	    }}
 	    catch(Exception e)
 	    {
 	    	System.out.println("Database not connected");
 	    }
%>
</body>
</html>