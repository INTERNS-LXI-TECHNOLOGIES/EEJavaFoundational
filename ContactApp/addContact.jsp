<!DOCTYPE html>
<html>
<%@page import="com.lxisoft.model.Contact,com.lxisoft.control.*,com.lxisoft.repository.*"%>
<%@page import="java.sql.*,java.io.*"%>
<%@page import="java.sql.Connection"%>

<head>
	<title>Contact App</title>
</head>
<body bgcolor="8A2BE2">
	<center>
	<%
	   String name= request.getParameter("name");
	   String lastname= request.getParameter("lname");
	   String number= request.getParameter("number");
	   String email= request.getParameter("email");
	   		 Control control = new Control();
	   		 control.addContact(name,lastname,,number,email); 	
		%>
		<tr><h1><b> CONTACTS IS ADDED SUCCESSFULLY </b></h1></tr>  
        <tr><td></td><td><a href="View.jsp" type="submit"> VIEW PAGE </a></td></tr>
        </center>
</body>
</html>