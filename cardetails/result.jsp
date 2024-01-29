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
    </style>
</head>
<body>
    <% 
        Car car = (Car) request.getAttribute("carObject");
        Steering steer = (Steering) request.getAttribute("steerObject");
    %>
    <h1>Car Details</h1>
    <% out.println("Car Name : "+car.getName()); %><br><br>
    <% out.println("Car Colour : "+car.getColor()); %>

    <h1>Tyre Details</h1>
   <% for(int i=0; i<4;i++)
    {
        Tyre tyre=(Tyre) request.getAttribute("tyreObject"+i);
        out.println("Tyre Brand : "+tyre.getBrand()); %><br><br>
       <% out.println("Tyre Size : "+tyre.getSize()); %><br><br>
  <%  }%>

    <h1>Door Details</h1>

    <% for(int i=0; i<4;i++)
    {
        Door door=(Door) request.getAttribute("doorObject"+i);%><br>
       <% out.println("Door Colour : "+door.getColor()); %><br>
   <% }%>
    <h1>Steering Details</h1>
    <% out.println("Steering Colour : "+steer.getColor()); %>
</body>
</html>
