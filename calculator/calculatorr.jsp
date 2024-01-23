<html>
<head>
<title> calaculate </title>
<style>
body
{
	text-align: center;
   	 background-color: #ADD8E6;
	
}
#fiirst{
	
	
}
</style>
    <script>
        function goBack() {
            window.history.back();
        }
    </script>
</head>
<body>
<form action = add.jsp  method = "post">
<lable>Enter the first number</lable>
<input type = "text" name="first" id = "first">
<lable>Enter the second number</lable>
<input type = "text" name="second" id = "second">
<select id = "selectAnyOne" name = "select">
<option value = "addition">+</option>
<option value = "multiplication"> * </option>
<option value="substraction">-</option>
<option value="division">/</option>

</select>
<input type = "submit" value="Submit">
</form>
<button onclick="goBack()">GoBack</button>
</body>
</html>