package com.divisosoft.studentapp;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet("/Creatingstudentservlet")
public class Creatingstudentservlet extends HttpServlet{
   Connection connection;

    public void init(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/studentdb";
            String password="Magesh@96";
            String username ="root";
            connection = DriverManager.getConnection(url, username, password);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }


    public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException{
        try{
            Student newStudent = this.createNewStudent(request,response);
            String addQuery = "INSERT INTO studentdata (name,gender,mark,age) VALUES(?,?,?,?)";
            PreparedStatement psAddQuery = connection.prepareStatement(addQuery);
            psAddQuery.setString(1,newStudent.getName());
            psAddQuery.setString(2,String.valueOf(newStudent.getGender()));
            psAddQuery.setInt(3, newStudent.getAge());
            psAddQuery.setInt(4, newStudent.getMark());
            psAddQuery.executeUpdate();
            RequestDispatcher  dp = request.getRequestDispatcher("index.html");
            dp.forward(request,response);
        }
        catch(SQLException e){
            e.printStackTrace();
        }

    }

    public Student createNewStudent(HttpServletRequest request , HttpServletResponse response){
        String studentName = request.getParameter("name");
        String stGender = request.getParameter("gender");
        char studentgender = stGender.charAt(0);
        int studentAge =Integer.parseInt(request.getParameter("age"));
        int studentMark =Integer.parseInt(request.getParameter("mark"));
        Student student = new Student(studentName,studentgender,studentAge,studentMark);
        return student;
    }
}