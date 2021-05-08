<!DOCTYPE html>
<html>
<head>
	<title></title>
</head>
<body>
	<%
		String n = request.getParameter("id");
		%>
	<div class="container">
		<form action="contactEdit" method="GET">
		<h2>Add Details</h2>
		 ID&nbsp&nbsp&nbsp<input type="text" name="id" placeholder="EnterFirstName" value="<%=request.getParameter("id")%>" readonly /><br><br>
		FirstName &nbsp&nbsp &nbsp<input type="text" name="FirstName" placeholder="Enter Name" required><br><br>
		LastName &nbsp&nbsp &nbsp <input type="number" name="LastName" placeholder="Enter Number" required><br><br>
		Phone Number  &nbsp &nbsp&nbsp &nbsp<input type="text" name="number" placeholder="Enter E-Mail id" required><br><br>
		<button class="button">Change</button>
		</form>	
		<br>
		<a href="index.html"><button class="button">Home</button></a>
	</div>
</body>
</html>