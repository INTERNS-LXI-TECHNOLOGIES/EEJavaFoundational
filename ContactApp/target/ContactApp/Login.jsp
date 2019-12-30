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
	<table align="center" border="5" width="25%" height="25%">
		<caption><h3><center>Login Form</center></h3></caption>
	
		<form action="login" method="post">
			<tr>
				<br><br><td>User Name:<input type="text" name="user name"/><br>			
				<br>Password:<input type="password" name="password"/><br>
				<br><input type="submit" value="Login"/><br>
		</form>
		<br><a href="SignUp.jsp">sign up</a>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="home">skip>>>>>>>></a>
		</tr>
</body>
</html>