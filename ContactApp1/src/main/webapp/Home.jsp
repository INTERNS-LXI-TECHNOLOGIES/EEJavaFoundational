<%@page import="com.lxisoft.contact.* "%>
<%@ page import="java.util.*"%>
<%@ page import="java.io.*"%>
<!DOCTYPE html>
<html>
<head>
	<title>Contact App</title>
	 <%out.println("Locale :"+request.getLocale());
	 Locale locale=request.getLocale();%>
	<link rel="Stylesheet" href="Style.css">	
</head>
<body>
	<header>
		<div>
			<h3>Contact App</h3>
		</div>
		<div class="buttonContainer">
			<form action="logout" method="post">
			<button type="submit" value="Submit">Logout</button>
			</form>
		</div>
	</header>
	
	<div>
	<ul><br>
		<form action="create.html" method="">
			<input type="submit" value="CREATE CONTACT" />
		</form><br>
		<form action="viewall" method="get">
			<input type="hidden" value="1" name="page"/>
			<input type="submit" value="VIEW CONTACT" />
		</form><br>
		<form action="Edit1.jsp" method="">
			<input type="submit" value="EDIT CONTACT" />
		</form><br>
		<form action="Delete.jsp" method="">
			<input type="submit" value="DELETE CONTACT" />
		</form><br>
		<form action="Search.html" method="">
			<input type="submit" value="SEARCH CONTACT" />
		</form>
		
	</ul>
</div>
<div>
	<select>
		<form >
		  <option value="English">English</option>
		  <option value="Malayalam">Malayalam</option>

	</select>
</div>
</body>
</html>