<html>
		<head>
			<title> ADD CONTACT </title>
			 <link rel="stylesheet" type="text/css" href="styles.css">
		</head>
		<body > 
			<%@ page import="com.lxisoft.model.*"%>
			<%@ page import="com.lxisoft.Domain.*"%>
			<%@ page import="com.lxisoft.servlets.*"%>
			<center>
				 <h3> Edit Contact </h3>
			</center>
			
			<% Contact contact=(Contact)session.getAttribute("currentcontact");	%>
			<form action="edit">
				<center>
					<input type="text"  name="fname"  value="<%=contact.getFirstName()%>" placeholder= "enter new first name"></br></br> 
					<input type="text"  name="lname" value="<%=contact.getLastName()%>" placeholder= "enter new last name"></br></br> 
					<input type="text"  name="num" value="<%=contact.getNo()%>" placeholder= "enter new number"></br></br>
					<input type="submit" value="save">
					<input type="reset" value="reset">
					<button align="left" type="button" onClick="window.location.href ='View';">Back</button>
				</center>
		</body>
</html>