<%@ page import="com.lxisoft.model.Model"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.*"%>
<%@ page import="java.io.*"%>

<!DOCTYPE html>
<html>
<head>
</head>
<body background="image/earth.jpg">
	<%Integer mark=(Integer)session.getAttribute("count");

	%>
	<h1><font color="#87CEFA"><%out.println("your Mark : "+mark);%></font></h1>
	<center>
	<form action="first.jsp">

<%
	 if(mark >=3)
	 {
	 	%>
	 	<h1><%out.println("Congratulations....");%></h1>
	 	<h1><%out.println("Exam Passed");%></h1>
	 	<%mark=0;%>
	 <%
	 }
	 else
	 {
	 	%>

	 	<h1><%out.println("!! Sorry !!");%></h1><br>
	 	<h1><%out.println("Exam Failed");%></h1>
	 	<%mark=0;%>
	 <%
	 }
	 %>

		<input type="submit" value="next"></form>
		
</center>

</body>
<%session.invalidate();%>
</html>