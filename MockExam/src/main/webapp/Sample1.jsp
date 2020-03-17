<html>
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.12/css/all.css" integrity="sha384-G0fIWCsCzJIMAVNQPfjH08cyYaUtMwjJwqiRKxxE/rx96Uroj1BtIQ6MLJuheaO9" crossorigin="anonymous">
<link href="https://fonts.googleapis.com/css?family=Raleway" rel="stylesheet">
<link rel="stylesheet" href="Sample.css"></link>
<body>

<div class="wrapper">
  <div class="login-text">
    <button class="cta"><i class="fas fa-chevron-down fa-1x"></i></button>
    <div class="text">
      <a href="">Login</a>
      <hr>
      <br>
      <form method="POST" action="j_security_check">
      <input  type="text" placeholder="Username" name="j_username">
      <br>
      <input type="password" placeholder="Password" name="j_password">
      <br>
      <button class="login-btn" type="submit">Log In</button>
      <button formaction="Register.jsp" class="signup-btn">Sign Up</button>
    </form>
    </div>
  </div>
  <div class="call-text">
    <h1>Welcome to <span>MOCK</span> Exam</h1>
    <label for="cars">Choose a car:</label>

      <select id="cars">
        <option value="volvo">Volvo</option>
        <option value="saab">Saab</option>
        <option value="opel">Opel</option>
        <option value="audi">Audi</option>
      </select>
    <!-- <button>Join the Community</button> -->
  </div>
  <

</div>
<script type="text/javascript" src="Sample.js"></script>
<!-- </form> -->
</body>
</html>