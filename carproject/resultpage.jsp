<%@ page import ="com.divisosoft.carmodel.*"%>
<html>
    <head>
        <title>RESULT</title>
    </head>
    <body>
   <% Car car = (Car) request.getAttribute("carobject");%>
   <p><%= car.getColor() %>,<%= car.getName() %></p> 
    <%
   for(int i =0;i<4;i++){
   Door door =(Door) request.getAttribute("doorobject"+(i+1));%>
    <p><%= door.getName() %></p>
   <%}
   for(int i =0;i<4;i++){
    Tyre tyre = (Tyre)request.getAttribute("tyreobject"+(i+1));%>
    <p>TYRE NAME :<%= tyre.getName()%>,<BR>TYRE SIZE :<%= tyre.getSize()%></p>
  <% }
   %>
     
    </body>
</html>