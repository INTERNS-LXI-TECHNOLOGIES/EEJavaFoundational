package com.lxisoft.company;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.*;

@WebServlet("/ProductServlet")

public class ProductServlet extends HttpServlet{

    String url="jdbc:mysql://localhost:3306/company";
    String userName = "root";
    String password = "Arshaf@12345";

    Product product = new Product();

    public void doPost(HttpServletRequest req, HttpServletResponse resp)throws ServletException,IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String select = req.getParameter("select");
        switch (select) {
            case "create":
                create(req, resp);
                resp.getWriter().println("product created");
                out.println("<p><a href=\"ProductDetails.jsp\">Back to Product Details</a></p>");
                break;

            case "update":
                update(req, resp);
                resp.getWriter().println("product updated");
                out.println("<p><a href=\"ProductDetails.jsp\">Back to Product Details</a></p>");
                break;

            case "delete":
                delete(req, resp);
                resp.getWriter().println("product Deleted");
                out.println("<p><a href=\"ProductDetails.jsp\">Back to Product Details</a></p>");
                break;
        }
    }
    public void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException,IOException{
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println(product.getName()+"<br/>");
        out.println(product.getId()+"<br/>");
        out.println(product.getCost()+"<br/>");
        out.println(product.getMfgDate()+"<br/>");
        out.println(product.getExpDate()+"<br/>");

    }
    public void create(HttpServletRequest req, HttpServletResponse resp)throws ServletException,IOException
    {
        product.setName(req.getParameter("productName"));
        product.setId(req.getParameter("productId"));
        product.setCost(req.getParameter("productCost"));
        product.setExpDate(req.getParameter("productExpDate"));
        product.setMfgDate(req.getParameter("productMfgDate"));
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, userName, password);
            String insert = "INSERT INTO productinfo (name,id,cost,expDate,mfgDate) VALUES(?,?,?,?,?)";
            try {
                PreparedStatement statement = connection.prepareStatement(insert);
                statement.setString(1, product.getName());
                statement.setString(2, product.getId());
                statement.setString(3, product.getCost());
                statement.setString(4, product.getExpDate());
                statement.setString(5, product.getMfgDate());
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
        product.setName(req.getParameter("productName"));
        product.setId(req.getParameter("productId"));
        product.setCost(req.getParameter("productCost"));
        product.setExpDate(req.getParameter("productExpDate"));
        product.setMfgDate(req.getParameter("productMfgDate"));
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, userName, password);
            String companyInfo = "update  employeeinfo set name= ?,cost = ?,expDate = ?,mfgDate = ? where id = ?";
            try {
                PreparedStatement statement = connection.prepareStatement(companyInfo);
                statement.setString(1, product.getName());
                statement.setString(2, product.getCost());
                statement.setString(3, product.getExpDate());
                statement.setString(4, product.getMfgDate());
                statement.setString(5, product.getId());
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
            String delete = "DELETE FROM productinfo where id = ?";
            PreparedStatement statement = connection.prepareStatement(delete);
            int id = Integer.parseInt(req.getParameter("productId"));
            statement.setInt(1,id);
            statement.executeUpdate();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

}
