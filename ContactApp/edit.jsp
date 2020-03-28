<!DOCTYPE html>
<html>
<head>
	<title>Edit</title>
	
</head>
<body>
		<%
		String n = request.getParameter("id");
		%>
	<div class="container">
		<form action="ContactEdit" method="GET">
		<h2>Add Details</h2>
		 ID&nbsp&nbsp&nbsp<input type="text" name="id" placeholder="EnterFirstName" value="<%=request.getParameter("id")%>" readonly /><br><br>
		FIRSTNAME &nbsp&nbsp &nbsp<input type="text" name="firstname" placeholder="Enter FirstName" required><br><br>
		LASTNAME &nbsp&nbsp &nbsp <input type="text" name="lastname" placeholder="Enter LastName" required><br><br>
		PHONENO  &nbsp &nbsp&nbsp &nbsp<input type="number" name="phno" placeholder="Enter Phone Number" required><br><br>
		<button value="updatebtn">Change</button>
		</form>	
		<br>
		<a href="index.html"><button value="homebtn">Home</button></a>



	</div>
</body>
</html> 