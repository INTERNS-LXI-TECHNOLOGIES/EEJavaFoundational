package com.divisosoft.movie;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/movieDetails")
public class MovieServlet extends HttpServlet
{
    Connection connection;
    public void init(ServletConfig servletConfig)throws ServletException
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
        try{
        
        FileReader fileReader = new FileReader("C:\\Users\\vipin\\Downloads\\MOCK_DATA.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        bufferedReader.readLine();
        String data;
        while((data=bufferedReader.readLine())!=null)
        {
            String[] values = data.split(","); 
            Movie movie = new Movie();

            movie.setName(values[0]);
            movie.setYear(Integer.parseInt(values[1]));
            movie.setHero(values[2]);
            movie.setHeroine(values[3]);
            movie.setVillain(values[4]);

            String insertQuery = "INSERT INTO movieinfo (name, year, hero, heroine, villan) VALUES (?, ?, ?, ?, ?)";
            try{
            PreparedStatement preparedStatement= connection.prepareStatement(insertQuery);
            preparedStatement.setString(1, movie.getName());
            preparedStatement.setInt(2, movie.getYear());
            preparedStatement.setString(3, movie.getHero());
            preparedStatement.setString(4, movie.getHeroine());
            preparedStatement.setString(5, movie.getVillain());
            preparedStatement.executeUpdate();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        bufferedReader.close();
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
    
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("sort");

        if ("name".equals(action)) {
            try{
            List<Movie> moviesByName = this.movieSortByName(request);
            request.setAttribute("movies", moviesByName);
            }
            catch(SQLException e)
            {
                e.printStackTrace();
            }
        } else if ("year".equals(action)) {
            try{
            List<Movie> moviesByYear = this.movieSortByYear(request);
            request.setAttribute("movies", moviesByYear);
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        } else {
            try {
                List<Movie> allMovies = this.movieDetails(request);
                request.setAttribute("movies", allMovies);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher("result.jsp");
        dispatcher.forward(request, response);
    }

    public List<Movie> movieDetails(HttpServletRequest request) throws FileNotFoundException, IOException, SQLException 
    {
        List<Movie> movies = new ArrayList<>();
    
        try {
            int end = 10;
            String action = request.getParameter("action");
    
            int strTOint;
    
            if (action == null) {
                strTOint = 1;
            } else {
                strTOint = Integer.parseInt(action);
            }
    
            int start = (strTOint * 10) - 10;
    
            String selectQuery = "SELECT * FROM movieinfo LIMIT ? ,?";
      
            PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
            preparedStatement.setInt(1, start);
            preparedStatement.setInt(2, end);
    
            ResultSet resultSet = preparedStatement.executeQuery();
    
            while (resultSet.next()) {
                Movie movie = new Movie();
    
                movie.setName(resultSet.getString(1));
                movie.setYear(resultSet.getInt(2));
                movie.setHero(resultSet.getString(3));
                movie.setHeroine(resultSet.getString(4));
                movie.setVillain(resultSet.getString(5));
    
                movies.add(movie);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        return movies;
    }  
    
    public List<Movie> movieSortByName(HttpServletRequest request)throws SQLException
    {
        List<Movie> movielist = new ArrayList<>();

        String action = request.getParameter("action");
        int end = 10;
        int strTOint;
        if(action==null)
        {
            strTOint = 1;
        }
        else{
            strTOint=Integer.parseInt(action);
        }

        int start = (strTOint *10)-10;

        String query =  "SELECT * FROM movieinfo LIMIT ? ,?";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, start);
        preparedStatement.setInt(2, end);
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            Movie movie = new Movie();

            movie.setName(resultSet.getString(1));
            movie.setYear(resultSet.getInt(2));
            movie.setHero(resultSet.getString(3));
            movie.setHeroine(resultSet.getString(4));
            movie.setVillain(resultSet.getString(5));
    
            movielist.add(movie);
        }

        List<Movie> movies = movielist.stream().sorted(Comparator.comparing(Movie::getName))
                            .collect(Collectors.toList());

        return movies;
    }

    public List<Movie> movieSortByYear(HttpServletRequest request)throws SQLException
    {
        List<Movie> movielist = new ArrayList<>();

        String action = request.getParameter("action");
        int end = 10;
        int strTOint;
        if(action==null)
        {
            strTOint = 1;
        }
        else{
            strTOint=Integer.parseInt(action);
        }

        int start = (strTOint *10)-10;

        String query =  "SELECT * FROM movieinfo LIMIT ? ,?";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, start);
        preparedStatement.setInt(2, end);
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            Movie movie = new Movie();

            movie.setName(resultSet.getString(1));
            movie.setYear(resultSet.getInt(2));
            movie.setHero(resultSet.getString(3));
            movie.setHeroine(resultSet.getString(4));
            movie.setVillain(resultSet.getString(5));
    
            movielist.add(movie);
        }

        List<Movie> movies = movielist.stream().sorted(Comparator.comparing(Movie::getYear))
                            .collect(Collectors.toList());

        return movies;
    }
}
