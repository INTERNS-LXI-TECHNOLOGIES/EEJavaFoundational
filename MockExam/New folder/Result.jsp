<%@page import="java.util.ArrayList"%>
<html>
<head>
 <title>Mock Exam</title>
    	<style>
		body{
		text-align: center;
		 background-color:#F5DEB3	 ;	

      padding-left: 200px;  
		
		}	
		h1 {
  			color: black;
  
  			font-family: courier;
			}
.button {
  
  font-size: 24px;
  text-align: center;
  cursor: pointer;
  outline: none;
  color: #fff;
  background-color: #4CAF50;
  border: none;
  border-radius: 15px;
  box-shadow: 0 9px #999;

}

.button:active {
  background-color: #3e8e41;
  box-shadow: 0 5px #666;
  transform: translateY(4px);
}
	</style>
</head>
<body>

	<div align="center" style="background-color: #FFDAB9			;">
		<br>
		<br>
		<font size="9">EXAM RESULT</font>
		<br>
		<br>
		</div>
	<div style="padding-top: 15%;">
<form>
<%
	 HttpSession sessions = request.getSession(false);
	 String mark = sessions.getAttribute("userMark").toString();
	 String rNum = sessions.getAttribute("userId").toString();
	 int totalMark = Integer.parseInt(mark);
	 %>
	  <h1><%out.println("Register Number  : "+rNum);%></h1>
	 <h1><%out.println("Your Mark Is : "+totalMark);%></h1>
	 <%
	 
	 if(totalMark >=3)
	 {
	 	%>
	 	<h1><%out.print("Exam Passed");%></h1>
	 <%
	 }
	 else
	 {
	 	%>

	 	<h1><%out.print("Exam Failed = > Study well for next one");%></h1>

	 <%
	 }
	 %>
	 <br>
	 <button type="submit" formaction="index.html" class="button">START EXAM AGAIN</button>
</form>
</div>
	</body>
</html>