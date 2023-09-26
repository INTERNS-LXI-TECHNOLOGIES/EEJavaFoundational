package com.lxisoft.yasirhussain.amazon.employee.controller;

import java.io.*;
import java.util.*;
import java.sql.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.ServletException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.Part;
import jakarta.servlet.annotation.WebServlet;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.lxisoft.yasirhussain.amazon.employee.controller.*;

@WebServlet("/employeeServlet")
@MultipartConfig(
        fileSizeThreshold = 1024 * 1024,  // 1 MB
        maxFileSize = 10 * 1024 * 1024,   // 10 MB
        maxRequestSize = 20 * 1024 * 1024 // 20 MB
)
public class EmployeeController extends HttpServlet{
    private static final Logger logger = LogManager.getLogger(EmployeeController.class);
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
        Part filePart = (Part)request.getAttribute("part");
        String name = (String) request.getAttribute("name");
        InputStream streamData = filePart.getInputStream();
        if(streamData != null){
            try{
                Properties properties = new Properties();
                InputStream inputStream = null;
                Connection connection = null;

                inputStream = this.getClass().getClassLoader().getResourceAsStream("application.properties");
                properties.load(inputStream);
                String dbUrl = properties.getProperty("db.url");
                String dbUsername = properties.getProperty("db.username");
                String dbPassword = properties.getProperty("db.password");
                String driverClassName = properties.getProperty("db.driverClassName");

                Class.forName(driverClassName);

                connection = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
                PreparedStatement statement = connection.prepareStatement("INSERT INTO employee (name, employee_data) VALUES (?, ?)");
                statement.setString(1, name);
                statement.setBlob(2, streamData);
                statement.executeUpdate();
                request.setAttribute("success", "CV uploaded successfully");
                request.getRequestDispatcher("/create/employee/createEmployee.jsp").forward(request, response);
            }catch(Exception e){
                logger.info("An exception occurred: " + e.getMessage());
            }

        }else{
            logger.info("something went wrong with the input Stream please check!");
        }

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String name = request.getParameter("name");
        try{
            Properties properties = new Properties();
            InputStream inputStream = null;
            Connection connection = null;
            inputStream = this.getClass().getClassLoader().getResourceAsStream("application.properties");
            properties.load(inputStream);
            String dbUrl = properties.getProperty("db.url");
            String dbUsername = properties.getProperty("db.username");
            String dbPassword = properties.getProperty("db.password");
            String driverClassName = properties.getProperty("db.driverClassName");
            Class.forName(driverClassName);

            connection = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
            PreparedStatement statement = connection.prepareStatement("select * from employee where name=?");
            statement.setString(1, name);
            ResultSet set = statement.executeQuery();

            while(set.next()){
                inputStream= set.getBinaryStream("employee_data");
            }
            request.setAttribute("stream", inputStream);
            request.getRequestDispatcher("/read/employee/readEmployee.jsp").forward(request, response);

        }catch(Exception e){
            logger.info(e.getMessage());
        }
    }

}
