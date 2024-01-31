<%@ page import ="com.divisosoft.car.*"%>
<html>
    <head>
        <title>THIS CONTROLLER</title>
    </head>
    <body>
    <%
        Car car = new Car();
        String carName = request.getParameter("carname");
        car.setName(carName);
    
        for(int i =0; i<4 ; i++){
        String doorName =request.getParameter("doorname"+(i+1));
        car.setDoor(new Door());
        car.getDoor().setName(doorName);
        request.setAttribute("doorobject"+(i+1),car.getDoor());
        }

       for(int i =0; i<4;i++){
        int tyreSize = Integer.parseInt(request.getParameter("tyresize"+(i+1)));
        car.setTyre(new Tyre());
        car.getTyre().setSize(tyreSize);
        request.setAttribute("tyreobject"+(i+1),car.getTyre());
       }
       request.setAttribute("carobject",car);
       RequestDispatcher dispatcher = request.getRequestDispatcher("out.jsp");
       dispatcher.forward(request,response); 
       %>

    </body>
</html>