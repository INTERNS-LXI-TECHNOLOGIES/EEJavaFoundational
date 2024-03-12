<%@ page import="com.lxisoft.airport.Airport" %>
<%@ page import="java.util.*" %>

<html>
<head>
    <title>Airport Information</title>
    <style>
        body {
            text-align: center;
            text-size-adjust: 100px;
            background-image: url("71.jpg");
        }
        h2 {
            text-align: center;
        }
        table {
            width: 80%;
            margin: 0 auto;
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

    <%
        List<Airport> list = (ArrayList<Airport>) request.getAttribute("airr");
    %>
   

    <table border="2">
        <thead>
            <tr>
                <th>Sl No</th>
                <th><a href="ReadServlet?sorted=ASC">&#x25B2;</a> <a href="ReadServlet?sorted=DESC">&#x25BC;</a> Name</a></th>
                <th>GPS Code</th>
                <th>ID</th>
            </tr>
        </thead>
        <% for (Airport airport : list) { %>
        <tbody>
            
                <tr>
                    <td><a href=""><%= airport.getSlNo() %></a></td>
                    <td><%= airport.getName() %></td>
                    <td><%= airport.getGpsCode() %></td>
                    <td><%= airport.getId() %></td>
                </tr>
            <% } %>
        </tbody>
    </table>
    <br><br>
    <form action="ReadServlet" method="get">
        <button onclick="myFunction() ">&#171;</button>
        <script>
            function myFunction() {
               window.location.href = "ReadServlet";
            }
        </script>
        <% for(int i=0; i<=10; i++) { %>
            <input type="submit" name="pagination" value="<%= i %>">
        <% } %>
        <input type="submit" name="fi" value="9">&#187;</input>
    </form>  
</body>
</html>
