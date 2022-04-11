<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <title>index</title>
     <link href="https://fonts.googleapis.com/css?family=ZCOOL+XiaoWei" rel="stylesheet">
        <link href=" " rel="stylesheet" type="text/css"/>
    </head>
    <body>
   <div class="container">
            <div class="box">
                <img class="avatar" src=" ">
                <h1> Login Account</h1>
<form action="j_security_check" method="post" >
                    <p>
Username</p>
<input type="text" placeholder="Username" name="j_username" required>
                    <p>
Password</p>
<input type="password" placeholder="Password" name="j_password" required>
                    <input type="submit" value="Login">
        <!--            <a href="#">Forget Password?</a><br>
                    <a href="registration.jsp">Create New Account</a> -->
                </form>
</div>
</div>
    </body>
    </html>