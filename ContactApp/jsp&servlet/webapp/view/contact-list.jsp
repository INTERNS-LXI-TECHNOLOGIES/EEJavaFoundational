<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
        <html>

        <head>
            <title>Contact Application</title>
            <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        </head>

        <body>

            <header>
                <nav class="navbar navbar-expand-md navbar-dark" style="background-color: tomato">
                    <div>
                        <a href=" " class="navbar-brand"> Contact App </a>
                    </div>


                    <ul class="navbar-nav">
                        <li><a href="<%=request.getContextPath()%>/list" class="nav-link">Contacts</a></li>
                    </ul>
                  
                </nav>
                 
            </header>
            <br>

            <div class="row">

                <!-- <div class="alert alert-success" *ngIf='message'>{{message}}</div> -->


                <div class="container">

                    <h3 class="text-center">List of Contacts</h3>

                    <hr>


                    <div class="container text-right">

                        <a href="contact-form.jsp" class="btn btn-success">Add New User</a>    &nbsp;&nbsp;|&nbsp;&nbsp;
                <a href="logout">Logout</a>
                        
                    </div>

                    <br>
                    <table class="table table-bordered">
                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>First Name</th>
                                <th>Last Name</th>
                                <th>Phone Number</th>
                                <th>Email</th>
                                
                                <th>Actions</th>
                            </tr>
                        </thead>
                        <tbody>
                            <!--   for (Todo todo: todos) {  -->
                            <c:forEach var="user" items="${listUser}">

                                <tr>
                                    <td>
                                        <c:out value="${user.id}" />
                                    </td>
                                    <td>
                                        <c:out value="${user.firstName}" />
                                    </td>
                                    <td>
                                        <c:out value="${user.lastName}" />
                                    </td>
                                    <td>
                                        <c:out value="${user.phNumber}" />
                                    </td>
                                                                        <td>
                                        <c:out value="${user.email}" />
                                    </td>
                                    <td><a href="edit?id=<c:out value='${user.id}' />">Edit</a> &nbsp;&nbsp;&nbsp;&nbsp; <a href="delete?id=<c:out value='${user.id}' />" onclick="return confirm('Are you sure you want to delete?')">Delete</a></td>
                                </tr>
                            </c:forEach>
                            <!-- } -->
                        </tbody>

                    </table>
                </div>
            </div>
        </body>

        </html>