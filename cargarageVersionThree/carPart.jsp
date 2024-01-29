<%@page import="java.util.ArrayList" %>
<%@page import="java.util.List" %>
<%@page import="com.divisosoft.car.Car" %>
<%@page import="com.divisosoft.car.Tyre" %>
<%@page import="com.divisosoft.car.Door" %>
<%@page import="com.divisosoft.car.Steering" %>

<% 
String n = request.getParameter("name");
String m = request.getParameter("model");

Car car = new Car();
car.setName(n);
car.setModel(m);
request.setAttribute("carr", car);

List<Tyre> tyreList = new ArrayList<>();

for (int i = 0; i < 4; i++) 
{
    Tyre tyre = new Tyre(request.getParameter("tyre" + i));
    tyre.setSize(request.getParameter("tyre" + i));
    tyreList.add(tyre);
}
request.setAttribute("tyreList", tyreList);

List<Door> doorList = new ArrayList<>();
for(int i=0;i<4;i++)
{
		String s = request.getParameter("door"+i);
		Door door = new Door(s+i);
		door.setBrandName(s);
		doorList.add(door);
}
request.setAttribute("doorList",doorList);

car.setSteering(new Steering(request.getParameter("steering")));
car.getSteering().setColour(request.getParameter("steering"));
request.setAttribute("car",car);
%>

<html>
<body>
<%
RequestDispatcher dispatcher = request.getRequestDispatcher("resultpage.jsp");
dispatcher.forward(request, response);
%>
</body>
</html>
