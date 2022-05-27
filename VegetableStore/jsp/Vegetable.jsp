<html>


<%@ page import="com.lxisoft.vegetable.Vegetable"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.List"%>




<body>


 <h1><center>Vegetable Details</center></h1>

 <table style="width: 100%;" border="1">

 <%List<Vegetable> vegetable = (ArrayList<Vegetable>)request.getAttribute("vegetable");


  for (int i = 0; i <vegetable.size(); i++) {%>

<td>


<%out.println("Name :" +vegetable.get(i).getName());%>

<%out.println("Price : " + vegetable.get(i).getPrice());%>

<%out.println("Stock :" +vegetable.get(i).getStock());%>

<%out.println("Minimum Order Quantitye :" +vegetable.get(i).getOrderQuantity());%>

<button>Buy</button>

</td>

<%}%>  
</table>
</body>

</html>