<html>
<head>
<title>ADD WORD</title>
<style>
	table,th,td{
		border: 1px solid black;
		border-collapse: collapse;
	}
	th,td{
		padding: 15px;
	}
	table{
		width: 25%%;
		background-color: #f1f1c1;
	}
	input[type="submit"]
	{
		background-color: #4CAF50;
	 	border :none;
	    color: white;
	}
</style>
<body>
	<table align="center" border="5" width="25%" height="25%">
		<caption><h1><center>NEW WORD</center></h1></caption>

		<form action= "add" method="post">
			<tr>
				<td>Word&nbsp;&nbsp;:<input type="text" name="word"/></td>
			</tr>
			<tr>
				<td>Meaning:<input type="text" name="meaning"/></td>
			</tr>			
			<tr>
				<td><a href="add"><input type="submit" value="Save"/></a>
		</form>
				<button onclick="window.history.back()">Cancel</button>
			</tr>

</body>
</head>
</html>