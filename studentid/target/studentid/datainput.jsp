<html>
    <head>
        <title>input the values here</title>
    </head>
    <body>
        <% String option = request.getParameter("option");
        if(option.equals("CREATE")){%>

            <from action="/Create" method="post" enctype="multipart/form-data">
                <label>ENTER THE NAME</label>
                <input type="text" name="name">
                <label>UPLOAD THE PHOTO</label>
                <input type="file" name="file">
                <input type="submit" value="ADD">                        
       <% }%>
     
    </body>
</html>