<!DOCTYPE html>
<html>
<head>
    <title>Welcome to Login Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 20px;
        }
        .container {
            max-width: 400px;
            margin: 50px auto;
            background-color: #fff;
            padding: 30px;
            border-radius: 8px;
            box-shadow: 0 2px 4px rgba(0,0,0,0.1);
        }
        h2 {
            margin-bottom: 20px;
            text-align: center;
        }
        h3 {
            margin-bottom: 10px;
        }
        input[type="text"], input[type="password"], input[type="submit"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 15px;
            border: 1px solid #ccc;
            border-radius: 5px;
            box-sizing: border-box;
        }
        input[type="submit"] {
            background-color:  #2980b9;
            color: white;
            border: none;
            cursor: pointer;
        }
        input[type="submit"]:hover {
            background-color: #2980b9;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Welcome to Login Page</h2>
        <form action="j_security_check" method="post">
            <h3>Enter your username</h3>
            <input type="text" name="j_username" required>
            <h3>Enter your password</h3>
            <input type="password" name="j_password" required>
            <input type="submit" value="Login">
        </form>
    </div>
</body>
</html>
