<%@ page import="com.lxisoft.contact.Contact" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<html>
<head>
    <title>Welcome</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-image: url("OIP.jpeg");
            background-size: cover;
            background-position: center center;
            margin: 0;
            padding: 20px;
        }

        table {
            width: 80%;
            border-collapse: collapse;
            margin: 20px auto;
            background-color: rgba(255, 255, 255, 0.8);
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
        }

        th, td {
            padding: 12px;
            text-align: left;
        }

        th {
            background-color: #007bff;
            color: white;
        }

        tr:nth-child(even) {
            background-color: #f8f9fa;
        }

        tr:hover {
            background-color: #e9ecef;
        }

        form {
            text-align: center;
            margin-bottom: 20px;
        }

        input[type="text"], input[type="submit"], select {
            padding: 10px;
            border-radius: 5px;
            border: 1px solid #ccc;
            margin: 5px;
            width: 200px;
        }

        input[type="submit"] {
            background-color: #007bff;
            color: white;
            border: none;
            cursor: pointer;
            position: relative;
            padding-left: 30px; /* Space for icon */
        }

        input[type="submit"]:hover {
            background-color: #0056b3;
        }

        .collapsible {
            background-color: #d1cfdc;
            cursor: pointer;
            padding: 10px;
            width: 100px;
            text-align: center;
            margin: 20px auto;
        }

        .content {
            display: none;
            overflow: hidden;
            background-color: #4a0ee2;
            padding: 20px;
        }

        #toggleButton {
            position: fixed;
            top: 10px;
            left: 10px;
            cursor: pointer;
            font-size: 24px;
        }

        a {
            color: #007bff;
            text-decoration: none;
        }

        a:hover {
            text-decoration: underline;
        }

        .go-back {
            text-align: center;
            margin-top: 20px;
        }

  
    </style>
</head>
<body>
    <div class="collapsible" onclick="toggleForm()">+</div>
    <div class="content" id="formContent">
    </div>

    <form action="Search" method="get">
        <input class="search-icon" type="text" name="name"  placeholder="&#x1F50D;"> 
        <input type="submit" value="View">
    </form>
    <% 
    List<Contact> list = (ArrayList<Contact>) request.getAttribute("contact");
    if (list != null) {
        for (Contact con : list) {
    %>
    <table>
        <tr>
            <th>Contact Name</th>
            <th>Contact Number</th>
        </tr>
     
        <tr>
            <td><a href="DeUp.html"><%= con.getName() %></a></td>
            <td><a href="DeUp.html"><%= con.getContactNumber() %></a></td>
        </tr>
        <%  
            } 
        } else {
            out.println("<tr><td colspan='2'>No contacts found</td></tr>");   
        }
        %>
    </table>

    <div class="go-back">
        <form action="index.html" method="get">
            <input type="submit" value="Go Back">
        </form>
    </div>

    <script>
        function toggleForm() {
        window.location.href="frontContact.jsp";
        }
    </script>
</body>
</html>
