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
	<%
    Contact con=(Contact) request.getAttribute("contacts");
    %>
	<tr>
    	<td><%=(con.getName())%></td>  
    </tr>
    <tr>
    	<td><%=(con.getContactNo())%></td>
    </tr>
    <tr>
        <td><a href="Edit.jsp"><input type="submit" value="Edit"></a></td>
        <td><a href="Delete.jsp"><input type="submit" value="Delete"></a></td>
    </tr>
</table>
</body>
</html>