<html>
<title>CONTACT APP</title>
<head><CENTER>again.. welcome to contact App</CENTER></head>
<body>
<%@ page import="com.lxisoft.Domain.*" %>
<a href="../viewall">print</a>
<%
String a=(String)request.getAttribute("n");%>

<!-- ArrayList<Contact> contacts=(ArrayList<Contact>)request.getAttribute("n"); -->
<!-- for (Contact a : contacts) -->


<table>
	<tr><th>ID</th><th>NAME</th><th>NUMBER</th></tr>
	
</table>	
<%	out.println("<h1>" + a+ "</h1>");
%>


asgsh
</body>
</html>
