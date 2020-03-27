<!DOCTYPE html>
<html>
<head>
	<title>UPDATE</title>
	<style type="text/css">
		.container
		{
			text-align:center;
			width: 100%;
			height: 100%;
			margin: 0 auto;
			padding-top: 250px;
			background: #55b4b0;
			display: block; 
		}
		html,body
		{
			width: 100%;
			height: 100%;
		}
	</style>
</head>
<body>
		<%
		String n = request.getParameter("id");
		%>
	<div class="container">
		<form action="updateContact" method="GET">
		<h2>ADD CONTACT</h2>
		 ID&nbsp&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp<input type="text" name="id" placeholder="Enter
		FirstName" value="<%=request.getParameter("id")%>" readonly /><br><br>
		FIRSTNAME &nbsp&nbsp &nbsp<input type="text" name="firstname" placeholder="Enter FirstName" required><br><br>
		LASTNAME &nbsp&nbsp &nbsp <input type="text" name="lastname" placeholder="Enter LastName" required><br><br>
		PHONENO  &nbsp &nbsp&nbsp &nbsp<input type="number" name="phno" placeholder="Enter Phone Number" required><br><br>
		<button value="updatebtn">UPDATE</button>
		</form>	
		<br>
		<a href="index.html"><button value="homebtn">Home</button></a>



	</div>
</body>
</html>