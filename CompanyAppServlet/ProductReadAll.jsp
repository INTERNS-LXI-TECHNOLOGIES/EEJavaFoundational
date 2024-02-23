<%@ page import = "com.lxisoft.company.model.Product"%>
<%@ page import = "java.util.List"%>
<%@ page import = "java.util.ArrayList"%>
<html>
<head>
    <style>
        body {
            text-align: center;
            background-image: url("prod.jpeg");
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
    List<Product> proo = (List<Product>) request.getAttribute("queryy");
        for(Product p:proo){
            %>

<tr>
<th>PRODUCT DETAILS</th>
    </tr>

    <tr>
        <td>Product Name</td>
        <td><%=p.getName()%></td>
        </tr>

        <tr>
            <td>Product Id</td>
            <td><%=p.getId()%></td>
                    </tr>

                    <tr>
                        <td>Product Cost</td>
                        <td><%=p.getCost()%></td>
                                </tr>


                                <tr>
                                    <td>Product Mfate</td>
                                    <td><%=p.getMfDate()%></td>
                                            </tr>

                                            <tr>
                                                <td>Product LsDate</td>
                                                <td><%=p.getLsDate()%></td>
                                                        </tr>
            <%}%>
    </table>
    <form action="index.html" method="post">
        <input type="submit" value="Go Back">
        </form>
</body>
</html>