<%@page import="com.lxisoft.servlet.*"%>
<%@page import="com.lxisoft.model.*"%>
<%@page import="com.lxisoft.repositry.*"%>
<%@page import="java.util.*"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <title>Covid Form</title>
</head>
<body>
    <h1><a href="Index.jsp" class="header"> Covid Application Search</a></h1>
    <h2> by Lxisoft Texhnologies pvt.ltd</h2>
    <form action=SearchApplicationServlet method="POST">  
  <input type="text" name="search" id="search" placeholder="Enter Phone Number to Search " required/>
<input type="submit" value="search" class="searchbutton"/></form>
</body>

</html>
