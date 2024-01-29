<html>
<head>
<title>cardetails</title>
<style>
body{
	align-items: center;
    text-align: center;
    background-color: chocolate;
}
#submit{
	text-align:center;
    background-color: blueviolet;
}
</style>
</head>
<body>
<form action="cardetails.jsp" method="post">
	<h4> Enter car Details </h4>
<label> Enter the car name </label>
<input type="text" name="carName"><br> <br>
<label> Enter the Colour </label>
<input type="text" name="carColor"><br> <br>
<h4> Enter Door Details </h4>
<% for(int i =0; i<4;i++)
{%>
	<label> Enter the Door Colour </label>
	<input type="text" name="color<%=i %>"> <br> <br>
    <%
}
%>
<h4> Enter Tyre Details </h4>
<% for(int i=0; i<4; i++) { %>
    <label>    Enter the Tyre<%=(i+1)%> Brand </label>
    <input type="text" name="brand<%= i %>"><br> <br>
    <label> Enter the Tyre<%=(i+1)%> Size </label>
    <input type="text" name="size<%= i %>"><br> <br>
<% } %>
<h4> Enter Steering Details</h4>
<label>Enter Steering Colour</label>
<input type="text" name="steer">
<br> <br>
<input type="submit" id="submit" value="Continue">
</form>
</body>
</html>