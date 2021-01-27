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
    <%

    	String name=request.getParameter("search");
    	ContactAppController controller= new ContactAppController();
    	controller.searchContacts(name);
    	Contact contact = new Contact();

    %>
    <table>
    <tr>
    	<th>First Name</th>
    	<th>Last Name</th>
    	<th>Email</th>
    	<th>Contact Number</th>
    </tr>
    <tr>
    	<td><%=contact.getFirstName()%></td>
   		<td><%=contact.getLastName()%></td>
        <td><%=contact.getEmail()%></td>
        <td><%=contact.getContactNumber()%></td>
    </tr>
    
    </table>
    <a href="ViewDatabase.jsp" class="button">View Database</a>

</div>
</body>
</html>