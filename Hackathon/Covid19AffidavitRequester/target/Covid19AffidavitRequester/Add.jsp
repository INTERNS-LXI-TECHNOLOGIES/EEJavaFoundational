<%@ page contentType="text/html;charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Add</title>
</head>
<body>
	<h1 align=center>Add Request</h1>
<table align="center">
	<form action="add" method="post">
	<tr>
		<td><br><input type="text" name="nameMVT" required="" placeholder=name><br>
		<br><input type="text" name="phnNoMVT" required="" placeholder=phnNo><br>
		<br><input type="text" name="addressMVT" required="" placeholder=address><br>
		<br><input type="text" name="vehicleNoMVT" required="" placeholder=vehicleNo><br>
		<br><input type="text" name="vehicleTypeMVT" required="" placeholder=vehicleType><br>
		<br><input type="text" name="startingLocationMVT" required="" placeholder=startingLocation><br>
		<br><input type="text" name="destinationMVT" required="" placeholder=destination><br>
		<br><input type="text" name="startingTimeMVT" required="" placeholder=startingTime><br>
		<br><input type="text" name="startingDateMVT" required="" placeholder=startingDate><br>
		<br><input type="text" name="endingTimeMVT" required="" placeholder=endingTime><br>
		<br><input type="text" name="endingDateMVT" required="" placeholder=endingDate><br>
		<br><input type="text" name="coPassengerNameMVT" required="" placeholder=coPassengerName><br>
		<br><input type="text" name="relationMVT" required="" placeholder=relation><br>
		<br><input type="text" name="reasonMVT" required="" placeholder=reason><br>
		<br><input type="submit" value="Submit"></form>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<a href="index.jsp"><input type="submit" value="Cancel"></a></td>
	</tr>
</table>
</body>
</html>