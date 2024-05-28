<%@ page session="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sign In</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
    <style>
        body {
            background-color: aqua;
            text-align: center;
        }
        .container {
            margin-top: 50px;
        }
        .language-options {
            margin-top: 20px;
        }
    </style>
</head>
<body>
    <div class="container">
        <c:choose>
            <c:when test="${empty language}">
                <h2>Sign In</h2>
                <form action="j_security_check" method="post">
                    <label for="j_username">Username:</label>
                    <input type="text" id="j_username" name="j_username"><br>
                    <label for="j_password">Password:</label>
                    <input type="password" id="j_password" name="j_password"><br>
                    <input type="submit" value="Login">
                </form>
            </c:when>
            <c:otherwise>
                <h2><c:out value="${language.title}"/></h2>
                <form action="j_security_check" method="post">
                    <label for="j_username"><c:out value="${language.username_label}"/></label>
                    <input type="text" id="j_username" name="j_username"><br>
                    <label for="j_password"><c:out value="${language.password_label}"/></label>
                    <input type="password" id="j_password" name="j_password"><br>
                    <input type="submit" value="<c:out value='${language.login}'/>">
                </form>
            </c:otherwise>
        </c:choose>
        <div class="language-options" id="languageOptions">
            <a href="localeServlet?lang=ml">Malayalam</a>
            <a href="localeServlet?lang=en">English</a>
        </div>
    </div>
</body>
</html>
