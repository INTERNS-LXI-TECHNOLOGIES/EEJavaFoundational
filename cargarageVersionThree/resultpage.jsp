<%@ page import="com.divisosoft.car.Tyre"%>
<%@ page import="com.divisosoft.car.Door"%>
<%@ page import="com.divisosoft.car.Car"%>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<html>
<head>
    <title>CAR DETAILS</title>
	<style>
	body{
		background-image:url(2.jpg);
		background-size: cover;
		background-position: center center;
	}
	</style>
</head>
<body>

   <h1 style = "color:brown">Car Details</h1>
    <p style = "color:rgba(221, 32, 238, 0.842)"> <%= request.getAttribute("carr") %> </p>
	
    <h2 style = "color:brown">Tyre Details</h2>
    <% 
        List<Tyre> retrievedTyreList = (List<Tyre>) request.getAttribute("tyreList");
        if (retrievedTyreList != null) {
            for (Tyre tyre : retrievedTyreList) { 
    %>
                <p style = "color:rgba(221, 32, 238, 0.842)">Tyre Size:<span style="color:blue;"> <%= tyre.getSize() %></span></p> 
    <% 
            }
        } else {
    %>
            <p>Debug - Tyre List is null</p>
    <% } %>
	
	<h2 style = "color:brown">Door Details</h2>
	<%
	 List<Door> door = (List<Door>)  request.getAttribute("doorList");
	  if (door != null) 
	  {
	 for(Door d: door)
	 {
		%> 
		<p style = "color:rgba(221, 32, 238, 0.842)">Door branName: <span  style="color: blue;"> <%=d.getBrandName()%> </span></p>
	 
	  <% 
            }
        } else {
    %>
            <p>Debug - Tyre List is null</p>
    <% } %>
	
	<h2 style = "color:brown">Steering Details</h2>
	<p style = "color:rgba(221, 32, 238, 0.842)"> <%= request.getAttribute("car")%></p>
</body>
</html>
