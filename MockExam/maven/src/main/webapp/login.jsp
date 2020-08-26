<html>

<head>
<title>Login User</title>
<style>
body {
	background-color: #f7cac9;
	text-align: center;
}

h1 {
	color: black;
	text-align: center;
	font-family: courier;
}

.button {
	padding: 15px 25px;
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
	<h1>Login Details</h1>
	<form method="POST" action="j_security_check">
		username :<input type="text" placeholder=" UserName" name="j_username" required><br>
		Password :<input type="password" placeholder="  Password" name="j_password" required><br>
		<br> <input type="submit" value="signin">
	</form>
	<input type="submit" class="button" value="Home">



</body>
</html>