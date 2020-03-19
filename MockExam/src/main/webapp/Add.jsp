<html>
<link rel="stylesheet" href="Style.css"></link>
<meta name="viewport" content="width=device-width, initial-scale=1">
<body>
<form>
	<div class="wrapper">
        
		<div align="center" style="background-color: darkmagenta;" >
            <br>
            <br>
      		<font size="9">ENTER QUESTION</font>
            <br>
            <br>
        </div>
        <div align="center">
        <h1><label for="question">Question : </label>
        <input class="text" type="text" id="question" placeholder="Enter Question" name="question"><br>
        <label for="answer">Answer : </label>
        <input type="text" id="answer" placeholder="Enter Answer"  name="answer"><br>
        <label for="option1">Option1 : </label>
        <input type="text" id="option1" placeholder="Enter Option"  name="option1"><br>
        <label for="option2">Option2 : </label>
        <input type="text" id="option2" placeholder="Enter Option2"  name="option2"><br>
        <label for="option3">Option3 : </label>
        <input type="text" id="option3" placeholder="Enter Option3"  name="option3"><br>
        <label for="option4">Option4 : </label>
        <input type="text" id="option4" placeholder="Enter Option4"  name="option4"></h1><br>
        <button formaction="Admin.jsp" class="button">BACK</button> <button formaction="Add" class="button">SUBMIT
        </button> <button type="reset" class="button">RESET</button>
  </div>
</div>
</form>
</body>
</html>