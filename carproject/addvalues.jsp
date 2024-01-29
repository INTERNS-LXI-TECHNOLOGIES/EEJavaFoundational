<html>
   <head>
    <title>THIS IS PAGE FOR ADDING VALUES</title>
   </head> 
   <body>
        <form action="puttingvalues.jsp" method="post">
            <label for="carname">ENTER THE CAR NAME</label>
            <input type="text" id="carname" name="carname" required><br>
            <label for="carcolour">ENTER THE CAR COLOUR</label>
            <input type="text" id="carcolour" name="carcolour"><br><br>

            <% for(int i=0;i<4;i++){ %>
                <label>ENTER DOOR</label>
                <input type="text" name="doorname<%= i+1 %>"><br>
            <%
            }
            %><br>
            <% for(int i=0;i<4;i++){ %>
                <label>ENTER TYRE NAME</label>
                <input type="text" name="tyrename<%=(i+1)%>"><br><br>

                <label>ENTER TYRE SIZE</label>
                <input type="text" name="tyresize<%=(i+1)%>"><br><br>
           <% }%>

            <input type="submit" value="Submit">
     
        </form>
   </body>
</html>