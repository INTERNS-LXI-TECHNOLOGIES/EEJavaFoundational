<html>
    <head>
        <title>home</title>
        <style>
            body{
                background-color: aqua;
                text-align: center;
            }
        </style>
    </head>
    <body>
        <%  boolean isAdmin = request.isUserInRole("admin");
            boolean isUser = request.isUserInRole("user");
            if(isAdmin){
         %>
        <a href="admin.jsp" target="f2" class="row">
            <span>&#x1F4C5;for Admin</span> 
        <%}
        else if(isUser)
        {%>
            <a href="user.jsp" target="f2" class="row">
                <span>&#128640;For User</span>    
            </a>
        <%}
        else{%>
            <h1>Something went wrong</h1>
            <%}%>
        
    </body>
</html>