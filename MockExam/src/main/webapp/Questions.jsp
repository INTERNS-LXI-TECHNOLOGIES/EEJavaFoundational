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
<link rel="stylesheet" href="option.css"></link>
<div align="center"><font size="9">!! MOCK EXAM !!</font></div>
<body>

<div style="background-color: mediumseagreen ">
<% 
ArrayList<MockExamModel> model = (ArrayList<MockExamModel>)session.getAttribute("questions");
int qcount = Integer.parseInt(request.getParameter("ques"));
if(qcount != model.size()) 
{
	out.println("<p><h1>Question No : "+(qcount+1)+"</h1></p>");
	out.println("<p><h2 class=\"fontbig\">Question : "+model.get(qcount).getQuestion().getQuestion()+"</h2></p>");
	%>
	</div>
	<div>
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

	</div>
	<%
	qcount++;
	%>
	<hr size = "5" >
		<input type="hidden" name="ques" value=<%out.println(qcount);%>/>
	<div align = "center">
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
</body>
</html>