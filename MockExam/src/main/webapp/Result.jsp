<%@page import="com.lxisoft.Model.MockExamModel"%>
<%@page import="java.util.ArrayList"%>
<html>
<link rel="stylesheet" href="Style.css"></link>
<meta name="viewport" content="width=device-width, initial-scale=1">
<body>
<div class = "wrapper">
		<div align="center" style="background-color: darkmagenta;">
		<br>
		<br>
		<font size="9">EXAM RESULT</font>
		<br>
		<br>
		</div>
	<div style="padding-top: 15%;padding-left: 37%">
<form>
	<%
	 String mark = request.getAttribute("totalMark").toString();
	 int totalMark = Integer.parseInt(mark);
	 %>
	 <h1><%out.println("Your Mark Is : "+totalMark);%></h1>
	 <%
	 
	 if(totalMark >=3)
	 {
	 	%>
	 	<h1><%out.println("Congratulations....");%></h1>
	 	<h1><%out.println("Exam Passed");%></h1>
	 <%
	 }
	 else
	 {
	 	%>

	 	<h1><%out.println("!! Sorry !!");%></h1><br>
	 	<h1><%out.println("Exam Failed");%></h1>
	 <%
	 }
	 %>
	 <br>
	 <button type="submit" formaction="Introduction.jsp" class="button">START EXAM AGAIN</button>
</form>
</div>
	</div>
	</body>
</html>