 <%@age import="java.util.*"%> 
<html>
<head>
   <!-- Font Awesome -->
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css">
<!-- Bootstrap core CSS -->
<link href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
<!-- Material Design Bootstrap -->
<link href="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.10.1/css/mdb.min.css" rel="stylesheet">
</head>
   <% String lan="ml";
      String country="IN";

      Locale l=new Locale(lan,country);
      ResourceBundle res=ResourceBundle.getBundle("lan_ml_IN",l);
   

   <body bgcolor = "#ffffff">
      
       <form class="text-center border border-light p-5" method = "POST" action ="j_security_check">
         <table border = "0">
            <p class="h4 mb-4">Login</p>
            <tr>
               <td>User Name</td>
               <br><td><input type = "text" class="form-control mb-4" name="j_username"></td></br>
            </tr>
            <tr>
               <td>Password</td>
               <br><td><input type = "password" class="form-control mb-4" name="j_password"></td></br>
            </tr>
         </table>
           <button class="btn btn-info btn-block"  type="submit">Login</button>


</form>
<!-- Default form subscription -->
      
   </body>
</html>




