<!-- <link rel="stylesheet" href="Style.css"></link> -->
<html>

<head>
<title>Login Page</title>
</head>

<body>

    <form method="POST" action="j_security_check">
        <div align="center" class ="inset">
            <h1 style="font-size:50px;"> LOGIN HERE </h1>
        <table cellspacing="5">
            <tr>
                <th align="right"><h1>Username:</h1></th>
                <td align="left"><h1><input type="text" name="j_username"></h1></td>
            </tr>

            <tr>
                <th align="right"><h1>Password:</h1></th>
                <td align="left"><input type="password" name="j_password"></td>
            </tr>

            <tr>
                <td align="center"><button type="submit" value="admin" class ="button">SUBMIT</button></td>
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