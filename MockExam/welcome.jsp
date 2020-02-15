<%@page import="com.lxisoft.Model.MockExamModel"%>
<%@page import="java.util.ArrayList"%>
<html>
<head><h1> Question Started</h> </head>
<body>
<p>
<% 
int k = 1;
ArrayList<MockExamModel> model = (ArrayList<MockExamModel>)request.getAttribute("question");
for(int i=0;i<model.size();i++)
{
//MockExamModel model = (MockExamModel)reguest.getAttribute(question);
out.println("<h1>Question No : "+model.get(i).getId()+"</h1>");
out.println("<h1>Question : "+model.get(i).getQuestion().getQuestion()+"</h1>");
out.println("<h1>Answer : "+model.get(i).getAnswer().getAnswer()+"</h1>");

}
%>
</p>
<a href="Home">Next </a>
</body>
</html>