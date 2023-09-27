package com.lxisoft.fairuz.workshoptwo.employee.controller;

import com.lxisoft.fairuz.workshoptwo.product.controller.ProductsController;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.*;
import java.util.*;
import java.sql.*;
import com.lxisoft.fairuz.workshoptwo.employee.model.Employee;
@WebServlet("/EmployeeServlet")  // Specifies the URL pattern for this servlet
public class EmployeeController extends HttpServlet {
    private static final Logger logger = LogManager.getLogger(EmployeeController.class);
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        // Set the content type and character encoding
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        try{
            Properties prop = new Properties();
            InputStream input = null;
            Connection connection = null;
            input = this.getClass().getClassLoader().getResourceAsStream("application.properties");
            prop.load(input);
            String dbUrl = prop.getProperty("db.url");
            String dbUsername = prop.getProperty("db.username");
            String dbPassword = prop.getProperty("db.password");
            String driverClassName = prop.getProperty("db.driverClassName");
            Class.forName(driverClassName);
            connection = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);

            Statement statement = connection.createStatement();

            ResultSet set= statement.executeQuery("select * from employees");

            // Get the PrintWriter to write HTML response

            // HTML response content
            out.println("<html>");
            out.println("<head><title>Hello Servlet</title></head>");
            out.println("<body>");
            out.println("<h1>Hello, Jakarta EE Servlet!</h1>");
            while(set.next()){
                Employee employee = new Employee();
               employee.setName(set.getString("name"));
               employee.setId(set.getInt("number"));
                out.println("<h1>"+employee+"</h1>");
            }
            out.println("</body>");
            out.println("</html>");
        }
        catch (Exception e){
            logger.info(e.getMessage());
        }
    }
}