<%@ page session="true" %>
<html>
<head>
    <title>Welcome to login page</title>
</head>
<body>
    <% 
    boolean isIntern = request.isUserInRole("intern");
    boolean isAdmin = request.isUserInRole("admin");

    if (isAdmin) { %>
      
    <a href = "admin.jsp">admin page</a>
 
 
    <%}
   else  if(isIntern)
    {%>
      
    <a href ="user.jsp" > user page</a>
      
   
    <%}%>
</body>
</html>
