<%@page import="com.lxisoft.models.*"%>
<%@page import="java.io.*"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
	<title>Questions</title>
</head>

<body>
	<H1><CENTER><u>Questions</u></CENTER></H1>
	<%
	List<Question> questionList=(List<Question>) request.getAttribute("questionlist");
	for(Question qn:questionList)
	{%>
		<input type=number value="<%=qn.getQno()%>"><br>
    	<input type="text" value="<%=qn.getQuestion()%>"><br>
    	<input type="radio" id="<%=qn.getOption1()%>" name="colour" value="<%=qn.getOption1()%>">
    	<label for="<%=qn.getOption1()%>"><%=qn.getOption1()%></label><br>
    	<input type="radio" id="<%=qn.getOption2()%>" name="colour" value="<%=qn.getOption2()%>">
    	<label for="<%=qn.getOption2()%>"><%=qn.getOption2()%></label><br>
    	<input type="radio" id="<%=qn.getOption3()%>" name="colour" value="<%=qn.getOption3()%>">
    	<label for="<%=qn.getOption3()%>"><%=qn.getOption3()%></label><br>
    	<input type="radio" id="<%=qn.getOption4()%>" name="colour" value="<%=qn.getOption4()%>">
    	<label for="<%=qn.getOption4()%>"><%=qn.getOption4()%></label><br>
	<%
	}
	%>  	
	<input type="button" class="button" value="Next">
</body>
</html>