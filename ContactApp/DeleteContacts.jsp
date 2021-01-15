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
    <p class="add">Contact Has been Deleted</p>
    <%
      
  ContactAppController controller=new ContactAppController();
      String delete=request.getParameter("delete");    
      controller.deleteContacts(); 
    %>
   <a href="ViewDatabase.jsp" class="button">View Database</a>


</div>
</body>
</html>
