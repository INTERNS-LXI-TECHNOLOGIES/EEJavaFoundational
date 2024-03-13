package com.divisosoft.movie;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SortServlet extends HttpServlet
{
    Connection connection;
    public void init(ServletConfig servletConfig) throws ServletException
    {
        String url = "jdbc:mysql://localhost:3306/movie";
        String username = "root";
        String password = "Cutepixal@2023";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, password);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
    {

    }

    public List<Movie> MovieDetails(HttpServletRequest request)
    {
        List<Movie> movies = new ArrayList<>();

        

        return movies;
    }

}