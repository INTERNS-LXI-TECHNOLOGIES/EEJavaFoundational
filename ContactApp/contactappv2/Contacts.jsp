<!-- <html>
<head>
</head>
<body>
	<a href="view">click</a>
	<% out.println(request.getAttribute("data"));%>
</body>
</html> -->
<!DOCTYPE html> 
<html> 
  <head>  
  <title>Contacts</title> 
  </head> 
  <body> 
  	<%@page import="java.util.*,com.lxisoft.contactapp.model.*"%>

  		<a href="view">click</a>
      <h1>All contacts</h1> 
      <table border ="1" width="500" align="center"> 
         <tr bgcolor="00FF7F"> 
          <th><b> ID</b></th> 
          <th><b> Name</b></th> 
          <th><b> Number</b></th> 
         </tr> 
 
        <%Contact contact=new Contact();%>
        <%ArrayList<Contact> colist = (ArrayList<Contact>)request.getAttribute("data");%>
        <%for(Contact c:colist){%> 
 
            <tr> 
                <td><%=c.getId()%></td> 
                <td><%=c.getName()%></td> 
                <td><%=c.getNumber()%></td> 
            </tr> 
            <%}%> 
        </table>  
        <hr/> 
    </body> 
</html> 