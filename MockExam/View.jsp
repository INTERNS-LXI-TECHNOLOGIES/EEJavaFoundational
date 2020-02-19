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
	<table align=center border="5px" width="100%" height="100%">
    <%Question q=(Question) request.getAttribute("question"); %>
	<tr>
    	<td><center><%=(q.getQuestion())%></center></td>  
    </tr>
    <tr>
        <td><center><%=(q.getOption1())%></center></td>  
    </tr>
    <tr>
        <td><center><%=(q.getOption2())%></center></td>  
    </tr>
    <tr>
        <td><center><%=(q.getOption3())%></center></td>  
    </tr>
    <tr>
        <td><center><%=(q.getOption4())%></center></td>  
    </tr>
    <tr>
        <td><center><%=(q.getAnswer())%></center></td>  
    </tr>
        <td><a href="admin"><input type="submit" value=Back></td>
    </tr>
  </table>
</body>
</html>