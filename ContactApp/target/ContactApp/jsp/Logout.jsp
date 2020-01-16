<!DOCTYPE html>
<html>
<head>
	<title></title>
</head>
<body>
<% session.invalidate(); 
String root= pageContext.getRequest().getServletContext().getContextPath();
response.sendRedirect(root+"/index.jsp");%>

</body>
</html>
