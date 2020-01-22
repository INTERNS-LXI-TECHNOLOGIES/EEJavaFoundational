
<html >
		<head>
			<title> Index page of Dictionary </title>
		</head>	
		<body style="background-color:#d9e6f2"> 
			<%  ArrayList<DictionaryModel> wordslist= (DictionaryModel)session.getAttribute("wordlist") %>
			<h3 align="center">Dictionary</h3>
				</br>
					<center>
						<table align="center" border="10px" width="30%">
						<tr><th colspan="3"><strong>Reserved words</strong></th></tr>
						<% for(DictionaryModel model:wordlist)
						{ %>

						<tr>
						<td><a href="select?user=<%=model.getWord()%>"><%=model.getWord()%></a>
						</td>
					</center>	
		</body>
</html>