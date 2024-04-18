package com.lxisoft.school;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.http.Part;
import java.io.InputStream;
import java.sql.DriverManager;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


@WebServlet("/Upload")
@MultipartConfig(
    fileSizeThreshold = 1024 * 1024 * 2, // 2MB
    maxFileSize = 1024 * 1024 * 10,      // 10MB
    maxRequestSize = 1024 * 1024 * 50    // 50MB
)
public class Upload extends HttpServlet
{
    String url;
    String pass;
    String name;
    Connection conection;


    public void init()
    {
    url = "jdbc:mysql://localhost:3306/school";
    name = "root";
    pass ="Jayaram";
    
try{
    Class.forName("com.mysql.cj.jdbc.Driver");

    }
    catch(ClassNotFoundException e)
    {
    e.printStackTrace();
    }

    try{
        conection = DriverManager.getConnection(url,name,pass);
    }
    catch(SQLException e)
    {
        e.printStackTrace();
    }
    }
public void doPost(HttpServletRequest request,HttpServletResponse response) throws  ServletException,IOException
{
School school = new School();
school.setName(request.getParameter("name"));
Part part = request.getPart("image");
InputStream input = part.getInputStream();
school.setInputstream(input);


try{

String query = "insert into schoolinfo (name,img) values (?,?)";
PreparedStatement pre = conection.prepareStatement(query);
pre.setString(1,school.getName());
pre.setBlob(2,school.getInputstream());
pre.executeUpdate();
response.getWriter().println("Image Upload Succesfully");
}
catch(SQLException e)
{
e.printStackTrace();
}
}

}