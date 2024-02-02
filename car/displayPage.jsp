<%@ page import="com.lxisoft.fahad.*"%>
<html>
<head>
    <title>Car Details</title>
    <style>
        body {
            text-align: center;
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
        }

        table {
            margin: auto;
            border-collapse: collapse;
            width: 60%;
            margin-top: 18px;
            background-color: white;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        th, td {
            padding: 10px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }

        th {
            background-color: #4CAF50;
            color: white;
        }

        tr:hover {
            background-color: #f5f5f5;
        }

        h2 {
            color: #4CAF50;
        }
    </style>
</head>
<body>
    <h2>Car Details</h2>
    <table>
        <tr>
            <th>SL NO:</th>
            <th>ITEM:</th>
            <th>DETAIL:</th>
        </tr>

        <% Car car = (Car) request.getAttribute("carObjects"); %>
        <tr>
            <td>1</td>
            <td>Car Name</td>
            <td><%= car.getName() %></td>
        </tr>
        <tr>
            <td>2</td>
            <td>Car Colour</td>
            <td><%= car.getColour() %></td>
        </tr>

        <% for(int i = 0; i < 4; i++) {
            Door door = (Door) request.getAttribute("doorObjects" + (i + 1));
        %>
        <tr>
            <td><%= 3 + i %></td>
            <td>Door Brand</td>
            <td><%= door.getBrand() %></td>
        </tr>
        <% } %>

        <% for(int i = 0; i < 4; i++) {
            Tyre tyre = (Tyre) request.getAttribute("tyreObjects" + (i + 1));
        %>
        <tr>
            <td><%= 7 + i %></td>
            <td>Tyre Brand</td>
            <td><%= tyre.getBrand() %></td>
        </tr>
                <% } %>

                <% for(int i = 0; i < 4; i++) {
                            Tyre tyre = (Tyre) request.getAttribute("tyreObjects" + (i + 1));
 %>
            <td><%= 11+ i %></td>
            <td>Tyre Size</td>
            <td><%= tyre.getSize() %></td>
        </tr>
        <% } %>

        <% Steering steering = (Steering) request.getAttribute("steeringObject"); %>
        <tr>
            <td>15</td>
            <td>Steering Colour</td>
            <td><%= steering.getColour() %></td>
        </tr>
    </table>
</body>
</html>
