<%@page import="com.rahul.model.*"%>
<%@page import="com.rahul.repository.*"%>
<%@page import="com.rahul.servlet.*"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
	<title>Admin Menu</title>
	<link rel="stylesheet" type="text/css" href="../page.css">
	<style type="text/css">
		
		html,body{
			padding: 5px;margin: 10px;
			background:#009b77;
		}

		.button1{
			background-color: #008cba;
			color: white;
			padding: 15px 30px;
			text-align: center;
			text-decoration: none;
			display: inline-block;
			font-size: 15px;
			border-radius: 10px;
		}
		#logout
		{
			float: right;
			position: relative;
			top: -50px;	
			left: 50px;
		}
		#exam
		{
			float: right;
			position: relative;
			top: -50px;	
			left: -210px;
		}
		table
		{
    		align-content: center;
   			margin: inherit;
    		width: 100%;
		}
		
	</style>
</head>
<body>
	<!-- <div id="addQuestion">
		<a href="../add.html"><button class="button1">Add Question</button></a>
	</div> -->
	<!-- <div id="exam">
		<a href="../secured/introduction.jsp"><button class="button4" style="height: 50px;background-color: #008cba; width: 100px; color: white;border-radius: 10px;">
			Test Exam
		</button></a>
	</div> -->
	<!-- <div id="logout">
		<a href="../logout.jsp"><button class="button3" style="height: 50px;background-color: #008cba; width: 100px; color: white;border-radius: 10px;">
			Logout
		</button></a>
	</div>	 -->
	<div id="view">
		<table id="pager" border="2" width="100%">
		<tr>
			<th>Sl.No</th>
			<th>Name</th>
			<th>Address</th>
			<th>phno</th>
			<th>Co-passenger</th>
			<th>Relation</th>
			<th>Reason</th>
			<th>Source</th>
			<th>Destination</th>
			<th>startDate</th>
			<th>returnDate</th>
			<th>startTime</th>
			<th>returnTime</th>
			<th>vehicleType</th>
			<th>vehicleRegNo</th>
		</tr>
		<%
		Database db = new Database();
		ArrayList<Model> requestList = new ArrayList<Model>();
		requestList = db.getAffidavitData(requestList);
		if(requestList.size() == 0)
		{%>
			<script type="text/javascript">
				window.alert("No Records To Display");
			</script>	
		<%}
		else{
		%>
		<%
			for (int i=0;i<requestList.size();i++) 
			{%>
		<tr>
			<td><%out.println(i+1);%></td>				
			<td><%out.println(requestList.get(i).getIdRmp());%></td>
			<td><%out.println(requestList.get(i).getNameRmp());%></td>
			<td><%out.println(requestList.get(i).getAddressRmp());%></td>
			<td><%out.println(requestList.get(i).getPhnoRmp());%></td>
			<td><%out.println(requestList.get(i).getCopassengerRmp());%></td>
			<td><%out.println(requestList.get(i).getRelationRmp());%></td> 
			<td><%out.println(requestList.get(i).getReasonRmp());%></td>
			<td><%out.println(requestList.get(i).getStartLocRmp());%></td>
			<td><%out.println(requestList.get(i).getEndLocRmp());%></td>
			<td><%out.println(requestList.get(i).getStartDateRmp());%></td>
			<td><%out.println(requestList.get(i).getEndDateRmp());%></td>
			<td><%out.println(requestList.get(i).getStartTimeRmp());%></td>
			<td><%out.println(requestList.get(i).getEndTimeRmp());%></td> 
			<td><%out.println(requestList.get(i).getVehivleTypeRmp());%></td>
			<td><%out.println(requestList.get(i).getVehicleNoRmp());%></td>


			<td><a href=""><button style="background-color: #008cba;color: white; border-radius: 10px;">Approve</button></a></td>
			<td><a href=""><button style="background-color: #008cba;color: white;
			border-radius: 10px;">Reject</button></td>	
		</tr>
		 <%}
		}%>
	</table>
	</div>
</body>
</html>