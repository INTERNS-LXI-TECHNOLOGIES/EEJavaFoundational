<html>


<%@ page import="com.lxisoft.vegetable.Vegetable"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.List"%>




<body>
  <form action ="AddPage" method = "POST">

  <button >Add Vegetable</button>
  
  </form>

 <h1><center>Vegetable Details</center></h1>

 <center><table style="width: 90%;" border="1">
 
 <tr>
 <th>Name</th>
 <th>Price</th>
 <th>Stock</th>
 <th>Minimum Order Quantity</th>
 <th>Actions</th>
 
 </tr>

 <%List<Vegetable> vegetables = (ArrayList<Vegetable>)request.getAttribute("vegetable");

 
  for (Vegetable vegetable : vegetables) {%>
  

<tr>

<td><%out.println("Name :" +vegetable.getName());%></td>

<td><%out.println("Price : " + vegetable.getPrice());%></td>

<td><%out.println("Stock :" +vegetable.getStock());%></td>

<td><%out.println("Minimum Order Quantity :" +vegetable.getOrderQuantity());%></td>

<td><form action="my-page" method="POST">

<Button>edit</Button>
  </form>

<button>Buy</button>

</td>

</tr>
<%}%>  
</table></center>
</body>

</html>