<%@ page import = "com.lxisoft.Contact.model.ContactModel" %>
<%@ page import = "com.lxisoft.Contact.repositoryImpl.*" %>
<%@ page import ="com.lxisoft.Contact.servlet.*" %>
<%@ page import = "java.util.*" %>
<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@ page errorPage="Error.jsp" %>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta http-equiv="x-ua-compatible" content="ie=edge">
  <title>Material Design Bootstrap</title>
  <!-- Font Awesome -->
  <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css">
  <!-- Bootstrap core CSS -->
  <link href="css/bootstrap.min.css" rel="stylesheet">
  <!-- Material Design Bootstrap -->
  <link href="css/mdb.min.css" rel="stylesheet">
  <!-- Your custom styles (optional) -->
  <link href="css/style.css" rel="stylesheet">
  <link href="css/home.css" rel="stylesheet">
  <link href="css/create.css" rel="stylesheet">
</head>
<body>



        <header>
            <!-- Navbar -->
            <nav class="navbar navbar-expand-lg navbar-dark fixed-top scrolling-navbar">
              <div class="container">
                <a class="navbar-brand" href="#">
                  <strong>AGZ</strong>
                </a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent-7" aria-controls="navbarSupportedContent-7" aria-expanded="false" aria-label="Toggle navigation">
                  <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent-7">
                  <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                      <a onclick="window.location.href='index.jsp'" class="nav-link" href="#">Home
                        <span class="sr-only">(current)</span>
                      </a>
                    </li>
                    <li class="nav-item">
                        <a onclick="window.location.href='create.jsp'" class="nav-link" href="#">Create</a>
                      </li>
                      <li class="nav-item">
                        <a class="nav-link" data-toggle="dropdown" href="Update.jsp">Update</a>
                        <div class="dropdown-menu">
                          <a onclick="window.locaton.href='upFirstName.jsp'" class="dropdown-item" href="upFirstName.jsp">Update First_Name</a>
                          <a onclick="window.locaton.href='upLastName.jsp'" class="dropdown-item" href="upLastName.jsp">Update Last_Name</a>
                          <a onclick="window.locaton.href='upPhoneN.jsp'" class="dropdown-item" href="upPhoneN.jsp">Update Phone_Number</a>
                          <a onclick="window.locaton.href='upMobN.jsp'" class="dropdown-item" href="upMobN.jsp">Update Mobile_Number</a>
                          <a onclick="window.locaton.href='upEmailId.jsp'" class="dropdown-item" href="upEmailId.jsp">Update Email_ID</a>
                        </div>
                      </li>
                      <li class="nav-item">
                        <a onclick="window.location.href='Delete.jsp'" class="nav-link" href="#">Delete</a>
                      </li>
                  </ul>
                  <form  action="logout" method="POST" class="form-inline">
                    <div class="md-form my-0">
                      <p>
                        <a href="Login.jsp" class="btn btn btn-lg">
                          <span class="glyphicon glyphicon-log-out"></span> Log out
                        </a>
                      </p> 
                    </div>
                  </form>
                </div>
              </div>
            </nav>
            <!-- Navbar -->
            <!-- Full Page Intro -->
            <div class="view" style="background-image: url('https://mdbootstrap.com/img/Photos/Others/images/91.jpg'); background-repeat: no-repeat; background-size: cover; background-position: center center;">
              <!-- Mask & flexbox options-->
              <div class="mask rgba-gradient align-items-center">
                <!-- Content -->
                <div class="container">
                        top: 30px;
                         position: relative
                  <!--Grid row-->
                  <div class="row mt-5">
                    <!--Grid column-->
                    <div class="col-md-6 mb-5 mt-md-0 mt-5 white-text text-center text-md-left">
                      <h1 class="h1-responsive font-weight-bold wow fadeInLeft" data-wow-delay="0.3s">Update First Name </h1>
                      <hr class="hr-light wow fadeInLeft" data-wow-delay="0.3s">
                      <h6 class="mb-3 wow fadeInLeft" data-wow-delay="0.3s">text.....</h6>
                      <a class="btn btn-outline-white wow fadeInLeft"  onclick="window.location.href='View.jsp'" data-wow-delay="0.3s">View Contacts</a>
                        
                    </div>
                    <!--Grid column-->
                    <!--Grid column-->
                    <div class="col-md-6 col-xl-5 mb-4">
                      <!--Form-->
                      <form name="" action="update" method="post">
                      <div class="card wow fadeInRight" data-wow-delay="0.3s">
                        <div class="card-body">
                          <!--Header-->
                          <div class="text-center">
                            <h3 class="white-text">
                              <i class="fas fa-user white-text"></i> Register:</h3>
                            <hr class="hr-light">
                          </div>
                          <!--Body-->
                          <div class="md-form">
                            <i class="fas fa-user prefix white-text active"></i>
                            <input type="text" id="form3" class="white-text form-control" name="First Name">
                            <label for="form3" class="active">Your First Name</label>
                          </div>
                          <div class="md-form">
                                <i class="fas fa-user prefix white-text active"></i>
                                <input type="text" id="form3" class="white-text form-control" name="Updated Name">
                                <label for="form3" class="active">Enter Updated Name</label>
                              </div>
                              
                          
        
                          <div class="text-center mt-4">
                            <button class="btn btn-indigo" type="submit" value="submit">Update</button>
                            <hr class="hr-light mb-3 mt-4">
                            <div class="inline-ul text-center">
                              <a class="p-2 m-2 tw-ic">
                                <i class="fab fa-twitter white-text"></i>
                              </a>
                              <a class="p-2 m-2 li-ic">
                                <i class="fab fa-linkedin-in white-text"> </i>
                              </a>
                              <a class="p-2 m-2 ins-ic">
                                <i class="fas fa-instagram white-text"> </i>
                              </a>
                            </div>
                          </div>
                        </form>
                        </div>
                      </div>
                      <!--/.Form-->
                    </div>
                    <!--Grid column-->
                  </div>
                  <!--Grid row-->
                </div>
                <!-- Content -->
              </div>
              <!-- Mask & flexbox options-->
            </div>
            <!-- Full Page Intro -->
          </header>
          <!-- Main navigation -->
          <!--Main Layout-->
          <main>
            <div class="container">
              <!--Grid row-->
              <div class="row py-5">
                <!--Grid column-->
                <div class="col-md-12 text-center">
                  <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
                </div>
                <!--Grid column-->
              </div>
              <!--Grid row-->
            </div>
          </main>
          <!--Main Layout-->
  

          <!-- SCRIPTS -->
  <!-- JQuery -->
  <script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>
  <!-- Bootstrap tooltips -->
  <script type="text/javascript" src="js/popper.min.js"></script>
  <!-- Bootstrap core JavaScript -->
  <script type="text/javascript" src="js/bootstrap.min.js"></script>
  <!-- MDB core JavaScript -->
  <script type="text/javascript" src="js/mdb.min.js"></script>
</body>

</html>
