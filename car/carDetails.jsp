<%@ page import ="com.lxisoft.fahad.*"%>
<html>
<head>
<title>Detials Page</title>
</head>
<body>
<p> PUTTING DETAILS</p>
<%
   String carName=request.getParameter("Carname");

   Car car = new Car();
   car.setName(carName);
   car.setColour(request.getParameter("Carcolour"));
   request.setAttribute("carObjects",car);

   for (int i = 0; i < 4;i++){
   String doorBrand= request.getParameter("doorBrand"+(i+1));
   Door door = new Door();
   door.setBrand(doorBrand);
   request.setAttribute("doorObjects"+(i+1),door);
   }

   for (int i = 0 ;i<4;i++){
   Tyre tyre= new Tyre();
   tyre.setBrand(request.getParameter("tyreBrand"+(i+1)));
   tyre.setSize(request.getParameter("tyresize"+(i+1)));
   request.setAttribute("tyreObjects"+(i+1),tyre);
   }
   Steering steering = new Steering ();
   steering.setColour(request.getParameter("steeringColour"));
   request.setAttribute("steeringObject",steering);

   RequestDispatcher dispatcher = request.getRequestDispatcher("displayPage.jsp");
   dispatcher.forward(request,response);
%>
</body>
</html>