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
    <table border="">
      <tr>
        <th>Id</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>MailID</th>
        <th>Number</th>
        <th>DELETE</th>
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
        <td><a href="Update.jsp?id=<%=contact.getID()%>&temp=<%=contact.getFirstName()%>&temp1=<%=contact.getLastName()%>&temp2=<%=contact.getMailId()%>&temp3=<%=contact.getNumber()%>"><input type="button" name="submit" value="<%=contact.getFirstName()%>"></a></td>
        <td><%out.println(contact.getLastName());%></td>
        <td><%out.println(contact.getMailId());%></td>
        <td><%out.println(contact.getNumber());%></td>
        <td><a href="Delete.jsp?id=<%=contact.getID()%>&name=<%=contact.getFirstName()%>"><input type="button" name="submit" value="DELETE"></a></td>
     </tr>
      <%   
    }
    %>
      </tr>
    </table>
    <tr><h1><b> THE DETAILS OF THE CONTACTS </b></h1></tr>  
    <table>
       <tr><td></td><td><a href="addContact.jsp" type="submit"> ADD CONTACT </a></td></tr>
       <tr><td></td><td><a href="Search1.jsp" type="submit"> SEARCH CONTACT </a></td></tr>
        <tr><td></td><td><a href="index.jsp" type="submit"> INDEX PAGE </a></td></tr>
    </table>
         </center>
</body>
</html>