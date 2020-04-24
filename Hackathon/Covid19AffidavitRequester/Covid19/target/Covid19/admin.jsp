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
    requestList = db.viewDatabaseAFS(requestList); %>
  
    	 <%  for (int i=0;i<requerstList.size();i++)  {%>
		 <table border="1" width="100%">
		 	Request ID :  <%out.println(requestList.get(i).getIdAFS());%>	
			Name : <%out.println(requestList.get(i).getNameAFS());%>
			Phone Number : <%out.println(requestList.get(i).getPhnumberAFS());%>
			Adderss : <%out.println(requestList.get(i).getAdressAFS());%>
			Vehicle Number : <%out.println(requestList.get(i).getVhnumberAFS());%>
			Vehicle Type : <%out.println(requestList.get(i).getVhtypeAFS());%>
			Starting Location : <%out.println(requestList.get(i).getStartinglAFS());%>
			Destination :  <%out.println(requestList.get(i).getDestinationAFS());%>
			Starting Date : <%out.println(requestList.get(i).getSdateAFS());%>
 			Ending Date : <%out.println(requestList.get(i).getEdateAFS());%>
 			Co Passenger : <%out.println(requestList.get(i).getPassengerAFS());%>
 			Relation : <%out.println(requestList.get(i).getRelationAFS());%>
 			Reason : <%out.println(requestList.get(i).getReasonAFS());%>
		<input type="hidden" flag ="1"name="id" value="<%=problemList.get(i).getId()%>"><button class="button">Aproved</button>
		<input type="hidden" flag="2" name="id" value="<%=problemList.get(i).getId()%>"><button class="button">Canceled</button>
		 <%}%>
		</form>
		<a href="index.jsp"><input type="submit" class="button" value="Home"></a>	
		
	</body>
</html>