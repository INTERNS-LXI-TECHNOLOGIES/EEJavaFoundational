<%@page import="com.lxisoft.Model.MockExamModel"%>
<%@page import="java.util.ArrayList"%>
<html>
<link rel="stylesheet" href="Login.css"></link>
<meta name="viewport" content="width=device-width, initial-scale=1">
<body>
<div>
	<Head><h1> Exam Result </h1></Head>
<form>
	<%

	 String mark = request.getAttribute("totalMark").toString();
	 int totalMark = Integer.parseInt(mark);%>
	 <h2><%out.println("Your Mark Is : "+totalMark);%></h2>
	 <button type="submit" formaction="index.jsp" class="button">START EXAM AGAIN</button>
</form>
	</div>
	</body>
</html>