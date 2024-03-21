package com.divisosoft.idcard;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;


@WebServlet("/studentDetails")
public class StudentServlet extends HttpServlet
{
    Connection connection;

    public void init(ServletConfig ServletConfig)throws ServletException
    {
        String url = "jdbc:mysql://localhost:3306/studentid";
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
        try{
            String action = request.getParameter("action");

            switch (action) {
                case "Create":
                try{
                    this.createStudent(request,response);
                    response.getWriter().println("aaaaaa");
                }
                catch(IOException e)
                {
                    e.printStackTrace();
                }
                break;
            
                case "Update":
                    this.updateStudent(request);
                break;

                case "Delete":
                    this.deleteStudent(request);
                break;

                default:
                break;
            }
        }
        catch(NullPointerException e)
        {
            e.printStackTrace();
        }
    }

    public void createStudent(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException
    {
        try{
            String insertQuery = "INSERT INTO studentinfo(name,rollno,photo) VALUES(?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setString(1, request.getParameter("name"));
            int rollno = Integer.parseInt(request.getParameter("roll"));
            preparedStatement.setInt(2, rollno);
            Part photo = request.getPart("photo");
            InputStream photoInputStream = photo.getInputStream();
            preparedStatement.setBlob(3, photoInputStream);


            preparedStatement.executeUpdate();
            response.getWriter().println("successfully stored in database");
        }
        catch(SQLException  e)
        {
            e.printStackTrace();
            response.getWriter().println("error storing file in database");
        }
    }

    public void updateStudent(HttpServletRequest request) throws ServletException 
    {
        try{
            String updateQuery = "UPDATE studentinfo SET name=?, photo=? WHERE rollno=?";
            PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);
            int roll = Integer.parseInt(request.getParameter("roll"));
            preparedStatement.setInt(1, roll);
            preparedStatement.setString(2, request.getParameter("name"));
            Part photo = request.getPart("photo");
            InputStream photoInputStream = photo.getInputStream();
            preparedStatement.setBlob(3, photoInputStream);
            preparedStatement.executeUpdate();
        }
        catch(SQLException | IOException e)
        {
            e.printStackTrace();
        }
    }

    public void deleteStudent(HttpServletRequest request)
    {
        try{
            String deleteQuery = "DELETE FROM studentinfo WHERE rollno = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery);
            int rollno = Integer.parseInt(request.getParameter("roll"));
            preparedStatement.setInt(1, rollno);
            preparedStatement.executeUpdate();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
}