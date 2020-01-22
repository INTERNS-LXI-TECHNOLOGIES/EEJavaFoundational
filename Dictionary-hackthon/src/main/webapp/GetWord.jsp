<%@page import="com.lxisoft.model.*"%>
<%@page import="java.util.*"%>
<%@page import="java.io.*"%>
<!DOCTYPE html>
<html>
<head>
	<title>getWord</title>
	<style>
	#b2
	{
		background-color: white;
	    color: black;
	    margin-left: 550px;
	   
	}
</style>
</head>
<body style="background-color: grey">
	<table align="center" border="5" width="25%" height="25%">
	<a href="home"><input type="button" id="b2" value="<---"></a>
<%
WordUnit w=(WordUnit) request.getAttribute("getWord");
%>
<font size="15">
<center><%=(w.getWord())%></center>
<center><%=(w.getMeaning())%></center>
</font>
</table>
</body>
</html>