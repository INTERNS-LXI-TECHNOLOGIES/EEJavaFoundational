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
        <th>ID</th>
    		<th>First Name</th>
    		<th>Last Name</th>
    		<th>Email</th>
    		<th>Contact Number</th>
    	</tr>
     
    	<%
    		ContactAppController controller = new ContactAppController();
        ArrayList<Contact> contactList= new ArrayList<Contact>();
        controller.printDatabases(contactList);
        
  
     for(Contact contact : contactList)
    { 
       %>
     <tr>
      <td><%out.print(contact.getIndex()); %></td>
      <td><a href="ContactDetails.jsp?id=<%=contact.getIndex()%>&fname=<%=contact.getFirstName()%>&lname=<%=contact.getLastName()%>&email=<%=contact.getEmail()%>&contactNumber=<%=contact.getContactNumber()%>" id class="tabledata"><%out.print(contact.getFirstName());%></a></td>
      <td><%out.print(contact.getLastName()); %></td>
      <td><%out.print(contact.getEmail());%></td>
      <td><%out.print(contact.getContactNumber()); %></td>
      </tr>
      <%
        
      }
      %>
    
</table>
</div>
    <a href="AddContacts.html" class="button">Add Contacts</a>
    <a href="SearchContacts.html" class="button">Search Contacts</a>

    
</body>
</html>