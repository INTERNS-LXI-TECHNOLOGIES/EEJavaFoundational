<%@page import="com.lxisoft.controller.*"%>
<%@page import="com.lxisoft.config.*"%>
<%@page import="com.lxisoft.domain.*"%>
<%@page import="com.lxisoft.model.*"%>
<%@page import="com.lxisoft.repository.*"%>
<%@page import="java.util.*"%>

<html>
<title>CONTACT APP</title>
<body>
	<!-- <%Locale.setDefault(new Locale("ml","IN"));
		ResourceBundle bundle = ResourceBundle.getBundle("text");
		String key=bundle.getString("contacts");
		out.println("key-"+key+"       Message in 222" + Locale.getDefault() + ": " + bundle.getString("contacts"));

	%> -->
	<%International inter=new International();%>

	<select onchange="javascript:handleSelect(this)">
		<option value="" selected="selected">lang</option>
		 <option value="ml">malayalam</option>
		 <option value="en">english</option>
	</select>
	<a href="?lang=en">lang</a>

	<script type="text/javascript">
	function handleSelect(elm){
		String key=inter.getLocale(elm.value,"IN");
		window.location ='?key='+key;
	}
	</script> 


 <!-- <select id="b3" name="sample" onchange="javascript:handleSelect(this)">
		<option value="" selected="selected">options</option>
		 <option value="sort?sortType=f">Firstname sort</option>
		 <option value="sort?sortType=l">Lastname sort</option>
		 <option value="<%=request.getContextPath()%>/jsp/Logout.jsp">logout</option>
	</select>

	<form action="search" style="text-align-last: center; padding:4px" method="get">
		<input type="text" name="searchName" placeholder="enter name to search">
		<button type="submit" >search</button>
	</form>
	 
	<script type="text/javascript">
	function handleSelect(elm){
		window.location = elm.value;
	}
	</script> -->

	<center>
		<a href="<%=request.getContextPath()%>/showAll" style="color: black"><img src="Apps-Contacts-icon.png" width="100" height="100"><h3><%=key%></h3></a>
	</center>
</body>
</html>