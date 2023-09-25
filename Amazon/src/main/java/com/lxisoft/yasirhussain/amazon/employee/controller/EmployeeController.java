package com.lxisoft.yasirhussain.amazon.employee.controller;

import java.io.*;
import java.util.*;
import java.sql.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.ServletException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/employee")
public class EmployeeController extends HttpServlet{

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		RequestDispatcher requestDispatcher = null;
		PrintWriter out = response.getWriter();
        Properties properties = new Properties();

		try{
			Connection connection = null;

			InputStream inputStream = getServletContext().getResourceAsStream("/WEB-INF/database.properties");
            properties.load(inputStream);	

            // Database connection properties
            String dbUrl = properties.getProperty("db.url");
            String dbUsername = properties.getProperty("db.username");
            String dbPassword = properties.getProperty("db.password");
		
			
			// Initialize a list to store retrieved data
            List<String> names = new ArrayList<>();

            // Connect to the database and retrieve data
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM employee_details");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String name = resultSet.getString("employee_name");
                names.add(name);
            }

            // Set the list as an attribute in the request
            request.setAttribute("names", names);

            resultSet.close();
            statement.close();
            connection.close();
        } 	catch (Exception e) {
            // Handle any exceptions and set an error attribute
            request.setAttribute("error", "Error: " + e.getMessage());
            out.println(e.getMessage());
        }

        request.getRequestDispatcher("secure/employee.jsp").forward(request, response);
	}	
}
