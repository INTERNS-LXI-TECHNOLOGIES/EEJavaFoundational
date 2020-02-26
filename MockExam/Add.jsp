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
  left: 30%;
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
input[type=text] {
  width: 300%;
  padding: 12px 20px;
  border: 2px solid red;
  border-radius: 4px;
}
</style>
<div class="container">
<div class="center">
<p>
  
  <form action="add" method="get">
<font size="6" color="midnightblue"><i><b>Welcome to Add Page</b></i></font><br><br><br>
<font size="5" color="midnightblue">Question : </font> <input type="text" name="question"><br>
<font size="5" color="midnightblue">Option 1 : </font> <input type="text" name="option1"><br>
<font size="5" color="midnightblue">Option 2 : </font> <input type="text" name="option2"><br>
<font size="5" color="midnightblue">Option 3 : </font> <input type="text" name="option3"><br>
<font size="5" color="midnightblue">Option 4 : </font> <input type="text" name="option4"><br>
<font size="5" color="midnightblue">Answer no : </font> <input type="text" name="ans"><br><br>
 <input type="submit" class="button_css" value="ADD" name="add">
 <button  formaction="AdminMenu.jsp" class="button_css" name="back">BACK</button>
</form>
</div>
</div>
</div>

</p>
</body>
</html>