<%@page import="com.lxisoft.Model.ExamModel"%>
<%@page import="java.util.ArrayList"%>
<html>
<head><h1>Questions</h> </head>
<body>
<p>
<% 
	ArrayList<ExamModel> emodels = (ArrayList<ExamModel>)request.getAttribute("question");
//	out.println("ArraySize : "+emodels.size());
	out.println("<h3>QustNo : "+emodels.get(0).getQuestionNumber()+"</h3>");
	out.println("<h3>Question : "+emodels.get(0).getQuestion()+"</h3>");
	out.println("<h4>opt1 :"+emodels.get(0).getOpt1()+"</h4>");   
	out.println("<h4>opt2 :"+emodels.get(0).getOpt2()+"</h4>"); 
	out.println("<h4>opt3 :"+emodels.get(0).getOpt3()+"</h4>"); 
	out.println("<h4>opt4 :"+emodels.get(0).getOpt4()+"</h4>"); 
%>
</p>
</body>
</html>




