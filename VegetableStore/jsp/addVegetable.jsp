<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<head>
<meta charset="ISO-8859-1">
<title>Vegetable Add Form</title>
</head>


<html>

<body>

<center>

<div align = "left">

  
<a href = "vegetable-list"> home
  </a>
  
  </div>
<h4>Add the Vegetable</h4>

<form action ="<%=request.getContextPath() %>/add-vegetable" method ="post">

<table style = "width: 80%">

<tr>

  <td>Enter Name</td>
  <td><input type = "text" name = "name"/></td>
  </tr>
  
  <tr> 
  <td>Enter Price </td>
  <td><input type = "text" name = "price"/></td>
</tr>

<tr>
<td>Enter Stock</td>
<td><input type = "text" name = "stock"/></td>
</tr>

<tr>
<td>Enter OrderQuantity</td>
<td><input type = "text" name = "orderQuantity"/></td>
</tr>

 </table>
 
 <input type = "submit" value = "submit"/>
 

</form>
</div>
</center>
</body>

</html>