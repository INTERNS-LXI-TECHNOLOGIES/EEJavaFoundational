<!DOCTYPE html>
<html>
<head>
	<title>
		SELECTED WORD
	</title>
</head>
<body style="background: lightgrey">
<%@page import = "com.lxisoft.servet.*"%>
<%@page import = "com.lxisoft.sqlrepository.*"%>
<%@page import = "com.lxisoft.model.*,java.util.*"%>
<style>

</style>
 <center>
<table align="center" style="border-collapse: collapse;">


  <%	
    String word =request.getParameter("word");
    String meaning = request.getParameter("meaning");
    %>
	        <tr>
				<th style="font-family: fantasy;font size: 5px"><h2><% out.println(word);%></h2></th>

				
			</tr>

	<tr>
		<td><% out.println(meaning);%></td>
	</tr>		
</table>
</center>

</body>
</html>