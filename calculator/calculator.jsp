<html>
<head>
<title>calculator</title>
<style>
body{
	text-align : center;
}
</style>
<script>
function addition(){
	var num1=document.getElementById('num1').value;
	var num2=document.getElementById('num2').value;
if(num1!==''&&num2!==''){
	var s =parseInt(num1)+parseInt(num2);
	document.getElementById('result').innerText ='Result :'+s;
}
else 
{
	document.getElementById('result').innerText = 'Please add numbers';
	return false ;
}
}
</script>
</head>
<body><form onsubmit="addition();">
<label>ENTER THE FIRST NUMBER:</label>
<input type="text" id="num1" name="num1">
<label>ENTER THE SECOND NUMBER:</label>
<input type="text" id="num2" name="num2"><BR><br>
<center><input type="submit" value="calculate"></center>
<div id="result"></div> 
</form>
</body>
</html>