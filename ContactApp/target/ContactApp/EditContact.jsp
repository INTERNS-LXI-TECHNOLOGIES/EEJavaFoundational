<%@page import="com.lxisoft.domain.*"%>
<%@page import="com.lxisoft.model.*"%>
<%@page import="javax.servlet.http.*"%>
<%@page import="javax.servlet.*"%>
<!DOCTYPE html>
<html>
<head>
	<title>Edit Contact</title>
</head>
<body style="background-color: grey">
<table align="center" border="5" width="25%" height="25%"  bgcolor="#3CBC8D">
		<caption><h1><center>Edit Contact</center></h1></caption>
		<%
		Contact c=(Contact)session.getAttribute("cont");
		%>
		<form action= "editContact" method="post">
			<input type="hidden" name="id" value="<%=(c.getContactId())%>"><br>
			<tr>
				<td><input type="text" name="first name" placeholder="new first Name" /><br>
				<br><input type="text" name="last name" placeholder="new last Name" /><br>
				<br><input type="text" name="number" placeholder="New Number" /><br>
				<br><input type="submit" value="Save"/><br>
		</form>
		<button onclick="window.history.back()">cancel</button>
			</tr>
</body>
</html>