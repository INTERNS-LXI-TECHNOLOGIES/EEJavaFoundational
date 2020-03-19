<%@page contentType = "text/html;charset=UTF-8" pageEncoding = "UTF-8"%>
<%@page import = "com.lxisoft.config.*"%>
<html>
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.12/css/all.css" integrity="sha384-G0fIWCsCzJIMAVNQPfjH08cyYaUtMwjJwqiRKxxE/rx96Uroj1BtIQ6MLJuheaO9" crossorigin="anonymous">
<link href="https://fonts.googleapis.com/css?family=Raleway" rel="stylesheet">
<link rel="stylesheet" href="Style.css"></link>
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

<div class="hello">
  <div align="center" style="background-color: darkmagenta;" >
    <br>
    <h1 style="font-size:50px;"> REGISTER HERE </h1>
    <br>
  </div>
  <div align="center">
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <form method="POST">
      <label for=username><%out.println(password);%> :</label>
      <input type="text" placeholder="<%out.println(username);%>" id="username" name="username"><br>
      
      <label for=password><%out.println(password);%> : </label><input id="password" type="text" placeholder="<%out.println(password);%>" name="password"><br>
      
      <br>
    <!-- <h1>Welcome to <span>MOCK</span> Exam</h1> -->
    <button class ="button" formaction="Register"><%out.println(createAccount);%></button> <button class ="button" formaction="Login"><%out.println(back);%></button>
  </form>
</div>
</div>
</body>
</html>