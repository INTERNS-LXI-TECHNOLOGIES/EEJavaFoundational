<%@page import="com.lxisoft.domain.*"%>
<%@page import="com.lxisoft.repository.*"%>
<%@page import="com.lxisoft.domain.*"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
	<title>view</title>
</head>

<body>
<h1>WORDS</h1>
<h2>word 		meaning</h2>
<table>
<%
ArrayList<Word> wordList=(ArrayList<Word>) request.getAttribute("wordList");
for(Word w:wordList)
{
	%><tr><td>
	<%out.println(w.getElement()+"		"+w.getMeaning());%>
	</td></tr>
<%}
%>
</table>
</body>
</html>