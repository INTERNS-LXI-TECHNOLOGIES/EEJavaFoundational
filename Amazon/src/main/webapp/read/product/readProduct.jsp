<%@ page import="com.lxisoft.yasirhussain.amazon.product.model.*,java.util.*"%>
<html>

<head>
    <style>
        /* Style the list container */
        ul.product-list {
            list-style-type: none;
            padding: 0;
        }

        /* Style each product item */
        li.product-item {
            background-color: #f7f7f7;
            border: 1px solid #ddd;
            margin: 10px;
            padding: 20px;
            box-shadow: 0px 0px 5px rgba(0, 0, 0, 0.2);
        }

        /* Style product links */
        li.product-item a {
            text-decoration: none;
            color: #333;
            font-weight: bold;
        }

        /* Style product headings */
        li.product-item strong {
            font-size: 18px;
        }

        /* Style product details */
        li.product-item p {
            margin: 5px 0;
            font-size: 16px;
        }
    </style>
</head>

<body>
    <%
    Set<ProductModel> products = (Set<ProductModel>) request.getAttribute("set");
    %>
    <ul class="product-list">
        <%
        for (ProductModel product : products) {
        %>
        <li class="product-item">
            <a href="/Maven Projects/ProductServlet?productId=<%= product.getProductId() %>">
                <strong>Product Id:</strong> <%= product.getProductId() %>
            </a>
            <p><strong>Product Name:</strong> <%= product.getProductName() %></p>
            <p><strong>Price:</strong> <%= product.getProductPrice() %></p>
        </li>
        <% } %>
    </ul>
</body>

</html>
