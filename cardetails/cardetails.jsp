<%@page import="com.divisosoft.carproject.*"%>
<html>
<head>
<title> cardetails </title>
<style>
body {
    align-items:center;
    text-align: center;
}
</style>
</head>
<body>

        <%
            Car car = new Car();
            car.setName(request.getParameter("carName"));
            car.setColor(request.getParameter("carColor")); 
            request.setAttribute("carObject", car); 

            for(int i=0; i<4; i++) {
                Door door = new Door();
                door.setColor(request.getParameter("color" + i));
                request.setAttribute("doorObject"+i,door);
            }

            for(int i=0;i<4;i++) {
                Tyre tyre = new Tyre();
                tyre.setBrand(request.getParameter("brand"+i));
                int size = Integer.parseInt(request.getParameter("size"+i));
                tyre.setSize(size);
                request.setAttribute("tyreObject"+i,tyre);
            }

            car.steer = new Steering();
            car.steer.setColor(request.getParameter("steer")) ;
            request.setAttribute("steerObject",car);

            RequestDispatcher dispatcher = request.getRequestDispatcher("result.jsp");
            dispatcher.forward(request,response);
        %>
        <form action="result.jsp" method="post">
        <input type="submit" value="continue">
    </form>
</body>
</html>
