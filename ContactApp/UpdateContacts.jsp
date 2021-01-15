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
    <h1><a href="Index.html" class="header"> Contact Application</a></h1>
    <h2> by Lxisoft Texhnologies pvt.ltd</h2>
    <p class="add"> Contact Has Been Updated</p>
    <%
    
  ContactAppController controller ContactAppController();
  Contact contact=new Contact();
  String id =request.getParameter("ID");    

    String fname=request.getParameter("fisrtname");
    String lname=request.getParameter("lastname");
    String email=request.getParameter("email");
    String phno=request.getParameter("contactnumber");

    contact.setFirstName(fname);
  contact.setLastName(lname);
  contact.setEmail(email);
  contact.setContactNumber(phno);
  controller.updateContacts();

    
    %>
    <a href="ViewDatabase.jsp" class="button">View Database</a> 


</div>
</body>
</html>
