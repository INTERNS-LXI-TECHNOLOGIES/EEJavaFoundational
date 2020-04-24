<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<%@page import = "com.lxisoft.Config.*"%>
<%@page contentType = "text/html;charset=UTF-8" pageEncoding = "UTF-8"%>
<html>
<link rel="stylesheet" href="Style.css"></link>
<head>
<title>REGISTER </title>
<style>
body {
  background-image: url('Register.jpg');
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;
}
</head>
</style>
<body>
     <%
  Internationalization international = new Internationalization();
  String language = request.getParameter("language");
  session.setAttribute("language",language);
  if(language == null)
  {
    language = "en";
  } 
  %>
  <a href = "?language=mal">Malayalam</a>
   <a href = "?language=en">English</a>
      <div class="dimbly" align="center">

    <div>
    <form method ="POST" >
        <div align="center" class ="inset">
            <h1 style="font-size:20px;"> REGISTER </h1>
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
                <td align="center"><button type="submit" formaction="RegisterServlet" class ="button"><%out.println(international.localization(language,"IN","Submit"));%></button></td>
                <td align="center"><button type="reset" class ="button"><%out.println(international.localization(language,"IN","Reset"));%></button></td>
                <td align="center"><button formaction="index.jsp" class ="button"><%out.println(international.localization(language,"IN","Back"));%></button></td>
            </tr>
        </table>
        <br>
        <br>
    </div>
    </form>
</body>
</html>
