<%@page import="com.lxisoft.controller.*"%>
<%@page import="com.lxisoft.domain.*"%>
<%@page import="com.lxisoft.model.*"%>
<%@page import="com.lxisoft.repository.*"%>
<%@page import="java.util.*"%>

<!DOCTYPE html>
<html>
<body style="background-color:#E6EC73;">
	<title>Login</title>
</head>
<body>
	<div align="center">
	<table style="border: 0.5px solid #F4714D; background-color: #C4F48A; width: 45%;">
		<!-- <h1 style="text-align: center; color:initial;"><b>&emsp;&emsp;&emsp;&emsp;CONTACTS</b></h1> -->
		<form action="<%=request.getContextPath()%>/login" method="post">
		<tr><td>username:<input type="text" name="username" placeholder="enter the username"></td></tr>
		<tr><td><br></td></tr>
		<tr><td>password:<input type="password" name="password" placeholder="enter the password"></td></tr>
		<tr><td><br></td></tr>
		<tr><td><input type="submit" name="login" style="text-align: center"></td></tr><br><br>	
		</table>
			
		</form>
		<a href="<%=request.getContextPath()%>/showAll" style="color: black">skip for now</a>
	</div>
</body>
</html>