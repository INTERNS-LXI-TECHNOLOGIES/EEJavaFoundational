<html>
    <head>
        <title>this is data entry page</title>
    </head>
    <body>
        <% String option = request.getParameter("submit");
        if(option.equals("create")){%>
            <form action="Createcar" method="post">
                <label>ENTER THE CAR NAME</label>
                <input type="text" name="name"><br><br>
                <label>UPLOAD CAR DOCUMENT</label>
                <input type="file" name="carDocument"><br><br>
                <input type="submit" value="submit">
            </form>
        <%}%>

    </body>
</html>