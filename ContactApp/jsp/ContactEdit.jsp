<html>
		<head>
			<title> ADD CONTACT </title>
		</head>
		<body > 
			<%@ page import="com.lxisoft.model.*"%>
			<%@ page import="com.lxisoft.Domain.*"%>
			<%@ page import="com.lxisoft.servlets.*"%>
			<center>
				 <h3> Edit Contact </h3>
			</center>
			<button align="left" type="button" onClick="window.location.href ='..\\View';">Back</button>
			<!-- <% Contact contact=(Contact)session.getAttribute("contact");	%> -->
			<form action="../edit" method="">
				<center>
					<input type="text"  name="name" placeholder= "enter new name"></br></br> 
					<input type="text"  name="num" placeholder= "enter new number"></br></br>
					<input type="submit" value="save">
					<input type="reset" value="reset">
				</center>
		</body>
</html>