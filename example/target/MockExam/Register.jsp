<%@page import="com.lxisoft.config.Internationalization"%>
<%@page import="java.io.*"%>
<%@page import="java.util.*"%>
<%@page import="javax.servlet.*"%>
<%@page import="javax.servlet.http.*"%>
<%@page import="java.util.ResourceBundle"%>
<%@page import="java.util.ResourceBundle.Control"%>
<%@ page contentType="text/html;charset=UTF-8"  pageEncoding="UTF-8"%>
<html>
<body background="image/earth.jpg">
  <%try{
  Internationalization international=new Internationalization();
  session.setAttribute("international",international);
  
  String language=request.getParameter("language");
  if(language==null)
  {
    language="en";
  }
  session.setAttribute("language",language);
  String username= international.localization(language,"IN","UserName");
  String password= international.localization(language,"IN","Password");
  String createaccount= international.localization(language,"IN","CreateAccount");
  String back= international.localization(language,"IN","Back");

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
    <button class ="button" formaction="Register"><%out.println(createaccount);%></button> <button class ="button" formaction="Login"><%out.println(back);%></button>
  </form>
  <center><a href="?language=en">ENGLISH</a>
  <a href="?language=mal">മലയാളം</a></center>
  </div>
</div>
</div>
<% } 
  catch (Exception e) {
%>

<font size="+3" color="#87CEFA" style="margin-left:-6%"></font><br></br>
<%
  e.printStackTrace();
  out.println(e);
}
%>
</body>
</html>