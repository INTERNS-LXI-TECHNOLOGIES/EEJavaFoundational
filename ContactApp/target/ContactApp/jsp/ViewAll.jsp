<%@page import="com.lxisoft.controller.*"%>
<%@page import="com.lxisoft.domain.*"%>
<%@page import="com.lxisoft.model.*"%>
<%@page import="com.lxisoft.repository.*"%>
<%@page import="java.util.*"%>

<html>
<title>CONTACTS</title>
<body style="background-color:#E6EC73;">
	<style>
		#b1 {
		  background-color: blue;
		  border-radius: 70%;
		  color: white;
		  padding: 30px;
		  font-size: large;
		 float: right;	
		  margin: 25px 75px;
		}
		#b2{
			background-color: red;
			font-size: larger;
		 float: right;	
		      margin: -2px 75px;
		}
		#b3{
			background-color: red;
			font-size: larger;
		 margin: -1px 75px;
		}
		img{
			vertical-align: middle;
		}
	</style>
	<div>
		<button id="b2" onclick="window.location.href='index.jsp'">close(X)</button>
	</div>

	<select id="b3" name="sample" onchange="javascript:handleSelect(this)">
		<option value="" selected="selected">options</option>
		 <option value="sort?sortType=f">Firstname sort</option>
		 <option value="sort?sortType=l">Lastname sort</option>
	</select>

	<form action="search" style="text-align-last: center; padding:4px" method="get">
		<input type="text" name="searchName" placeholder="enter name to search">
		<button type="submit" >search</button>
	</form>
	 
	<script type="text/javascript">
	function handleSelect(elm){
		window.location = elm.value;
	}
	</script>
	
<br>
<table style="border: 0.5px solid #F4714D; background-color: #C4F48A; width: 35%;" align="center" tabindex="center ">
		<tr><td><h1 style="text-align: center; color:initial;"><b>&emsp;&emsp;&emsp;&emsp;CONTACTS</b></h1></td></tr>
<%
ArrayList<Contact> contactList=(ArrayList<Contact>) request.getAttribute("list");
if(contactList.size()==0)
{
	%>
	<tr><td><h3>Sorry no contact present</h3> <td></tr>
	<%
}
int count=0;
for(Contact contact:contactList)
{
	count++;
	%>
	<tr>
	<td>
	<h2><a style="margin-left: 30px;" href="<%=request.getContextPath()%>/jsp/Select.jsp?selectId=<%=contact.getId()%>">
	<img src="WEB-INF/classes/images/person.jpg" width="50" height="50">  <%=contact.getFName()%>&nbsp;<%=contact.getLName()%></a>
	</h2>
	</td>
	<td>
	<button onclick="window.location.href='<%=request.getContextPath()%>/selectContact?selectId=<%=contact.getId()%>&type=e'">Edit</button>
	</td>
	<td>
	<button onclick="window.location.href='<%=request.getContextPath()%>/selectContact?selectId=<%=contact.getId()%>&type=d'">Delete</button>
	</td>
	</tr>
 	<%
}
%>
</table>

<form action="jsp/Save.jsp">
 <button id="b1">+</button>
</form>
<div align="center" style="padding-top: 90px">total contacts: <%=count%></div>

</body>
</html>