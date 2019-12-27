<%@page import="com.lxisoft.domain.*"%>
<!DOCTYPE html>
<html>
<head>
	<title>delete</title>
</head>
<body>
	<table align="center" width="50%"  border color= "blue" bgcolor="#3CBC8D">
		<%
		Contact c=(Contact)session.getAttribute("cont");
		%>
		<tr>
			<th>Are you sure you want to delete "<%=(c.getContactFirstName())%> <%=(c.getContactLastName())%>"</th>
		</tr>
		<tr>
			<td>
				<form action="delete" method ="get">
					<input type="hidden" name="id" value="<%=(c.getContactId())%>">
					<input type="submit" value="deletes"/>
				</form>
				<form action= "getContact" method="get">
					<input type="hidden" name="crud" value="2"/>
					<input type="hidden" name="id" value="<%=(c.getContactId())%>"/>
					<input type="submit" value="Cancel"/>
				</form>
			</td>
		</tr>
</body>
</html>      