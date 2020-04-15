<!DOCTYPE html>
<html>
<head>
	<title>Logging Out...</title>
</head>
<body>
	<%
	session.invalidate();
	response.sendRedirect("login.jsp");
	%>
</body>
</html>