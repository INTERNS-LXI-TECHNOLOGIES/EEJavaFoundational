<!DOCTYPE html>
<html>
<%@page import="com.lxisoft.Model.Contact,com.lxisoft.repository.ContactRepository"%>
<%@page import="java.sql.*,java.io.*"%>
<%@page import="java.sql.Connection"%>
<head>
	<title>Contact App</title>
</head>
<body>
	<%
	   String firstname= request.getParameter("fname");

	   try
	   {
	   	Class.forName("com.mysql.cj.jdbc.Driver");
	   	 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contactapp","root","password");
	   	 Statement stmt = con.creatStatement();
       String sql  = "select * from contactapp";
      stmt = con.createStatement();
      rs = stmt.executeQuery(sql);
      while (rs.next()) 
       {
                int id = rs.getInt("id");
                String firstname = rs.getString("firstname");
                String lastname = rs.getString("lastname");
                String mailid = rs.getString("mailid");
                int number = rs.getInt("number");
                System.out.println(id+") "+firstname+":"+"\n"+"    "+lastname+"\n"+"    "+mailid+"\n"+"    "+number);
        }
         stmt.close();
         con.close();
        }
	   catch(Exception e)
	   {
	   	System.out.println(e)
	   }
      %>
</body>
</html>