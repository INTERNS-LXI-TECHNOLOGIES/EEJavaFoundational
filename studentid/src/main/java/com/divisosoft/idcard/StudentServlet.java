package com.divisosoft.idcard;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/studentDetails")
public class StudentServlet extends HttpServlet
{
    Connection connection;

    public void init(ServletConfig ServletConfig)throws ServletException
    {
        String url = "jdbc:mysql:/localhost:3306/student";
        String username = "root";
        String password ="vipin@2002";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, password);
        }
        catch(SQLException | ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }

    public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException
    {

    }

    public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException
    {

    }

    public void createStudent(HttpServletRequest request)throws SQLException
    {
        String inserQuery = "";
    }
}