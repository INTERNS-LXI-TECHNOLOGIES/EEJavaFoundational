<%@page import="javax.servlet.*"%>
<%@page import="javax.servlet.http.*"%>
<%@page import="com.lxisoft.repository.*"%>
<%@page import="com.lxisoft.domain.*"%>
<%@page import="com.lxisoft.models.*"%>
<html>
<head>
	<title>EDIT</title>
	</head>
	<body>
		<center><h1>Edit Contact</h1></center>
		<%
		Contact co=(Contact)session.getAttribute("contact");
		%>
		<table bgcolor="ccffcc" align=center border=5 width=25% height=20%>
			<form action="edit" method="post">
				<input type="hidden" name="id" value="<%=co.getId()%>"/>
			<tr>
				
				<td><br><input type="text" name="name" placeholder="New Contact Name"><br>
				<br><input type="text" name="contactNo" placeholder="New Contact Number"><br>
				<br><a href="edit"><input type="submit" value="Save"></a></td>
			</tr>
			</form>
		</table>
		
	</body>
</html>