<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Sign Up Form </title>

    <!-- Font Icon -->
    <link rel="stylesheet" href="fonts/material-icon/css/material-design-iconic-font.min.css">

    <!-- Main css -->
    <link rel="stylesheet" href="css/style1.css">
</head>
<body>

    <div class="main">
        <div class="container">
            <div class="signup-content">
                <div class="signup-img">
                    <img src="img/signup-img.jpg" alt="">
                </div>
                <div class="signup-form">
                    <form action="sign" method="post" class="register-form" id="register-form">
                        <h2>User registration form</h2>
                        <div class="form-row">
                            <div class="form-group">
                                <label for="name">Full Name :</label>
                                <input type="text" name="name" id="name" required/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="email">Email ID :</label>
                            <input type="email" name="newemailmail" id="newemailmail" />
                        </div>
                        <div class="form-group">
                                <label for="username">UserName :</label>
                                <input type="text" name="username" id="name" required/>
                            </div>
                         <div class="form-group">
                                <label for="password">Password :</label>
                                <input type="password" name="Password" id="Password" required/>
                        </div>
                        <div class="form-group">
                            <label for="phone">Phone number :</label>
                            <input type="text" name="phone" id="pincode">
                        </div>
   
                        <div  class="form-submit">
                            <input type="submit" value="Reset All" class="submit" name="reset" id="reset" />
                            <input type="submit" value="Submit Form" class="submit" name="submit" id="submit" />
                        </div>
                    </form>
                </div>
            </div>
        </div>

    </div>

    <!-- JS -->
    <script src="vendor/jquery1/jquery.min.js"></script>
    <script src="js/main1.js"></script>
    <script src="js/date.js"></script>
</body><!-- This templates was made by Colorlib (https://colorlib.com) -->
</html>