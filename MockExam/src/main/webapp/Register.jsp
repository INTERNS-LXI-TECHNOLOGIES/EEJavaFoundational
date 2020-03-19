<%@page contentType = "text/html;charset=UTF-8" pageEncoding = "UTF-8"%>
<%@page import = "com.lxisoft.config.*"%>
<html>
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.12/css/all.css" integrity="sha384-G0fIWCsCzJIMAVNQPfjH08cyYaUtMwjJwqiRKxxE/rx96Uroj1BtIQ6MLJuheaO9" crossorigin="anonymous">
<link href="https://fonts.googleapis.com/css?family=Raleway" rel="stylesheet">
<link rel="stylesheet" href="Sample.css"></link>
<body>
    <%
  Internationalization international = new Internationalization();
  String language = session.getAttribute("language").toString();
  if(language == null)
  {
    language = "en";
  }
  String username = international.localization(language,"IN","username");
  String password = international.localization(language,"IN","Password");
  String createAccount = international.localization(language,"IN","CreateAccount");
  String back = international.localization(language,"IN","back");
  %>

<div class="wrapper">
  <div class="login-text">
  </div>
  <div class="call-text">
    <form method="POST">
      <input  type="text" placeholder="<%out.println(username);%>" name="username">
      <br>
      <input type="password" placeholder="<%out.println(password);%>" name="password">
      <br>
      <br>
    <!-- <h1>Welcome to <span>MOCK</span> Exam</h1> -->
    <button formaction="Register"><%out.println(createAccount);%></button> <button formaction="Sample1.jsp"><%out.println(back);%></button>
  </form>
  </div>
</div>
</body>
</html>
<!-- 
<html>
<link rel="stylesheet" href="Style.css"></link>
<head>
<title>REGISTER HERE</title>
</head>

<body>
    <form method ="POST" >
        <div align="center" class ="inset">
            <h1 style="font-size:50px;"> REGISTER HERE </h1>
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
                <td align="center"><button type="submit" formaction="Register" class ="button">SUBMIT</button></td>
                <td align="center"><button type="reset" class ="button">RESET</button></td>
                <td align="center"> <button formaction="index.jsp" class ="button">BACK</button></td>
            </tr>
        </table>
        <br>
        <br>
    </div>
    </form>
</body>
</html> -->