<%@page import="com.lxisoft.domain.*"%>
<%@page import="com.lxisoft.model.*"%>
<%@page import="java.io.*"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
	<title>WORDS</title>
</head>
<body>
	<H1><CENTER>All WORDS</CENTER></H1>
	
	<table bgcolor="#00ffbf" align=center border="2px" width="30%">
		<%if (request.isUserInRole("admin")) {%>
		<form>
		<tr>
			<td align="center"><a href="Add.jsp"><h3>+</h3></a>
		</tr>
	</form>
	<%}%>
	<tr>
		<th><b>Words</b></th>
	<%List<WordModel>wordsList=(List<WordModel>) request.getAttribute("wordlist");
	for(WordModel wm:wordsList)
	{%>
		
		<TR>
		<form action="select" method="get">
		<input type="hidden" name="id" value="<%=wm.getId()%>"> 
    	<TD><input type="submit" value="<%=wm.getWord()%>"></TD>
    	</form>
    </TR>
    <%
	}%>
	</table>
</body>
</html>