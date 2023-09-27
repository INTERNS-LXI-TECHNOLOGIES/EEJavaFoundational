package com.lxisoft.fairuz.workshoptwo.company.controller;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
@WebServlet("/company")
public class CompanyController extends HttpServlet {
    // Define your database connection parameters
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/demoapptwo";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "root";
    private static final Logger logger = LogManager.getLogger(CompanyController.class);
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException {
        String inputData = request.getParameter("name");
        // Parse inputData1 as an integer
        int inputData1 = 0; // Default value in case parsing fails

        try {
            inputData1 = Integer.parseInt(request.getParameter("stock_price"));
        } catch (NumberFormatException e) {
            // Handle the case where the parameter cannot be parsed as an integer
            e.printStackTrace(); // You should handle this exception appropriately
        }

        try {
            // Load the database driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the database connection
            Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
            if(connection!=null){
                String sql = "INSERT INTO companytable (name, stock_price) VALUES (?, ?)";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, inputData);
                preparedStatement.setInt(2, inputData1); // Use setInt for the second parameter

                preparedStatement.executeUpdate();
                request.setAttribute("message", "Successfully created");
                request.getRequestDispatcher("company.jsp").forward(request, response);
                // Close the database connection
                connection.close();
            }else{
                request.setAttribute("message", "not created");
                request.getRequestDispatcher("company.jsp").forward(request, response);
            }
        } catch (Exception e) {
            logger.info(e.getMessage());
        }

        // response.sendRedirect("company.jsp"); // Redirect to a success page after storing the data.
    }
}