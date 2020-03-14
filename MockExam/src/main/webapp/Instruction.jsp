<!DOCTYPE html>
<html>
<head>
  <body bgcolor="OldLace">
<style>
.container {
  height: 700px;
  position: relative;
  border: 5px solid oldlace;
}
.center {
  margin: 0;
  position: absolute;
  top: 25%;
  left: 30%;
  -ms-transform: translate(-30%, -30%);
  transform: translate(-20%, -20%);
}
.button_css
{
	background-color: midnightblue;
	color: white;
	width: 150px;
	height: 40px;
}
</style>
</head>
<body bgcolor="OldLace">
<div class="container">
<div class="center">
<p>
<h1><font color="MediumBlue">Instruction</font></h1>
<ol>
 <h2><font color="SlateBlue"><li>Please read instructions so that you will be able to easily navigate through the Test.</li></font> </h2>
 <h2><font color="SlateBlue"><li>Timer start when you click start button.</li></font></h2>
 <h2><font color="SlateBlue"><li>The Question Paper consists of multiple sections each having multiple options for each.</li></font></h2>
 <h2><font color="SlateBlue"><li>Only one Question will be displayed at a time click on "Next"button next question will get.</li></font></h2>
 <h2><font color="SlateBlue"><li>If you answered all the questions please click on the 'Submit' button.</li></font></h2>
</ol>

<form method="get" action="QuestionServlet" value="0">
	<input type = "hidden" name = "count" value ="0">
	<button type="submit" class="button_css"> Start </button>
	<button formaction = "index.jsp" class="button_css">Back</button>
</form>
     
</p>
</div>
</div>


</body>
</html>
