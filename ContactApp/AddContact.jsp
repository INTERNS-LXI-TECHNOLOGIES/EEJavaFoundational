<html>
<head>
<title>ADD CONTACT</title>
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
	    padding:px 22px;
	}
</style>
<body>
	<table align="center" border="5" width="25%" height="25%">
		<caption><h1><center>NEW CONTACT</center></h1></caption>
	
		<form action= "add" method="post">
			<tr>
				<td>Name&nbsp;&nbsp;:<input type="text" name="name"/></td>
			</tr>
			<tr>
				<td>Number:<input type="text" name="number"/></td>
			</tr>			
			<tr>
				<td><a href="add"><input type="submit" value="Save"/></a>
		</form>
				<a href="home"><input type="submit" value="Cancel"/></a></td>
			</tr>

</body>
</head>
</html>