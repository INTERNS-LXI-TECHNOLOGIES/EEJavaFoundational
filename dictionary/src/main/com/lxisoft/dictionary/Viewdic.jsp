
<!DOCTYPE HTML>
 

<html>
<%@page import="java.util.*,com.lxisoft.dictionary.*"%> 

<head>
<!-- Font Awesome -->
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css">
<!-- Bootstrap core CSS -->
<link href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
<!-- Material Design Bootstrap -->
<link href="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.10.1/css/mdb.min.css" rel="stylesheet">


</head>

<h1><center>DICTIONARY APP</center></h1>
  <body>

      <form method="post"  action="search">
      <!--   <h3>Search contact</h3></td></tr>
        <tr><td ><b> Name</b></td> -->
          <td>: <input  type="text" class="form-control mb-4" placeholder="Search"  aria-label="Search"  name="word">
        </td></tr>        
        <input  type="submit" class="btn btn-info btn-block"  name="submit" value="MEANING"></td>


      <%Contact c=(Contact)request.getAttribute("con");
         if(c!=null)
          {
         %>































































 
          {
         %>

         <table class="table table-striped"> 
          <tr>
          <th><b> ID</b></th> 
          <th><b> Name</b></th> 
          <th><b> Number</b></th> 
         </tr> 

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

                    
                  <!--   </td>
                         
                      </tr>
        <a href="view" class="btn btn-info btn-lg">
          <span class="glyphicon glyphicon-plus"></span> Back 
                      </table> -->
 <%}%>
<!--  <% else{%>
 <p class="text-primary">Contact Not Found</p>
  <br><a href="view" class="btn btn-info btn-lg">
     <span class="glyphicon glyphicon-plus"></span> Back 
              </table></br> 
      
    </form>-->
  </body>
</html>