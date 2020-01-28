<%@page import="com.lxisoft.Domain.*"%>
<html>
<title> dictionary </title>
<head></head>
<body>
	<%
		String id=(String)request.getParameter("no");
		Dictionary d=(Dictionary)request.getAttribute("dictionary");
	%>
	<%=id%>
	<%=c.getWord()%>
	<%=c.getMeaning()%>
	<a href="start"><input type="submit" name="back" value="back"></a>
</body>
</html>
