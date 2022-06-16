<html>


<%@ page import="com.lxisoft.vegetable.Vegetable"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.List"%>




<body>
  
<form action="addpage" method="GET">
  <button >Add Vegetable</button>
  </form>
 
 <h1><center>Vegetable Details</center></h1>

 <center><table style="width: 90%;" border="1">
 
 <tr>
 <th>No</th>
 <th>Name</th>
 <th>Price</th>
 <th>Stock</th>
 <th>Minimum Order Quantity</th>
 <th>Actions</th>
 
 </tr>

 <%List<Vegetable> vegetables = (ArrayList<Vegetable>)request.getAttribute("vegetable");

 
  for (Vegetable vegetable : vegetables) {%>
  

<tr>

<td><center><%out.println(vegetable.getNo());%></center></td>

<td><center><%out.println(vegetable.getName());%></center></td>

<td><center><%out.println( vegetable.getPrice());%></center></td>

<td><center><%out.println(vegetable.getStock());%></center></td>

<td><center><%out.println(vegetable.getOrderQuantity());%></center></td>

<td><form action="my-page" method="POST">

<center><Button>Edit</Button></center></form>

<form action="my-page" method="delete">

<center><button>Delete</button></center>

</form>


</td>

</tr>
<%}%>  
</table></center>
</body>

</html>



