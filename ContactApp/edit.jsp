<!DOCTYPE html>
<html>
<head>
	<title></title>
</head>
<body>
	<%
		int n = request.getParameter("id");
		String name = request.getParameter("name");
		String number  = request.getParameter("num");
		String mail = request.getParameter("mail");
		%>
	<div class="container">
		<form action="contactEdit" method="GET">
		<h2>Add Details</h2>
		 ID&nbsp&nbsp&nbsp<input type="text" name="sno" value="<%n%>" readonly /><br><br>
		FirstName &nbsp&nbsp &nbsp<input type="text" name="name" value="<%name%>" required><br><br>
		Phone Number &nbsp&nbsp &nbsp <input type="text" name="number" value="<%number%>" required><br><br>
		E-Mail  &nbsp &nbsp&nbsp &nbsp<input type="text" name="email" value="<%mail%>" required><br><br>
		<button class="button">Change</button>
		</form>	
		<br>
		<a href="index.html"><button class="button">Home</button></a>
	</div>
</body>
</html>