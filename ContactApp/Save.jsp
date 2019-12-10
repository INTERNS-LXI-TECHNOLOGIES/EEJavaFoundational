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
	<table align=center border="5px" width="25%">
	<%Contact c=(Contact) request.getAttribute("contacts");%>
	<tr>
    	<td><%=(c.getName())%></td>
    	<td><%=(c.getContactNo())%></td>
    </tr>
</table>
</body>
</html>