<!DOCTYPE html>
<html>
<%@page import="com.lxisoft.model.Contact"%>
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
       Statement stmt = con.createStatement();
        String sql = "delete from contactapp where FirstName ='"+fname+"'";
         stmt = con.createStatement();
         stmt.executeUpdate(sql);
         stmt.close();
         con.close();
        }
     catch(Exception e)
     {
      
     }
      %>
</body>
</html>