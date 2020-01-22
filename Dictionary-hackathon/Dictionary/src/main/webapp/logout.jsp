<!DOCTYPE html>
<html>
<head>
	<title>logout</title>
</head>
<body>
<% session.invalidate();
response.sendRedirect("viewall"); %>
</body>
</html>