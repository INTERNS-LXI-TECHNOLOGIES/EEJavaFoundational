<!DOCTYPE html>
<html>
<head>
	<title>
		
	</title>
</head>
<body button style ="background: lightgreen">

<%@page import = "com.lxisoft.servet.*"%>
<%@page import = "com.lxisoft.repository.*"%>
<%@page import = "com.lxisoft.sqlrepository.*"%>
<%@page import = "com.lxisoft.model.*,java.util.*"%>
<form method="POST" action="j_security_check">

            <p>User name: <input type="text" name="j_username" size="20"/></p>
            <p>Password: <input type="password" size="20" name="j_password"/></p>
            <p>  <input type="submit" value="Submit"/></p>

        </form>       
</body>
</html>