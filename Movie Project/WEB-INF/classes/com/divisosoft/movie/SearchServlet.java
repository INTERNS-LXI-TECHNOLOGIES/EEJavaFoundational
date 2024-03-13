package com.divisosoft.movie;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/search")
public class SearchServlet extends HttpServlet
{
    Connection connection;

    public void init(ServletConfig servletConfig) throws ServletException
    {
        String url="jdbc:mysql://localhost:3306/movie";
        String username="root";
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

    public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
    {
        try{
            List<Movie> movies = this.searchMovies(request);
            request.setAttribute("searchMovies", movies);

            RequestDispatcher dispatcher = request.getRequestDispatcher("search.jsp");
            dispatcher.forward(request, response);
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }

    public List<Movie> searchMovies(HttpServletRequest request)throws SQLException
    {
        List<Movie> movies = new ArrayList<>();

        String name = request.getParameter("search");

        String searchQuery = "SELECT  * FROM movieinfo WHERE name =?";

        PreparedStatement preparedStatement = connection.prepareStatement(searchQuery);

        preparedStatement.setString(1, name);

        ResultSet resultSet=preparedStatement.executeQuery();

        while (resultSet.next()) {
            Movie movie = new Movie();

            movie.setName(resultSet.getString(1));
            movie.setYear(resultSet.getInt(2));
            movie.setHero(resultSet.getString(3));
            movie.setHeroine(resultSet.getString(4));
            movie.setVillain(resultSet.getString(5));

            movies.add(movie);
        }
        return movies;
    }
}