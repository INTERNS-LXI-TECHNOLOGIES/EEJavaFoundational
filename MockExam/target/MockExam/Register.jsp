<html>
<link rel="stylesheet" href="Style.css"></link>
<head>
<title>REGISTER </title>
</head>

<body>
    <form method ="POST" >
        <div align="center" class ="inset">
            <h1 style="font-size:50px;"> REGISTER </h1>
        <table cellspacing="5">
            <tr>
                <th align="right"><h1>Username:</h1></th>
                <td align="left"><h1><input type="text" name="username"></h1></td>
            </tr>

            <tr>
                <th align="right"><h1>Password:</h1></th>
                <td align="left"><input type="password" name="password"></td>
            </tr>

            <tr>
                <td align="center"><button type="submit" formaction="RegisterServlet" class ="button">SUBMIT</button></td>
                <td align="center"><button type="reset" class ="button">RESET</button></td>
                <td align="center"> <button formaction="index.jsp" class ="button">BACK</button></td>
            </tr>
        </table>
        <br>
        <br>
    </div>
    </form>
</body>
</html>