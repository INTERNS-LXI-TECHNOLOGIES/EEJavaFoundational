<%@ page import="com.divisosoft.car.Car"  %>
<% 
String n = request.getParameter("name");
String m = request.getParameter("model");
String c = request.getParameter("colour");

Car car = new Car(n,m,c);
request.setAttribute("car",car);
%>
<html>
<head>
<title>CAR DETAILS</title>
</head>
<body>
<h1>Car Details</h1>
<p>Car Name: <%= request.getAttribute("carName") %></p>
<p>Car Model: <%= request.getAttribute("carModel") %></p>
<p>Car color: <%= request.getAttribute("carColour") %></p>
</body>
</html>