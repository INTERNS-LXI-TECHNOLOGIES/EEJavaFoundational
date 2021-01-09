<%@page import ="java.sql.*" %> 
<%@page import ="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>Delete Contact
    </title>
</head>
<body>
    <a href =index.html><h1 align = center><b><u> Contact APP </u></b></h1></a>
    <p align = center>contact app developed by Faris for LxiTechnologies pvt.ltd</p>
    <p> SuccessFully Deleted  From Records</p>
    <% 
    String fname= request.getParameter("first_name");
    String lname= request.getParameter("last_name");
    String email= request.getParameter("email");
    String phNo= request.getParameter("contact");
    String j= request.getParameter("j");
    
    String jdbcURL = "jdbc:mysql://localhost:3306/ContactApp";
    String userName = "root";
    String password = "root";
    PreparedStatement preparedstatement=null;
    Statement statement=null;
    Connection connection = null;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try
            {
                connection = DriverManager.getConnection(jdbcURL,userName,password);
                preparedstatement = connection.prepareStatement("UPDATE ContactInfo SET First_Name='"+fname+"',  Last_Name='"+lname+"', Email='"+email+"', Contact_Number='"+phNo+"' WHERE id ='"+j+"'");
            int row = preparedstatement.executeUpdate();
            preparedstatement.close();
            connection.close();
            if(row>0)
            {
                System.out.println("The Contact Details has been updated");
            }
        }
        

            catch(SQLException e)
            {
                System.out.println("Database is not Connected Due to SQLException");
            }
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("Database Is Not Connected To Database Due To ClassNotFoundException");
        }
    %>
    <a href = index.html color=black>Back to Home Page</a>
</body>
</html>