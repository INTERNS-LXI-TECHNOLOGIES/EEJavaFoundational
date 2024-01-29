<%@ page import ="com.divisosoft.carmodel.*"%>


<html>
    <head>
        <title>THIS IS VALUE PUTTING PAGE</title>
    </head>
    <body>
        <p>PUTTING VALUES</p>
        
        <%
        String carNmae = request.getParameter("carname");
      
        Car  car =new Car();
        car.setName(carNmae);
        car.setColor(request.getParameter("carcolour"));
        request.setAttribute("carobject",car);
       
        for(int i =0;i<4;i++){
        String doorName= request.getParameter("doorname"+(i+1));
        Door door=new Door();
        door.setName(doorName);
        request.setAttribute("doorobject"+(i+1),door);
       }
        
       for(int i=0;i<4;i++){
        String tyreName = request.getParameter("tyrename"+(i+1));
        int tyresize= Integer.parseInt(request.getParameter("tyresize"+(i+1)));
        Tyre tyre = new Tyre();  
        tyre.setName(tyreName);
        tyre.setSize(tyresize);
        request.setAttribute("tyreobject"+(i+1),tyre);
        }
       
      
      RequestDispatcher dispatcher = request.getRequestDispatcher("resultpage.jsp");
      dispatcher.forward(request, response);
      %>



      
    </body>
</html>