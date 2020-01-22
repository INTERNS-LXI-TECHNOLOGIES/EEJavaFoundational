<%@ page import="com.lxisoft.model.*"%>
<%@ page import="com.lxisoft.Domain.*"%>
<%@ page import="java.util.*"%>
<html >
		<head>
			<title> Index page of Dictionary </title>
		</head>	
		<body style="background-color:#d9e6f2"> 
			<%  ArrayList<DictionaryModel> wordslist= (ArrayList<DictionaryModel>)session.getAttribute("wordlist"); %>
			<h3 align="center">Dictionary</h3>
				</br>
					<center>
							<% if (request.isUserInRole("admin"))  { %>
							<center> <button  type="button" onClick="window.location.href = 'Add.jsp';">Add</button></center>
							<% } %>
						</br></br>
						<table align="center" border="10px" width="30%">
						<tr><th colspan="3"><strong>Reserved words</strong></th></tr>
						<% for(DictionaryModel model:wordslist)
						{ %>

						<tr>
						<td><a href="select?user=<%=model.getWord()%>"><%=model.getWord()%></a>
						</td>
						<% } %>
					</center>	
		</body>
</html>