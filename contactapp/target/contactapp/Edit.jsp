<%@ page import="java.util.*"%>
<!DOCTYPE html >
<html>
<head>
<!-- Font Awesome -->
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css">
<!-- Bootstrap core CSS -->
<link href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
<!-- Material Design Bootstrap -->
<link href="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.10.1/css/mdb.min.css" rel="stylesheet">


</head>
<body>
	<form class="text-center border border-light p-5" action="Edit" method="post">
    
 		<% String a=(String)request.getAttribute("id");%>
 			<input type="hidden" class="form-control mb-4" name="id" value="<%=a%>"/><br/>
        New Name:<input type="text" class="form-control mb-4" name="Name"/><br/>
        New Number:<input type="text" class="form-control mb-4" name="Number"/><br/>
        </select> <br/>
        <input type="submit" class="btn btn-info btn-block" value="save"/>
 
    </form>
</body>
</html> 

 
