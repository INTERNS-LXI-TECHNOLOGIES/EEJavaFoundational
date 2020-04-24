<%@ page contentType="text/html;charset=UTF-8"  pageEncoding="UTF-8"%>
<html>
<head>
	<title>REQUEST</title>
</head>
<body>
	<h1 align="center">Request Form</h1>
	<form action="Add.jsp">
		<center><input type="submit" value="APPLY"></center>
	</form>
	<% if (request.isUserInRole("admin"))
      {
        %>
	<center><a href=admin><input type=Submit value=ViewAll></a></center>
<%}%>
</body>
</html>