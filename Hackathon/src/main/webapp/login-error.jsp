<%@ page session="true" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Error</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
    <style>
        @import url('https://fonts.googleapis.com/css2?family=Coiny&display=swap');

        body {
            margin: 0;
            padding: 0;
            font-family: 'Coiny', cursive;
            background-color: rgb(95, 216, 107);
            background-size: cover;
            color: #ffffff; /* White text */
            display: flex;
            justify-content: center;
            align-items: center;
            min-height: 100vh;
        }

        .container {
            width: 90%;
            max-width: 400px;
            padding: 20px;
            background-color: rgba(0, 0, 0, 0.8); /* Semi-transparent dark background */
            border-radius: 15px;
            box-shadow: 0 0 15px rgba(0, 0, 0, 0.5);
            text-align: center;
            position: relative;
        }

        h2 {
            font-size: 28px;
            margin-bottom: 20px;
        }

        p {
            font-size: 18px;
            margin-bottom: 20px;
        }

        .error-icon {
            color: #ff6347; /* Tomato color text */
            font-size: 48px;
            margin-bottom: 20px;
        }

        .back-to-login {
            margin-top: 20px;
        }

        .back-to-login a {
            color: #ffffff; /* White text */
            text-decoration: none;
            font-size: 16px;
        }

        .back-to-login a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <div class="container">
        <i class="fas fa-exclamation-triangle error-icon"></i>
        <h2>Login Error</h2>
        <p>Sorry, your username or password is incorrect. Please try again.</p>
        <div class="back-to-login">
            <a href="login.jsp">Back to Login</a>
        </div>
    </div>
</body>
</html>
