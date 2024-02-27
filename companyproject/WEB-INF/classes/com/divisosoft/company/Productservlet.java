package com.divisosoft.company;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpResponse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

@WebServlet("/Productservlet")
public class Productservlet extends HttpServlet{

    String url = "jdbc:mysql://localhost:3306/companydata";
    String username="root";
    String password = "Magesh@96";

    public void doPost(HttpServletRequest request,HttpServletResponse response){
        if(request.getParameter("option").equals("addproduct")){
            this.createProduct(request,response);
        }

        if(request.getParameter("option").equals("readproduct")){
            
            this.showProducts(request,response); 
        }

        if(request.getParameter("option").equals("updateproduct")){
            this.updateProduct(request,response);
        }

        if(request.getParameter("option").equals("deleteproduct")){
            this.deleteProduct(request,response);
        }

    }

    public void createProduct(HttpServletRequest request,HttpServletResponse response){

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url,username,password);
            Product product = new Product();
            product.setName(request.getParameter("productname"));
            product.setPrice(Integer.parseInt(request.getParameter("productprice")));

            String addProductQuery = "INSERT INTO producttable (name,price) VALUES(?,?)";
            PreparedStatement psCreateProduct = connection.prepareStatement(addProductQuery);
            psCreateProduct.setString(1,product.getName());
            psCreateProduct.setInt(2, product.getPrice());
            psCreateProduct.executeUpdate();
            }
            catch(Exception e){
                e.printStackTrace();
            } 
    }

    public void showProducts(HttpServletRequest request,HttpServletResponse response) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url,username,password);
            try{
            String productReadQuery = "SELECT * FROM producttable WHERE name=?";
            PreparedStatement psReadstatement = connection.prepareStatement(productReadQuery);
                psReadstatement.setString(1,request.getParameter("productname"));
            
                ResultSet result = psReadstatement.executeQuery();
                while(result.next()){
                    PrintWriter out = response.getWriter();
                    out.println(result.getInt("price"));
                }
                 // response.getWriter().println(result.getInt(1));
               // response.getWriter().println(result.getString(2));
              
                } catch (Exception e) {
                e.printStackTrace();
            }  
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }       

    }

    public void updateProduct(HttpServletRequest request,HttpServletResponse response){
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url,username,password);
        String productUpdateQuery = "UPDATE producttable SET price=? WHERE name=?";
        PreparedStatement psUpdateProduct = connection.prepareStatement(productUpdateQuery);
        psUpdateProduct.setInt(1,Integer.parseInt(request.getParameter("productprice")));
        psUpdateProduct.setString(2, request.getParameter("productname"));
        psUpdateProduct.executeUpdate();


        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void deleteProduct(HttpServletRequest request,HttpServletResponse response){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url,username,password);
            String productDeleteQuery = "DELETE FROM producttable WHERE name=?";
            PreparedStatement psDeleteProduct = connection.prepareStatement(productDeleteQuery) ;
            psDeleteProduct.setString(1, request.getParameter("productname"));
            psDeleteProduct.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}