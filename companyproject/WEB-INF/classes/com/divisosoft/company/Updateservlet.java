package com.divisosoft.company;

import com.sun.net.httpserver.Request;
import java.io.IOException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.SQLException;

@WebServlet("/Updateservlet")
public class Updateservlet extends HttpServlet{
    String url = "jdbc:mysql://localhost:3306/companydata";
    String username = "root";
    String password = "Magesh@96";

    public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
        String pkeyToChange =request.getParameter("name");
        String placeToChange = request.getParameter("place");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url,username,password);
            String updateQuery = "UPDATE companytable SET place =? where name=?";
            try{
           PreparedStatement prestmnt = connection.prepareStatement(updateQuery);
           prestmnt.setString(1,placeToChange);
           prestmnt.setString(2,pkeyToChange);
           prestmnt.executeUpdate();
            }
            catch(SQLException e){
                e.printStackTrace();
            }
        } 
        catch (Exception e){
            e.printStackTrace();
        }
    }
}