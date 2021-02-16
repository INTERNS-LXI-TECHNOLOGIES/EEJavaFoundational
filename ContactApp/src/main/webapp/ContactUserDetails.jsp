<%@page import="com.lxisoft.control.*"%>
<%@page import="com.lxisoft.model.*"%>
<%@page import="com.lxisoft.repositry.*"%>
<%@page import="java.util.*"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>

<!DOCTYPE html>
<html>
<head>
  <title>Contact Application</title>
</head>
<body>
  <link href="style1.css" rel="stylesheet" type ="text/css">
  <div class="testbox">
    <h1><a href="Index.jsp" class="header"> Contact Application</a></h1>
    <h2> by Lxisoft Texhnologies pvt.ltd</h2>
    <table>
    <tr>
    		<th>First Name</th>
    		<th>Last Name</th>
    		<th>Email</th>
    		<th>Contact Number</th>
    	</tr>
    <%
    
    Contact contact = new Contact();
    String id=request.getParameter("id");
    String fname=request.getParameter("fname");
    String lname=request.getParameter("lname");
    String email=request.getParameter("email");
    String contactNumber=request.getParameter("contactNumber");
    %>
		<tr>
      <td><%out.print(fname);%></td>
      <td><%out.print(lname);%></td>
      <td><%out.print(email);%></td>
      <td><%out.print(contactNumber);%></td>
      </tr></table>
      <a href="ViewDatabaseServlet" class="button">View Database</a>
</div>
</body>
</html>