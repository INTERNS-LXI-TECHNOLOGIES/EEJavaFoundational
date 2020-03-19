<!DOCTYPE html>
<%@page import = "com.lxisoft.Config.*"%>
<%@page contentType = "text/html;charset=UTF-8" pageEncoding = "UTF-8"%>
<html>
<head>
<title>Login </title>
<style>
body {
  background-image: url('login.jpg');
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;
}
</style>
</head>
<body>
   <%
  Internationalization international = new Internationalization();
  String language = request.getParameter("language");
  session.setAttribute("language",language);
  if(language == null)
  {
    language = "mal";
  } 
  %>
  <a href = "?language=mal">Malayalam</a>
   <a href = "?language=en">English</a>
  <div class = "inset">
    <div class="dimbly" align="center">

    <form method="POST" action= "j_security_check">
        <div align="center" class ="inset">
            <h1 style="font-size:30px;"> Welcome to Mockexam </h1>
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
                <td align="center"><button type="submit" name="Login" class ="button"><%out.println(international.localization(language,"IN","Login"));%></button></td>
                <td align="center"><button type="reset" class ="button"><%out.println(international.localization(language,"IN","Reset"));%></button></td>
                <td align="center"> <button formaction="index.jsp" class ="button"><%out.println(international.localization(language,"IN","Back"));%></button></td>

            </tr>
        </table>
        <br>
        <br>
    </div>
    </form>
</body>
</html>
