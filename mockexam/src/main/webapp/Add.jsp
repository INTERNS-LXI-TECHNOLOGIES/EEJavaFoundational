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
  background-image: url('78.png');
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
input[type=text] {
  width: 230%;
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
    String welcomeAdd=inter.localization(language,"IN","welcomeAdd");
     String question=inter.localization(language,"IN","question");
     String opt1=inter.localization(language,"IN","opt1");
     String opt2=inter.localization(language,"IN","opt2");
     String opt3=inter.localization(language,"IN","opt3");
     String opt4=inter.localization(language,"IN","opt4");
     String ans=inter.localization(language,"IN","ans");
     String add=inter.localization(language,"IN","add");
     String back=inter.localization(language,"IN","back");
  %>
<div class="container">
<div class="center">
<p>
  
  <form action="add" method="get">
<font size="6" color="midnightblue"><i><b><%out.println(welcomeAdd);%></b></i></font><br><br><br>
<font size="5" color="midnightblue"><%out.println(question);%> : </font> <input type="text" name="question" placeholder="Question"><br>
<font size="5" color="midnightblue"><%out.println(opt1);%> : </font> <input type="text" name="option1" placeholder="option1"><br>
<font size="5" color="midnightblue"><%out.println(opt2);%> : </font> <input type="text" name="option2" placeholder="option2"><br>
<font size="5" color="midnightblue"><%out.println(opt3);%> : </font> <input type="text" name="option3" placeholder="option3"><br>
<font size="5" color="midnightblue"><%out.println(opt4);%> : </font> <input type="text" name="option4" placeholder="option4"><br>
<font size="5" color="midnightblue"><%out.println(ans);%> : </font> <input type="text" name="ans" placeholder="ans"><br><br>
 <input type="submit" class="button button1" value="<%out.println(add);%>" name="add">
 <button  formaction="AdminMenu.jsp" class="button button2" name="back"><%out.println(back);%></button>
</form>
</div>
</div>
</div>

</p>
</body>
</html>