<html>
<title> CONTACT APP</title>
<head>
	<link rel="stylesheet" type="text/css" href="styles.css"><CENTER><font color="red" size="32"><b> CONTACT APP </b></font></CENTER></head>
<body>
<%@ page import="com.lxisoft.Domain.*" %>
<%@ page import="com.lxisoft.Models.*" %>
<%@ page import="java.util.*" %>

<a href="addnew.jsp"><button >+</button></a>
</button> 
 <center>
<form action="search" method="GET"  align="center">
	<font color="white"> search a contact: </font><br><input  type="text"  align="center" name="user">
	<button name="search" type="submit">search</button></form>

</center>
<button  onclick="window.location.href='deleteAll';" >delete All Contact</button> <br>

<% ArrayList<ViewListModel>contacts=null;
contacts=(ArrayList<ViewListModel>)session.getAttribute("contacts"); %>

<% 	if(contacts.size()==0){ %>
<%	 out.println("<b><h1><CENTER>"+"no contact to show"+"</CENTER></h1></b>"); %> 

<% } %>

<br>
	<!-- <img src="dead.jpg" width="50" height="50"> -->
<div style="overflow-x: auto;">
<table align="center">
	<p><tr><th></th><th><h3>ID</h3></th>
		<th><h3>NAME</h3></th></p></tr>

	 <%  for (ViewListModel a: contacts){%>

	<tr>
		<td><img src="contact.png" width="50" height="50"></td>
		<td><font color=" grey" size="65"><%out.println(a.getId());%></font></td>
		<% String useC=a.getName();%>
		
		<td><a href="search?user=<%=a.getName()%>"><font color=" green" size="65"><%out.println(a.getName());%></font></td></a>
		
	</tr>

	<%}%>
</table></div>



</body>
</html>
