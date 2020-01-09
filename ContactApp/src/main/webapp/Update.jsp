<!DOCTYPE html>
<html>
<head>
	<title>
		
		
	</title>
</head>
<body style="background:  lightblue">
  
   
<%@page import = "com.lxisoft.servlet.*"%>
<%@page import = "com.lxisoft.repository.*"%>
<%@page import = "com.lxisoft.sqlrepository.*"%>
<%@page import = "com.lxisoft.model.*,java.util.*"%>
<form action="Update" method="get">
	<% Contact contact = new Contact(); %>
    <%String firstname=(String)session.getAttribute("firstname");%>
	<center>
		
	ENTER FIRSTNAME : <input type="text" name="firstname" value="<%out.print(firstname);%>"><br><br>

	ENTER LASTNAME : <input type="text" name="lastname" value=" "><br><br>
	ENTER NUMBER : <input type="text" name="number" value=" "><br><br>
	<% String id= request.getParameter("id");%>
	 <input type="hidden" name="id" value="<%=id%>">
	<input type="submit" value="submit">
	</center>
</form>
</body>
</html>