<!DOCTYPE html>
<html>
<head>
	<title>question1</title>
</head>
<body bgcolor="FloralWhite">
<style>
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
.button_css
{
	background-color: midnightblue;
	color: white;
	width: 150px;
	height: 40px;
  border-radius: 12px;
   display: inline-block;
  font-size: 16px;
  text-decoration: none;
}
</style>
<div class="container">
<div class="center">
<p>
<center>
  <font size="7" color=" midnightblue"><i><b>MOCK EXAM</b></i></font>
  <br>
  <br>
  <font size="6" color=" midnightblue">choose your option</font>
  <br>
  <br>
  <form>
  <input type="submit" formaction="Add.jsp" class="button_css" name="ADD" value="ADD" >
  <input type="submit" formaction="delete.jsp" class="button_css" name="DELETE" value="DELETE" >
  <input type="submit" formaction="update.jsp" class="button_css" name="UPDATE" value="UPDATE" >
  <input type="submit" formaction="display" class="button_css" name="DISPLAY" value="DISPLAY">
  <input type="submit" formaction="Login.jsp" class="button_css" name="BACK" value="BACK" >
</form>
</center>
</p>
</div>
</div>
</div>

</body>
</html>