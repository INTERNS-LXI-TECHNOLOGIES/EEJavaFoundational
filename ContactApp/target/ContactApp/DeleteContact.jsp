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
				<%
				String s=(String)session.getAttribute("c");
				int x=Integer.parseInt(s);
				if(x==10)
				{
				%>
				<form action= "getContact" method="get">
					<input type="hidden" name="crud" value="2"/>
					<input type="hidden" name="id" value="<%=(c.getContactId())%>"/>
					<input type="submit" value="Cancel"/>
				</form>
				<%
				}
				if(x==11)
				{
				%>
				<a href="home"><br><input type="submit" value="Cancel"/></a>
				<%
				}
				%>
			</td>
		</tr>
</body>
</html>      