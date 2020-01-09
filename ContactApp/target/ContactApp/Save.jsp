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
	<table bgcolor="#ffcccc" align=center border="5px" width="25%">
	<%
    Contact con=(Contact) request.getAttribute("contacts");
    %>
	<tr>
    	<td><center><%=(con.getFName())%><%=(con.getLName())%></center></td>  
    </tr>
    <tr>
    	<td><center><%=(con.getContactNo())%></center></td>
    </tr>
    <%if (request.isUserInRole("admin"))
      {%>
            <tr>
            <td><a href="Edit.jsp"><input type="submit" value="Edit"></a></td>
            <td><a href="Delete.jsp"><input type="submit" value="Delete"></a></td>
            <td><a href="url"><input type="submit" value="Back"></td>
            </tr>
    <%
    }%>
</table>
</body>
</html>