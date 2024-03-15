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
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

@WebServlet("/imgServlet")

public class imgServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String savePath = "D:\\database";
        String imageName = "";
        byte[] imageData = null;

        // Get the file part from the request
        Part filePart = request.getPart("image");
        String fileName = Paths.get(filePart.getSubmittedFileName()).getFileName().toString(); 
        InputStream fileContent = filePart.getInputStream();

        // Save the image to the server
        OutputStream outputStream = new FileOutputStream(savePath + File.separator + fileName);
        int read;
        byte[] buffer = new byte[1024];
        while ((read = fileContent.read(buffer)) != -1) {
            outputStream.write(buffer, 0, read);
        }
        outputStream.close();

        // Get the image name and data
        imageName = fileName;
        imageData = Files.readAllBytes(Paths.get(savePath + File.separator + fileName));

        // Connect to the database and insert the image data
        String dbURL = "jdbc:mysql://localhost:3306/contacts";
        String dbUsername = "root";
        String dbPassword = "Jayaram";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(dbURL, dbUsername, dbPassword);
            PreparedStatement pstmt = conn.prepareStatement("INSERT INTO images (imagename, imagedata) VALUES (?, ?)");
            pstmt.setString(1, imageName);
            pstmt.setBytes(2, imageData);
            pstmt.executeUpdate();
            pstmt.close();
            conn.close();
            response.getWriter().println("Image uploaded successfully.");
        } catch (Exception ex) {
            response.getWriter().println("Error uploading image: " + ex.getMessage());
        }
    }
}
