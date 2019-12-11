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
		<form>

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
    <td><input type="submit" value="Delete"></td>
    <td><input type="submit" value="Edit"></td>
    </tr>
</form>
</table>
</body>
</html>