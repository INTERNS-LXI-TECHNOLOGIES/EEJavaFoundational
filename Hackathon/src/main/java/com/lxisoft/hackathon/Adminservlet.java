package com.lxisoft.hackathon;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.RequestDispatcher;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet("/adminservlet")
@MultipartConfig
public class Adminservlet extends HttpServlet{
    boolean hasUpperCase;
    Connection connection;
    String url = "jdbc:mysql://localhost:3306/hackathon";
    String username = "root";
    String pass = "Magesh@96";
   
    public void init() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, pass);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public void doPost(HttpServletRequest request , HttpServletResponse response)throws ServletException,IOException{
        try{
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            Part photo = request.getPart("photo");
            InputStream ipPhoto =photo.getInputStream();
            int num = password.length();
          
            for (char c : password.toCharArray()){
                 if (Character.isUpperCase(c)){
                    hasUpperCase = true;
                    break;
                    }
                }
           if(num>=8 && hasUpperCase){
            String query = "INSERT INTO adminTable(name,email,password,photo) values(?,?,?,?)";
            PreparedStatement psquery = connection.prepareStatement(query);
            psquery.setString(1, name);
            psquery.setString(2, email);
            psquery.setString(3, password);
            psquery.setBlob(4, ipPhoto);
            psquery.executeUpdate();
           }
           else{
            String pass = password;
            request.setAttribute("pass", pass);
            RequestDispatcher rd =request.getRequestDispatcher("adminform.jsp");
            rd.forward(request,response);
           }
    
            
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }

}