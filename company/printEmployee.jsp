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
        <h3>Employee Details</h3>

            <% List<Employee> employees = (List<Employee>) request.getAttribute("PrintEmployee"); %>
                
                <table border="2">
                    <% for(Employee employee : employees)
                    {%>
                    <tr>
                        <th colspan="2"><%= employee.getName()%> Details</th>
                    </tr>
                    <tr>
                        <td>Id</td>
                        <td><%=employee.getId()%></td>
                    </tr>
                    <tr>
                        <td>Name</td>
                        <td><%=employee.getName()%></td>
                    </tr>
                    <tr>
                        <td>Age</td>
                        <td><%=employee.getAge()%></td>
                    </tr>
                    <tr>
                        <td>Salary</td>
                        <td><%=employee.getSalary()%></td>
                    </tr>
                    <tr>
                        <td>Phone</td>
                        <td><%=employee.getPhone()%></td>
                    </tr>
                    <% } %>
                </table>
    </body>    
</html>