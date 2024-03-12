<%@ page import="com.lxisoft.airport.Airport" %>

<html>
<head>
    <title>Airport Information</title>
    <style>
        table {
            width: 80%;
            margin: 0 auto; /* This centers the table */
            border-collapse: collapse;
        }

        th, td {
            border: 1px solid black;
            padding: 8px;
            text-align: center;
        }

        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>

    <h1>Airport Information</h1>

    <% Airport airport = (Airport) request.getAttribute("airr"); 
    if (airport != null ) { %>
    <table>
        <thead>
            <tr>
                <th>Sl No</th>
                <th>Name</th>
                <th>GPS Code</th>
                <th>ID</th>
            </tr>
        </thead>
        <tbody>
     
            <tr>
                <td><%= airport.getSlNo() %></td>
                <td><%= airport.getName() %></td>
                <td><%= airport.getGpsCode() %></td>
                <td><%= airport.getId() %></td>
            </tr>
        <%}
        else
        {%>
            <p>No airports found.</p>
        <%}%>
        </tbody>
    </table>

</body>
</html>
