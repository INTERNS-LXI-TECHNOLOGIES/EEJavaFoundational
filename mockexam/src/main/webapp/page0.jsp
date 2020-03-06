<!DOCTYPE html>
<html>
<head>
	<title>question1</title>
</head>
<body bgcolor="FloralWhite">
<style>
   body {
  background-image: url('fun-art_00375794.jpg');
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
<form>
<center>
Name<input type="text" name="username">
</center>
  <input type="button" class="button button1" onclick="window.location.href = 'http://localhost:8080/mockExam/welcome.jsp';" value="Back"/>
   <input type="button" class="button button2" onclick="window.location.href = 'http://localhost:8080/mockExam/page1.jsp';"  value="NEXT" />
</form>
</p>
</div>
</div>

</body>
</html>