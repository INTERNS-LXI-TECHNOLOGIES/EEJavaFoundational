<%@ page import="com.lxisoft.company.model.Employee"%>
<html>
<head>
<title>Welocme To Product  </title>
<style>
        body {
            text-align: center;
            background-image: url("R.jpeg");
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
                
            <table border="2">
                <tr>
                <th>Product Details</th>
                </tr>
                <%Employee employee = (Employee)request.getAttribute("employeee");%>
                <tr>
                        <td>Product Name</td>
                        <td><%=employee.getName()%></td>
                        </tr>

                                <tr>
                                        <td>Product Cost</td>
                                        <td><%=employee.getAge()%></td>
                                        </tr>


                                        <tr>
                                                <td>Product MfDate</td>
                                                <td><%=employee.getPhoneNumber()%></td>
                                                </tr>

                                                
                        <tr>
                                <td>Product  LsDate</td>
                                <td><%=employee.getAddress()%></td>
                                </tr>
</table>
<form action="index.html" method="post">
        <input type="submit" value="Go Back">
        </form>
        </body>
</html>