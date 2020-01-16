<%@page import="com.lxisoft.domain.*,com.lxisoft.config.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Login Form</title>
</head>
<style>
	table{
		width: 25%%;
		background-color: #f1f1c1;
	}
	input[type="submit"]
	{
		background-color: #4CAF50;
	 	border :none;
	    color: white;
	}
</style>
<body>
	<%
	Localizer lo=new Localizer();
	String lang=(String)session.getAttribute("langu");
	%>
	<table align="center" border="5" width="25%" height="25%">
		<caption><h3><center><%=(lo.getWord("LoginForm",lang,"IN"))%></center></h3></caption>
	
		<form method="POST" action ="j_security_check">
			<tr>
				<br><br><td><%=(lo.getWord("username",lang,"IN"))%><input type="text" name="j_username"/><br>			
				<br><%=(lo.getWord("password",lang,"IN"))%><input type="password" name="j_password"/><br>
				<br><input type="submit" value="Login"/><br>
		</form>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<a href="home">skip>>>>>>>></a>
		</tr>
</body>
</html>