<html>
    <head>
        <title>user</title>
    </head>
    <body>
        <form action="userServlet" method="post" enctype="multipart/form-data">
            <label for="name">Name :</label>
            <input type="text" name="name">
            <label for="phone">Phone :</label>
            <% 
                String passwordError = (String)request.getAttribute("error");
                if (passwordError != null) {
            %>
                <span style="color: red;"><%= passwordError %></span><br>
            <% } %>
            <input type="text" name="phone">
            <label for="photo">Photo :</label>
            <input type="file" id="photo" name="photo">
            <input type="submit" value="submit">
        </form>
    </body>
</html>