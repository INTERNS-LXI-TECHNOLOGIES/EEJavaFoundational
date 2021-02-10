<!DOCTYPE html>
<html>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<head>
	<title></title>
</head>
<body>
	    <div id="login">
        <h3 class="text-center text-white pt-5">UPDATE Contact</h3>
        <div class="container">
            <div id="login-row" class="row justify-content-center align-items-center">
                <div id="login-column" class="col-md-6">
                    <div id="login-box" class="col-md-12">
                        <form id="login-form" class="form" action="UpdateServlet" method="get">
                            <h3 class="text-center text-info">UPDATE Contact</h3>
                            <div class="form-group">
                                <label for="number" class="text-info">Enter the Name</label><br>
                                <input type="name" name="name" id="name" class="form-control"value="<%= request.getParameter("temp")%>">
                                <input type="hidden" name="id" id="id" class="form-control " value="<%= request.getParameter("id")%>">
                            </div>
                            <div class="form-group">
                                <label for="number" class="text-info">Enter the LastName</label><br>
                                <input type="name" name="lname" id="lname" class="form-control"value="<%= request.getParameter("temp1")%>">
                            </div>
                             <div class="form-group">
                                <label for="email" class="text-info">Enter the Email Id</label><br>
                                <input type="email" name="email" id="name" class="form-control"value="<%= request.getParameter("temp2")%>">
                            </div>
                            <div class="form-group">
                                <label for="number" class="text-info">Enter the Number</label><br>
                                <input type="number" name="number" id="name" class="form-control"value="<%= request.getParameter("temp3")%>">
                            </div>
                            <div class="form-group">
                                
                                <input type="submit" name="submit" class="btn btn-info btn-md" value="submit">
                            </div>
                          
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>