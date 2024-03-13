<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Company Information</title>
    <style>
        body {
            background-image: url("Screenshot 2024-02-07 162243.png");
            background-size: cover;
            margin: 0;
            font-family: Arial, sans-serif;
        }

        h1 {
            color: white;
        }

        label {
            color: white;
            display: block;
            margin-top: 10px;
        }

        input, select {
            margin-bottom: 10px;
            padding: 5px;
            width: 100%;
        }

        form {
            max-width: 600px;
            margin: 50px auto;
            padding: 20px;
            background: rgba(0, 0, 0, 0.5);
            border-radius: 10px;
        }

        input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            padding: 10px 15px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }
    </style>
</head>
<body>
    <form action="ProductServlet" method="post">
        <h1>Product Information</h1>

        <label for="productName">Product Name:</label>
        <input type="text" id="productName" name="productName">

         <label for="productId">product Id:</label>
         <input type="text" id="productId" name="productId">

        <label for="productCost">Product Cost:</label>
        <input type="text" id="productCost" name="productCost">

        <label for="productExpDate">EXP date of the product:</label>
        <input type="date" id="productExpDate" name="productExpDate">

          <label for="productMfgDate">MFG date of the product:</label>
          <input type="date" id="productMfgDate" name="productMfgDate">

        <select name="select">
            <option value="create">Create</option>
            <option value="read">Read</option>
            <option value="update">Update</option>
            <option value="delete">Delete</option>
            <option value="nun">Nun</option>
        </select>
        <br>
        <input type="submit" value="Update">
    </form>
</body>
</html>
