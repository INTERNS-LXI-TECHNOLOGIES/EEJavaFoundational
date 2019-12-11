<%@page import="com.lxisoft.controller.*"%>
<%@page import="com.lxisoft.domain.*"%>
<%@page import="com.lxisoft.model.*"%>
<%@page import="com.lxisoft.repository.*"%>
<%@page import="java.util.*"%>

<!DOCTYPE html>
<html>
<head>
	<title>SAVE</title>
	<center style="color: blue"><h1><b>Save</b><h1></center>
</head>
<body style="background-color:#D4DB65;">
	<style>
		form{
			 text-align: center;
    font-size: xx-large;
    margin: 79px
		}
		
		#b1{
			
    background-color: blue;
    color: white;
    font-size: large;
}
		
		#b2 {
			  background-color: red;
    color: white;
    font-size: large;
				}
		input{
			padding-right: 50px;
			padding-top: 10px;

		}
	</style>

	<div class="grid-item">
		<div class="row-1">

	<form action="addContact" method="post">
			Name:<input type="type" name="name"><br><br>
			Number:<input type="type" name="number" ><br><br>
			<button id="b1" type="submit" >save</button><br><br>		
	</form>

<center>
	<button id="b2"  onclick="window.location.href='showAll'">Back</button>
</center>
	

	</div>
	</div>

</body>
</html>