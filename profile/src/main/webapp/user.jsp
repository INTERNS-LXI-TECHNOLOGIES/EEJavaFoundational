<!DOCTYPE html>
<html>
<head>
    <title>Welcome to User Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 20px;
            background-color: #f4f4f4;
        }
        .container {
            max-width: 600px;
            margin: 0 auto;
            background-color: #fff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 2px 4px rgba(0,0,0,0.1);
        }
        h3 {
            margin-bottom: 10px;
        }
        input[type="email"], input[type="file"], input[type="submit"] {
            display: block;
            width: 100%;
            padding: 10px;
            margin-bottom: 15px;
            border: 1px solid #ccc;
            border-radius: 5px;
            box-sizing: border-box;
        }
        input[type="submit"] {
            background-color: #2980b9;
            color: white;
            border: none;
            cursor: pointer;
        }
        input[type="submit"]:hover {
            background-color: #2980b9;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Welcome to User Page</h2>
        <form action="user" method="post" enctype="multipart/form-data">
            <h3>Enter your e-mail</h3>
            <input type="email" name="mail_id">
            <h3>Upload your image</h3>
            <input type="file" name="image">
            <input type="submit" value="Upload">
        </form>
    </div>
</body>
</html>
