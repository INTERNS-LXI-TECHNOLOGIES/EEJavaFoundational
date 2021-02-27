<!DOCTYPE html>
<html>
<head>
<title>login page</title>
<link rel="stylesheet" type="text/css" href="style4.css">
<body>
    <h1>SECURITY PURPOSE</h1>
    <h3>ERROR HAVE BEEN OCCURED SO RE-ENTER THE DETAILS</h3> 
    <div class="error">
        <img src="avatar.png" class="avatar">
        <h1>LOGIN</h1>
        <form action="j_security_check" method="post">
            <p>USER NAME</p>
            <input type="text" name="j_username" placeholder="Enter User Name">
            <p>PASSWORD</p>
            <input type="password" name="j_password" placeholder="Enter Password">
            <input type="submit" name="" value="LOGIN">
        </form>             
    </div>
</body>
</head>
</html>