<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Used Car Showroom Application</title>
		<style>
		     .links, .links a {color: #979da3; text-decoration: none;}
		</style>
	</head>
	<body style="margin:0;background: #e6f0e9;">
		<div
			style="background: #0a3939; color: white; text-align: center; padding: 9px; text-transform: uppercase;">
			<h1>Used Car Showroom Application</h1>
			<h2 class="links">
				<a href="home">Home</a>
				&nbsp;&nbsp;|&nbsp;&nbsp;
				<a href="create">Add New Car</a>
				&nbsp;&nbsp;|&nbsp;&nbsp;
				<a href="logout">Logout</a>
			</h2>
		</div>
		<div style="padding: 40px;">
			<table cellspacing="0" border="1" cellpadding="5" style="text-transform: uppercase; width: 100%; text-align: center;">
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