package com.lxisoft.contact;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

@WebServlet("/imgServlet")
@MultipartConfig(
    fileSizeThreshold = 1024 * 1024 * 2, 
    maxFileSize = 1024 * 1024 * 10,      
    maxRequestSize = 1024 * 1024 * 50    
)
public class imgServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String savePath = "D:\\database";
        String imageName = "";
        byte[] imageData = null;

        Part filePart = request.getPart("image");
        String fileName = Paths.get(filePart.getSubmittedFileName()).getFileName().toString(); 
        InputStream fileContent = filePart.getInputStream();

        OutputStream outputStream = new FileOutputStream(savePath + File.separator + fileName);
        int read;
        byte[] buffer = new byte[1024];
        while ((read = fileContent.read(buffer)) != -1) {
            outputStream.write(buffer, 0, read);
        }
        outputStream.close();

        imageName = fileName;
        imageData = Files.readAllBytes(Paths.get(savePath + File.separator + fileName));

        String dbURL = "jdbc:mysql://localhost:3306/contacts";
        String dbUsername = "root";
        String dbPassword = "Jayaram";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(dbURL, dbUsername, dbPassword);
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO images (imagename, imagedata) VALUES (?, ?)");
            stmt.setString(1, imageName);
            stmt.setBytes(2, imageData);
            stmt.executeUpdate();
            stmt.close();
            conn.close();
            response.getWriter().println("Image uploaded successfully.");
        } catch (Exception ex) {
            response.getWriter().println("Error uploading image: " + ex.getMessage());
        }
    }
}
