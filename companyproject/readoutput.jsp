<%@ page import="com.divisosoft.company.*" %>
<%@ page import="java.util.List" %>
<html>
    <head>
        <title>THIS IS READ OUTPUT PAGE</title>
    </head>
    <body>
        <% List <String> outList = (List<String>) request.getAttribute("datalist");
            for(String d :outList){%>
                <h1><%= d %></h1>

            <%}%>
    </body>
</html>