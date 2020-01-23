<%@page import="java.util.*,com.lxisoft.contactapp.model.*"%>
 <%@age import="java.util.*"%> 
<html>
<title>CONTACTS </title>
<head>
<!-- Font Awesome -->
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css">
<!-- Bootstrap core CSS -->
<link href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
<!-- Material Design Bootstrap -->
<link href="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.10.1/css/mdb.min.css" rel="stylesheet">


</head>
<h1><center>CONTACT LIST</center></h1>
<body>
  

 <!--  <br><a href="Create.jsp" class="btn-floating btn-sm btn-secondary"><i class="fas fa-star"></i></a></br> -->
 <!-- <br><a href="Create.jsp" type="button" class="btn btn-cyan px-3" data-toggle="popover-hover" data-content="Create New"><i class="fas fa-pluse" aria-hidden="true"></i></a></br> -->



    <form method="post" name="frm" action="search">
      <!--   <h3>Search contact</h3></td></tr>
        <tr><td ><b> Name</b></td> -->
          <td>: <input  type="text" class="form-control mb-4" placeholder="Search"  aria-label="Search"  name="Name">
        </td></tr>        
        <input  type="submit" class="btn btn-info btn-block"  name="submit" value="Search"></td>


 <!-- <form method="post"  action="search">
  <br><div class="input-group md-form form-sm form-2 pl-0">
     <input class="form-control my-0 py-1 red-border" type="text" placeholder="Search"  aria-label="Search" name="Name">
        <div class="input-group-append">
             <span class="input-group-text red lighten-3" id="basic-text1"><i class="fas fa-search text-grey"
                   aria-hidden="true"></i></span>
  </div>
</div></br></form> -->
 




  <table class="table table-striped">
  <body class="navy-blue-skin">

    <tr>
      <th>ID</th>
      <th>NAME</th>
      <th>NUMBER</th>
      <th> </th>
      <th> </th>
    </tr>

       <br><p>
        <a href="Create.jsp" class="btn btn-info btn-lg">
          <span class="glyphicon glyphicon-plus"></span> Create 
        </a>
      </p></br>


<!--              <br><p>
        <a href="search.jsp" class="btn btn-info btn-lg">
          <span class="glyphicon glyphicon-plus"></span> Search 
        </a>
      </p></br> -->


    

<!--  <%Contact contact=new Contact();%> -->
        <%ArrayList<Contact> colist = (ArrayList<Contact>)session.getAttribute("data");%>
        <%if(colist!=null){%>
            <%for(Contact c:colist){%> 
 
                      <tr> 
                      <td><%=c.getId()%></td> 
                      <td><%=c.getName()%></td> 
                      <td><%=c.getNumber()%></td>

                        <% if(request.isUserInRole("admin")) {%>
                     <!--  <% session.setAttribute("contact",c);%> -->
                      <td><a type="button" class="btn btn-outline-info btn-rounded waves-effect" href="Edit?id=<%=c.getId()%>">edits</a></td> 
                      <td><a type="button" class="btn btn-outline-danger btn-rounded waves-effect" data-toggle="modal" data-target="#centralModalSuccess">Delete</a>
                        <!-- Central Modal Medium Success -->
<div class="modal fade" id="centralModalSuccess" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
  aria-hidden="true">
  <div class="modal-dialog modal-notify modal-success" role="document">
    <!--Content-->
    <div class="modal-content">
      <!--Header-->
      <div class="modal-header">
        <p class="heading lead">Delete</p>

        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true" class="white-text">&times;</span>
        </button>
      </div>

      <!--Body-->
      <div class="modal-body">
        <div class="text-center">
          <i class="fas fa-check fa-4x mb-3 animated rotateIn"></i>
          <p>Delete Contact
        </div>
      </div>

      <!--Footer-->
      <div class="modal-footer justify-content-center">
        <a type="button" class="btn btn-success" href="Delete?idd=<%=c.getId()%>">Delete <i class="far fa-gem ml-1 text-white"></i></a>
        <a type="button" class="btn btn-outline-success waves-effect" data-dismiss="modal">Cancel</a>
      </div>
    </div>
    <!--/.Content-->
  </div>
</div>
<!-- Central Modal Medium Success-->
                    
                    </td>
                         
                      </tr> 
                 <%}%> 
             <%}%>
          <%}%>
        </table> 
<!-- JQuery -->
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<!-- Bootstrap tooltips -->
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.4/umd/popper.min.js"></script>
<!-- Bootstrap core JavaScript -->
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.3.1/js/bootstrap.min.js"></script>
<!-- MDB core JavaScript -->
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.10.1/js/mdb.min.js"></script>
        
    </body> 
</html>


