<html>

<body>
 <form action ="<%=request.getContextPath() %>/vegetable-list" method ="post">

<center><h4>Edit the Vegetable</h4></center>
<center>
<table style = "width: 80%">

 <tr>
 
   <td>Enter Name</td>
   <td><input type = "text"  name = "name" /></td>
   </tr>
   
   <tr> 
   <td>Enter Price </td>
   <td><input type = "text"  name = "price"  /></td>
 </tr>
 
 <tr>
 <td>Enter Stock</td>
 <td><input type = "text"  name = "stock"/></td>
 </tr>
 
 <tr>
 <td>Enter OrderQuantity</td>
 <td><input type = "text" name = "orderQuantity"/></td>
 </tr>

  </table>
  <center><input type = "submit" value = "submit"/></center>

 </center>
</form>
</body>

</html>