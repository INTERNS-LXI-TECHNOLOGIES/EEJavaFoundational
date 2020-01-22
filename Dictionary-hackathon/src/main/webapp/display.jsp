<%@ page import="com.lxisoft.model.*"%>
<%@ page import="com.lxisoft.Domain.*"%>
<%@ page import="java.util.*"%>
<%@ page import="java.lang.*"%>
<html >
		<head>
			<title> Index page of Dictionary </title>
		</head>	
		<body style="background-color:#d9e6f2"> 
			<!-- <%  ArrayList<DictionaryModel> wordslist= (ArrayList<DictionaryModel>)session.getAttribute("wordlist"); %> -->
				<% W_Dictionary word=(W_Dictionary)(session.getAttribute("word1")); %>
			<h3 align="center">Dictionary</h3>
				</br>
					<center>
						<table align="center" border="10px" width="30%">
						<tr><th colspan="3"><strong>Reserved words</strong></th><th>meaning</th></tr>
						<!-- <% for(W_Dictionary word:wordslist)
						{ %> -->

						<tr>
						<td><%=word.getWord()%>
						</td>
						<td><%=word.getMeaning()%>
						</td>
						<!-- <% } %> -->
					</center>	
		</body>
</html>