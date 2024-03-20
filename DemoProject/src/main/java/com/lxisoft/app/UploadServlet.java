package com.lxisoft.app;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
import java.sql.*;

@WebServlet("/UploadServlet")
@MultipartConfig
public class UploadServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Part filePart = request.getPart("file");
        String fileName = filePart.getSubmittedFileName();
        InputStream fileContent = filePart.getInputStream();

        // Store file content in the database
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String jdbcUrl = "jdbc:mysql://localhost:3306/your_database_name";
            String username = "your_mysql_username";
            String password = "your_mysql_password";

            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO files (filename, file_content) VALUES (?, ?)");
            preparedStatement.setString(1, fileName);
            preparedStatement.setBlob(2, fileContent);
            preparedStatement.executeUpdate();

            response.getWriter().println("File uploaded successfully and content stored in the database!");
        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().println("Error storing file content in the database!");
        }
    }
}
