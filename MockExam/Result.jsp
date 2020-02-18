<%@page import="com.lxisoft.Model.MockExamModel"%>
<%@page import="java.util.ArrayList"%>
<html>
<Head><h1> Exam Result</h1></Head>
<body>
	<% Arraylist<MockExamModel> name =  (ArrayList<MockExamModel>)request.getAttribute("test");
	out.println(name.get(0).getId());
	%>
	</body>
</html>