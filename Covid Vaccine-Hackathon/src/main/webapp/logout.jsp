<html>
<head>
<title>Logout</title>
</head>
<body>
<% 
session.invalidate();
 %>
<p>You have been successfully logout</p>
<%	   	
	response.sendRedirect("index.jsp");
%>
</body>
</html>
