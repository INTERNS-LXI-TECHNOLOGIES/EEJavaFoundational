<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Enter Car Details</title>
</head>
<body>
    <h1>Enter Your Car Details</h1>
    <form action="carDetails.jsp" method="post">
        <label for="carname">Car Name:</label>
        <input type="text" id="carname" name="Carname" required><br>
        <label for="carcolor">Car Color:</label>
        <input type="text" id="carcolor" name="Carcolour"><br><br>

        <fieldset>
            <legend>Doors</legend>
            <% for (int i = 0; i < 4; i++) { %>
                <label>Door <%= i + 1 %> Brand:</label>
                <input type="text" name="doorBrand<%= i + 1 %>"><br>
            <% } %>
        </fieldset>

        <fieldset>
            <legend>Tyres</legend>
            <% for (int i = 0; i < 4; i++) { %>
                <label>Tyre <%= i + 1 %>:</label>
                <div>
                    <label for="TyreBrand<%= i + 1 %>">Brand:</label>
                    <input type="text" id="TyreBrand<%= i + 1 %>" name="tyreBrand<%= i + 1 %>">
                    <label for="TyreSize<%= i + 1 %>">Size:</label>
                    <input type="text" id="tyresize<%= i + 1 %>" name="tyresize<%= i + 1 %>">
                </div>
            <% } %>
        </fieldset>

        <label for="steeringColour">Steering Colour:</label>
        <input type="text" id="steeringColour" name="steeringColour"><br><br>

        <input type="submit" value="Go to Next Page">
    </form>
</body>
</html>