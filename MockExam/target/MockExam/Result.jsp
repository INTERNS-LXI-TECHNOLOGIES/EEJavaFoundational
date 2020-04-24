<!DOCTYPE html>
<%@page import="com.lxisoft.Control.*"%>
<%@page import="com.lxisoft.Model.*"%>
<%@page import="java.io.*"%>
<%@page import="java.util.*"%>
<head>
	<title>Result</title>
<style>
body {
  background-image: url('images.png');
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;
}
.container {
  height: 700px;
  position: relative;
  border: 5px solid oldlace;
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
<center><b><font size="30" color="Black">Result</font></b></center><br><br>	
<body>
	<center>
		<%
int m=(int) session.getAttribute("Mark");
out.println(m);
%><br>
<%
  if(m>=5)
  {
	 out.println("PASSED");
  }
  else
  {
	 out.println("FAILED");	
  }
  %>
  
	</center><br><br>
 <center> 
<button class="button" onclick="window.location.href = 'index.jsp';"> 
       BACK
    </button> </center>
 	
 </body>
</html>


	