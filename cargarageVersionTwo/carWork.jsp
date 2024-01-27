<html>
<head>
<title>CarDetails</title>

</head> 
<body>
    <form action="carPart.jsp" method="post">
	
   <label>Enter the Car name</label>
   <input type = "text" name="name" id="name">
   <label>Enter the Car model</label>
   <input type = "text" name="model" id="model"> 
	<br><br>
	<% for(int i =0;i<4;i++){%>
	<label>Enter the Tyre size</label>
	<input type="text" name="tyre<%= +i%>" id="tyre"> <br>
	<%}%>
	<br><br>
	<% for(int i=0;i<4;i++){%>
	<label>Enter the Door BrandName</label>
	<input type = "text" name="door<%= +i%>" id="door"> <br>
	<%}%>
	<br><br>
	<label>Enter the Steering colour <label>
	<input type="text" name="steering" id="steering">
	<br>
   <input type="submit" value="Submit">
   </form>
</body>    
</html>