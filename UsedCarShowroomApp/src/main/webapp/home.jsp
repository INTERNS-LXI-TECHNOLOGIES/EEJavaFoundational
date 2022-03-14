<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Used Car Showroom Application</title>
	</head>
	<body>
		<div align="center">
			<h1>Used Car Showroom Application</h1>
			<h2>
				<a href="home">Home</a>
				&nbsp;&nbsp;&nbsp;
				<a href="create">Add New Car</a>
			</h2>
		</div>
		<div align="center">
			<table border="1">
				<tr>
					<th>CAR ID</th>
					<th>MANUFACTURER</th>
					<th>MODEL</th>
					<th>VARIANT</th>
					<th>YEAR</th>
					<th>TOTAL KILOMETERS</th>
					<th>EXPECTED PRICE</th>
					<th>OTHER DETAILS</th>
					<th>ACTIONS</th>
				</tr>
				<c:forEach var="car" items="${carList}">
					<tr>
						<td>${car.carId}</td>
						<td>${car.manufacturer}</td>
						<td>${car.model}</td>
						<td>${car.variant}</td>
						<td>${car.year}</td>
						<td>${car.totalKilometers}</td>
						<td>${car.expectedPrice}</td>
						<td>${car.otherDetails}</td>
						<td>
							<a href="edit?carId=${car.carId}">Edit</a>
							&nbsp;&nbsp;&nbsp;&nbsp;
							<a href="delete?carId=${car.carId}">Delete</a>
						</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</body>
</html>