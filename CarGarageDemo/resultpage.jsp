<%@ page import="com.divisosoft.car.Tyre"%>
<%@ page import="com.divisosoft.car.Door"%>
<%@ page import="com.divisosoft.car.Car"%>
<%@page import="com.divisosoft.car.Steering" %>
<html>
<head>
    <title>CAR DETAILS</title>
	<style>
	body{
		background-image:url(12.jpg);
		background-size: cover;
		background-position: center center;
	}
	
	</style>
</head>
<body>

<table style="color:orange" border ="2">
<%Car car = (Car)request.getAttribute("carObject");
 Steering steering = car.getSteering();%>
<tr>
<th> Car Details</th>
</tr>
  <tr>
  <td style = "color:brown">Car Name</td>
  <td style = "color:brown"><%=car.getName()%>
	</tr>
	<tr>
	<td style = "color:brown">Car Model</td>
  <td style = "color:brown"><%=car.getModel()%></td>
  </tr>
  
   <tr>
  <th > Tyre Details </th>
  </tr>
   <%for(int i =0;i<4;i++)
   {
  Tyre tyre = (Tyre)request.getAttribute("tyreObject"+i); %>
  <tr>
  <td style = "color:brown">Tyre Size</td>
  <td style = "color:brown"><%=tyre.getSize()%></td>
  </tr>
   <%}%>

<tr>
<td> Door Details </td>
</tr>   

<%for(int i=0;i<4;i++)
{
Door door= (Door)request.getAttribute("doorObject"+i);%>
<tr>
<td style = "color:brown">Door BrandName</td>
<td style = "color:brown"><%=door.getBrandName()%></td>
</tr>
<%}%>
   
   
   <tr>
   <th>Steering Details</th>
   </tr>
  
   <tr>
   <td style = "color:brown"> Steering Colour </td>
   <td style = "color:brown"><%=steering.getColour()%></td>
   </tr>	
	
	<form action="carWork.jsp" method="post">
<input style="color:pink" type="submit" value="Go Back">
</form>
</table>
</body>
</html>
