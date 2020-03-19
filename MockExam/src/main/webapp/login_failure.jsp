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
  String login = international.localization(language,"IN","LogIn");
  String sorry = international.localization(language,"IN","Sorry");
  String failed = international.localization(language,"IN","Failed");
  String back = international.localization(language,"IN","back");
  %>

<div class="wrapper">
  <div class="login-text">
    <div class="text">
      <h1>Login Failed</h1>
    
    </div>
  </div>
  <div class="call-text">
    <h1><%out.println(sorry);%> <span><%out.println(login);%></span><%out.println(failed);%></h1>
    <form>
    <button formaction="Sample1.jsp"><%out.println(back);%></button>
	</form>
  </div>
</div>
</body>
</html>