<!DOCTYPE html>
<html>
<head>
	<title>question1</title>
</head>
<body>
<style>
  body {
  background-image: url('itl.cat_simple-wallpaper_120953.png');
    background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
  height: 100%
}
.container {
  height: 700px;
  position: relative;
  border: 5px solid midnightblue;
}
.center {
  margin: 0;
  position: absolute;
  top: 50%;
  left: 50%;
  -ms-transform: translate(-50%, -50%);
  transform: translate(-50%, -50%);
}
.button {
  background-color: #4CAF50; /* Green */
  border: none;
  color: white;
  padding: 16px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  transition-duration: 0.4s;
  cursor: pointer;
}

.button1 {
  background-color: white; 
  color: black; 
  border: 2px solid #4CAF50;
  border-radius: 12px;
}

.button1:hover {
  background-color: #4CAF50;
  color: white;
}

.button2 {
  background-color: white; 
  color: black; 
  border: 2px solid #008CBA;
  border-radius: 12px;
}

.button2:hover {
  background-color: #008CBA;
  color: white;
}
</style>
<div class="container">
<div class="center">
<p>
<center>
  <h1><font color="midnightblue" size="7">MOCK EXAM</font></h1><br><br>

  <input type="submit" class="button button1" name="USER" value="USER" onclick="window.location.href = 'http://localhost:8080/mockExam/welcome.jsp';">
  <input type="submit" class="button button2" name="ADMIN" value="ADMIN" onclick="window.location.href = 'http://localhost:8080/mockExam/Login.jsp';">  
</center>

</p>
</div>
</div>
</div>

</body>
</html>