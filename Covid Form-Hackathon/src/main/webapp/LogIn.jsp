<%@page import="com.lxisoft.servlet.*"%>
<%@page import="java.util.*"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
  <title>Covid Form</title>
</head>
<body>
  <h1>LogIn</h1>
<form action="j_security_check" method ="POST">
  <input type="text" name="j_username" id="j_username" placeholder="Enter UserName" required/></br>
  <label id="icon" for="name"><i class="icon-user"></i></label>
  <input type="password" name="j_password" id="j_password" placeholder="Enter Password" required/></br>
  <input type="submit" value="Login"/>
</form>

</body>
</html>
