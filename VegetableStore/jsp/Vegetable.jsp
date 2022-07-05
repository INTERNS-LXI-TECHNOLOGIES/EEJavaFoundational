<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>

<head>

<title>Vegetable List</title>
<style> 

h1{
color:white;	
background-color:blue;
font-size:37px;
height:60px;
width:1200px;

}
h2{
color:white;	
background-color:chartreuse;
border-radius:10px;
margin : 5px 410px;
height:40px;
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
margin : 10px 150px;
border-radius:10px;
height:30px;
width:100px;
}
.editBtn{
  background-color:blue;
  color : white;
  border: none;
  border-radius:10px;
  width:70px;
  height:30px

}
.deleteBtn{
background-color:red;
border: none;
border-radius:10px;
color : white;
width:70px;
  height:30px
  
}
.vegetableBtn{
height:40px;
}



</style>
 
</head>
<%@ page import="com.lxisoft.vegetable.Vegetable"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.List"%>

<body>
  
  <h1><center>VEGETABLE STORE</center></h1>

  <div
  style= "text-align: right;">
  <a href = "log-out"  ><img src ="image?name=logout.jpeg" alt="google-play" height = 60px  class="log" onclick = "return confirm('Are You Sure Want to Logout')"></a></center>
</div>

 <h2><center>Vegetable Details</center></h2>


 <% if (request.isUserInRole("admin")) {  %>
  <a href = "add-vegetable"><img src ="image?name=add.jpeg" alt="google-play" height = 50px  class="vegetableBtn"></a></center>

<%}%>
 <center><table style="width: 75%;" border="1" >
 
 <tr>
 <th>Id</th>
 <th>Name</th>
 <th>Price</th>
 <th>Stock</th>
 <th>Minimum Order Quantity</th>
 <th>image</th>

 <% if (request.isUserInRole("admin")) {  %>

 <th>Actions</th>
 
 <%}%>
 </tr>

 <%List<Vegetable> vegetables = (ArrayList<Vegetable>)request.getAttribute("vegetable");

 
  for (Vegetable vegetable : vegetables) {%>
  


<tr>

<td><center><%out.println(vegetable.getId());%></center></td>

<td><center><%out.println(vegetable.getName());%></center></td>

<td><center><%out.println( vegetable.getPrice());%></center></td>

<td><center><%out.println(vegetable.getStock());%></center></td>

<td><center><%out.println(vegetable.getOrderQuantity());%></center></td>

<td><img src="data:image/jpg;base64,<%= vegetable.getBase64Image()%>"width = "130" height ="130"></td>


<td>
 

<% if (request.isUserInRole("admin")) {  %>

  <form action = "update-vegetable" method = "GET">

    <center><input type = "hidden" name ="id" value= <%=vegetable.getId()%>
      <input type = "submit" ><button class = "editBtn">Edit</button></input></center></form>



    <form action = "delete-vegetable" method = "POST">

      <center><input type = "hidden" name ="id" value= <%=vegetable.getId()%>
        <input type = "submit" ><button class = "deleteBtn" onclick ="return confirm('Are You Delete Permanently?')">Delete</button></input></center></form>
  
<%}%>

</td>
</tr>
<%}%>  
</table></center>
</body>

</html>