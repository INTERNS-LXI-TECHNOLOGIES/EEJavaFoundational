<!DOCTYPE html>
<html>
<%@page import="com.lxisoft.model.Contact,com.lxisoft.servlet.*,com.lxisoft.repository.*,com.lxisoft.servlet.*"%>
<%@page import="java.sql.*,java.io.*,java.util.*"%>
<%@page import="java.sql.Connection"%>
<head>
  <title>Contact App</title>
</head>
<body bgcolor="800020">
    <form action="DeleteServlet" method="get">
  <center>
      <h1 class="text-center text-white pt-5">DELETE CONTACT</h1>
    <table>
        <tr><td>ENTER THE FIRST NAME YOU WANT TO DELETE : </td><td><input type="text" name="name"></td></tr>
      <tr><td></td><td><input type="submit" value="SUBMIT"></td></tr>
    </table>  
    <h1><b> YOUR REQUESTED CONTACT HAVE BEEN DELETED </b></h1>
      <table>
        <tr><td></td><td><a href="View.jsp" type="submit"> VIEW PAGE </a></td></tr>
      </table>
      </center>
        </form>
</body>
</html>