<!DOCTYPE html>
<html>
<head>
  <title>Contact Application</title>
</head>
<body>
  <link href="style1.css" rel="stylesheet" type ="text/css">
  <div class="testbox">
    <h1><a href="Index.html" class="header"> Contact Application</a></h1>
    <h2> by Lxisoft Texhnologies pvt.ltd</h2>
    <%
        String updateId=request.getParameter("id");

    %>
    <form action="UpdateContacts.jsp?id=<%=updateId%>" method="POST">
  <label id="icon" for="name"><i class="icon-envelope "></i></label>
  <input type="text" name="firstname" id="firstname" placeholder="Enter First Name" required/></br>
     <label id="icon" for="name"><i class="icon-envelope "></i></label>
  <input type="text" name="lastname" id="lastname" placeholder=" Enter Last Name" required/></br>
<label id="icon" for="name"><i class="icon-envelope "></i></label>
  <input type="text" name="email" id="email" placeholder="Email" required/></br>
<label id="icon" for="name"><i class="icon-envelope "></i></label>
  <input type="text" name="contactnumber" id="contactnumber" placeholder="Enter Contact Number" required/></br>
  <input type="submit" value="Update" />
</form>
   <a href="ViewDatabase.jsp" class="button">View Database</a>


</div>
</body>
</html>
