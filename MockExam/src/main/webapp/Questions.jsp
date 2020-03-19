<%@page import = "com.lxisoft.config.*"%>
<%@page  contentType = "text/html;charset=UTF-8" pageEncoding = "UTF-8"%>
<%@page import="com.lxisoft.Model.MockExamModel"%>
<%@page import="java.util.ArrayList"%>
<html>
<head>
		<script type="text/javascript">

		function selectRadio() {
			document.getElementById('submitBtn').type = "submit";
		}

		function check() {
		var checkRadio = document.querySelector( 
                'input[name="option"]:checked'); 
                if(!checkRadio) {
            		alert("Please Select a Option");
            	}
		}
              
	</script>
</head>
<link rel="stylesheet" href="Style.css"></link>
<br>
<br>
<br>
<div align="center" style="background-color: darkmagenta;"><font size="9">!! MOCK EXAM !!</font>
<br>
<br>
</div>
<script>
<%
String clock = "10";
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
		window.location.href=data[0].slice(0,data[0].lastIndexOf('/'))+'/Option?ques='+qcount;
	}
}
//-->
</script>
<body>	
<!-- <div style = "text-align:right;"> -->
<form action="Result.jsp" name="forma">
<div align="right">
<h1 >Seconds Remaining : <span id="clocky"><%=clock%></span> </h1>
</div>
</form>
<script>
 timer();

</script>
</div>

<div class="questionBox" style ="border: outset;">
<% 
ArrayList<MockExamModel> model = (ArrayList<MockExamModel>)session.getAttribute("questions");
int qcount = Integer.parseInt(request.getParameter("ques"));
if(qcount < model.size()) 
{
	%>
	<div align="center" style="background-color: darkmagenta;" >
		<br>
	<%
	out.println("<h1>Question No : "+(qcount+1)+"</h1>");
	out.println("<h1 class=\"fontbig\">Question : "+model.get(qcount).getQuestion().getQuestion()+"</h1>");
	%>
	<br>
	</div>
	<form method="get" action="Option">
	<h1>
	<input onclick="selectRadio()" type ="radio" value="1" id = "Option1" name = "option"> 
	<label for = "Option1" > <%out.println(model.get(qcount).getOption1().getOption());%>  </label></input></h1>
	<h1><input onclick="selectRadio()" type ="radio" value="2" id = "Option2" name = "option"> 
	<label for = "Option2"> <%out.println(model.get(qcount).getOption2().getOption());%> </label></input></h1>
	<h1><input onclick="selectRadio()"  type ="radio" value="3" id = "Option3" name = "option"> 
	<label for = "Option3"> <%out.println(model.get(qcount).getOption3().getOption());%> </label></input></h1>
	<h1><input onclick="selectRadio()" type ="radio" value="4" id = "Option4" name = "option"> 
	<label for = "Option4"> <%out.println(model.get(qcount).getOption4().getOption());%> </label></input></h1>

	
	<%
	qcount++;
	%>
	<div align = "center">
		<input type="hidden" name="ques" value=<%out.println(qcount);%>/>
		<button onclick="check()" type="button" align = "center" id="submitBtn" class="button">NEXT</button>
		<button align = "center" class="button" type="submit" value=<%out.println(qcount);%>>SKIP</button>
	</div>
	</form>
<%} 
else 
{
	response.sendRedirect("Result");
}
%>
</div>
</body>
</html>