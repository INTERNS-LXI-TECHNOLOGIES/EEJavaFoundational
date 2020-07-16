<html>
<%@ page import="com.lxisoft.model.*"%>
<%@ page import="com.lxisoft.repository.*"%>
<%@ page import="java.sql.*"%>
<%
DatabaseRepo db = new DatabaseRepo();
String name = request.getParameter("name"); 
String regno = request.getParameter("regno");
db.addUser(name,regno);
%>
<a href="index.html"><button class="button">Home</button></a>




</html>