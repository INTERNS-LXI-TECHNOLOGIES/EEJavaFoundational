<%@page import="com.divisosoft.car.Car" %>
<%@page import="com.divisosoft.car.Tyre" %>
<% 
String n = request.getParameter("name");
String m = request.getParameter("model");

Car car = new Car(n,m);
car.setName(n);
car.setModel(request.getParameter("model"));
request.setAttribute("carr",car);

Tyre[] tyreArray = new Tyre[4];

for(int i=0;i<4;i++)
{
Tyre tyre = new Tyre(request.getParameter("tyre"+i));
tyre.setSize(request.getParameter("tyre"+i));
tyreArray[i]= tyre;
}
request.setAttribute("tyreArray",tyreArray);
%>
<html>
<head>
<title>CAR DETAILS</title>
</head>
<body>
<h1>Car Details</h1>
<p>Car Details: <%= request.getAttribute("carr")%></p>

	<form action="resultpage.jsp" method ="post">
	 <input type="hidden" name="tyreArray" value="<%= tyreArray %>">
	<input type="submit" value="sumbit">
	</form>
</body>
</html>