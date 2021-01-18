<!DOCTYPE html>
<html>
<%@page import="com.lxisoft.model.Contact"%>
<%@page import="java.sql.*,java.io.*,java.util.*"%>
<%@page import="java.sql.Connection"%>
<head>
  <title>Contact App</title>
</head>
<body bgcolor="800020">
  <center>
  <%
     String name= request.getParameter("name");

     try
     {
      Class.forName("com.mysql.cj.jdbc.Driver");
       Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contactapp","root","password");
       Statement stmt = con.createStatement();
        String sql = "delete from contactapp where FirstName ='"+name+"'";
         stmt = con.createStatement();
         stmt.executeUpdate(sql);
         stmt.close();
         con.close();
        }
     catch(Exception e)
     {
      
     }
      %>
      <h1><b> YOUR REQUESTED CONTACT HAVE BEEN DELETED </b></h1>
      <table>
        <tr><td></td><td><a href="index.html" type="submit"> INDEX PAGE </a></td></tr>
      </table>
      </center>
</body>
</html>