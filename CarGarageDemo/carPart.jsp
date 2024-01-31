
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
request.setAttribute("carObject", car);


for (int i = 0; i < 4; i++) 
{
    Tyre tyre = new Tyre(request.getParameter("tyre" + i));
    tyre.setSize(request.getParameter("tyre" + i));
	request.setAttribute("tyreObject"+i, tyre);
}


for(int i=0;i<4;i++)
{
		String s = request.getParameter("door"+i);
		Door door = new Door(s+i);
		door.setBrandName(s);
		request.setAttribute("doorObject"+i,door);
}


car.setSteering(new Steering(request.getParameter("steering")));
car.getSteering().setColour(request.getParameter("steering"));
request.setAttribute("steeringObject",car);
%>

<html>
<body>
<%
RequestDispatcher dispatcher = request.getRequestDispatcher("resultpage.jsp");
dispatcher.forward(request, response);
%>

</body>
</html>
