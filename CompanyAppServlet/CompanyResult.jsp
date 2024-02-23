<%@ page import="com.lxisoft.company.model.Company" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<html>
<head>
    <title>Result</title>
    <style>
        body {
            text-align: center;
            background-image: url("R.jpeg");
            background-size: cover; 
            background-position: center center; 
        }
        table {
            margin: 20px auto;
            border-collapse: collapse;
            width: 80%;
            max-width: 800px;
            background-color: #f9f9f9;
        }
        th, td {
            padding: 10px;
            border: 1px solid #ccc;
        }
        th {
            background-color: #555;
            color: white;
            text-transform: uppercase;
        }
        td {
            color: #2a417c;
        }
    </style>
</head>
<body>
    <table>
        <tr>
           <th>Company Details</th>
        </tr>
        <% 
            List<Company> lis = (ArrayList<Company>) request.getAttribute("a");
                for (Company li : lis) {
        %>
        <tr>
            <td>Name</td>
            <td><%= li.getName() %></td>
        </tr>
      
        <tr>
            <td>CoName</td>
            <td><%= li.getCoName() %></td>
        </tr>
        <tr>
            <td>Location</td>
            <td><%= li.getLocation() %></td>
        </tr>
        <tr>
            <td>ContactNumber</td>
            <td><%= li.getContactNumber() %></td>
        </tr>
        <%  } %>
    </table>
    <form action="index.html" method="post">
        <input type="submit" value="Go Back">
        </form>
</body>
</html>
