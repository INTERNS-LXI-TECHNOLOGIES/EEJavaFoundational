<!DOCTYPE html>
<html>
<head>
  <title>Login</title>
  <link rel="stylesheet" type="text/css" href="new.css">
</head>
<body>
    <div class="login-page">
      <div class="form">
        <!-- <form class="register-form">
          <input type="text" placeholder="name"/>
          <input type="password" placeholder="password"/>
          <input type="text" placeholder="email address"/>
          <button>create</button>
          <p class="message">Already registered? <a href="#">Sign In</a></p>
        </form> -->
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
