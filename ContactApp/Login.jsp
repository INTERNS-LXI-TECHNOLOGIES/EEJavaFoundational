<%@page import="com.lxisoft.servlet.*"%>
<%@page import="java.util.*"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
  <title>form</title>
</head>
<body>
<link href="style1.css" rel="stylesheet" type ="text/css">
<div class="testbox">
  <h1>LogIn</h1>
<form action="LoginServlet" method ="post">
  <hr>
  <label id="icon" for="name"><i class="icon-envelope "></i></label>
  <input type="text" name="username" id="username" placeholder="Enter UserName" required/></br>
  <label id="icon" for="name"><i class="icon-user"></i></label>
  <input type="password" name="Password" id="password" placeholder="Enter Password" required/></br>
  <input type="submit" value="Login" class="login"/>
</form>
</div>
</body>
</html>
