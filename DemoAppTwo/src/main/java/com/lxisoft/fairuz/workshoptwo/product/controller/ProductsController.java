package com.lxisoft.fairuz.workshoptwo.product.controller;

import com.lxisoft.fairuz.workshoptwo.company.controller.CompanyController;
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
 import com.lxisoft.fairuz.workshoptwo.product.model.*;
@WebServlet("/ProductServlet")  // Specifies the URL pattern for this servlet
public class ProductsController extends HttpServlet {
    private static final Logger logger = LogManager.getLogger(ProductsController.class);
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        // Set the content type and character encoding
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        try {
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

            ResultSet set= statement.executeQuery("select * from products");

            // Get the PrintWriter to write HTML response

            // HTML response content
            out.println("<html>");
            out.println("<head><title>Hello Servlet</title></head>");
            out.println("<body>");
            out.println("<h1>Hello, Jakarta EE Servlet!</h1>");
            while(set.next()){

                Product product  = new Product();
                product.setName(set.getString("name"));
                product.setNumber(set.getInt("number"));
                out.println("<h1>"+product+"</h1>");
            }
            out.println("</body>");
            out.println("</html>");

        }catch (Exception e){
            logger.info(e.getMessage());
        }
    }
}