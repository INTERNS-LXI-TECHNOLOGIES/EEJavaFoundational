<%@page import="java.util.*,com.lxisoft.contactapp.model.*"%>

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
  <a href="Create.jsp" class="btn-floating btn-sm btn-secondary"><i class="fas fa-star"></i></a>
  <table class="table table-striped">
<!--   <table align="center" border= "5" width="30%" border color= "yellow" bgcolor="blue"> -->
    <tr>
      <th>ID</th>
      <th>NAME</th>
      <th>NUMBER</th>
      <th> </th>
      <th> </th>
    </tr>


<!-- <style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}
td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}
tr:nth-child(even) {
  background-color: #dddddd;
}
</style> -->
<!-- <button type="button" href="view" class="btn btn-primary btn-rounded">Primary</button>
 --><br><a href="view">all</a></br>
<!-- <a href="Create.jsp"><h1><center>ADD<center></h1></a> -->


       <!--  <%Contact contact=new Contact();%> -->
        <%ArrayList<Contact> colist = (ArrayList<Contact>)session.getAttribute("data");%>
        <%if(colist!=null){%>
            <%for(Contact c:colist){%> 
 
                      <tr> 
                      <td><%=c.getId()%></td> 
                      <td><%=c.getName()%></td> 
                      <td><%=c.getNumber()%></td>
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


