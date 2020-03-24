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
  background-image: url('full-hd-colourful-download-trees-simple-jpg.jpg');
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
  left: 50%;
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

.button2 {
  background-color: white; 
  color: black; 
  border: 2px solid #008CBA;
  border-radius: 12px;
}

.button2:hover {
  background-color: #008CBA;
  color: white;
}

.button3 {
  background-color: white; 
  color: black; 
  border: 2px solid #f44336;
  border-radius: 12px;
}

.button3:hover {
  background-color: #f44336;
  color: white;
}

.button4 {
  background-color: white;
  color: black;
  border: 2px solid #e7e7e7;
  border-radius: 12px;
}

.button4:hover {background-color: #e7e7e7;}

.button5 {
  background-color: white;
  color: black;
  border: 2px solid #555555;
  border-radius: 12px;
}

.button5:hover {
  background-color: #555555;
  color: white;
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
    String mock=inter.localization(language,"IN","mock");
     String choose=inter.localization(language,"IN","choose");
     String add=inter.localization(language,"IN","add");
     String delete=inter.localization(language,"IN","delete");
     String update=inter.localization(language,"IN","update");
     String display=inter.localization(language,"IN","display");
     String back=inter.localization(language,"IN","back");
  %>
<div class="container">
<div class="center">
<p>
<center>
  <font size="7" color=" midnightblue"><i><b><%out.println(mock);%></b></i></font>
  <br>
  <br>
  <font size="6" color=" midnightblue"><%out.println(choose);%></font>
  <br>
  <br>
  <form>
  <input type="submit" formaction="Add.jsp" class="button button1" name="ADD" value="<%out.println(add);%>" >
  <input type="submit" formaction="delete.jsp" class="button button2" name="DELETE" value="<%out.println(delete);%>" >
  <input type="submit" formaction="update.jsp" class="button button3" name="UPDATE" value="<%out.println(update);%>" >
  <input type="submit" formaction="display" class="button button4" name="DISPLAY" value="<%out.println(display);%>">
  <input type="submit" formaction="select" class="button button5" name="BACK" value="<%out.println(back);%>" >
</form>
</center>
</p>
</div>
</div>
</div>

</body>
</html>