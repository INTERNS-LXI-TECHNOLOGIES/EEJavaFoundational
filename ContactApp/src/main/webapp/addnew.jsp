<!DOCTYPE html>
<html>
<head>
	<title>add new </title>
</head>
<body>
	<%@ page import="com.lxisoft.Domain.*" %>
	<%@ page import="com.lxisoft.Models.*" %>
	<%@ page import="java.util.*" %>
	<% Contact c=new Contact();
	c.setName(request.getParameter("newcontact")); 
	
		%>
<% out.println(c.getName()); %>
<% if(c.getName()==null){%>
		<center>	<img src="smiley.gif" alt="Smiley face" width="42" height="42" ></center>
			<form action="createNewContact" method="get"><br><center>
			<input type="text" name="name" placeholder="ENTER NAME"><br><br>
			<input type="text" name="number" placeholder="ENTER NUMBER"><br><br>
			<button  type="submit" name="CREATE">create</button></form>
			<button type="button" onClick="window.location.href='viewall';">Back</button></center>
	<%}
	else{
	
 out.println(c.getName());} %>
		
		
</body>
</html>