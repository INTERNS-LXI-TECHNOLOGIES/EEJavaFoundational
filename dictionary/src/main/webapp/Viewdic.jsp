
<!DOCTYPE HTML>
<html>
<head>
<!-- Font Awesome -->
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css">
<!-- Bootstrap core CSS -->
<link href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
<!-- Material Design Bootstrap -->
<link href="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.10.1/css/mdb.min.css" rel="stylesheet">


</head>
  <body>
    <%@page import="com.lxisoft.dictionary.*"%>   
      <form method="post"  action="view">
          <td>: <input  type="text" class="form-control mb-4" placeholder="Search"  aria-label="Word"  name="word">
        </td></tr>        
        <input  type="submit" class="btn btn-info btn-block"  name="submit" value="MEANING"></td>


      <%ModelWords model=(ModelWords)request.getAttribute("model");
         if(model!=null)
          {
         %>
         <table class="table table-striped"> 
          <tr>
            <td><%=model.getMean()%></td> 
          </tr>
          <%}%>
        </table>
      </form>
    </body>
    </html>


    



























































