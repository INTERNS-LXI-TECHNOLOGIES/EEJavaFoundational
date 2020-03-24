<%@ page import="com.lxisoft.model.Model"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="com.lxisoft.sqlRepository.SqlRepository"%>
<%@page import="com.lxisoft.config.*"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding = "UTF-8"%>
<!DOCTYPE html>
<html>
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
    String time=inter.localization(language,"IN","time");
    String question=inter.localization(language,"IN","question");
     String next=inter.localization(language,"IN","next");
  %>
<div class="container">
<div class="center">
  <script>
<%
String clock = "10";
// if( clock == null ) clock = "180";
%>
var timeout = <%=clock%>;
function timer()
{
if( -- timeout > 0 )
{
document.getElementById("clock").innerHTML= timeout;
window.setTimeout( "timer()", 1000 );
}
else
{
document.getElementById("clock").innerHTML = "Time over";
document.qform.submit();
///disable submit-button etc
}
}
//-->
</script>
  <form action="<%=request.getRequestURL()%>" name="forma">
<h1><%out.println(time);%>: <span id="clock"><%=clock%></span></h1>
</form>
<script>
<!--
timer();
//-->
</script>
<p>
     <%
      ArrayList<Model> model=new ArrayList<Model>();
       model =(ArrayList<Model>)session.getAttribute("array");
       int qcount = Integer.parseInt(request.getParameter("questionNo"));
       //out.println("qcount: "+qcount);
       
        // String mark =session.getAttribute("count").toString();
        // out.println("Mark : "+mark);
       if(qcount != model.size()) {

        %><font color="midnightblue"> <%out.println("<h1>"+question+" :"+(qcount + 1)+"."+model.get(qcount).getQn()+"</h1>");
           %>
           <form action="check1" method="get" name="qform">
        <h1><input type="radio" name="opt" value="1"/>
          <label for="1"><font color="midnightblue"><% out.println(model.get(qcount).getOpt1());%></label></font></h1>
          <h1><input type="radio" name="opt" value="2"/>
          <label for="2"><font color="midnightblue"><% out.println(model.get(qcount).getOpt2());%></label></font></h1>
          <h1><input type="radio" name="opt" value="3"/>
          <label for="3"><font color="midnightblue"><% out.println(model.get(qcount).getOpt3());%></label></font></h1>
          <h1><input type="radio" name="opt" value="4"/>
          <label for="4"><font color="midnightblue"><% out.println(model.get(qcount).getOpt4());%></label></font></h1>
            <input type="hidden" name="questionNo" value= <%out.println(qcount);%>/>
            <input type="submit" class="button button1"   value="<%out.println(next);%>" />
          </form>
<%    
         } else {
        //request.setAttribute("mark",mark);

        response.sendRedirect("Result.jsp");
      } %>
</p>
</div>
</div>

</body>
</html>