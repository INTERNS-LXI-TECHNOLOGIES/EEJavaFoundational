package com.lxisoft.profile;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServlet;

//import java.io.PrintWriter;
import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.ServletException;
import java.sql.DriverManager;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import jakarta.servlet.http.Part;
import java.io.InputStream;
import jakarta.servlet.annotation.MultipartConfig;

@WebServlet("/admin")
@MultipartConfig(
    fileSizeThreshold = 1024 * 1024 * 2, // 2MB
    maxFileSize = 1024 * 1024 * 10,      // 10MB
    maxRequestSize = 1024 * 1024 * 50    // 50MB
)
public class admin extends HttpServlet
{
    String url;
    String pass;
    String name;
    Connection conection;

    public void init() {
        url = "jdbc:mysql://localhost:3306/profile";
        name = "root";
        pass = "Jayaram";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            conection = DriverManager.getConnection(url, name, pass);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


public void doPost(HttpServletRequest request,HttpServletResponse responce) throws ServletException, IOException
{
String name = request.getParameter("name");
Part part = request.getPart("image");
String phone = request.getParameter("phone");
if(phone.length()<10){
    request.setAttribute("error", "phone number is not valid");
    RequestDispatcher re = request.getRequestDispatcher("admin.jsp");
    re.forward(request,responce);
}
InputStream input = part.getInputStream();


try{
    String query = "insert into admin  (name,image,phone) values (?,?,?)";
    PreparedStatement   pre = conection.prepareStatement(query);
    pre.setString(1, name);
    pre.setBlob(2, input);

   
    pre.setString(3, phone);
   
  
    pre.executeUpdate();
}
catch(SQLException e)
{
    e.printStackTrace();
}


}
}
