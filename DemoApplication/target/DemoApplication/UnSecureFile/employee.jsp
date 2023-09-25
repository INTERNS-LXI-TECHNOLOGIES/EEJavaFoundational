<%@ page import ="java.sql.* " %>
<%@ page import ="com.lxisoft.ibrahim.workshoptwo.employee.employeemodel.*"%>
<%@ page import="org.apache.logging.log4j.Logger,org.apache.logging.log4j.LogManager" %>
<html>
<body>

<h1> Here Is Your employee Details </h1>
<%
Logger logger = LogManager.getLogger("employee");
try{
Connection con = null;

Class.forName("com.mysql.jdbc.Driver");
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/maven","root","root");
if(con!=null){
out.write("- connection created successfully");

} else{


out.write("- Not connection created successfully");
}

Statement statement = con.createStatement();

 ResultSet results = statement.executeQuery("Select * from  employee ");

 while(results.next()){

     EmployeeModel em = new EmployeeModel();



          em.setEmployee_id( results.getLong("employee_id"));

          em.setFirst_name(results.getString("first_name"));

          out.write("Employee_id :"+ em.getEmployee_id());

          out.write("firstname"+em.getFirst_name());



 }
    con.close();
}
catch(Exception e){
logger.info(e.getMessage());
}

%>


</body>
</html>
