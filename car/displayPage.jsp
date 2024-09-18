<%@ page import ="com.lxisoft.fahad.*"%>
<html>
<head>
<title>Result</title>
<style>
     body{
                text-align:center;
                }

                table{
                margin:auto;}
                </style>
</head>
<body>
<table style="color:red" border="1">
<% Car car = (Car) request.getAttribute("carObjects");%>
<tr>
<th>SL NO:</th>
<th>ITEM:</th>
<th>NAME:</th>
</tr>
<tr>
<td>1</td>
<td>Car name</td>
<td><%= car.getName() %></td></tr>
<tr>
<td>2</td>
<td>Car Colour</td>
<td><%= car.getColour() %></td>
</tr>

<% for(int i = 0;i<4;i++){
Door door = (Door) request.getAttribute("doorObjects"+(i+1));%>
<tr>
<td><%=3+i%></td>
<td>DoorBrand</td>
<td><%=door.getBrand()%></td>
</tr>
<% } %>

<% for(int i = 0;i<4;i++){
Tyre tyre = (Tyre) request.getAttribute("tyreObjects"+(i+1));%>
<tr>
<td><%=7+i%></td>
<td>TyreBrand</td>
<td><%=tyre.getBrand()%></td></tr>

<tr>
<td><%=+i%></td>
<td>TyreSize</td>
<td><%=tyre.getSize()%></td>

</tr>

<% } %>


<%  Steering steering = (Steering)request.getAttribute("steeringObject");%>
<tr>
<td><%=11%></td>
<td>SteeringColour</td>
<td><%=steering.getColour()%></td>
</tr>

 </table>
  </body>
</html>
