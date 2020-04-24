<!DOCTYPE html>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<%@page import = "com.amritha.config.*"%>
<%@page contentType = "text/html;charset=UTF-8" pageEncoding = "UTF-8"%>
<html>
<head>
<title>Login </title>
    <form method="POST" action= "j_security_check">
        <div align="center" class ="inset">
            <h1 style="font-size:30px;"> Covid19 </h1>
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
           <td align="center"><button type="submit" name="Login" class ="button">Login</button></td>
           <td align="center"> <button formaction="index.jsp" class ="button">Back</button></td>

            </tr>
        </table>
        <br>
        <br>
    </div>
    </form>
</body>
</html>
