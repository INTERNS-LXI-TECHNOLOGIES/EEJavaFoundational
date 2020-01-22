<!DOCTYPE html>
<html>
<head>
	<title>OXFORD DICTIONARY</title>
</head>
<body>
<%@ page import="com.lxisoft.Domain.*" %>
<%@ page import="java.util.*" %>

<center><b>OXFORD DICTIONARY</b></center><br><b><br></b>
<a href="add">add to dictionary</a>
<% ArrayList<Word> words=(ArrayList<Word> ) session.getAttribute("words"); 
for(Word a: words)
{
	out.println("a");
}
	%>

</body>
</html>
