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
        <h3>Product Details</h3>

            <% List<Product> products = (List<Product>) request.getAttribute("printProduct"); %>
                
                <table border="2">
                    <% for(Product product : products)
                    {%>
                    <tr>
                        <th colspan="2"><%= product.getName()%> Details</th>
                    </tr>
                    <tr>
                        <td>Product Name</td>
                        <td><%=product.getName()%></td>
                    </tr>
                    <tr>
                        <td>Price</td>
                        <td><%=product.getPrice()%></td>
                    </tr>
                    <tr>
                        <td>Product Category</td>
                        <td><%=product.getProductCategory()%></td>
                    </tr>
                    <tr>
                        <td>Product Rate</td>
                        <td><%=product.getRate()%></td>
                    </tr>
                    <tr>
                        <td>Manufacturing Date</td>
                        <td><%=product.getDate()%></td>
                    </tr>
                    <% } %>
                </table>
    </body>    
</html>