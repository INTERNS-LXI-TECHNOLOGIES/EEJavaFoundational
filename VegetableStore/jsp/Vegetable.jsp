<html>


<%@ page import="com.lxisoft.vegetable.Vegetable"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.List"%>




<body>


 <h1>Vegetable Details</h1>

 <%List<Vegetable> vegetable = (ArrayList<Vegetable>)request.getAttribute("vegetable");

  for (int i = 0; i <vegetable.size(); i++) {%>

<%out.println("Name :" +vegetable.get(i).getName());%>

<%out.println("Price : " + vegetable.get(i).getPrice());%>

<%out.println("Stock :" +vegetable.get(i).getStock());%>

<%out.println("Minimum Order Quantitye :" +vegetable.get(i).getOrderQuantity());%>

<%}%>



</body>

</html>