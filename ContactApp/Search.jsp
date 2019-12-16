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
    List<Contact> c=(List<Contact>) request.getAttribute("contactList");
    for(Contact co:c)
    {%>
    <tr>
        <input type="hidden" name="id" value="<%=co.getId()%>"> 
        <td><input type="submit" value="<%=co.getName()%>"></a></td>
    </tr>
    <%
    }%>
</table>
</body>
</html>