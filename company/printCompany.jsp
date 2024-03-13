<%@page import="com.divisosoft.company.*"%> 
<%@page import="java.sql.*"%>
<%@page import="java.io.PrintWriter" %>
<%@page import="java.util.*"%>
<html>
    <head>
        <title>result</title>
        <style>
            body{
                text-align: center;
                background-color: tomato;
            }
            table{
                margin:auto;
                height: 280;
                width: 360;
                border: black;
            }
        </style>
    </head>
    <body>
        <h3>Company Details</h3>

        <% 
            List<Company> com = (List<Company>) request.getAttribute("PrintCompany");%>
                <table border="2">
                    <%
                    for(Company c: com)
                    { %>

                    <tr>
                        <th colspan="2"><%=c.getName()%> Company Details</th>
                    </tr>
                    <tr>
                        <td>Company name</td>
                        <td><%=c.getName()%></td>
                    </tr>
                    <tr>
                        <td>Address</td>
                        <td><%=c.getAddress()%></td>
                    </tr>
                    <tr>
                        <td>Location</td>
                        <td><%=c.getLocation()%></td>
                    </tr>
                    <tr>
                        <td>Phone No </td>
                        <td><%=c.getPhone()%></td>
                    </tr>
                    <tr>
                        <td>CEO Name </td>
                        <td><%=c.getCeoName()%></td>
                    </tr>

                    <% }%>
                </table>
    </body>    
</html>