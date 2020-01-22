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
<body style="background-color: #ffc0cb">
		<h3><center>Login Form</center></h3>
		<form method = "get" action ="j_security_check">
      	<center> User Name:  <input type = "text" name="j_username"><br><br></center>
        <center> Password:   <input type = "password" name="j_password"></center>
        <center><input type = "submit" value = "Login!"></center>
      </form>
</body>
</html>