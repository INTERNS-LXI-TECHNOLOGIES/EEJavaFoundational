<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Enter Car Details</title>
</head>
<body>
    <h1>Enter Your Choice</h1>
    <form action="carDetails.jsp" method="post">
        <label for="carname">CarName:</label>
        <input type="text" id="Carname" name="Carname" required><br>
        <label for="Carcolor">CarColor:</label>
        <input type="text" id="Carcolor" name="Carcolour"><br><br>

              <% for(int i = 0; i < 4; i++) { %>
                    <label>DoorBrand</label>
                   <input type="text" name="doorBrand<%= i+1 %>"><br>
               <% } %>


        <% for (int i= 0;i<4;i++){%>
        <label >Tyre Name</label>
        <input type="text"  name="TyreBrand<%=i+1%>"><br>

        <label>Tyre Size</label>
        <input type="text"  name="TyreSize<%=(i+1)%>"><br><br>
        <%
        }
        %>
        <label>SteeringColour</label>
        <input type= "text" name="steeringColour"><br><br>
        <input type="submit" value = "Go to next Page">
    </form>
</body>
</html>