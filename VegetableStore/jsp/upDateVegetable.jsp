<html>


<head>

  <%@ page import="com.lxisoft.dao.VegetableDao"%>

<body>

<%VegetableDao veg = new VegetableDao()%>
<center><h4>Edit the Vegetable</h4></center>
<center>
<table style = "width: 80%">

 <tr>
 
   <td>Enter Name
  <input type = "text"  name = "name" /></td>

   
     <td>Enter Price
    <input type = "text"  name = "price"  /></td>

 

 <td>Enter Stock</td>
 <td><input type = "text"  name = "stock"/></td>

 
 <td>Enter OrderQuantity</td>
 <td><input type = "text" name = "orderQuantity"/></td>
 </tr>

  </table>
  <center><input type = "submit" value = "submit"/></center>

 </center>

</body>
</head>
</html>