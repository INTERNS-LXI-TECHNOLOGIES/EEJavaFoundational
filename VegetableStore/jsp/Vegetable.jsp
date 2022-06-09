<html>


<%@ page import="com.lxisoft.vegetable.Vegetable"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.List"%>




<body>


 <h1><center>Vegetable Details</center></h1>

 <table style="width: 100%;" border="1">

 <%List<Vegetable> vegetables = (ArrayList<Vegetable>)request.getAttribute("vegetable");


  for (Vegetable vegetable : vegetables) {%>

<td>


<%out.println("Name :" +vegetable.getName());%>

<%out.println("Price : " + vegetable.getPrice());%>

<%out.println("Stock :" +vegetable.getStock());%>

<%out.println("Minimum Order Quantitye :" +vegetable.getOrderQuantity());%>

<form action="my-page" method="POST">

<Button>edit</Button>
  </form>

<button>Buy</button>

</td>

<%}%>  
</table>
</body>

</html>