<%@ page import="com.divisosoft.car.Tyre"%>
<%@ page import="com.divisosoft.car.Door"%>
<%@ page import="com.divisosoft.car.Car"%>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<html>
<head>
    <title>CAR DETAILS</title>
</head>
<body>

   <h1>Car Details</h1>
    <p>Car Details: <br> <%= request.getAttribute("carr") %></p>
    <h2>Tyre Details</h2>
    <% 
        List<Tyre> retrievedTyreList = (List<Tyre>) request.getAttribute("tyreList");
        if (retrievedTyreList != null) {
            for (Tyre tyre : retrievedTyreList) { 
    %>
                <p>Tyre Size: <%= tyre.getSize() %></p> 
    <% 
            }
        } else {
    %>
            <p>Debug - Tyre List is null</p>
    <% } %>
	
	<h2>Door Details</h2>
	<%
	 List<Door> door = (List<Door>)  request.getAttribute("doorList");
	  if (door != null) 
	  {
	 for(Door d: door)
	 {
		%> 
		<p>Door branName: <%=d.getBrandName()%></p>
	 
	  <% 
            }
        } else {
    %>
            <p>Debug - Tyre List is null</p>
    <% } %>
	
	<h2>Steering Details</h2>
	<p>Steering Details: <br><%= request.getAttribute("steering")%></p>
</body>
</html>
