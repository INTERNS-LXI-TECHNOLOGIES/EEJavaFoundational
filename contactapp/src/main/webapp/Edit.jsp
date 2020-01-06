<%@ page import="java.util.*"%>
<!DOCTYPE html >
<html>
<body>
    <form action="Edit" method="post">
 		<% String a=(String)request.getAttribute("id");%>
 			<input type="hidden" name="id" value="<%=a%>"/><br/>
        New Name:<input type="text" name="Name"/><br/>
        New Number:<input type="text" name="Number"/><br/>
        </select> <br/>
        <input type="submit" value="save"/>
 
    </form>
</body>
</html> 

 
