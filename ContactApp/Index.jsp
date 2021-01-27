<!DOCTYPE html>
<html>
<head>
	<title>Contact Application</title>
</head>
<body>
	<link href="style1.css" rel="stylesheet" type ="text/css">
	<div class="testbox">
		<h1> Contact Application</h1>
		<h2> by Lxisoft Technologies pvt.ltd</h2>
		<form action="#">
		<label id="icon" for="name"><i class="icon-envelope "></i></label>
  		<input type="text" name="uname" id="uname" placeholder="Enter Username " required/></br>
  		<label id="icon" for="name"><i class="icon-envelope "></i></label>
  		<input type="password" name="name" id="name" placeholder="Enter Password" required/>
		<input type="submit" value="login" class="login"/>
		<%
			String uname=request.getParameter("uname");
			String password=request.getParameter("password");

			if(uname.equals(uname) && password.equals(password))
			{%>
				<a href=index.html>redirecting</a>
			<%}
				 else if (uname.equals(uname))
				 {%>
				 	<p>invalid username or password</p>
				 <%}
				 	else if (password.equals(password))
				 {%>
					<p> invalid username or password</p>
				 <%}
				 		else{

				 		%>
				 		<p> Invalid access.</p>
				 		<%}
				 		%>
		
		</form>
</body>
</html>