<%@page import = "com.sanfar.config.*"%>
<%@page contentType = "text/html;charset=UTF-8" pageEncoding = "UTF-8"%>
<html>
<body background="image/earth.jpg">
  <meta http-equiv="Content_Type" content="text/html;charset=UTF-8"/>
  <script type="text/javascript">
    function selectRadio() 
    {
      document.getElementById('submitBtn').type = "submit";
    }
    function check()
    {
      var checkLabel1 = document.querySelector('input[name="username"]:checked'); 
       var checkLabel2= document.querySelector('input[name="password"]:checked'); 
            if(!checkLabel1 && !checkLabel2) 
            {
              alert("Please Insert UserName or password");
            }
    }
       
  </script>
  <%
  Internationalization international=new Internationalization();
  String language = session.getAttribute("language").toString();
  if(language==null)
  {
    language="en";
  }
  session.setAttribute("language",language);
  String exam = international.localization(language,"IN","Exam");
  String english = international.localization(language,"IN","English");
  String register = international.localization(language,"IN","REGISTER_HERE");
  String welcome = international.localization(language,"IN","Welcome_to_Mockexam");
  String malayalam = international.localization(language,"IN","Malayalam");
  String login = international.localization(language,"IN","Login");
  String signUp = international.localization(language,"IN","Signup");
  String username = international.localization(language,"IN","UserName");
  String password = international.localization(language,"IN","Password");
  String add = international.localization(language,"IN","Add");
  %>
<div class="wrapper">
  <div class="login-text">
   <div class="hello">
  <div align="center" style="background-color: darkmagenta;" >
    <br>
    <h1><%out.println(welcome);%></h1>
    <h2 style="font-size:50px;"><%out.println(register);%></h2>
    <br>
  </div>
  <div align="center">
    <form method="POST">
      <label for=username><%out.println(username);%> :</label>
      <input type="text" placeholder="<%out.println(username);%>" id="username" name="username"><br>
      
      <label for=password><%out.println(password);%> : </label><input id="password" type="text" placeholder="<%out.println(password);%>" name="password"><br>
      
      <br>
      <button class ="button" formaction="Reg"><%out.println(signUp);%></button><button class ="button" formaction="first.jsp"><%out.println(login);%></button>
  </form>
  <div class="call-text">
    
  </div>
</div>
<script type="text/javascript" src="reg.js"></script>
</body>
</html>