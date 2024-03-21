package com.lxisoft.student;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.*;
import jakarta.servlet.RequestDispatcher;
import java.util.*;

@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
    String url = "jdbc:mysql://localhost:3306/contact";
    String userName = "root";
    String password = "Arshaf@12345";
    Student student = new Student();
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String select = req.getParameter("select");
        switch (select) {
            case "upload":
                upload(req, resp);
                resp.getWriter().println("id uploaded");
                out.println("<p><a href=\"StudentDetails.jsp\">Back to student Details</a></p>");
                break;
        }
    }
    public void upload(HttpServletRequest req, HttpServletResponse resp)throws ServletException,IOException
    {
        student.setName(req.getParameter("name"));
       //student.setImage(req.getParameter("image"));
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, userName, password);
            String insert = "INSERT INTO studentInfo (name,image) VALUES(?,?)";
            try {
                PreparedStatement statement = connection.prepareStatement(insert);
                statement.setString(1, student.getName());
                //statement.setString(2, student.getImage());
                statement.executeUpdate();
            } catch (SQLException e)
            {
                e.printStackTrace();
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
