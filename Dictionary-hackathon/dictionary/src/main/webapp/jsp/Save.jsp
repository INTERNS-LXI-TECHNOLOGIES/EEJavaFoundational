<%@page import="com.lxisoft.domain.*"%>
<%@page import="com.lxisoft.repository.*"%>
<%@page import="com.lxisoft.domain.*"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
	<title>view</title>
</head>
<form action="<%= request.getContextPath() %>/Save.jsp">
	<button>save</button>
</form>
<body>
<h1>WORDS</h1>
<h2>word 		meaning</h2>
<%
ArrayList<Word> wordList=(ArrayList<Word>) request.getAttribute("wordList");
for(Word w:wordList)
{
	out.println(w.getElement()+"		"+w.getMeaning())+"\n";
}
%>
</body>
</html>