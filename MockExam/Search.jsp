<%@page import="com.lxisoft.models.*"%>
<%@page import="java.io.*"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
	<title>Search</title>
</head>
<body>
<table>
	<%
    List<Question> q=(List<Question>) request.getAttribute("question");
    for(Question qn:q)
    {%>
    <tr>
        <td><%=qn.getQuestion()%></td>
    </tr>
    <%
    }%>
</table>
</body>
</html>