<!DOCTYPE html>
<html>
<head>
  <title>Authentication Error</title>
</head>
<body>
  <link href="style1.css" rel="stylesheet" type ="text/css">
  <div class="testbox">
    <h1><a href="Index.jsp" class="header"> Contact Application</a></h1>
    <h2> by Lxisoft Texhnologies pvt.ltd</h2>
    <p class="credits" style="color:red; "> There was an error Logging in. please try again...</p>
    <h1>LogIn</h1>
<form action="j_security_check" method ="POST">
  <hr>
  <label id="icon" for="name"><i class="icon-envelope "></i></label>
  <input type="text" name="j_username" id="j_username" placeholder="Enter UserName" required/></br>
  <label id="icon" for="name"><i class="icon-user"></i></label>
  <input type="password" name="j_password" id="j_password" placeholder="Enter Password" required/></br>
  <input type="submit" value="Login" class="login"/>
</form>
</div>
</body>
</html>
