<!DOCTYPE html>
<html>
<head>
  <title>Contact Application</title>
</head>
<body>
	<%if(request.isUserInRole("admin")){%>
  <link href="style1.css" rel="stylesheet" type ="text/css">
  <div class="testbox">
    <h1><a href="Index.jsp" class="header"> Contact Application</a></h1>
    <h2> by Lxisoft Texhnologies pvt.ltd</h2>
    <form action=DeleteContacts.jsp method="post">
     <label id="icon" for="name"><i class="icon-envelope "></i></label>
  <input type="text" name="delete" id="delete" placeholder="Enter FirstName to Search " required/>
<input type="submit" value="search" class="searchbutton"/></form>
   <a href="ViewDatabase.jsp" class="button">View Database</a>


</div>
</body>
<% }
	else
		{
			response.sendRedirect("WrongAuth.jsp");
		}
%>
</html>
