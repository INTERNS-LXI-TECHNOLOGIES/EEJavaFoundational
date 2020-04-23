<!DOCTYPE html>
<html>
<head>
  <title>Login</title>
  <style type="text/css">
    .login-page {
  width: 660px;
  padding: 10% 0 0;
  margin: auto;
  border-color: red;
}

.form {
  position: relative;
  z-index: 1;
  background: #FFFFFF;
  max-width: 360px;
  margin: 0 auto 100px;
  padding: 45px;
  text-align: center;
  box-shadow: 0 0 20px 0 rgba(0, 0, 0, 0.2), 0 5px 5px 0 rgba(0, 0, 0, 0.24);
}
.form input {
  font-family: "Roboto", sans-serif;
  outline: 0;
  background: #f0f2f2;
  width: 100%;
  border: 0;
  border-radius: 20px;
  margin: 0 0 35px;
  padding: 15px;
  box-sizing: border-box;
  font-size: 17px;
}
.form button {
  font-family: "Roboto", sans-serif;
  text-transform: uppercase;
  outline: 0;
  /*background: #4CAF50;*/
  background:#009b77;
  width: 100%;
  border: 0;
  padding: 15px;
  color: #FFFFFF;
  font-size: 14px;
  -webkit-transition: all 0.3 ease;
  transition: all 0.3 ease;
  cursor: pointer;
  border-radius: 20px;
}
.form button:hover,.form button:active,.form button:focus {
  background: #43A047;
}
.form .message {
  margin: 15px 0 0;
  color: black;
  font-size: 16px;
  font-weight: bolder;
}
.form .message a {
  color: #255627;
  font-size: 16px;
  text-decoration: none;
  font-weight: bold;
}
.form .register-form {
  display: none;
}
.container {
  position: relative;
  z-index: 1;
  max-width: 300px;
  margin: 0 auto;
}
.container:before, .container:after {
  content: "";
  display: block;
  clear: both;
}
.container .info {
  margin: 50px auto;
  text-align: center;
}
.container .info h1 {
  margin: 0 0 15px;
  padding: 0;
  font-size: 36px;
  font-weight: 300;
  color: #1a1a1a;
}
.container .info span {
  color: #4d4d4d;
  font-size: 12px;
}
.container .info span a {
  color: #000000;
  text-decoration: none;
}
.container .info span .fa {
  color: #EF3B3A;
}
body {
  background:#009b77;
  /*background: #76b852;*/ /* fallback for old browsers */
  /*background: -webkit-linear-gradient(right, #76b852, #8DC26F);
  background: -moz-linear-gradient(right, #76b852, #8DC26F);
  background: -o-linear-gradient(right, #76b852, #8DC26F);
  background: linear-gradient(to left, #76b852, #8DC26F);
  font-family: "Roboto", sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale; */     
}
  </style>
</head>
<body>
    <div class="login-page">
      <div class="form">
        <form action="j_security_check" method="POST" class="login-form">
           <input type="text" name="j_username" placeholder="username" required="required" />
           <input type="password"  name="j_password" placeholder="password" required="required" />
           <button>login</button>
           <p class="message">Not registered? <a href="register.jsp">Register</a></p>
        </form>
     </div>
   </div>
<script type="text/javascript" href="sample.js"Lo></script>
</body>
</html>
