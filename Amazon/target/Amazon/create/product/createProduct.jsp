<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registration Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
        }

        .container {
            max-width: 600px;
            margin: 0 auto;
            padding: 20px;
            background-color: #fff;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            border-radius: 5px;
        }

        h2 {
            text-align: center;
        }

        .form-group {
            margin-bottom: 20px;
        }

        label {
            font-weight: bold;
        }

        input[type="text"],
        input[type="email"],
        input[type="password"] {
            width: 100%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }

        select {
            width: 100%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }

        .btn-submit {
            background-color: #007bff;
            color: #fff;
            padding: 10px 20px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }

        .btn-submit:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Registration Form</h2>
        <form action="/Maven Projects/productValidator" method="post">
            <div class="form-group">
                <label for="productName">Product Name:</label>
                <input type="text" id="productName" name="productName" required>
                <c:forEach var="err" items="${validationErrors}">
                    <c:if test="${err == 'Product Name is invalid.'}">
                <span class="error">${err}</span>
            </c:if>
                </c:forEach>
            </div>
            <div class="form-group">
                <label for="productCategory">Category:</label>
                <input type="text" id="productCategory" name="productCategory" required>
                <c:forEach var="err" items="${validationErrors}">
                    <c:if test="${err == 'Product Category is invalid.'}">
                <span class="error">${err}</span>
            </c:if>
                </c:forEach>
            </div>
            <div class="form-group">
                <label for="productPrice">Price:</label>
                <input type="text" id="productPrice" name="productPrice" required>
                <c:forEach var="err" items="${validationErrors}">
                    <c:if test="${err == 'Product Price is invalid.'}">
                <span class="error">${err}</span>
            </c:if>
                </c:forEach>
            </div>

            <div class="form-group">
                <input type="submit" value="Register" class="btn-submit">
            </div>
        </form>
    </div>
</body>
</html>
