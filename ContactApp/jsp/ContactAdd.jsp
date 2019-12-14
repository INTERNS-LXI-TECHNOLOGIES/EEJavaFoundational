		<html>
		<head>
			<title> ADD CONTACT </title>
		</head>
		<body > 
			<%@ page import="com.lxisoft.model.*"%>
			<%@ page import= "com.lxisoft.Domain.*"%>
			<%@ page import="com.lxisoft.servlets.*"%>
			<center>
				 <h3> TO ADD CONTACT </h3>
			</center>
			<% Contact contact =(Contact)request.getAttribute("contacts"); 
			if(contact!=null) 
			{ %>
				<button align="left" type="button" onClick="window.location.href = '..\\View';">Back</button>
				<form action="../Add" method="">
					<center>
						<input type="text"  name="name" placeholder= "enter name"></br></br> 
						<input type="text"  name="num" placeholder= "phone number"></br></br>
						<input type="submit" value="save">
						<input type="reset" value="reset">
					</center>
					<script>
						msg()
						function msg(){
						alert("same contact Name found choose another");}
					</script>
		<% } 
		  else
			{ %>
				<button align="left" type="button" onClick="window.location.href = '..\\View';">Back</button>
				<form action="../Add" method="">
					<center>
						<input type="text"  name="name" placeholder= "enter again name"></br></br> 
						<input type="text"  name="num" placeholder= "phone number"></br></br>
						<input type="submit" value="save">
						<input type="reset" value="reset">
					</center>
		<% } %>
		</body>
</html>