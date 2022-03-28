<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Used Car Showroom Application</title>
	</head>
	<body>
		<div align="center">
			<h4>Please login:</h4>
			<form method="POST" action="j_security_check">
				Username: <input type="text" name="j_username"><br><br>
				Password: <input type="password" name="j_password"><br><br>
				<input type="submit" value="Login">
			</form>
		</div>
	</body>
</html>