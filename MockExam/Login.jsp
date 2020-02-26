<%@page import="com.lxisoft.config.*"%>
<!DOCTYPE html>
<html>
<head>
	<title>Login</title>
	<style>
  	.button
  	{
  		background-color: #4CAF50;
  	}
  	div
  	{
  		padding-top: 80px;
  		padding-right: 50px;
  		padding-left: 80px;
  		padding-bottom: 50px;
  	}
  	</style>
</head>
<body>
	<div><table background="nn.jpeg" align=center border=1 width=30% height=30% >
	<form action="j_security_check" method="post">
		<tr>
			<td><h1 align="center"><u>Login Page</u></h1>
			&nbsp;&nbsp;<input type="text" name="j_username" placeholder=userName><br>
			<br>&nbsp;&nbsp;<input type="password" name="j_password" placeholder=password><br>
			<br>&nbsp;&nbsp;<input type="submit" value=login>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</form><a href="admin"><input type="submit" value=skip></a><br><br>
			</td>
		</tr></div>
</table>
</body>
</html>