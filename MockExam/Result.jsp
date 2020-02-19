<%@page import="com.lxisoft.Model.MockExamModel"%>
<%@page import="java.util.ArrayList"%>
<html>
<Head><h1> Exam Result</h1></Head>
<body>

	<%

	 String mark = request.getAttribute("totalMark").toString();
	 int totalMark = Integer.parseInt(mark);%>
	 <h2><%out.println("Your Mark Is : "+totalMark);%></h2>
	<!-- //ArrayList<MockExamModel> arrayModel = (ArrayList<MockExamModel>)session.getAttribute("Array");
	//out.println(arrayModel.get(0).getId());
	//out.println(arrayModel.get(0).getQuestion().getQuestion());
	//out.println(arrayModel.get(0).getAnswer().getAnswer());
	//out.println(arrayModel.get(0).getSelectedOption().getOption()); -->
	
	</body>
</html>