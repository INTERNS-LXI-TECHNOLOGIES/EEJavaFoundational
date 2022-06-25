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
margin : 10px 133px;
height:30px;
width:100px;
}
.editBtn{
  background-color:blue;
  color : white;
  border: none;
}
.deleteBtn{
background-color:red;
border: none;
color : white;
}

</style>
 
</head>
<%@ page import="com.lxisoft.vegetable.Vegetable"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.List"%>


<body>
  
 
 <h1><center>Vegetable Details</center></h1>

 <form action= "add-vegetable" method="POST">
  <button class="vegetableBtn" >Add Vegetable</button>
  </form>

 <center><table style="width: 75%;" border="1">
 
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
 
  <form action = "update-vegetable" method = "GET">

    <center><input type = "hidden" name ="id" value= <%=vegetable.getId()%>
      <input type = "submit" ><button class = "editBtn">Edit</button></input></center></form>



    <form action = "add-vegetable" method = "GET">

      <center><input type = "hidden" name ="id" value= <%=vegetable.getId()%>
        <input type = "submit" ><button class = "deleteBtn" onclick ="return confirm('Are You Delete Permanently?')">Delete</button></input></center></form>
  



</td>
</tr>
<%}%>  
</table></center>
</body>

</html>