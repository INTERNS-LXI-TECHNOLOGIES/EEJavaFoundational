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
  height: 730px;
  position: relative;
  border: 5px solid midnightblue;
}

.center {
  margin: 0;
  position: absolute;
  top: 25%;
  left: 30%;
  -ms-transform: translate(-30%, -30%);
  transform: translate(-20%, -20%);
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
    String i1=inter.localization(language,"IN","i1");
    String i2=inter.localization(language,"IN","i2");
    String i3=inter.localization(language,"IN","i3");
    String i4=inter.localization(language,"IN","i4");
    String i5=inter.localization(language,"IN","i5");
    String i6=inter.localization(language,"IN","i6");
     String back=inter.localization(language,"IN","back");
      String next=inter.localization(language,"IN","next");
  %>
<div class="container">
<div class="center">
<p>
<h1><font color="midnightblue"><%out.println(i1);%></font></h1>
<ol>
 <h2><font color="midnightblue"><li><%out.println(i2);%></li></font> </h2>
 <h2><font color="MidnightBlue"><li><%out.println(i3);%></li></font></h2>
 <h2><font color="MidnightBlue"><li><%out.println(i4);%></li></font></h2>
 <h2><font color="MidnightBlue"><li><%out.println(i5);%></li></font></h2>
 <h2><font color="MidnightBlue"><li><%out.println(i6);%></li></font></h2>
</ol>
<form method="get" action="check">
  <input type="button" class="button button1" onclick="window.location.href = 'http://localhost:8080/mockExam/index.jsp';" value="<%out.println(back);%>"/>
  <input type="submit" class="button button2"  value="<%out.println(next);%>" />
</form>
     <%
      // ArrayList<Model> model=new ArrayList<Model>();
      //  model = (ArrayList<Model>)session.getAttribute("array");
      // for(int i=0;i<model.size();i++)
      //   {
      //      out.println("<h2>array size : "+model.size()+"<h2>");
      //    out.println("<h2>slno : "+model.get(i).getSlno()+"<h2>");
      //    out.println("<h2>qn : "+model.get(i).getQn()+"<h2>");
      //    out.println("<h2>opt 1 : "+model.get(i).getOpt1()+"<h2>");
      //    out.println("<h2>opt 2 : "+model.get(i).getOpt2()+"<h2>");
      //   }
    %>
</p>
</div>
</div>
</body>
</html>