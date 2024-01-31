<%@ page import ="com.divisosoft.car.*"%>
<html>
    <head>
        <title>output page</title>
    </head>
    <style>
    table{
        text-align:center;
        margin:auto;
        height:50;
        width:300;
    }
</style>
    <body>
        <h1 style="text-align: center; font: 100px; background-color: bisque; font-family: 'Franklin Gothic Medium';">CAR PARTS</h1>
        <table border="1">
            <thead>
                <tr>
                    <td>SL NO</td>
                    <td>PART</td>
                    <td>NAME OF PART</td>
                </tr>
            </thead>
        <%
         Car car = (Car) request.getAttribute("carobject");%>

            <tr>
                <td>1</td>
                <td>CAR NAME</td>
                <td><%= car.getName() %></td>
            </tr>
      <%  for(int i =0; i<4 ; i++){
        Door d = (Door)request.getAttribute("doorobject"+(i+1));
        %>
               <tr>
            <td><%= i+2 %></td>
            <td>DOOR NAME</td>
            <td><%= d.getName() %></td>
        </tr>
      <%  }
    
      for(int i =0 ;i<4 ; i++){ 
        Tyre tyre =  (Tyre) request.getAttribute("tyreobject"+(i+1));%>
    
        <tr>
            <td><%= i+6 %> </td>
            <td>TYRE SIZE</td>
            <td><%= tyre.getSize()%></td>
        </tr>

  <%  }%>
    </table>
    </body>
</html>