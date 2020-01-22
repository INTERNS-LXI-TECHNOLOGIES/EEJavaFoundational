<!DOCTYPE html>
<html>
<head>
	<title>OXFORD DICTIONARY</title>
</head>
<center><body >
<%@ page import="com.lxisoft.Domain.*" %>
<%@ page import="java.util.*" %>

<center><b>OXFORD DICTIONARY</b></center><br><b><br></b>
<% String userName=null;
if(request.getUserPrincipal()!=null){
userName= request.getUserPrincipal().getName();

}%>
<% if (userName=="admin"){ %>

<a href="add.jsp">add to dictionary</a><br>
<a href="logout.jsp">logout</a>
<% }
if(request.getUserPrincipal()==null){ %>
<a href="logout.jsp">login</a>
<% } %>
<% ArrayList<Word> words=(ArrayList<Word> ) session.getAttribute("words"); %>
<table>
	<tr><th>Word</th><b><b></b></b><th>meaning</th></tr>

	<%
for(Word a: words)
{
%>
<tr><td><% out.println(a.getWord()); %> </td>	<b><b></b></b>
	<td><% out.println(a.getMeaning()); %> </td></tr>	
<%
}
	%>
</table>

</body></center>
</html>
