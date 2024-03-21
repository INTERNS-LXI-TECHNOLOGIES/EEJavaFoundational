package com.lxisoft.school;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException; 

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Download")
public class Download extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String imageId = request.getParameter("id");
        if (imageId != null && !imageId.isEmpty()) {
            String url = "jdbc:mysql://localhost:3306/school";
            String userName = "root";
            String password = "Jayaram";
            try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
            try (Connection connection = DriverManager.getConnection(url, userName, password)) {
                String query = "SELECT img FROM schoolinfo WHERE id=?";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, imageId);
                ResultSet resultSet = preparedStatement.executeQuery();
                if (resultSet.next()) {
                    InputStream imageInputStream = resultSet.getBinaryStream("img");
                    if (imageInputStream != null) {
                        response.setContentType("image/jpeg"); // Set the content type based on your image format
                        response.setHeader("Content-Disposition", "attachment; filename=image.jpg"); // Set the filename for download
                        try (OutputStream outputStream = response.getOutputStream()) {
                            byte[] buffer = new byte[4096];
                            int bytesRead;
                            while ((bytesRead = imageInputStream.read(buffer)) != -1) {
                                outputStream.write(buffer, 0, bytesRead);
                            }
                        }
                    } else {
                        response.getWriter().println("Image not found.");
                    }
                } else {
                    response.getWriter().println("Image not found.");
                }
            } catch (SQLException e) {
                e.printStackTrace();
                response.getWriter().println("Database error: " + e.getMessage());
            }
        } else {
            response.getWriter().println("Invalid image ID.");
        }
    }
}
