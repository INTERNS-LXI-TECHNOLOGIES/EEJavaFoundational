<%@ page import="com.divisosoft.company.*" %>
<%@ page import="java.util.List" %>
<html>
    <head>
        <title>THIS IS FINAL PAGE</title>
    </head>
    <body>
        <%
        Company co = (Company) request.getAttribute("CompanyData");
        if (co != null) {
        %>
            <h1><%= co.getName() %></h1>
        <%
        } else {
        %>
            <h1>NULL</h1>
        <%
        }
        
        List<String> dList = (List<String>) request.getAttribute("datalist"); 
            if (dList != null){   
                for (String d : dList) { 
                    if(d != null){%>
                        <h1><%= d %></h1>
                    <%}
                    else{%>
                            <h1>it null</h1><%
                    }
                }
            }
            else{
            %>
                <h1>this is null</h1>
            <%
            }
            %>
    </body>
</html>
