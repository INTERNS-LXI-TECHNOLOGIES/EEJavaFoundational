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

import java.util.List;
import java.util.ArrayList;

@WebServlet("/Fetchdataservlet")
public class Fetchdataservlet extends HttpServlet{

    Connection connection;

    public void init(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/contact";
            String username = "root";
            String password="Magesh@96";
            connection = DriverManager.getConnection(url,username,password);

        }
        catch(Exception e){
            e.printStackTrace();
        }

    }


    public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
        try{
            String getQueryOfId = "SELECT * FROM contacttable WHERE id=?";
            PreparedStatement psGetQuery = connection.prepareStatement(getQueryOfId);
            psGetQuery.setInt(1,Integer.parseInt(request.getParameter("id")) );
            ResultSet result = psGetQuery.executeQuery();
            while(result.next()){
                Contact con = new Contact();
                con.setId(result.getInt("id"));
                con.setName(result.getString("name"));
                con.setPhonenumber(result.getLong("phonenumber"));
                con.setEmail(result.getString("email"));
                request.setAttribute("con", con);
                
            }
            RequestDispatcher dp = request.getRequestDispatcher("updation.jsp");
            dp.forward(request, response);
        }
        catch(SQLException e){
            e.printStackTrace();
        }
       
    }
    
}