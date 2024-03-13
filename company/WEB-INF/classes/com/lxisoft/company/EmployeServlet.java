package com.lxisoft.company;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.*;

@WebServlet("/EmployeServlet")

public class EmployeServlet extends HttpServlet{

    String url="jdbc:mysql://localhost:3306/company";
    String userName = "root";
    String password = "Arshaf@12345";

    Employe employe = new Employe();

    public void doPost(HttpServletRequest req, HttpServletResponse resp)throws ServletException,IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String select = req.getParameter("selectt");
        switch (select) {
            case "create":
                create(req, resp);
                resp.getWriter().println("employee created");
                out.println("<p><a href=\"EmployeDetails.jsp\">Back to Employe Details</a></p>");
                break;

            case "update":
                update(req, resp);
                resp.getWriter().println("updated");
                out.println("<p><a href=\"EmployeDetails.jsp\">Back to Employe Details</a></p>");
                break;

            case "delete":
                delete(req, resp);
                resp.getWriter().println("Deleted");
                out.println("<p><a href=\"EmployeDetails.jsp\">Back to Employe Details</a></p>");
                break;
        }
    }
    public void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException,IOException{
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println(employe.getName()+"<br/>");
        out.println(employe.getId()+"<br/>");
        out.println(employe.getNumber()+"<br/>");
        out.println(employe.getDob()+"<br/>");
        out.println(employe.getAddress()+"<br/>");
    }
    public void create(HttpServletRequest req, HttpServletResponse resp)throws ServletException,IOException
    {
        employe.setName(req.getParameter("employeeName"));
        employe.setId(req.getParameter("employeeId"));
        employe.setNumber(req.getParameter("employeeNumber"));
        employe.setDob(req.getParameter("employeeDob"));
        employe.setAddress(req.getParameter("employeeAddress"));
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, userName, password);
            String insert = "INSERT INTO employeeinfo (name,id,number,dob,address) VALUES(?,?,?,?,?)";
            try {
                PreparedStatement statement = connection.prepareStatement(insert);
                statement.setString(1, employe.getName());
                statement.setString(2, employe.getId());
                statement.setString(3, employe.getNumber());
                statement.setString(4, employe.getDob());
                statement.setString(5, employe.getAddress());
                statement.executeUpdate();
            } catch (Exception exp)
            {
                exp.printStackTrace();
            }
        }
        catch (SQLException | ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        //resp.sendRedirect("EmployeServlet");
    }
    public void update(HttpServletRequest req, HttpServletResponse resp)throws ServletException,IOException
    {
        employe.setName(req.getParameter("employeeName"));
        employe.setId(req.getParameter("employeeId"));
        employe.setNumber(req.getParameter("employeeNumber"));
        employe.setDob(req.getParameter("employeeDob"));
        employe.setAddress(req.getParameter("employeeAddress"));
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, userName, password);
            String companyInfo = "update  employeeinfo set name= ?,id = ?,dob = ?,address = ? where number = ?";
            try {
                PreparedStatement statement = connection.prepareStatement(companyInfo);
                statement.setString(1, employe.getName());
                statement.setString(2, employe.getId());
                statement.setString(3, employe.getDob());
                statement.setString(4, employe.getAddress());
                statement.setString(5, employe.getNumber());
                statement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public void delete(HttpServletRequest req, HttpServletResponse resp)throws ServletException,IOException
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, userName, password);
            String delete = "DELETE FROM employeeinfo where number = ?";
            PreparedStatement statement = connection.prepareStatement(delete);
            int number = Integer.parseInt(req.getParameter("employeeNumber"));
            statement.setInt(1,number);
            statement.executeUpdate();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
