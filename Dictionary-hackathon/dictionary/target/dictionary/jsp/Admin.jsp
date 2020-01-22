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
	<button>add</button>
</form>
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