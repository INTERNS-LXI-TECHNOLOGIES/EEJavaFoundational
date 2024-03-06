<%@ page import="com.lxisoft.airport.Airport" %>
<%@ page import="java.util.*" %>

<html>
<head>
    <title>Airport Information</title>
    <style>
        body{
            text-align: center;
            text-size-adjust: 100px;
            background-image:url("71.jpg");
        }
        h2{
            text-align:center;
        }
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

    <form action="ResultOne" method="get">
        <input type="text" name="slno" placeholder="search">
        <input type="submit" placeholder="submit">
        </form>

    <% List<Airport> list = (ArrayList<Airport>) request.getAttribute("airr");%>

    <table border="2">
        <thead>
            <tr>
                <th>Sl No</th>
                <th>Name</th>
                <th>GPS Code</th>
                <th>ID</th>
            </tr>
        </thead>
        <tbody>
            <% for (Airport airport : list) { %>
            <tr>
                <td >
                    <a href=""><%= airport.getSlNo() %></a></td>
                <td><%= airport.getName() %></td>
                <td><%= airport.getGpsCode() %></td>
                <td><%= airport.getId() %></td>
            </tr>
            <% } %>
        </tbody>
    </table>
    <br><br>
    <form action="ReadServlet" method="get">
        <a href="ReadServlet"><<</a>
        <% for(int i=0; i<=10; i++) { %>
            <input type="submit" name="pagination" value="<%= i %>">
        <% } %>
        <a href="ReadServlet">>></a>
    </form>
   
    


</body>
</html>
