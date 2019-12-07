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
    margin: 79px
		}
		
		#b1{
			
    background-color: blue;
    color: white;
    margin: 25px 169px;
    font-size: large;
}
		
		#b2 {
			  background-color: red;
    color: white;
    font-size: large;
    margin: -57px  653px;
				}
		input{
			padding-right: 50px;
			padding-top: 10px;

		}
	</style>
	<%out.println("cont="+ request.getAttribute("contact"));%>
	<div class="grid-item">
		<div class="row-1">
			<div class="col-1">

	<form action="addContact" method="post">
			Name:<input type="type" name="name"><br><br>
			Number:<input type="type" name="number" ><br>
			<button id="b1" type="submit" >save</button>		
	</form>

</div>
<div class="col-2">
	<button id="b2"  onclick="window.location.href='index.jsp'">Back</button>
</div>
	</div>
	</div>

</body>
</html>