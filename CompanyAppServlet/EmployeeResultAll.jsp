<%@ page import = "com.lxisoft.company.model.Employee"%>
<%@ page import = "java.util.List"%>
<%@ page import = "java.util.ArrayList"%>
<html>
<head>

    <style>
        body {
            text-align: center;
            background-image: url("Em.png");
            background-size: cover; 
            background-position: center center; 
        }
        table {
            margin: 20px auto;
            border-collapse: collapse;
            width: 80%;
            max-width: 800px;
            background-color: #f9f9f9;
        }
        th, td {
            padding: 10px;
            border: 1px solid #ccc;
        }
        th {
            background-color: #555;
            color: white;
            text-transform: uppercase;
        }
        td {
            color: #2a417c;
        }
    </style>

    </head>
    <body>
<table border ="2">
    <%
    List<Employee> emp = (List<Employee>) request.getAttribute("employeee");
        for(Employee e:emp){                     
            %>

<tr>
<th>PRODUCT DETAILS</th>
    </tr>

    <tr>
        <td>Product Name</td>
        <td><%=e.getName()%></td>
        </tr>

        <tr>
            <td>Product Id</td>
            <td><%=e.getId()%></td>
                    </tr>

                    <tr>
                        <td>Product Cost</td>
                        <td><%=e.getAge()%></td>
                                </tr>


                                <tr>
                                    <td>Product Mfate</td>
                                    <td><%=e.getPhoneNumber()%></td>
                                            </tr>

                                            <tr>
                                                <td>Product LsDate</td>
                                                <td><%=e.getAddress()%></td>
                                                        </tr>
            <%}%>
    </table>

    <form action="index.html" method="post">
    <input type="submit" value="Go Back">
    </form>
</body>
</html>