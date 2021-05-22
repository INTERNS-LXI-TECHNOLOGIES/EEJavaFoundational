<%@page import="com.lxisoft.servlet.*"%>
<%@page import="com.lxisoft.model.*"%>
<%@page import="com.lxisoft.repository.*"%>
<%@page import="java.util.*,java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
	<title>Contacts</title>
</head>
<body>
	<h1>Contact List</h1>
	<%
	int pageNumber = 0;
	int totalContacts = 0;
	int contactPerPage = 3;
	int start = 0;
	int numOfPage = 0;

	String no = request.getParameter("page");
	pageNumber = Integer.parseInt(no);

	start = (pageNumber * contactPerPage)-contactPerPage + 1;
 
	%>
	<table border="1" width="50%">
		<tr>
			<!--<th>Id</th>-->
			<th>Name</th>
			<th>Number</th>
			<th>E-Mail</th>
			<th>Actions</th>
		</tr>
		<%
		ContactDatabase db = new ContactDatabase();
		ArrayList<Contact> contactList = new ArrayList<Contact>();
		contactList = db.viewDatabase(contactList,start,contactPerPage);	%>
	
		<%	for (int i=start;i<contactList.size();i++) 	{
		        int id = contactList.get(i).getId();
		        String name = contactList.get(i).getName();
		        String number = contactList.get(i).getNumber();
		        String mail = contactList.get(i).getEmail();
		         %>
		<tr>				
			<!--<td><%out.println(id/*contactList.get(i).getId()*/);%></td>-->
			<td><%out.println(name/*contactList.get(i).getName()*/);%></td>
			<td><%out.println(number/*contactList.get(i).getNumber()*/);%></td>
			<td><%out.println(mail/*contactList.get(i).getEmail()*/);%></td> 		
			<td><a href="edit.jsp?id=<%=id%> & name=<%=contactList.get(i).getName()%> & num =<%=number%> & mail=<%=mail%>"><button class="button">Edit</button></a>
			<a href="contactDelete?name=<%=contactList.get(i).getName()%>"><button class="button button2">Delete</button></a></td>	
			<%}%></tr>	
	</table>
	<%
	Connection con = null;
	ResultSet rs= null;
    Statement stmt = null;
    PreparedStatement ps = null;;
    int row;
		//ContactDatabase cd = new ContactDatabase();
	try{
	    Class.forName("com.mysql.jdbc.Driver");
		try{
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contactapp","root","abi@1003");	
		}catch(SQLException e)
		{	
			e.printStackTrace();	
		}
		    //cd.createDatabaseConnection();
	    stmt = con .createStatement();
	    rs = stmt.executeQuery("select count(*) from contacts");
	    rs.next();
	    totalContacts= rs.getInt(1);
	    numOfPage = totalContacts/contactPerPage;
	    if(totalContacts > numOfPage * contactPerPage){
            numOfPage = numOfPage+1;
	    } 
	    for(int j=1; j<=numOfPage; j++){
            %>
            <a href="view.jsp?page=<%=j%>"><%=j%></a>
            &nbsp;&nbsp;&nbsp;&nbsp;
            <%
	    }
	}
	catch(Exception e){
        e.printStackTrace();
    }	    %>
	
	
	<br>
	<a href="search.html"><button class="button">Search</button></a>
	<br>
	<a href="index.html"><button class="button">Home</button></a>
	<br>
	<a href="add.html"><button class="button">AddContact</button></a>
</body>
</html>