<%@page import="com.lxisoft.Domain.*"%>
<html>
<title> dictionary </title>
<head></head>
<body>
	<%
		
		Dictionary d=(Dictionary)request.getAttribute("Dictionary");
	%>
	<%=d.getWord()%>
	<%=d.getMeaning()%>
	<a href="start"><input type="submit" name="back" value="back"></a>
</body>
</html>
