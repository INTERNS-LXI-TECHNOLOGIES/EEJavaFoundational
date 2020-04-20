<%request.getSession().setMaxInactiveInterval(-1);%>
<!DOCTYPE html>
<html>
<head>
  <title>Login</title>
  <link rel="stylesheet" type="text/css" href="new.css">
</head>
<body>
    <div class="login-page">
      <div class="form">
        <form action="userLogin" method="GET" class="login-form">
           <input type="text" name="username" placeholder="username" required="required" />
           <input type="password"  name="password" placeholder="password" required="required" />
           <button>login</button>
           <p class="message">Not registered? <a href="register.jsp">Register</a></p>
        </form>
     </div>
   </div>
<script type="text/javascript" href="sample.js"Lo></script>
</body>
</html>
