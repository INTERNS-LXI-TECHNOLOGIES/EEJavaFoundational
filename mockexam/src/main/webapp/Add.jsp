<!DOCTYPE html>
<html>
<head>
	<title>question1</title>
</head>
<body bgcolor="FloralWhite">
<style>
      body {
  background-image: url('78.png');
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
  left: 30%;
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
<font size="5" color="midnightblue">Question : </font> <input type="text" name="question" placeholder="Question"><br>
<font size="5" color="midnightblue">Option 1 : </font> <input type="text" name="option1" placeholder="option1"><br>
<font size="5" color="midnightblue">Option 2 : </font> <input type="text" name="option2" placeholder="option2"><br>
<font size="5" color="midnightblue">Option 3 : </font> <input type="text" name="option3" placeholder="option3"><br>
<font size="5" color="midnightblue">Option 4 : </font> <input type="text" name="option4" placeholder="option4"><br>
<font size="5" color="midnightblue">Answer no : </font> <input type="text" name="ans" placeholder="ans"><br><br>
 <input type="submit" class="button button1" value="ADD" name="add">
 <button  formaction="AdminMenu.jsp" class="button button2" name="back">BACK</button>
</form>
</div>
</div>
</div>

</p>
</body>
</html>