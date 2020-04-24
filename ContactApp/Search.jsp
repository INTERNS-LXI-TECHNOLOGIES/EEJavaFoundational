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
    List<Contact> c=(List<Contact>) request.getAttribute("contactlist");
    for(Contact co:c)
    {%>
    <tr>
        <td><%=(co.getName())%></td>
    </tr>
    <%
    }%>
</table>
</body>
</html>