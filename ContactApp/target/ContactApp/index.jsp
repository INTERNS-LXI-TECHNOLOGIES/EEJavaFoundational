<%@page import="com.lxisoft.controller.*"%>
<%@page import="com.lxisoft.config.*"%>
<%@page import="com.lxisoft.domain.*"%>
<%@page import="com.lxisoft.model.*"%>
<%@page import="com.lxisoft.repository.*"%>
<%@page import="java.util.*"%>

<html>
<title>CONTACT APP</title>
<body>
	<center>
		<a href="<%=request.getContextPath()%>/showAll" style="color: black"><img src="Apps-Contacts-icon.png" width="100" height="100"><h3>CONTACT APP</h3></a>
		<%International inter=new International();
		inter.getLocale("d","u");
		%>
	</center>
</body>
</html>