<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Dictionary Application</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body>

	<header>
		<nav class="navbar navbar-expand-md navbar-dark"
			style="background-color: blue">
			<div>

				<a href="https://www.javaguides.net" class="navbar-brand"> Dictionary App </a>
			</div>
			<ul class="navbar-nav">
				<li><a href="<%=request.getContextPath()%>/list"
					class="nav-link">Words</a></li>
			</ul>

			<ul class="navbar-nav">
				<div class="container text-left">
				<li><a href="logout"
				class="nav-link" onclick="return confirm('Are you sure you want to Log Out?')">Log Out</a></li>

			</ul>
		</div>
		</nav>

	</header>
	<br>

	<div class="row">

		<div class="container">
			<h3 class="text-center">List of Words</h3>

			<div class="container" >
				<div align="center">
				<form>
				<h5><input type="search" placeholder="Search Word">
				<button type="submit">Search</button></h5>

			  </form>
			  <form class="nosubmit">
			  </form>
			  </div>


			<div class="container text-left">

				<a href="<%=request.getContextPath()%>/new" class="btn btn-success">Add
					New Word</a>
			</div>
			<br>
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>ID</th>
						<th>Word</th>
						<th>Meaning</th>
						<% if (request.isUserInRole("admin")) { %>
						<th>Actions</th>
						<% } %>
					</tr>
				</thead>
				<tbody>

					<c:forEach var="data" items="${listData}" varStatus="status">
						<tr>
							<td><c:out value="${status.index + 1}" /></td>
							<td><c:out value="${data.word}" /></td>
							<td><c:out value="${data.meaning}" /></td>
							<% if (request.isUserInRole("admin")) { %>
							<td><a href="edit?id=<c:out value='${data.id}' />">Edit</a>
								&nbsp;&nbsp;&nbsp;&nbsp; <a
								href="delete?id=<c:out value='${data.id}' />" onclick="return confirm('Are you sure you want to delete?')">Delete</a></td>
								<% } %>
						</tr>
					</c:forEach>

				</tbody>

			</table>
		</div>
	</div>
</body>
</html>