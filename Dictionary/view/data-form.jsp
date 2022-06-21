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
					class="nav-link">Words List</a></li>
			</ul>
		</nav>
	</header>
	<br>
	<div class="container col-md-5">
		<div class="card">
			<div class="card-body">
				<c:if test="${data != null}">
					<form action="update" method="post">
				</c:if>
				<c:if test="${data == null}">
					<form action="insert" method="post">
				</c:if>

				<caption>
					<h2>
						<c:if test="${data != null}">
            			Edit Word
            		</c:if>
						<c:if test="${data == null}">
            			Add New Word
            		</c:if>
					</h2>
				</caption>

				<c:if test="${data != null}">
					<input type="hidden" name="id" value="<c:out value='${data.id}' />" />
				</c:if>

				<fieldset class="form-group">
					<label>WORD</label> <input type="text"
						value="<c:out value='${data.word}' />" class="form-control"
						name="word" required="required">
				</fieldset>

				<fieldset class="form-group">
					<label>MEANING</label> <input type="text"
						value="<c:out value='${data.meaning}' />" class="form-control"
						name="meaning">
				</fieldset>
        
				<button type="submit" class="btn btn-success">Save</button>
				</form>
			</div>
		</div>
	</div>
</body>
</html>