<%@page import ="com.lxisoft.vegetable.Vegetable";%>
<$@page import ="java.util.ArrayList";%>




<html>

<body>


 <h1>Vegetable Details</h1>

 <%ArrayList<Vegetable> vegetable = (ArrayList<Vegetable>)request.getAttribute("vegetable");

  for (Vegetable vegetables : vegetable) {%>

<tr>

<td><%vegetables.getName();%></td>

</tr>

}%>



</body>

</html>