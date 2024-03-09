package com.divisosoft.contactapp;

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
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;

@WebServlet("/Updationservlet")
public class Updationservlet extends HttpServlet{
    Connection connection;

    public void init(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/contact";
            String username = "root";
            String password = "Magesh@96";
            connection = DriverManager.getConnection(url,username,password);
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void doPost (HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException{

        if(request.getParameter("option").equals("update")){
            this.update(request,response);
        }
        
        if(request.getParameter("option").equals("delete")){
            this.delete(request,response);
        }
    }
    
    public void update(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
        try {

            String updatingQuery = "UPDATE contacttable SET name=?, phonenumber=?,email=? WHERE id=?";
            PreparedStatement psupdating = connection.prepareStatement(updatingQuery);
            psupdating.setString(1, request.getParameter("name"));
            Long pho = Long.parseLong(request.getParameter("phonenumber"));
            psupdating.setLong(2,pho);
            psupdating.setString(3, request.getParameter("email"));
            psupdating.setInt(4, Integer.parseInt(request.getParameter("id")));
            psupdating.executeUpdate();
            RequestDispatcher dispatcher = request.getRequestDispatcher("/index.html");
            dispatcher.forward(request, response);
        } 
        catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void delete(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
        try{

            String deleteQuery = "DELETE FROM contacttable WHERE id=?";
            PreparedStatement psDelete = connection.prepareStatement(deleteQuery);
            psDelete.setInt(1, Integer.parseInt(request.getParameter("id")));
            psDelete.executeUpdate();
            RequestDispatcher dispatcher = request.getRequestDispatcher("/index.html");
            dispatcher.forward(request, response);
        }
        catch(SQLException e){
            e.printStackTrace();
        }   
    }
}