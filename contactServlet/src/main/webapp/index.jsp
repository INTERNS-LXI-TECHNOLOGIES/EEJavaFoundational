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
</head>
<body>



        <!-- Main navigation -->
        <header>
          <!--Navbar-->
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
                    <a class="nav-link" href="index.jsp">Home
                      <span class="sr-only">(current)</span>
                    </a>
                  </li>
                  <li class="nav-item">
                    <a onclick="window.location.href='create.jsp'" class="nav-link" href="#">Create</a>
                  </li>
                  <li class="nav-link">
                    <a class="nav-link" data-toggle="dropdown" href="Update.html">Update</a>
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
          <!-- Full Page Intro -->
          <div class="view" style="background-image: url('https://mdbootstrap.com/img/Photos/Others/architecture.jpg'); background-repeat: no-repeat; background-size: cover; background-position: center center;">
            <!-- Mask & flexbox options-->
            <div class="mask rgba-gradient align-items-center">
              <!-- Content -->
              <div class="container">
                <!--Grid row-->
                <div class="row">
                  <!--Grid column-->
                  <div class="col-md-6 white-text text-center text-md-left mt-xl-5 mb-5 wow fadeInLeft" data-wow-delay="0.3s">
                    <h1 class="h1-responsive font-weight-bold mt-sm-5">Phone Book </h1>
                    <hr class="hr-light">
                    <h6 class="mb-4">There's nothing that makes you so aware of the improvisation of human existence as a song unfinished. 
                      Or an old address book. so be Updated on this ... </h6>
                    <a class="btn btn-outline-white wow fadeInLeft"  onclick="window.location.href='View.jsp'" data-wow-delay="0.3s">View Contacts</a>
                        <mat-icon class="mat-18"></mat-icon>
                    </button ></a>
                    <a class="btn btn-outline-black">Learn more</a>
                  </div>
                  <!--Grid column-->
                  <!--Grid column-->
                  <div class="col-md-6 col-xl-5 mt-xl-5 wow fadeInRight" data-wow-delay="0.3s">
                    <img src="https://mdbootstrap.com/img/Mockups/Transparent/Small/admin-new.png" alt="" class="img-fluid">
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
                <p>AgZ- This  

                </p>
              </div>
              <!--Grid column-->
            </div>
            <!--Grid row-->
          </div>
        </main>
        <!--Main Layout-->
</body>
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
