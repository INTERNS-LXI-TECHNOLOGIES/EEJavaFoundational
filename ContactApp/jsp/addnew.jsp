<!DOCTYPE html>
<html>
<head>
	<title>add new </title>
</head>
<body>
	<%@ page import="com.lxisoft.Domain.*" %>
	<%@ page import="com.lxisoft.Models.*" %>
	<%@ page import="java.util.*" %>
	<% boolean contact=true;
	contact= (boolean)request.getAttribute("newcontact"); %>
	<% if (contact) 
		{ %>
		<center>	<img src="../smiley.gif" alt="Smiley face" width="42" height="42" ></center>
		<form action="..\createNewContact" method="get"><br><center>
			<input type="text" name="name" placeholder="ENTER NAME"><br><br>
			<input type="text" name="number" placeholder="ENTER NUMBER"><br><br>
			<button  type="submit" name="CREATE">create</button>
			<button type="button" onClick="window.location.href='../viewall';">Back</button></center>
		<% }
		else
		{ %>
			<script>
			myFunction()
function myFunction() {
  alert("name already found try another,");
}
</script>
		</form><form action="..\createNewContact" method="get"><br><center>
			<input type="text" name="name" placeholder="ENTER  ANOTHER NAME"><br><br>
			<input type="text" name="number" placeholder="ENTER NUMBER"><br><br>
			<button  type="submit" name="CREATE">create</button>
			<button type="button" onClick="window.location.href='../viewall';">Back</button></center>
		</form>		

		<% } %>
</body>
</html>