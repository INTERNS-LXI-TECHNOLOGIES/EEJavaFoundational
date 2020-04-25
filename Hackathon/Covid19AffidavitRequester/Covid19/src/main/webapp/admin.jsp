<%@page import="com.ashik.servlet.*"%>
<%@page import="com.ashik.model.*"%>
<%@page import="com.ashik.repository.*"%>
<%@page import="java.util.*"%>
<html>
	
	<head>
		<title>Add New Request</title>
		<style>
		body{
		 background-color: lightblue;	
		 margin-top:250px;
		 text-align:center;
		}

		h1 {
  			color: black;
  			text-align: center;
  			font-family: verdana;
			}
	.button {
  background-color: #4CAF50;
  border: none;
  color: white;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;

  .button:hover {  background-color: black;}
}	
	</style>
	</head>
	<body>
<h1>Request List</h1>
	

		
		<form  method="GET" action="aproverequest" >

	<% UserDatabase db = new UserDatabase();
    ArrayList<User> requestList = new ArrayList<User>();
    requestList = db.viewDatabaseAFS(requestList);
    	for (int i=0;i<requestList.size();i++)  {%>
		 <table border="1" width="100%">
		<h3>Request ID :  <%out.println(requestList.get(i).getIdAFS());%></h3>	
		<h3>Name : <%out.println(requestList.get(i).getNameAFS());%></h3>
		<h3>Phone Number : <%out.println(requestList.get(i).getPhnumberAFS());%></h3>
		<h3>Adderss : <%out.println(requestList.get(i).getAdressAFS());%></h3>
		<h3>Vehicle Number : <%out.println(requestList.get(i).getVhnumberAFS());%></h3>
		<h3>Vehicle Type : <%out.println(requestList.get(i).getVhtypeAFS());%></h3>
		<h3>Starting Location : <%out.println(requestList.get(i).getStartinglAFS());%></h3>
		<h3>Destination :  <%out.println(requestList.get(i).getDestinationAFS());%></h3>
		<h3>Starting Date : <%out.println(requestList.get(i).getSdateAFS());%></h3>
 		<h3>Ending Date : <%out.println(requestList.get(i).getEdateAFS());%></h3>
 		<h3>Co Passenger : <%out.println(requestList.get(i).getPassengerAFS());%></h3>
 		<h3>Relation : <%out.println(requestList.get(i).getRelationAFS());%></h3>
 		<h3>Reason : <%out.println(requestList.get(i).getReasonAFS());%></h3>
 		
		<input type="hidden" flag ="1"name="id" value="<%=requestList.get(i).getIdAFS()%>"><button class="button">Aproved</button>
		<input type="hidden" flag="2" name="id" value="<%=requestList.get(i).getIdAFS()%>"><button class="button">Canceled</button>
		 <%}%>
		</form>
		<a href="index.jsp"><input type="submit" class="button" value="Home"></a>	
		
	</body>
</html>