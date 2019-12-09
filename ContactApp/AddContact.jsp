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
		</form>
		<tr>
				<td><a href="add"><input type="submit" name="submit" value="Save" /></a>
					<a href="url"><input type="submit" name="cancel" value="Cancel"></a></td>
			</tr>
</body>
</head>
</html>