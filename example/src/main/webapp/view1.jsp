<%@ page import="com.lxisoft.model.Model"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.*"%>
<%@ page import="java.io.*"%>

<!DOCTYPE html>
<html>
<head>

	<meta http-equiv="Content_Type" content="text/html;charset=UTF-8"/>
		<script type="text/javascript">
		function selectRadio() 
		{
			document.getElementById('submitBtn').type = "submit";
		}
		function check()
		{
			var checkRadio = document.querySelector('input[name="option"]:checked'); 
            if(!checkRadio) 
            {
         		alert("Please Select a Option");
        	}
		}
       
	</script>
<% Integer i=(Integer)session.getAttribute("num"); %>
<script>

		<%
			String clock = "20";
		%>
	var timeout = <%=clock%>;

function timer()
{

	if( --timeout > 0 )
	{
		document.getElementById('clocky').innerHTML = timeout;
		window.setTimeout( "timer()", 1000 );
	}
	else
	{
		var data = window.location.href.split('=');
		var qcount = parseInt(data[1]) +1;
		window.location.href=data[0].slice(0,data[0].lastIndexOf('/'))+'/go?num='+qcount;
	}
}
</script>
<body  background="image/earth.jpg">	

	<form action="result.jsp" name="num">
		<div align="right">
				<h1><font color="#C0C0C0">Seconds Remaining : <span id="clocky"><%=clock%></font></span> </h1>
		</div>
	</form>
		<script>
	 		timer();
		</script>
</div>
</script>
</head>

	<% ArrayList<Model> model =new ArrayList<Model>();
	
		model=(ArrayList<Model>)session.getAttribute("array");
		
		if(i<=model.size())
		
	{%>
	<form method="get" action="go">
	<h1><font color="#87CEFA"><%=(model.get(i).getQuestion())%></font></h1>
	<h3><input  onclick="selectRadio()" type="radio" name="option" value="<%=(model.get(i).getAnswer())%>"><font color="#87CEFA"><%=(model.get(i).getAnswer())%></font></h3>
	<h3><input  onclick="selectRadio()" type="radio" name="option" value="<%=(model.get(i).getOption1())%>"><font color="#87CEFA"><%=(model.get(i).getOption1())%></font></h3>
	<h3><input  onclick="selectRadio()" type="radio" name="option" value="<%=(model.get(i).getOption2())%>"><font color="#87CEFA"><%=(model.get(i).getOption2())%></font></h3>
	<h3><input  onclick="selectRadio()" type="radio" name="option" value="<%=(model.get(i).getOption3())%>"><font color="#87CEFA"><%=(model.get(i).getOption3())%></font></h3>

	<input type="hidden" name="num" value=<%out.println(i);%>/>
	<button onclick="check()" type="button" align = "center" id="submitBtn" class="button" value="next">NEXT</button>
	</form>
	<%}%>
</body>
</html>