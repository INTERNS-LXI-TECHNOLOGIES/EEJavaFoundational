<%@page import="com.lxisoft.domain.*"%>
<%@page import="com.lxisoft.models.*"%>
<%@page import="java.io.*"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
	<title>Save</title>
</head>
<body>
	<table bgcolor="#ffcccc" align=center border="5px" width="25%">
	<%
    Word wd=(Word) request.getAttribute("words");
    %>
	<tr>
    	<td><center>&nbsp;&nbsp;Word:&nbsp;&nbsp;<%=(wd.getWord())%></center></td>  
    </tr>
    <tr>
    	<td><center>&nbsp;&nbsp;Meaning:&nbsp;&nbsp;<%=(wd.getMeaning())%></center></td><br>
    </tr>
    <tr>
        <br><td><a href="admin"><input type="submit" value="Back"></td>
    </tr>
</table>
</body>
</html>