<!DOCTYPE html>
<html>
<head>
	<title>Edit</title>
		<style>
		body{
		 background-color: lightblue;	
		 margin-top:250px;
		 text-align:center;
		}

		h1 {
  			color: black;
  			text-align: center;
  			font-family: verdana;
			}
	.button {
  background-color: #4CAF50;
  border: none;
  color: white;
  padding: 8px 35px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
}
/*.button2 {background-color: #f44336;}	*/
	</style>
</head>
<body>
		<%
		String n = request.getParameter("id");
		%>
	<div class="container">
		<form action="contactEdit" method="GET">
		<h2>Add Details</h2>
		 ID&nbsp&nbsp&nbsp<input type="text" name="id" placeholder="EnterFirstName" value="<%=request.getParameter("id")%>" readonly /><br><br>
		FirstName &nbsp&nbsp &nbsp<input type="text" name="FirstName" placeholder="Enter FirstName" required><br><br>
		LastName &nbsp&nbsp &nbsp <input type="text" name="LastName" placeholder="Enter LastName" required><br><br>
		Phone Number  &nbsp &nbsp&nbsp &nbsp<input type="number" name="number" placeholder="Enter Phone Number" required><br><br>
		<button class="button">Change</button>
		</form>	
		<br>
		<a href="index.html"><button class="button">Home</button></a>



	</div>
</body>
</html> 