<html>
    <head>
        <title> THIS IS PAGE FOR INPUT</title>
    </head>

    <body>
        <form action="carcontroller.jsp" method="post">
            <label>ENTER THE CAR NAME</label>
            <input type="text" name="carname"><br><br>
            <% for(int i=0;i<4;i++){ %>
                <label>ENTER DOOR NAME</label>
                <input type="text" name="doorname<%=(i+1)%>"><br>
           <% } %>
           <br>
           <%
            
           for(int i=0;i<4;i++){ %>
            <label>ENTER TYRE SIZE</label>
            <input type="text" name="tyresize<%=(i+1)%>"><br>
         <%  }%>
         <input type="submit" value="ok">
        </form>
    </body>
</html>