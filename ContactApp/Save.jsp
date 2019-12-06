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
		#b2 {
			  background-color: blue;
			  color: white;
			  font-size: large;	
			  margin: 25px 75px;
				}
		input{
			padding-right: 50px;
			padding-top: 10px;

		}
	</style>
	<form action="addContact" method="post">
		<label>
			Name:<input type="type" name="name"><br><br>
			Number:<input type="type" name="number"><br>
			<button id="b1" type="submit">save</button>
		</label>
	</form>
	<center>
	<button id="b2" type="submit" style="color: red">save</button>
	</center>

</body>
</html>