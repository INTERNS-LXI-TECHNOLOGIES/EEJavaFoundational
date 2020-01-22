<!DOCTYPE html>
<html>
<head> 
<style>
	table th,td 
	{	width: 2px;
		border:2px solid black;

	}
</style> 
	<h1 align="center">DICTIONARY</h1>
	<title>
		
	</title>
</head>
<body style="background: white">
<%@page import = "com.lxisoft.servet.*"%>
<%@page import = "com.lxisoft.sqlrepository.*"%>
<%@page import = "com.lxisoft.model.*,java.util.*"%>

<table align="center" style="border-collapse: collapse;">
	        <tr>
				<th style="font-family: fantasy;font size: 10px">WORD</th>
				
			</tr>
<% ArrayList<Word> wordList=(ArrayList<word>) request.getAttribute("wordList");
	
	for(Word i : wordList)
		{ %>
			<b>
			<tr style=" font-style:oblique;  ">
			<td>
				<a href="Select.jsp?temp=<%=i.getMeaning()%>"><input type="button" name="submit" value="<%=i.getWord() %>"></a>
			</td>
			
			</tr>
			</b>
			<%
		} %>

</table>
<center><br>


</center>
</body>
</html>