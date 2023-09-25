<!DOCTYPE html>
<html>
<head>
    <title>Create Product</title>
    <style>
        table {
            border-collapse: collapse;
            width: 50%;
            margin: 0 auto;
        }

        th, td {
            padding: 8px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }
    </style>
</head>
<body>
    <h1>Create User</h1>
   <form action="/DemoProject/ProductController" method="post">

        <table>
            <tr>
                <td><label for="product_category">ProductCategory:</label></td>
                <td><input type="text" id="product_category" name="product_category" required></td>
            </tr>
                           
        </table>
        <br>
        <input type="submit" value="Create Product">
    </form>
</body>
</html>