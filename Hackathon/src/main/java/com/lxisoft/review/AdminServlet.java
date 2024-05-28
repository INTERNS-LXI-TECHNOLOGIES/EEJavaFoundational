package com.lxisoft.review;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServlet;


import jakarta.servlet.annotation.WebServlet;

import java.sql.DriverManager;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import jakarta.servlet.http.Part;
import java.io.InputStream;
import jakarta.servlet.annotation.MultipartConfig;

@WebServlet("/adminServlet")
@MultipartConfig(
    fileSizeThreshold = 1024 * 1024 * 2, 
    maxFileSize = 1024 * 1024 * 10,      
    maxRequestSize = 1024 * 1024 * 50   
)
public class AdminServlet extends HttpServlet
{
    String url;
    String pass;
    String name;
    Connection conection;

    public void init() {
        url = "jdbc:mysql://localhost:3306/hackathon";
        name = "root";
        pass = "vipin@2002";

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
Part part = request.getPart("photo");
String phone = request.getParameter("phone");
if(phone.length()<10){
    request.setAttribute("error", "phone number is not valid");
    RequestDispatcher re = request.getRequestDispatcher("admin.jsp");
    re.forward(request,responce);
}
InputStream inputStream = part.getInputStream();


try{
    String query = "insert into admin  (user_name,phone,photo) values (?,?,?)";
    PreparedStatement   preparedStatement = conection.prepareStatement(query);
    preparedStatement.setString(1, name);
    preparedStatement.setString(2, phone);
    preparedStatement.setBlob(3, inputStream);   
    
    preparedStatement.executeUpdate();
}
catch(SQLException e)
{
    e.printStackTrace();
}

RequestDispatcher dispatcher = request.getRequestDispatcher("success.jsp");
dispatcher.forward(request, responce);
}
}