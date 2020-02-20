<%@page import="com.lxisoft.models.*"%>
<%@page import="java.io.*"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
	<title>Save</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<div class="jumbotron text-center"></div>
<body>
    <% Question qn=(Question) request.getAttribute("question"); %>
	<tr>
    	<td><center><%=qn.getQuestion()%></center></td>  
    </tr>
    <tr>
        <td><center><%=qn.getOption1()%></center></td>  
    </tr>
    <tr>
        <td><center><%=qn.getOption2()%></center></td>  
    </tr>
    <tr>
        <td><center><%=qn.getOption3()%></center></td>  
    </tr>
    <tr>
        <td><center><%=qn.getOption4()%></center></td>  
    </tr>
    <tr>
        <td><center><%=qn.getAnswer()%></center></td>  
    </tr>
        <td><a href="admin"><input type="submit" value=Back></td>
    </tr>
</body>
</html>