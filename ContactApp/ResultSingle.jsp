<%@ page import="com.lxisoft.contact.Contact" %>
<html>
<head>
    <title>Welcome</title>
    <style>

        body{
                background-image:url("OIP.jpeg");
                text-align:center;  
                background-size: cover; 
            background-position: center center; 
            table-layout: center-center;
            }
            table {
            width: 80%;
            border-collapse: collapse;
            background-color: rgba(255, 255, 255, 0.8);
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
        }

        th, td {
            padding: 10px;
            text-align: left;
        }

        th {
            background-color: #f2f2f2;
        }

        tr:nth-child(even) {
            background-color: #f9f9f9;
        }

        tr:hover {
            background-color: #f1f1f1;
        }

        form {
            text-align: center;
        }

        input[type="submit"] {
            background-color: #007bff;
            color: white;
            border: none;
            padding: 10px 20px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 16px;
            margin-top: 20px;
            cursor: pointer;
            border-radius: 5px;
        }

        input[type="submit"]:hover {
            background-color: #0056b3;
        }
        </style>
</head>
<body>
    
    <table border="6">
        <tr>
            <th>Contact Name</th>
        </tr>
        <% 
        Contact con = (Contact) request.getAttribute("connection");%>
        <tr>
            <td><%= con.getName() %></td>
        </tr>
    </table>
    <form action="ReadC" method="get">
    <input type="submit" value = "Go Back">
    </form>
</body>
</html>
