<%@page import="com.lxisoft.servlet.*"%>
<%@page import="com.lxisoft.model.*"%>
<%@page import="java.util.*"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
  <title>form</title>
</head>
<body>
<link href="style1.css" rel="stylesheet" type ="text/css">

<div class="testbox">
  <h1>Registration</h1>

  <form action="AddContactServlet" method ="post">
  <hr>
  <label id="icon" for="name"><i class="icon-envelope "></i></label>
  <input type="text" name="firstname" id="firstname" placeholder="First Name" required/></br>
  <label id="icon" for="name"><i class="icon-user"></i></label>
  <input type="text" name="lastname" id="lastname" placeholder="Last Name" required/></br>
  <label id="icon" for="name"><i class="icon-shield"></i></label>
  <input type="email" name="email" id="email" placeholder="Email" required/></br>
  <label id="icon" for="name"><i class="icon-user"></i></label>
  <input type="text" name="contactnumber" id="contactnumber" placeholder="Contact Number" required/></br>
<div class="checkbox">
   <input type="checkbox" value="None" id="radioOne" name="T&C" required/></br>
      <label for="checkbox" class="box" ></div>
     <div class ="tc"><p> By clicking Register, you agree on our <a href="#">terms and condition</a>.</p></label></div>
   <input type="submit" value="Register" class="registerbutton"/>
   <a href="ViewDatabaseServlet" class="button">View Database</a>
  </form>
</div>
</body>
</html>