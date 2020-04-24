<%@ page contentType="text/html;charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Add</title>
</head>
<body>
	<h1>Add Request</h1>
<table align="center">
	<form action="add" method="post">
	<tr>
		<td><br><input type="text" name="name" required="" placeholder=name><br>
		<br><input type="text" name="phnNo" required="" placeholder=phnNo><br>
		<br><input type="text" name="address" required="" placeholder=address><br>
		<br><input type="text" name="vehicleNO" required="" placeholder=vehicleNO><br>
		<br><input type="text" name="vehicleType" required="" placeholder=vehicleType><br>
		<br><input type="text" name="startingLocation" required="" placeholder=startingLocation><br>
		<br><input type="text" name="destination" required="" placeholder=destination><br>
		<br><input type="text" name="startingTime" required="" placeholder=startingTime><br>
		<br><input type="text" name="startingDate" required="" placeholder=startingDate><br>
		<br><input type="text" name="endingTime" required="" placeholder=endingTime><br>
		<br><input type="text" name="endingDate" required="" placeholder=endingDate><br>
		<br><input type="text" name="coPassengerName" required="" placeholder=coPassengerName><br>
		<br><input type="text" name="relation" required="" placeholder=relation><br>
		<br><input type="text" name="reason" required="" placeholder=reason><br>
		<br><input type="submit" value="Submit"></form>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<a href="index.jsp"><input type="submit" value="Cancel"></a></td>
	</tr>
</table>
</body>
</html>