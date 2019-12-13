<%@page import="com.lxisoft.controller.*"%>
<%@page import="com.lxisoft.domain.*"%>
<%@page import="com.lxisoft.model.*"%>
<%@page import="com.lxisoft.repository.*"%>
<%@page import="java.util.*"%>

<!DOCTYPE html>
<html>
<head>
	<title>EDIT CONTACT</title>
	<center style="color: blue"><h1><b>Edit contact</b><h1></center>
</head>
<style type="text/css">
	#b3{
			background-color: red;
			font-size: larger;
		 float: right;	
		  margin: -54px 161px;
		}
	form{
    font-size: xx-large;
    margin: 79px
		}
	input{
			padding-right: 50px;
			padding-top: 10px;

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
	</style>
	<div>
		<button id="b3" onclick="window.location.href='index.jsp'">close(X)</button>
	</div>

<body style="background-color:#E6EC73;">
	<div align="center">
	<form action="editContact" method="post">
			Name:<input type="type" name="name" placeholder="enter new name"><br><br>
			Number:<input type="type" name="number" placeholder="enter new name"><br><br>
			<button id="b1" type="submit" >confirm</button><br><br><br>
	</form>
	<button id="b2"  onclick="onclick=goBack()">Back</button>
	</div>

	<script type="text/javascript">
	function goBack() {
  	window.history.back();
	}
	</script>

</body>
</html>


