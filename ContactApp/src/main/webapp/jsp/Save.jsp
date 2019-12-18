<%@page import="com.lxisoft.controller.*"%>
<%@page import="com.lxisoft.domain.*"%>
<%@page import="com.lxisoft.model.*"%>
<%@page import="com.lxisoft.repository.*"%>
<%@page import="java.util.*"%>
<html>
<title>SAVE</title>
<center style="color: blue"><h1><b>Save</b><h1></center>
<body style="background-color:#E6EC73;">
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
				#b3{
			background-color: red;
			font-size: larger;
		 float: right;	
		  margin: -50px 75px;
		}
		input{
			padding-right: 50px;
			padding-top: 10px;
		}
	</style>

	<div>
		<button id="b3" onclick="window.location.href='index.jsp'">close(X)</button>
	</div>

	<div >
		<form action="addContact" method="post">
			Name:<input type="type" name="name" placeholder="enter name to save"><br><br>
			Number:<input type="type" name="number" placeholder="enter name to save"><br><br>
			<button id="b1" type="submit" >save</button><br><br>		
		</form>
		<center>
			<button id="b2"  onclick="window.location.href='showAll'">Back</button>
		</center>
	</div>

</body>
</html>