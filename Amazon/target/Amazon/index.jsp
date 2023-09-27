<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta content="text/html; charset=UTF-8" http-equiv="Content-Type">
    <title>Welcome</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f5f5f5;
            margin: 0;
            padding: 0;
        }

        .container {
            max-width: 800px;
            margin: 0 auto;
            padding: 20px;
            background-color: #fff;
            border-radius: 5px;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
        }

        h1, h2 {
            text-align: center;
            color: #333;
        }

        h1 a {
            text-decoration: none;
            color: #007bff;
        }

        h1 a:hover {
            text-decoration: underline;
        }

        h2 {
            margin-top: 20px;
        }

        .language-form {
            text-align: center;
            margin-top: 20px;
        }

        label {
            font-weight: bold;
        }

        select {
            padding: 5px;
            font-size: 16px;
        }

        input[type="submit"] {
            background-color: #007bff;
            color: #fff;
            padding: 10px 20px;
            font-size: 16px;
            border: none;
            cursor: pointer;
        }
    </style>
</head>
<body>
    <div class="container">
        <%
         ResourceBundle resourceBundle = (ResourceBundle)session.getAttribute("resource");
         String date = (String)session.getAttribute("date");
         if(resourceBundle != null){
    %>
        <h2><%= date %></h2>
        <h1><a href="/workshop/company/company.jsp"><%= resourceBundle.getString("company.details") %></a></h1>
        <h1><a href="/workshop/employee/employee.jsp"><%= resourceBundle.getString("employee.details") %></a></h1>
        <h1><a href="/workshop/product/product.jsp"><%= resourceBundle.getString("product.details") %></a></h1>
        <%
    }
    %>

        <div class="language-form">
            <h2>Choose a Language | ഭാഷ തിരഞ്ഞെടുക്കുക</h2>
            <form action="./setLanguage" method="post">
                <label for="language">Choose a Language:</label>
                <select id="language" name="language">
                    <option value="en">English</option>
                    <option value="ml">മലയാളം</option> <!-- Malayalam -->
                    <!-- Add more language options as needed -->
                </select>
                <input type="submit" value="Submit">
            </form>
        </div>
    </div>
</body>
</html>
