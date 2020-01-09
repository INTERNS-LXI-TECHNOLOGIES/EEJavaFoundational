<%@page import="com.lxisoft.Domain.*"%>
<html>
<title> contact </title>
<head></head>
<body>
	<%
		Contact c=(Contact)request.getAttribute("contact");
	%>
	<%=id%>
	<%=c.getName()%>
	<%=c.getNumber()%>
	<a href="start"><input type="submit" name="back" value="back"></a>
</body>
</html>
