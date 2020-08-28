<html>

<head>
<title>Login User</title>
<style>
body {
	background-color:#FF6F61;
	text-align: center;
	
}
 th, td { 
                width:150px; 
                text-align:center; 
                padding:100px 
                border-spacing:0 15px;

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
</head>
<body>
<div align="center" style="background-color:#B22222;">
		<br>
		<br>
		<font size="9">Login Details </font>
		<br>
		<br>
</div>
<div  style="padding-top: 6%;">
	<form method="POST" action="j_security_check">
		<table align="center">
			<tr>
				<td>User Name :</td>
				<td><input type="text" placeholder=" UserName" name="j_username" required></td>
			</tr>
			<tr>
				<td>Password :</td>
				<td><input type="password" placeholder="  Password" name="j_password" required></td>
			</tr>
	
			<tr>
				<td><input type="submit" value="sign in" class="button"></td>
				<td><a href="Index.jsp"> <input type="button" class="button" value="Home"></a> </td>
				</table>
	</form>
	</div>




</body>
</html>