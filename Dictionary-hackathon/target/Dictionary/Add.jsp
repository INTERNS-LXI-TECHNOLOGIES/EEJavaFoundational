	<%@ page import="com.lxisoft.model.*"%>
	<%@ page import= "com.lxisoft.Domain.*"%>
	<%@ page import="com.lxisoft.servlets.*"%>
	<%@ page import="java.util.*"%>
		<html >
		<head>
			 
			<title> add </title>
		</head>
		<body > 
			
				<form action="Add" method="GET">
					<center>
						<input type="text"  name="word" placeholder= "new word">
						
						<input type="text"  name="meaning" placeholder= "meaning">
						
						<input type="submit" value="Add">	
						
					</center>
				</form>
					
		</body>
</html>