<!DOCTYPE html>
<html>
<head>
	<title>
		ADD NEW WORD
	</title>
</head>
<body style="background: lightyellow">
   
<%@page import = "com.lxisoft.servlet.*"%>
<%@page import = "com.lxisoft.sqlrepository.*"%>
<%@page import = "com.lxisoft.model.*,java.util.*"%>

<form action="Add" method="get">
	<center>
	
	ENTER THE WORD : <input type="text" name="word"><br><br>
	ENTER THE MEANING  : <input type="text" name="meaning"><br><br>
	<input type="submit" value="submit">
	</center>
</form>
</body>
</html>