<%@page import="com.lxisoft.domain.*"%>
<!DOCTYPE html>
<html>
<head>
	<title>getContact</title>
</head>
<body>
<%
Contact con=(Contact) request.getAttribute("getContactById");
%>
<%=(con.getContactName())%>
<%=(con.getContactNumber())%>

</body>
</html>