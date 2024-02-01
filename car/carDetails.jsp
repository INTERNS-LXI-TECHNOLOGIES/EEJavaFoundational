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
   String tyreBrand=request.getParameter("TyreBrand"+(i+1));
   tyre.setBrand(tyreBrand);
   String tyresize = request.getParameter("TyreSize"+(i+1));
   tyre.setSize(tyresize);
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