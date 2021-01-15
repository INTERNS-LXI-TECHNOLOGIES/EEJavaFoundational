<%@page import="com.lxisoft.control.*"%>
<%@page import="com.lxisoft.model.*"%>
<%@page import="java.util.*"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
  <title>Contact Application</title>
</head>
<body>
  <link href="style1.css" rel="stylesheet" type ="text/css">
  <div class="testbox">
    <h1><a href="Index.html" class="header"> Contact Application</h1>
    <h2> by Lxisoft Texhnologies pvt.ltd</h2>
    <%
      ContactAppController controller= new ContactAppController();
     Contact contact= new Contact(); 
      String fname=request.getParameter("firstname");
  String lname=request.getParameter("lastname");
  String email=request.getParameter("email");
  String phno=request.getParameter("contactnumber");
  Contact contact=new Contact();
  contact.setFirstName(fname);
  contact.setLastName(lname);
  contact.setEmail(email);
  contact.setContactNumber(phno);
    controller.addContact();  

    %>
    <p class="add">Contact Added Successfully.</p>
  <div class="buttons">
    <a href="ViewDatabase.jsp" class="button">View Contact Database</a>
    
</body>
</html>