<html>
<title> CONTACT APP</title>
<head>
	<link rel="stylesheet" type="text/css" href="jsp\styles.css"><CENTER><h1><b>welcome to contact App</h1></b></CENTER></head>
<body>
<%@ page import="com.lxisoft.Domain.*" %>
<%@ page import="com.lxisoft.Models.*" %>
<%@ page import="java.util.*" %>
<table><tr>
 <center>
<button  id="button" onclick="window.location.href='jsp/addnew.jsp';" >Add new Contact</button> <br>
<button  onclick="window.location.href='deleteAll';" >delete All Contact</button> <br></center>
<form action="search" method="GET"  align="center"><br>
	search a contact: <br><input type="text" align="center" name="user">
	<button name="search" type="submit">search</button>
</form></tr>
</table>
 
<% ArrayList<ViewListModel>contacts=null;
contacts=(ArrayList<ViewListModel>)session.getAttribute("contacts"); %>

<% 	if(contacts.size()==0){
	 out.println("<b><h1><CENTER>"+" no contact to show" +"</CENTER></h1><b>");
	 
%> <script> function functio {alert("no contacts to show");}</script>
<% } %>

<br>

<table align="center">
	<p><tr><th><h3>ID</h3></th>
		<th><h3>NAME</h3></th></p></tr>

	 <%  for (ViewListModel a: contacts){%>

	<tr><td><%out.println(a.getId());%></td>
		<% String useC=a.getName();%>
		
		<td><a href="search?user=<%=a.getName()%>"><%out.println(a.getName());%></td></a>
		
	</tr>

	<%}%>
</table>



</body>
</html>
