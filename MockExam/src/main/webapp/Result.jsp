<!DOCTYPE html>
<%@page import="com.lxisoft.Control.*"%>
<%@page import="com.lxisoft.Model.*"%>
<%@page import="java.io.*"%>
<%@page import="java.util.*"%>
<html>
<html>
<head>
	<title>Result</title>
	<h1 align="center">Result</h1>
<body>
<%int m=(int) session.getAttribute("Mark");
int result=m;
out.println(result);%><br>

<%
  if(m>=5)
  {
	 out.println("PASSED");
  }
  else
  {
	 out.println("FAILED");	
  }%>
 <a href="index.jsp">Back</a></center>
</body>
</html>


	