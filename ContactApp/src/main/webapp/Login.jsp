<!DOCTYPE html>
<html>
<head>
	<title>Login</title>
</head>
<body>
<table bgcolor="#00ffff" align=center border=1 width=20% height="">
	<form action="j_security_check" method="post">
		<tr>
			<td><h1 align="center"><u>Login Page</u></h1>
			&nbsp;&nbsp;<input type="text" name="j_username" placeholder="UserName"><br>
			<br>&nbsp;&nbsp;<input type="password" name="j_password" placeholder="PassWord"><br>
			<br>&nbsp;&nbsp;<input type="submit" value="Login">&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;<a href="ViewAll.jsp"><input type="submit" value="Skip"></a>&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;<a href="SignUp.jsp"><input type="submit" value="Sign Up"></a>
			</td>
		</tr>
	</form>
</table>
</body>
</html>