<%@ page session="true" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sign In</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
    <style>
        body{
            background-color: aqua;
            text-align: center;
        }
    </style>
</head>
<body>
    <div class="container">
                <h2>Login</h2>
                <form action="j_security_check" method="post">
                    <label for="j_username">Username:</label>
                    <input type="text" id="j_username" name="j_username" required>
                    <label for="j_password">Password:</label>
                    <input type="password" id="j_password" name="j_password" required>
                    <input type="submit" value="Login">
                </form>
        <div class="language-options" id="languageOptions">
            <a href="LanguageServlet?lang=ml">Malayalam</a>
            <a href="LanguageServlet?lang=en">English</a>
        </div>
    </div>
</body>
</html>
