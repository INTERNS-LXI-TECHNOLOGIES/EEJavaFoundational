<%@page import="com.lxisoft.domain.*"%>
<%@page import="com.lxisoft.models.*"%>
<%@page import="java.io.*"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
	<title>Save</title>
</head>
<body>
	
	<%Contact c=(Contact) request.getAttribute("contacts");%>
    <%=c.getName()%>
    <%=c.getContactNo()%>
</body>
</html>