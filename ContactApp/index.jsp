<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Contact App</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
            margin: 0;
            padding: 0;
        }

        header {
            background-color: dodgerblue;
            color: white;
            text-align: center;
            height: 110px;
        }

        main {
            display: flex;
            justify-content: center;
            align-items: center;
            height: calc(100vh - 100px);
            margin-bottom: 500px;
        }

        .welcome-message {
            text-align: center;

        }

        .welcome-message h1 {
            font-size: 36px;
            margin-bottom: 10px;
        }

        .welcome-message p {
            font-size: 18px;
            margin-bottom: 20px;
        }

        .welcome-message button {
            background-color: #4caf50;
            color: white;
            padding: 10px 20px;
            border: none;
            cursor: pointer;
            font-size: 18px;
            transition: background-color 0.3s;
        }

        .welcome-message button:hover {
            background-color: #3e8e41;
        }
       .img1{
       height : 170px;
       width : 170px;
       margin-left :700px;
       margin-top :90px;
       }
       .form{


       height:200px;
       position: relative;
       bottom:250px;;

       }
    </style>
</head>
<body>
<div>
    <header>
        <h1 style="font-size:50px;padding-top:30px">Contact App</h1>
    </header>
<a href="input.jsp">
        <img class="img1" src="PNG.png" >
</a>
    <main>
        <div class="welcome-message">
        <form class="form" action ="ReadServlet" method ="get">
            <h1>Welcome to Contact App</h1>
            <p>Your one-stop solution for managing your contacts.</p>
        </div>
    </main>


    </form>
    </div>
</body>
</html>