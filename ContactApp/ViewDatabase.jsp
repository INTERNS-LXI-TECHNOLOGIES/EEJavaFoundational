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
    <h1><a href="Index.html" class="header"> Contact Application</a></h1>
    <h2> by Lxisoft Texhnologies pvt.ltd</h2>
    <div style="overflow-y:auto;">
    <table>
    	<tr>
    		<th>First Name</th>
    		<th>Last Name</th>
    		<th>Email</th>
    		<th>Contact Number</th>
    	</tr>
    	<tr>
    		<td>1</td>
    		<td>2></td>
    		<td>3</td>
    		<td>4</td>
    	</tr>
    	<tr>
    		<td>fa</td>
    		<td>ba</td>
    		<td>ck</td>
    		<td>is</td>
    	</tr>
    	<tr>
    		<td>fa</td>
    		<td>ba</td>
    		<td>ck</td>
    		<td>is</td>
    	</tr>
<tr>
    		<td>fa</td>
    		<td>ba</td>
    		<td>ck</td>
    		<td>is</td>
    	</tr>
    	<%
    		ContactAppController contactApp= new ContactAppController();
    	%>
    </table>
</div>
    <a href="AddContacts.jsp" class="button">Add Contacts</a>
    <a href="AddContacts.jsp" class="button">Delete Contact</a>
    <a href="AddContacts.jsp" class="button">Update Contact</a>

    
</body>
</html>