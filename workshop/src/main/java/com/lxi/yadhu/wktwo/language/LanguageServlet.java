package com.lxi.yadhu.wktwo.language;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.util.*;
import java.text.*;

@WebServlet("/setLanguage")
public class LanguageServlet extends HttpServlet{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get the selected language from the request parameter
        HttpSession session = request.getSession();
        response.setContentType("text/html;charset=UTF-8");
        //PrintWriter out = response.getWriter();
        String selectedLanguage = request.getParameter("language");

        // Validate the selected language (you can add your validation logic here)
        Locale locale = new Locale(selectedLanguage);

        // Load the properties file based on the selected language
        ResourceBundle resourceBundle = ResourceBundle.getBundle("messages", locale);
        DateFormat dateFormat = new SimpleDateFormat(resourceBundle.getString("date.format"),locale);
        String formattedDate = dateFormat.format(new Date());

        session.setAttribute("resource", resourceBundle);       
        session.setAttribute("date", formattedDate);

// ... and so on for other translations you need
       request.getRequestDispatcher("index.jsp").forward(request, response);
        // Store the selected language in the user's session
        
        // You can optionally send a response back to the client to indicate success
        

    }
}
