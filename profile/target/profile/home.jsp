<%@ page session="true" %>
<html>
<head>
    <title>Welcome to Login Page</title>
    <style>
        body {
            margin: 0;
            padding: 0;
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background-color: #0c1021; /* Dark blue background */
            color: #ffffff; /* White text */
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .container {
            text-align: center;
        }

        .button {
            display: inline-block;
            padding: 10px 20px;
            margin: 10px;
            background-color: #3498db; /* Blue button */
            color: #ffffff; /* White text */
            text-decoration: none;
            border-radius: 5px;
            transition: background-color 0.3s ease;
        }

        .button:hover {
            background-color: #2980b9; /* Darker blue on hover */
        }

        .title {
            font-size: 24px;
            margin-bottom: 30px;
        }

        .subtitle {
            font-size: 18px;
            margin-bottom: 20px;
        }

        .game-logo {
            margin-bottom: 40px;
        }

        .footer {
            margin-top: 50px;
            font-size: 14px;
        }
    </style>
</head>
<body>
    <div class="container">

        <div class="subtitle">Choose your path:</div>
        <% 
        boolean isIntern = request.isUserInRole("intern");
        boolean isAdmin = request.isUserInRole("admin");

        if (isAdmin) { %>
            <a href="admin.jsp" class="button">Admin Page</a>
        <%} else if(isIntern) {%>
            <a href="user.jsp" class="button">User Page</a>
        <%}%>
        <div class="footer">Powered by Your Game Company</div>
    </div>
</body>
</html>
