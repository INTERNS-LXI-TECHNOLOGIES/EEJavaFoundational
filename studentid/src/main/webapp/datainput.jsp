<html>
    <head>
        <title>input the values here</title>
    </head>
    <body>
        <% String option = request.getParameter("option");
        if(option.eaquals("CREATE")){%>
            <from action="Create" method="post">
                <label>ENTER THE NAME</label>
                <input type="text" name="name">
                
        }
    </body>
</html>