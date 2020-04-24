<%@page import="com.lxisoft.domain.*"%>
<%@page import="com.lxisoft.models.*"%>
<%@page import="com.lxisoft.config.*"%>
<%@page import="java.io.*"%>
<%@page import="java.util.*"%>
<%@ page contentType="text/html;charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Save</title>
</head>
   <% Internationalization international=new Internationalization();
    String language=(String) session.getAttribute("language");
    String delete= international.localization(language,"IN","Delete");
    String edit= international.localization(language,"IN","Edit");
    String cancel= international.localization(language,"IN","Cancel");%>
<body>
	<table bgcolor="#ffcccc" align=center border="5px" width="25%">
	<%
    Contact con=(Contact) request.getAttribute("contacts");
    %>
	<tr>
    	<td><center><%=(con.getName())%></center></td>  
    </tr>
    <tr>
    	<td><center><%=(con.getContactNo())%></center></td>
    </tr>
    <tr>
        <td><a href="Edit.jsp"><input type="submit" value=<%=edit%>></a></td>
        <td><a href="Delete.jsp"><input type="submit" value=<%=delete%>></a></td>
        <td><a href="url"><input type="submit" value=<%=cancel%>></td>
    </tr>
</table>
</body>
</html>