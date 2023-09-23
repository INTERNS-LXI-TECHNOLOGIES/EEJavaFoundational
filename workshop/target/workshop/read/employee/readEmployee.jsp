<%@ page import="java.util.*,java.io.*"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>Employee Search</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
        }

        .container {
            width: 400px;
            margin: 0 auto;
            padding: 20px;
            background-color: #fff;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
            border-radius: 5px;
            text-align: center;
        }

        h1 {
            color: #333;
        }

        label {
            display: block;
            margin-bottom: 10px;
            color: #555;
        }

        input[type="text"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 20px;
            border: 1px solid #ccc;
            border-radius: 5px;
            font-size: 16px;
        }

        input[type="submit"] {
            background-color: #007bff;
            color: #fff;
            border: none;
            border-radius: 5px;
            padding: 10px 20px;
            font-size: 18px;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <%
    ResourceBundle resourceBundle = (ResourceBundle)session.getAttribute("resource");
   %>
    <div class="container">
        <form action="/workshop/employeeServlet" method="get">
            <label for="name"><%=resourceBundle.getString("employee.name")%>:</label>
            <input type="text" name="name" id="name"  required>
            <input type="submit" value="Submit">
        </form>
    </div>
    <%
    InputStream input = (InputStream)request.getAttribute("stream");    
    if (input != null) {
        // Set the content type based on the type of data (e.g., image/jpeg)
        response.setContentType("application/pdf"); // Change to the appropriate content type
        
        // Read and display the binary data
        byte[] buffer = new byte[4096];
        int bytesRead;
        while ((bytesRead = input.read(buffer)) != -1) {
            response.getOutputStream().write(buffer, 0, bytesRead);
        }
        input.close();
    } else {
        // Handle the case where the input stream is null or unavailable
        out.println("Employee data not found.");
    }
    %>

</body>
</html>
