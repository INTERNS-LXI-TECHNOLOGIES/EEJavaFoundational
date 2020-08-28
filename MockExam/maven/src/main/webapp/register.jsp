<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
body {
	background-color:#FF6F61;
	text-align: center;
}

h1 {
	color: black;
	text-align: center;
	font-family: courier;
}

.button {
	padding: 10px 10px;
	font-size: 24px;
	text-align: center;
	cursor: pointer;
	outline: none;
	color: #fff;
	background-color: #4CAF50;
	border: none;
	border-radius: 15px;
	box-shadow: 0 9px #999;
}

.button:active {
	background-color: #3e8e41;
	box-shadow: 0 5px #666;
	transform: translateY(4px);
}
</style>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
<div align="center" style="background-color:#B22222;">
		<br>
		<br>
		<font size="9">Register </font>
		<br>
		<br>
</div>
	<form>
		<table align="center">
			<tr>
				<td>User Name :</td>
				<td><input type="text" name="username" /></td>
			</tr>
			<tr>
				<td>Password  :</td>
				<td><input type="password" name="password" /></td>
			</tr>
			<tr>
				<td> User</td>
				<td><input type ="radio" name ="role" value ="user" checked /></td>
				<td>Admin </td>
				<td><input type ="radio" name ="role" value ="admin"  /></td>
			<tr>
				<td></td>
				<td><button formaction="register" class="button">Register</button></td>
			</tr>
		</table>
	</form>
</body>
</html>