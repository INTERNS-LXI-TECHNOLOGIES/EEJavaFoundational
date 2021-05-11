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
		 ID&nbsp&nbsp&nbsp<input type="text" name="sno" placeholder="Enter Name" value="<%=request.getParameter("id")%>" readonly /><br><br>
		FirstName &nbsp&nbsp &nbsp<input type="text" name="name" placeholder="Enter Name" required><br><br>
		Phone Number &nbsp&nbsp &nbsp <input type="text" name="number" placeholder="Enter Number" required><br><br>
		E-Mail  &nbsp &nbsp&nbsp &nbsp<input type="text" name="email" placeholder="Enter E-Mail id" required><br><br>
		<button class="button">Change</button>
		</form>	
		<br>
		<a href="index.html"><button class="button">Home</button></a>
	</div>
</body>
</html>