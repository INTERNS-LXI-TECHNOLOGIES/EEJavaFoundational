
<%@ page import="com.lxisoft.model.*"%>
			<%@ page import="com.lxisoft.servlets.*"%><html>
		<head>
			<title> ADD CONTACT </title>
		</head>
		<body > 
			
			<center>
				 <h3> TO ADD CONTACT </h3>
			</center>
			<form action="..\Add" method="">
				<center>
					<input type="text"  name="name" placeholder= "enter name"></br></br> 
					<input type="text"  name="num" placeholder= "phone number"></br></br>
					<input type="submit" value="save">
					<input type="reset" value="reset">
				</center>
		</body>
</html>