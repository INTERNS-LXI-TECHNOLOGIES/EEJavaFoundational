<!DOCTYPE html>
<!-- saved from url=(0039)http://localhost:8080/mockexam/add.html -->
<html><head><meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
	<title>REQUEST</title>
	<style type="text/css">
		.container
		{
			text-align:center;
			width: 100%;
			height: 100%;
			margin: 0 auto;
			padding-top: 0px;
			background:#009b77;
		}
		html,body
		{
			width: 100%;
			height: 150%;
		}
		input
		{
			border-radius: 8px;
			border-spacing: 20px;
			width: 250px;
			height: 26px;
		}
		textarea
		{
			width: 300px;
			height: 50px;
		}
		button
		{
			width: 60px;
			height: 35px;
			border-radius: 10px;
		}
	</style>
</head>
<body>
	<div class="container">
		<form action="../addData" method="GET">
		<h2>AFFIDAVIT</h2>	
		Name &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  <input type="text" name="name" required="required"><br><br>
		phno  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="phno"  required="required"><br><br>
		Adress&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  <input type="text" name="adr"  required="required"><br><br>
		VehicleNo&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  <input type="text" name="vno"  required="required"><br><br>
		VehicleType&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  <input type="text" name="vtype"  required="required"><br><br>
		StartLocation&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="startLoc" required="required"><br><br>
		EndLocation &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="endLoc"  required="required"><br><br>
		StartDate&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  <input type="text" name="startDate"  required="required"><br><br>
		StartTime&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  <input type="text" name="startTime"  required="required"><br><br>
		EndTime&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  <input type="text" name="endTime"  required="required"><br><br>
		EndDate&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  <input type="text" name="endDtae"  required="required"><br><br>
		CopassengerName&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  <input type="text" name="coName"  required="required"><br><br>
		Relation&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  <input type="text" name="relation"  required="required"><br><br>
		Reason&nbsp;&nbsp;&nbsp;&nbsp;<textarea name="reason" required="required"></textarea><br><br>
		<button value="addbtn">ADD</button>             
		</form>
		 <button type="reset" value="regbtn">RESET</button>	
		 <a href="http://localhost:8080/mockexam/admin/admin.jsp"><button value="homebtn">Home</button></a>
		<br>
	</div>

</body></html>
