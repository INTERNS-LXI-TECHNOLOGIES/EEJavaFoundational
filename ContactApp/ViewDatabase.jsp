<%@page import="com.Lxisoft.Control.*"%>
<%@page import="com.Lxisoft.Model.*"%>
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
    <div style="overflow-x:auto;">
    <table>
    	<tr>
    		<th>First Name</th>
    		<th>Last Name</th>
    		<th>Email</th>
    		<th>Contact Number</th>
    	</tr>
    	<%
    		ContactAppController contact = new ContactAppController();
    		contact.printDatabase(data);
    	%>
    </table>
</div>
  <div class="buttons">
    <a href="AddContacts.jsp" class="button">View Contact Database</a></div>
    
</body>
</html>