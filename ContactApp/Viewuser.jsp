<!DOCTYPE html>
<html>
<%@page import="com.lxisoft.model.Contact,com.lxisoft.servlet.*,com.lxisoft.repository.*,com.lxisoft.servlet.*"%>
<%@page import="java.sql.*,java.io.*,java.util.*"%>
<%@page import="java.sql.Connection"%>
<head>
	<title>Contact App</title>
</head>
<body bgcolor="B87333"> 
  <center>
    <h3 class="text-center text-white pt-5">CONTACT VIEW</h3>
    <table border="">
      <tr>
        <th>Id</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>MailID</th>
        <th>Number</th>
      </tr>
      <tr>
<%  
  ArrayList<Contact> contactList= new ArrayList<Contact>();
  contactList = (ArrayList<Contact>) request.getAttribute("list");
  for(Contact contact : contactList)
    { 
      %>
     <tr>
        <td><%out.println(contact.getID());%></td>
        <td><%out.println(contact.getFirstName());%></td>
        <td><%out.println(contact.getLastName());%></td>
        <td><%out.println(contact.getMailId());%></td>
        <td><%out.println(contact.getNumber());%></td>
     </tr>
      <%   
    }
    %>
      </tr>
    </table>
    <table>
       <tr>
       <td><a href="index.jsp" type="submit"> INDEX PAGE </a></td>
      </tr>
    </table>
    </center>
</body>
</html>