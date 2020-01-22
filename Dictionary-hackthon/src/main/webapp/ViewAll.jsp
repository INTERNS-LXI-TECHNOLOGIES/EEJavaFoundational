<%@page import="com.lxisoft.model.*"%>
<%@page import="java.util.*"%>
<%@page import="java.io.*"%>
<html>
<title>Dictionary </title>
<h1><center>DICTIONARY</center></h1>
<body style="background-color: white">
	<a href="AddWord.jsp"><input type="submit" id="b2"name="submit" value="+" /></a>
	<%List<WordUnit> w=(List<WordUnit>) request.getAttribute("allWord");%>
	<table align="center" width="60%"  border color= "blue" bgcolor="#3CBC8D">
		<tr>
			<th>Word</th>
			<th>Meaning</th>
		</tr>
<%
for(int i=0;i<w.size();i++)
{
%>
	<tr>
		<td><%=(w.get(i).getWord())%></td>
		<td><%=(w.get(i).getMeaning())%></td>
	</tr>
<%
}
%>
</table>
</body>
</html> 