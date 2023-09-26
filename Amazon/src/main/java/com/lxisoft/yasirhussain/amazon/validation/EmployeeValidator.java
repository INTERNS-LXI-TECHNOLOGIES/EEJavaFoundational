package com.lxisoft.yasirhussain.amazon.validation;

import java.io.*;
import java.util.*;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/employeeValidator")
@MultipartConfig(
        fileSizeThreshold = 1024 * 1024,  // 1 MB
        maxFileSize = 10 * 1024 * 1024,   // 10 MB
        maxRequestSize = 20 * 1024 * 1024 // 20 MB
)
public class EmployeeValidator  extends HttpServlet {
    private static final long MAX_SIZE = 3 * 1024 * 1024;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            String name = request.getParameter("name");
            Part filePart = request.getPart("cvFile");

            // Check if a file was uploaded{
            if (filePart != null && filePart.getSize() > 0) {
                // Load the PDF document directly from the input stream
                if (filePart.getSize() > MAX_SIZE) {

                    request.setAttribute("invalid", "not permitted");
                    request.getRequestDispatcher("/create/employee/createEmployee.jsp").forward(request, response);
                    // Close the document when done

                } else {
                    request.setAttribute("part", filePart);
                    request.setAttribute("name", name);
                    request.getRequestDispatcher("/employeeServlet").forward(request, response);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            out.println("An error occurred: " + e.getMessage());
        }
    }
}
