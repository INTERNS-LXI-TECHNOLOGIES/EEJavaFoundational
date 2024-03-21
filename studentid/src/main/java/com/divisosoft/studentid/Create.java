package com.divisosoft.studentid;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.annotation.MultipartConfig;

import java.sql.*;
import java.io.*;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;

@WebServlet("/Create")
@MultipartConfig()
public class Create extends HttpServlet{
    Connection connection;
    public void init(ServletConfig servletConfig){
        try {
            String url = "jdbc:mysql://localhost:3306/studentiddb";
            String password  ="Magesh@96";
            String username = "root";
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection =DriverManager.getConnection(url, username, password);
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
  
    public void doPost(HttpServletRequest request , HttpServletResponse response)throws IOException,ServletException{
        try {
            Student student =  this.createStudent(request,response);
            String addQuery = "INSERT INTO student_table (name,photo) VALUES(?,?)";
            PreparedStatement psAddQuery = connection.prepareStatement(addQuery);
            psAddQuery.setString(1, student.getName());
            psAddQuery.setBlob(2, student.getPhoto()); 
            psAddQuery.executeUpdate();
        }
         catch (Exception e) {
            e.printStackTrace();
        }

    }   

    public Student createStudent(HttpServletRequest request , HttpServletResponse response)throws IOException,ServletException{
        Student studentObj = new Student();
        studentObj.setName(request.getParameter("name"));
        studentObj.setPhoto((request.getPart("file")).getInputStream());
        return studentObj;
    }
}
