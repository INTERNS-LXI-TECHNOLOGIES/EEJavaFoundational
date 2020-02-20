<%@ page import="com.lxisoft.model.Model"%>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
	<title>instructions</title>
</head>
<body bgcolor="FloralWhite">
<style>
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
.button_css
{
	background-color: midnightblue;
	color: white;
	width: 150px;
	height: 40px;
}

</style>
<div class="container">
<div class="center">
<p>
     <%
      ArrayList<Model> model=new ArrayList<Model>();
       model =(ArrayList<Model>)session.getAttribute("array");
       int qcount = Integer.parseInt(request.getParameter("questionNo"));
       //out.println("qcount: "+qcount);
       
        // String mark =session.getAttribute("count").toString();
        // out.println("Mark : "+mark);
       if(qcount != model.size()) {

        %><font color="midnightblue"> <%out.println("<h1>question no: "+(qcount + 1)+"."+model.get(qcount).getQn()+"</h1>");
           %>
           <form action="check1" method="get">
        <h1><input type="radio" name="opt" value="1"/>
          <label for="1"><font color="midnightblue"><% out.println(model.get(qcount).getOpt1());%></label></font></h1>
          <h1><input type="radio" name="opt" value="2"/>
          <label for="2"><font color="midnightblue"><% out.println(model.get(qcount).getOpt2());%></label></font></h1>
          <h1><input type="radio" name="opt" value="3"/>
          <label for="3"><font color="midnightblue"><% out.println(model.get(qcount).getOpt3());%></label></font></h1>
          <h1><input type="radio" name="opt" value="4"/>
          <label for="4"><font color="midnightblue"><% out.println(model.get(qcount).getOpt4());%></label></font></h1>
            <input type="hidden" name="questionNo" value= <%out.println(qcount);%>/>
            <input type="submit" class="button_css"   value="NEXT" />
          </form>
<%    
         } else {
        //request.setAttribute("mark",mark);
       String count  = session.getAttribute("count").toString();

        response.sendRedirect("Result.jsp");
      } %>
</p>
</div>
</div>
</body>
</html>