<!DOCTYPE html>
<html>
<%@page import="com.lxisoft.config.*"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding = "UTF-8"%>
<head>
  <meta http-equiv="Content_Type" content="text/html;charset=UTF-8"/>
  <title>sample project</title>
  <link rel="stylesheet" href="Style.css"></link>
</head>
<body bgcolor="FloralWhite">
<style>
   body {
  background-image: url('itl.cat_simple-wallpaper_120953.png');
    background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
  height: 100%
}
.container {
  height: 700px;
  position: relative;
  border: 5px solid midnightblue;
}

.center {
  margin: 0;
  position: absolute;
  top: 50%;
  left: 30%;
  -ms-transform: translate(-50%, -50%);
  transform: translate(-50%, -50%);
}
.button {
  background-color: #4CAF50; /* Green */
  border: none;
  color: white;
  padding: 16px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  transition-duration: 0.4s;
  cursor: pointer;
}

.button1 {
  background-color: white; 
  color: black; 
  border: 2px solid #4CAF50;
  border-radius: 12px;
}

.button1:hover {
  background-color: #4CAF50;
  color: white;
}
input[type=text] {
  width: 300%;
  padding: 12px 20px;
  border: 2px solid red;
  border-radius: 4px;
}
</style>
<%
    Internationalize inter=new Internationalize();
    String language=request.getParameter("language");
     String lan=(String)session.getAttribute("language");
     if(lan.equals("mal"))
    {
      language="mal";
    }
    else
    {
      language="en";
    }
    String ns1=inter.localization(language,"IN","ns1");
    String ns2=inter.localization(language,"IN","ns2");
     String back=inter.localization(language,"IN","back");
  %>
<div class="container">
<div class="center">
<p>
  <form>
<h2><b><i><%out.println(ns1);%> !!!</i></b></h2>
<br>
<h2><b><i><%out.println(ns2);%></i></b></h2>
<button formaction="page0.jsp" class="button button1" name="back" ><%out.println(back);%></button>
</form>
</div>
</div>
</div>

</p>
</body>
</html>