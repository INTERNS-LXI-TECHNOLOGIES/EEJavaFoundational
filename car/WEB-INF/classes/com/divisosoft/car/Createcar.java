package com.divisosoft.car;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Part;


import java.io.IOException;
import java.rmi.ServerException;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet("/Createcar")
public class Createcar extends HttpServlet{
   
    Connection connection;

    public void init(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/cars";
            String username = "root";
            String password = "Magesh@96";
            connection =DriverManager.getConnection(url,username,password);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void doPost(HttpServletRequest request,HttpServletResponse respons)throws ServletException,IOException{
        try{
            Car car = this.creatingCar(request,respons);
            String addQuery = "INSERT INTO cartable (name,document) VALUES (?,?)";
            PreparedStatement psAddQuery = connection.prepareStatement(addQuery);
            psAddQuery.setString(1,car.getName());
            psAddQuery.setBlob(2,car.getFileData());
            psAddQuery.executeUpdate();

        }
        catch(SQLException e){
            e.printStackTrace();
        }


    }

    public Car creatingCar(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
        Car car = new Car();
        car.setName(request.getParameter("name"));
        car.setFileData(request.getPart("carDocument").getInputStream());
        return car;
    }
}