package com.divisosoft.company;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/productdetails")
public class ProductServlet extends HttpServlet
{
    String url = "jdbc:mysql://localhost:3306/company";
    String userName = "root";
    String password ="Cutepixal@2023";

    public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
    {
        String action = request.getParameter("action");
        switch (action) {
            case "Create":
                this.createProduct(request);
                response.getWriter().println("Created Successfully !");
            break;

            case "Update":
                this.updateProduct(request);
                response.getWriter().println("Updated Successfully !");
            break;

            case "Delete":
                this.deleteProduct(request);
                response.getWriter().println("Deleted Successfully !");
            break;
        
            default:
                response.getWriter().println("Sorry... Something went wrong");
            break;
        }
    }

    public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
    {
        List<Product> products = this.printProduct(request);
        request.setAttribute("printProduct", products);

        RequestDispatcher dispatcher = request.getRequestDispatcher("printProduct.jsp");
        dispatcher.forward(request, response);
    }

    public void createProduct(HttpServletRequest request)
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, userName, password);

            String InsertQuery = "INSERT INTO productinfo VALUES(?,?,?,?,?)";

            PreparedStatement preparedStatement = connection.prepareStatement(InsertQuery);

            preparedStatement.setString(1, request.getParameter("productName"));
            int price = Integer.parseInt(request.getParameter("productPrice"));
            preparedStatement.setInt(2, price);
            preparedStatement.setString(3, request.getParameter("productCatagory"));
            double rate =Double.parseDouble(request.getParameter("productRate"));
            preparedStatement.setDouble(4, rate);
            preparedStatement.setString(5, request.getParameter("date"));

            preparedStatement.executeUpdate();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public List<Product> printProduct(HttpServletRequest request)
    {
        List<Product> products = new ArrayList<>();

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, userName, password);
            Statement statement = connection.createStatement();

            String readQuery = "SELECT * FROM productinfo";
            ResultSet rs = statement.executeQuery(readQuery);

            while (rs.next()) {
                Product product = new Product();
                product.setName(rs.getString(1));
                product.setPrice(rs.getInt(2));
                product.setProductCategory(rs.getString(3));
                product.setRate(rs.getDouble(4));
                product.setDate(rs.getString(5));

                products.add(product);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return products;
    }

    public void updateProduct(HttpServletRequest request) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, userName, password);
    
            int price = Integer.parseInt(request.getParameter("productPrice"));
            double rate = Double.parseDouble(request.getParameter("productRate"));
    
            String updateQuery = "UPDATE productinfo SET productname=?, price=?, category=?, rate=?, manufacturingdate=? WHERE productname=?";
    
            PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);
    
            preparedStatement.setString(1, request.getParameter("productName"));
            preparedStatement.setInt(2, price);
            preparedStatement.setString(3, request.getParameter("productCatagory"));
            preparedStatement.setDouble(4, rate);
            preparedStatement.setString(5, request.getParameter("date"));
            preparedStatement.setString(6, request.getParameter("updateId"));
    
            preparedStatement.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    

    public void deleteProduct(HttpServletRequest request)
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, userName, password);
            
            String deleteQuery = "DELETE FROM productinfo WHERE productname=?";
            
            PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery);

            preparedStatement.setString(1, request.getParameter("updateId"));

            preparedStatement.executeUpdate();
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
}