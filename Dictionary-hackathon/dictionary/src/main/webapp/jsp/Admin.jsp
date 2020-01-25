<%@page import="com.lxisoft.domain.*"%>
<%@page import="com.lxisoft.repository.*"%>
<%@page import="com.lxisoft.domain.*"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
	<title>ADMIN</title>
</head>
<center>
<form action="<%= request.getContextPath() %>/jsp/Save.jsp" method="post">
	<input type="submit" name="add" value="add(+)">
</form></center>
<h1>welcome Admin!</h1>
<br>
<h2>word----------------meaning</h2>
<table>
<%
ArrayList<Word> wordList=(ArrayList<Word>) request.getAttribute("wordList");
for(Word w:wordList)
{
	%><tr><td>
	<%out.println(w.getElement()+"---------------------"+w.getMeaning());%>
	</td></tr>
<%}
%>
</table>
</body>
</html>