<%@ page import= "com.lxisoft.contact.ContactModel"%>
<%@ page import= "com.lxisoft.contact.RepositoryImpl"%>
<%@ page import="java.sql.*"%>

<%
	RepositoryImpl ri=new RepositoryImpl();

%>
<html>
    <head>
    <title> Remove </title>
</head>
<body>
	<%
String b=request.getParameter("Last Name");
String d=request.getParameter("Updated Name");
String c="firstName";
ri.updateContact(c,b,d);
%>



	<a href="view.jsp"><tr>go back</tr></br></br></a>
</body>
</html>