package com.lxisoft.company;
 import java.io.IOException;
 import java.io.PrintWriter;
 import jakarta.servlet.ServletException;
 import jakarta.servlet.annotation.WebServlet;
 import jakarta.servlet.http.HttpServlet;
 import jakarta.servlet.http.HttpServletRequest;
 import jakarta.servlet.http.HttpServletResponse;
 import java.sql.*;

@WebServlet("/CompanyServlet")

public class CompanyServlet extends HttpServlet{

String url="jdbc:mysql://localhost:3306/company";
String userName = "root";
String password = "Arshaf@12345";

    Company company = new Company();

    public void doPost(HttpServletRequest req, HttpServletResponse resp)throws ServletException,IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String select = req.getParameter("select");
        switch (select) {
            case "create":
                create(req, resp);
                resp.getWriter().println("company created");
                out.println("<p><a href=\"CompanyDetails.jsp\">Back to Company Details</a></p>");
                break;

            case "update":
                update(req, resp);
                resp.getWriter().println("updated");
                out.println("<p><a href=\"CompanyDetails.jsp\">Back to Company Details</a></p>");
                break;

            case "delete":
                delete(req, resp);
                resp.getWriter().println("Deleted");
                out.println("<p><a href=\"CompanyDetails.jsp\">Back to Company Details</a></p>");
                break;
        }
    }
    public void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException,IOException{
    resp.setContentType("text/html");
    PrintWriter out = resp.getWriter();
    out.println(company.getName()+"<br/>");
    out.println(company.getCeo()+"<br/>");
    out.println(company.getAddress()+"<br/>");
    out.println(company.getNumber()+"<br/>");
    out.println(company.getNoOfEmployees()+"<br/>");
}
public void create(HttpServletRequest req, HttpServletResponse resp)throws ServletException,IOException
{
    company.setName(req.getParameter("companyName"));
    company.setCeo(req.getParameter("companyCeo"));
    company.setAddress(req.getParameter("companyAddress"));
    company.setNumber(req.getParameter("companyNumber"));
    company.setNoOfEmployes(req.getParameter("companyEmployees"));
    try
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, userName, password);
        String insert = "INSERT INTO companyinfo (name,ceo,address,number,noOfEmployees) VALUES(?,?,?,?,?)";
        try {
            PreparedStatement statement = connection.prepareStatement(insert);
            statement.setString(1, company.getName());
            statement.setString(2, company.getCeo());
            statement.setString(3, company.getAddress());
            statement.setString(4, company.getNumber());
            statement.setString(5, company.getNoOfEmployees());
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
    resp.sendRedirect("CompanyServlet");
}
public void update(HttpServletRequest req, HttpServletResponse resp)throws ServletException,IOException
{
    company.setName(req.getParameter("companyName"));
    company.setCeo(req.getParameter("companyCeo"));
    company.setAddress(req.getParameter("companyAddress"));
    company.setNumber(req.getParameter("companyNumber"));
    company.setNoOfEmployes(req.getParameter("companyEmployees"));
try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection connection = DriverManager.getConnection(url, userName, password);
    String companyInfo = "update  companyinfo set name= ?,ceo = ?,address = ?,noOfEmployees = ? where number = ?";
    try {
        PreparedStatement statement = connection.prepareStatement(companyInfo);
        statement.setString(1, company.getName());
        statement.setString(2, company.getCeo());
        statement.setString(3, company.getAddress());
        statement.setString(4, company.getNoOfEmployees());
        statement.setString(5, company.getNumber());
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
            String delete = "DELETE FROM companyinfo where number = ?";
            PreparedStatement statement = connection.prepareStatement(delete);
            int number = Integer.parseInt(req.getParameter("companyNumber"));
            statement.setInt(1,number);
            statement.executeUpdate();
            }
        catch (Exception e)
        {
                e.printStackTrace();
        }
    }
}
