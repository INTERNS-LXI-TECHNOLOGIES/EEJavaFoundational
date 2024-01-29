<html>
<head>
<title>CarDetails</title>
<style>
body
{
	
	background-image :url("3.jpg");
	 background-size: cover; 
}
</style>
</head> 
<body>
    <form action="carPart.jsp" method="post">
	
   <label><strong>Enter the Car name</strong></label>
   <input type = "text" name="name" id="name">
   <label><strong>Enter the Car model</strong></label>
   <input type = "text" name="model" id="model"> 
	<br><br>
	<% for(int i =0;i<4;i++){%>
	<label><strong>Enter the Tyre size</strong></label>
	<input type="text" name="tyre<%= +i%>" id="tyre"> <br>
	<%}%>
	<br><br>
	<% for(int i=0;i<4;i++){%>
	<label><strong>Enter the Door BrandName</strong></label>
	<input type = "text" name="door<%= +i%>" id="door"> <br>
	<%}%>
	<br><br>
	<label><strong>Enter the Steering colour</strong> <label>
	<input type="text" name="steering" id="steering">
	<br>
   <input style="color:violet" type="submit" value="Submit">
   </form>
</body>    
</html>