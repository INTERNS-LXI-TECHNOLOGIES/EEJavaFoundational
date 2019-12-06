<%@page import="com.lxisoft.controller.*"%>
<%@page import="com.lxisoft.domain.*"%>
<%@page import="com.lxisoft.model.*"%>
<%@page import="com.lxisoft.repository.*"%>
<%@page import="java.util.*"%>

<!DOCTYPE html>
<html>
<head>
	<title>SAVE</title>
</head>
<body style="background-color:#D4DB65;">
	<style>
		form{
			 text-align: center;
			 font-size: xx-large;	
			 margin: 200px;
			 
		}
		input{
			padding-right: 50px;
			padding-top: 10px;

		}
	</style>
	<form action="add">
		<label>
			Name:<input type="type" name="name"><br><br>
			Number:<input type="type" name="number"><br>
		</label>
	</form>

</body>
</html>