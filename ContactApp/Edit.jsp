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
<%
String selectModel=(String) request.getParameter("selectModel");
%>
<%=selectModel%>
%>

<body style="background-color:#D4DB65;">
	<div align="center">
	<form action="edit" method="post">

			Name:<input type="type" name="name"><br><br>
			Number:<input type="type" name="number" ><br><br>
			<button id="b1" type="submit" >confirm</button><br><br><br>
	</form>
	<button id="b2"  onclick="window.location.href='Select.jsp?selectModel=<%=selectModel%>'">Back</button>
	</div>
	

</body>
</html>


contact from select page 
contact to edit model and add string[] of new contact
pass to repo