<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
				&nbsp;&nbsp;&nbsp;
				<a href="logout">Logout</a>
			</h2>
		</div>
		<div align="center">
			<c:if test="${car != null}">
				<form action="update" method="post">
	        </c:if>
	        <c:if test="${car == null}">
				<form action="insert" method="post">
	        </c:if>
		        <table border="1" cellpadding="5">
		            <caption>
		            	<h2>
		            		<c:if test="${car != null}">
		            			Edit Car
		            		</c:if>
		            		<c:if test="${car == null}">
		            			Add New Car
		            		</c:if>
		            	</h2>
		            </caption>
		        		<c:if test="${car != null}">
		        			<input type="hidden" name="carId" value="${car.carId}" />
		        		</c:if>            
		            <tr>
		                <th>Manufacturer: </th>
		                <td>
		                	<input type="text" name="manufacturer" value="${car.manufacturer}" />
		                </td>
		            </tr>
		            <tr>
		                <th>Model: </th>
		                <td>
		                	<input type="text" name="model" value="${car.model}" />
		                </td>
		            </tr>
		            <tr>
		                <th>Variant: </th>
		                <td>
		                	<input type="text" name="variant" value="${car.variant}" />
		                </td>
		            </tr>
		            <tr>
		                <th>Year: </th>
		                <td>
		                	<input type="text" name="year" value="${car.year}" />
		                </td>
		            </tr>
		            <tr>
		                <th>Total Kilometers: </th>
		                <td>
		                	<input type="text" name="totalKilometers" value="${car.totalKilometers}" />
		                </td>
		            </tr>
		            <tr>
		                <th>Expected Price: </th>
		                <td>
		                	<input type="text" name="expectedPrice" value="${car.expectedPrice}" />
		                </td>
		            </tr>
		            <tr>
		                <th>Other Details: </th>
		                <td>
		                	<input type="text" name="otherDetails" value="${car.otherDetails}" />
		                </td>
		            </tr>
		            <tr>
		            	<td colspan="2" align="center">
		            		<input type="submit" value="Save" />
		            	</td>
		            </tr>
		        </table>
	        </form>
	    </div>	
	</body>
</html>
