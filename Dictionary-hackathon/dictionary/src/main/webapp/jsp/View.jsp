<%@page import="com.lxisoft.domain.*"%>
<%@page import="com.lxisoft.repository.*"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
	<title>view</title>
</head>

<body>
<h1>words</h1><br>
<h2>word		meaning</h2>
<%
ArrayList<Word> wordList=request.getAttribute("wordList");
for(Word word:wordList)
{
	out.println(word.getElement()	+"-"+	word.getMeaning());
}
%>
</body>
</html>