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
    <table>
    <tr>
    	<th>ID</th>
    	<th>First Name</th>
    	<th>Last Name</th>
    	<th>Email</th>
    	<th>Contact Number</th>
    </tr>
  <%
    	String name=request.getParameter("search");
    	ContactAppController controller= new ContactAppController();
    	ArrayList<Contact> searchContact = new ArrayList<Contact>();
    	controller.searchContacts(name,searchContact);
    	for(Contact contact : searchContact)
    {%>
    	<tr>
    	<td><%out.print(contact.getIndex());%></td>
    	<td><%out.print(contact.getFirstName());%></td>
   		<td><%out.print(contact.getLastName());%></td>
        <td><%out.print(contact.getEmail());%></td>
        <td><%out.print(contact.getContactNumber());%></td>
    	</tr>
    <%}%>
    
    
    </table>
    <a href="ViewDatabase.jsp" class="button">View Database</a>

</div>
</body>
</html>