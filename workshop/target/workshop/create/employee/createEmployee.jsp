<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Upload CV</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f5f5f5;
            margin: 0;
            padding: 0;
        }
        .container {
            max-width: 600px;
            margin: 0 auto;
            padding: 20px;
            background-color: #fff;
            border-radius: 5px;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
        }
        h1 {
            text-align: center;
            color: #333;
        }
        form {
            margin-top: 20px;
            text-align: center;
        }
        label {
            display: block;
            margin-top: 10px;
            font-weight: bold;
        }
        input[type="text"],
        input[type="file"],
        input[type="submit"] {
            width: 100%;
            padding: 10px;
            margin-top: 5px;
            border: 1px solid #ccc;
            border-radius: 3px;
            font-size: 16px;
        }
        input[type="file"] {
            cursor: pointer;
        }
        input[type="submit"] {
            background-color: #007bff;
            color: #fff;
            font-weight: bold;
            cursor: pointer;
        }
        p {
            color: red;
            text-align: center;
        }
        h2 {
            color: green;
            text-align: center;
        }
    </style>
</head>
<body>
    <%
    ResourceBundle resourceBundle = (ResourceBundle)session.getAttribute("resource");
    %>
    <div class="container">
        <h1><%=resourceBundle.getString("employee.upload")%></h1>
        <form action="/workshop/employeeValidator" method="post" enctype="multipart/form-data">
            <label for="name"><%=resourceBundle.getString("employee.name")%>:</label>
            <input type="text" name="name" id="name" required>
            <label for="cvFile"><%=resourceBundle.getString("employee.upload")%>:</label>
            <input type="file" name="cvFile" id="cvFile" accept=".pdf, .doc, .docx">
            <input type="submit" value="<%=resourceBundle.getString("submit")%>">
        </form>
        <p><%=(String)request.getAttribute("invalid")%></p>
        <h2><%=(String)request.getAttribute("success")%></h2>
    </div>
</body>
</html>
