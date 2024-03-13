<%@page import="com.divisosoft.version2.*"%> 
<%@page import="java.util.*"%>
<html>
    <head>
        <title>Company Details</title>
        <style>
            body {
                text-align: center;
                background-color: rgb(175, 229, 241);
                margin: 0%;
            }
            header{
                background-color: cornflowerblue;
                padding: 0.5em;
            }

            table {
                margin: auto;
                height: 280;
                width: 800;
                border-collapse: collapse;
                border: 2px solid black;
                background-color: aliceblue;
            }

            th, td {
                border: 1px solid black;
                padding: 8px;
                font-weight: bold;
            }

            th {
                background-color: #0f0f0f;
                color: aliceblue;
            }
        </style>
    </head>
    <body>
        <header>
            <h2>Company Details</h1>
        </header><br><br>

        <%
        try { 
            List<Company> com = (List<Company>) request.getAttribute("printCompany");
        %>
                    <%
                        for(Company c: com) {
                    %>
                    <table>
                    <tr>
                        <th colspan="2"><%=c.getName()%> company Details</th>
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
                        </table><br>
                    <%
                    }
                } catch(Exception e) {
                    e.printStackTrace();
                }
                %>
                
    </body>    
</html>
