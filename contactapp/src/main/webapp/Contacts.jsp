<!DOCTYPE html> 
<html> 
  <head>  
  <title>Contacts</title> 
  </head> 
  <body> 
    <%@page import="java.util.*,com.lxisoft.contactapp.model.*"%>

    <div class="container-fluid">
  <!-- Content here -->
    </div>

        <br><a href="view">all</a></br>

       <form action="Create.jsp">
      <button>Create</button>
      </form>


       
       <form action="search.jsp">
        <button>Search</button>
      </form>


      <h1>All contacts</h1> 
      <table border ="1" width="500" align="center"> 
         <tr bgcolor="00cccc"> 
          <th><b> ID</b></th> 
          <th><b> Name</b></th> 
          <th><b> Number</b></th> 
         </tr> 
 
        <%Contact contact=new Contact();%>
        <%ArrayList<Contact> colist = (ArrayList<Contact>)session.getAttribute("data");%>
        <%if(colist!=null){%>
            <%for(Contact c:colist){%> 
 
                      <tr> 
                      <td><%=c.getId()%></td> 
                      <td><%=c.getName()%></td> 
                      <td><%=c.getNumber()%></td> 
                      </tr> 
                 <%}%> 
             <%}%>
        </table> 

        
    </body> 
</html> 