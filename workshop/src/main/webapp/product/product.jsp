<%@ page import="com.lxi.yadhu.wktwo.product.model.*"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Product Listing</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
        }
        
        header {
            background-color: #333;
            color: #fff;
            text-align: center;
            padding: 20px 0;
        }

        nav {
            background-color: #444;
            color: #fff;
            padding: 10px 0;
        }

        nav ul {
            list-style: none;
            padding: 0;
            text-align: center;
        }

        nav ul li {
            display: inline;
            margin: 0 20px;
        }

        .container {
            max-width: 1200px;
            margin: 0 auto;
            padding: 20px;
            display: flex;
            flex-wrap: wrap;
            justify-content: space-between;
        }

        .product-card {
            background-color: #fff;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
            margin: 20px 0;
            padding: 20px;
            border-radius: 5px;
            flex-basis: calc(33.3333% - 40px);
            text-align: center;
        }

        .product-card img {
            max-width: 100%;
            height: auto;
        }

        .product-card h2 {
            margin: 10px 0;
        }

        .product-card p {
            margin: 0;
            color: #777;
        }

        .product-card button {
            background-color: #007bff;
            color: #fff;
            border: none;
            padding: 10px 20px;
            border-radius: 5px;
            cursor: pointer;
            transition: background-color 0.3s;
        }

        .product-card button:hover {
            background-color: #0056b3;
        }

        footer {
            background-color: #333;
            color: #fff;
            text-align: center;
            padding: 20px 0;
        }
    </style>
</head>
<body>
    <header>
        <h1>Welcome to Our Online Store</h1>
    </header>
    <%
       Product product = (Product)request.getAttribute("success");
    %>
    <nav>
        <div class="container">
            <ul>
                <li><a href="/workshop/index.jsp">Home</a></li>
                <li><a href="/workshop/ProductServlet">Products</a></li>
                <li><a href="/workshop/create/product/createProduct.jsp">Sell</a></li>
                <li><a href="#">Cart</a></li>
            </ul>
        </div>
    </nav>
    <%
    if(product != null)
    {
        %>
    <main>
        <div class="container">
            <div class="product-card">
                <img src="product1.jpg" alt="Product 1">
                <h2><%=product.getProductName()%></h2>
                <p>Description of Product 1.</p>
                <p>Price: <%=product.getProductPrice()%></p>
                <button>Add to Cart</button>
            </div>
            
            <div class="product-card">
                <img src="product2.jpg" alt="Product 2">
                <h2>Product 2</h2>
                <p>Description of Product 2.</p>
                <p>Price: $24.99</p>
                <button>Add to Cart</button>
            </div>
            
            <!-- Add more product cards as needed -->
        </div>
    </main>
    <%
}
    %>
    <footer>
        <p>&copy; 2023 Your Company</p>
    </footer>
</body>
</html>
