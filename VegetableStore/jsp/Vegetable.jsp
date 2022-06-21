<html>

<head>

<title>Vegetable List</title>
<style> 

h1{
color:white;	
background-color:chartreuse;
border-color:red;
margin : 30px 400px;
height:50px;
width:300px;
}
table{
  border: 1.5px solid red;
border-collapse: collapse;

}
th,td{
  padding : 9px;
}
th{
background-color:skyblue;
color:white;

}
.vegetableBtn{
background-color:orange;
color:white;
border: none;
margin : 10px 160px;
height:30px;
width:100px;
}
.editBtn{
  background-color:blue;
  color : white;
  border: none;
}

</style>
 
</head>
<%@ page import="com.lxisoft.vegetable.Vegetable"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.List"%>


<body>
  
 
 <h1><center>Vegetable Details</center></h1>

 <form action="add-vegetable" method="GET">
  <button class="vegetableBtn" >Add Vegetable</button>
  </form>

 <center><table style="width: 70%;" border="1">
 
 <tr>
 <th>Id</th>
 <th>Name</th>
 <th>Price</th>
 <th>Stock</th>
 <th>Minimum Order Quantity</th>
 <th>Actions</th>
 
 </tr>

 <%List<Vegetable> vegetables = (ArrayList<Vegetable>)request.getAttribute("vegetable");

 
  for (Vegetable vegetable : vegetables) {%>
  


<tr>

<td><center><%out.println(vegetable.getId());%></center></td>

<td><center><%out.println(vegetable.getName());%></center></td>

<td><center><%out.println( vegetable.getPrice());%></center></td>

<td><center><%out.println(vegetable.getStock());%></center></td>

<td><center><%out.println(vegetable.getOrderQuantity());%></center></td>

<td>
 
  <form action = "vegetable-list" method = "POST">

    <center><button class="edit.Btn">Edit</button></center></form>

    <form action = "vegetable-list" method = "DELETE">

      <center><button class="delete.Btn">Delete</button></center></form>
  

</td>

</tr>
<%}%>  
</table></center>
</body>

</html>