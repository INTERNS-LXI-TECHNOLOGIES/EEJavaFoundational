<%@page import="com.lxisoft.models.*"%>
<%@page import="java.io.*"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
	<title>Save</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
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
    <tr>
        <td><center><%=qn.getAnswer2()%></center></td>  
    </tr>
        <td><center><a href="admin"><input type="submit" value=Back></td></center>
    </tr>
</body>
</html>