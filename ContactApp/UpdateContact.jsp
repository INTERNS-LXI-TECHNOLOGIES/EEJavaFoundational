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
        String fname=request.getParameter("fname");
        String lname=request.getParameter("lname");
        String email=request.getParameter("email");
        String phno=request.getParameter("contactNumber");        

    %>
    <form action="UpdateContacts.jsp?id=<%=updateId%>" method="POST">
  <label id="icon" for="name"><i class="icon-envelope "></i></label>
  <input type="text" name="firstname" id="firstname" value="<%=fname%>" required/></br>
     <label id="icon" for="name"><i class="icon-envelope "></i></label>
  <input type="text" name="lastname" id="lastname" value="<%=lname%>" required/></br>
<label id="icon" for="name"><i class="icon-envelope "></i></label>
  <input type="text" name="email" id="email" value="<%=email%>" required/></br>
<label id="icon" for="name"><i class="icon-envelope "></i></label>
  <input type="text" name="contactnumber" id="contactnumber" value="<%=phno%>" required/></br>
  <input type="submit" value="Update" />
</form>
   <a href="ViewDatabase.jsp" class="button">View Database</a>


</div>
</body>
</html>
