<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <style>
        body{
                   text-align:center;
                   }
           @keyframes textAnimation {
               0% {
                   transform: scale(1);
                   color: violet;
               }

               50% {
                   transform: scale(1.2);
                   color: blue;
               }
               100% {
                   transform: scale(1);
                   color: green;
               }
           }

           h1 {
               animation: textAnimation 3s infinite;
               /* Adjust the animation duration and other properties as needed */
           }
       </style>
</head>
<body>
<div>
    <h1>WELCOME TO CAR GARAGE</h1>
    <img src="./image/carimage.jpg" alt="carImage" width="800" height="500">
    <form action="carSetup.jsp" >
    <input type="submit" value= "Go to next Page"  style="background-color: #4CAF50; color: white; padding: 10px 15px; border: none; border-radius: 4px; cursor: pointer;">
    </form>
</div>

</body>
</html>
