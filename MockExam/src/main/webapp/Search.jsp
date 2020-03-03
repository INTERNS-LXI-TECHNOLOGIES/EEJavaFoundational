<%@page import="com.lxisoft.models.*"%>
<%@page import="java.io.*"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
	<title>Search</title>
    <style>
    div
    {
        padding-top: 50px;
        padding-right: 30px;
        padding-left: 80px;
        padding-bottom: 50px;
    }
    </style>
</head>
<body>
    <div><table background="nn.jpeg" align="center" width="30%">
    <%List<Question> q=(List<Question>) request.getAttribute("question");
    for(Question qn:q)
    {%>
        <tr>
        <td><%=qn.getQuestion()%></td>
        </tr><br>
    <%}%>
</table></div>
</body>
</html>