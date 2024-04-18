<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Welcome You</title>
    <style>
        body {
            text-align: center;
            background-image: url('OIP.jpeg');
            background-size: cover;
            background-position: center;
            background-repeat: no-repeat;
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            height: 100vh;
        }

        .content {
            background-color: rgba(255, 255, 255, 0.9);
            border-radius: 10px;
            padding: 20px;
            max-width: 500px;
            margin: 0 auto;
            margin-top: 50px;
        }

        h1 {
            color: #333;
            text-transform: uppercase;
            margin-bottom: 20px;
        }

        form {
            margin-top: 20px;
        }

        header h1 {
            color: blue;
            font-size: 24px;
            margin-bottom: 10px;
            padding: 0.5em;
            background-color: #1585d0;
        }

        input[type="text"],
        input[type="file"],
        input[type="submit"] {
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
            margin-bottom: 10px;
            width: 80%;
            max-width: 300px;
            box-sizing: border-box;
        }

        input[type="submit"] {
            background-color: #3498db;
            color: #fff;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #2980b9;
        }
    </style>
</head>
<body>
    <div class="content">
        <header><h1>School</h1></header>
        <form action="Upload" method="post" enctype="multipart/form-data">
            <h3>Enter the Name</h3>
            <input type="text" name="name">
            <br>
            <h3>Upload the Image</h3>
            <input type="file" name="image">
            <br>
            <input type="submit" value="Upload">
        </form>

        <form action="Download" method="get" enctype="multipart/form-data">
            <h3>Enter the ID</h3>
            <input type="text" name="id">
            <br>
            <input type="submit" value="Download">
        </form>

        <form action="Read" method="get">
            <input type="submit" value="View">
            </form>
    </div>
</body>
</html>
