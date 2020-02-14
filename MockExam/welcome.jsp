<%@page import="com.lxisoft.Model.MockExamModel"%>
<%@page import="java.util.ArrayList"%>
<html>
<head><h1> Question Started</h> </head>
<body>
<p>
<% //ArrayList<MockExamModel> model = new ArrayList<MockExamModel>();
// model = (ArrayList<MockExamModel>)session.getAttribute("Array");
//for(int i=0;i<model.size();i++)
//{
MockExamModel model = (MockExamModel)session.getAttribute("Array");
out.println("<h1>Question No : "+model.getId()+"</h1>");
out.println("<h1>Question : "+model.getQuestion().getQuestion()+"</h1>");
out.println("<h1>Answer : "+model.getAnswer().getAnswer()+"</h1>");
//}
%>
</p>
<a href="Home">Next </a>
</body>
</html>