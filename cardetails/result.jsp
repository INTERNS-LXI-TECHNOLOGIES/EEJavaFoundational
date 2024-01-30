<%@page import="com.divisosoft.carproject.*"%>
<html>
<head>
    <title>cardetails</title>
    <style>
        body {
            text-align: center;
            background-color: blueviolet;
            font-size: 20;
        }
        table{
            margin:auto;
            height: 280;
            width: 580;
        }
        th{
            text-align: center;
        }
    </style>
</head>
<body>
    <table border="2">
    <% 
        Car car = (Car) request.getAttribute("carObject");
        Steering steer = car.steer;
    %>
    <tr>
        <th>Car Details</th>
    </tr>

    <tr>
        <td>Car Name  </td>
        <td><%= car.getName() %></td>
    </tr>

    <tr>
        <td>Car Colour </td>
        <td><%=car.getColor()%></td>
    </tr>
    
    <th>Tyre Details</th>
   <% for(int i=0; i<4;i++)
    {
        Tyre tyre=(Tyre) request.getAttribute("tyreObject"+i);%>
        <tr>
            <td>Tyre Brand</td>
            <td><%=tyre.getBrand()%></td>
        </tr>
        <tr>
            <td>Tyre Size</td>
            <td><%=tyre.getSize()%></td>
        </tr>
  <%  }%>

    <th>Door details</th>

    <% for(int i=0; i<4;i++)
    {
        Door door=(Door) request.getAttribute("doorObject"+i);%>
        <tr>
            <td>Door Colour</td>
            <td><%=door.getColor()%></td>
        </tr>
   <% }%>
    <th>Steering Details</th>
    <tr>
        <td>Steering Colour</td>
        <td><%=steer.getColor()%></td>
    </tr>
</table>
</body>
</html>
