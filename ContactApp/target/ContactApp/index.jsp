<html>
		<head>
			<title> Index page of Contact App </title>
			 <link rel="stylesheet" type="css" href="jsp/styles.css">
		</head>	
		<body style="background-color:#d9e6f2"> 
			<h3 align="center">CONTACT APPLICATION</h3>
				</br>
					<center><a href="View" ><img src="images/contacts.png" height="150px"; width="140px";></a></center></br></br>
					<div>
						<!-- <h1 ><%  out.println("Username or Password incorrect"); %></h1> -->
						<form action="login" method="GET"><center>
							<input type="text"  name="username" placeholder= "username"></br></br> 
							<input type="password"  name="password" placeholder= "password"></br></br> 
							<input type="submit" value="Login">
							<input type="reset" value="reset"></br></br>
							<a href="ContactView.jsp">skip</a></center>
						</form>
					</div>
		</body>
</html>