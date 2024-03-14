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

import java.util.*;
@WebServlet("/Showstudents")
public class Showstudents extends HttpServlet{
    List <Student> studenList;
    Connection connection;
    int firstIndex;
    final int lastIndex =5;

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

  

    public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException{
        String readQuery;
        try{
            String page  = request.getParameter("page");
            if(page !=null){
                firstIndex=Integer.parseInt(page)*5;
            }
            else{
                firstIndex=0;
            }
            studenList = new ArrayList<>();
            String searchOption = request.getParameter("search");
            if(searchOption != null){
                readQuery="SELECT * FROM studentdata WHERE name=?";
                PreparedStatement psSearch = connection.prepareStatement(readQuery);
                psSearch.setString(1, searchOption);
                ResultSet searchObjects = psSearch.executeQuery();
                while(searchObjects.next()){
                    Student searchStudent = new Student();
                    searchStudent.setId(searchObjects.getInt("id"));
                    searchStudent.setName(searchObjects.getString("name"));
                    searchStudent.setGender((searchObjects.getString("gender")).charAt(0));
                    searchStudent.setMark(searchObjects.getInt("mark"));
                    searchStudent.setAge(searchObjects.getInt("age"));
                    studenList.add(searchStudent);
                }
            }
            else{
                String sortopt="ASC";
                String sortOption = request.getParameter("sort");
                if(sortOption!=null){
                    sortopt= sortOption;
                }
                   
                readQuery = "SELECT * FROM studentdata ORDER BY name " + sortopt + " LIMIT ?, ?";

                PreparedStatement psReadQuery = connection.prepareStatement(readQuery);
                psReadQuery.setInt(1, firstIndex);
                psReadQuery.setInt(2, lastIndex);
                ResultSet result = psReadQuery.executeQuery();
                while(result.next()){
                    Student readStudent = new Student();
                    readStudent.setId(result.getInt("id"));
                    readStudent.setName(result.getString("name"));
                    readStudent.setGender((result.getString("gender")).charAt(0));
                    readStudent.setMark(result.getInt("mark"));
                    readStudent.setAge(result.getInt("age"));
                    studenList.add(readStudent);
                }
            }

        }
        catch(SQLException e){
            e.printStackTrace();
        }
   
        request.setAttribute("stdentList",studenList);
        RequestDispatcher dp = request.getRequestDispatcher("display.jsp");
        dp.forward(request,response);
    }
}