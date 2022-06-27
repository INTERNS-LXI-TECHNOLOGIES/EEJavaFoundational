<html>


<head>

   <%@ page import="com.lxisoft.vegetable.Vegetable"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.List"%>


<body>

   <a href = "vegetable-list"> home</a>
   
   <form action ="<%=request.getContextPath() %>/update-vegetable" method ="post">


   <%List<Vegetable> vegetables = (ArrayList<Vegetable>)request.getAttribute("vegetable");

 
      for (Vegetable vegetable : vegetables) {%>

<center><h4>Edit the Vegetable</h4></center>
<center>
<table style = "width: 80%">

  
   <td><input type = "hidden" name = "id" value =<%=vegetable.getId()%>></td>
   </tr>
   
   <tr>

      <td>Enter Name</td>
      <td><input type = "text" name = "name" value =<%=vegetable.getName()%>></td>
      </tr>
      
      <tr> 
      <td>Enter Price </td>
      <td><input type = "text" name = "price"  value =<%=vegetable.getPrice()%>></td>
    </tr>
    
    <tr>
    <td>Enter Stock</td>
    <td><input type = "text" name = "stock"  value =<%=vegetable.getStock()%>></td>
    </tr>
    
    <tr>
    <td>Enter OrderQuantity</td>
    <td><input type = "text" name = "orderQuantity"  value =<%=vegetable.getOrderQuantity()%>></td>
    </tr>
    
     </table>
     
     <input type = "submit" value = "submit"/>
     
    

 </center>

 <%}%>
</body>
</head>
</html>