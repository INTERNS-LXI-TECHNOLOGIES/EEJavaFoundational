package com.lxisoft.yasirhussain.amazon.product.controller;

import java.io.*;
import java.util.*;
import java.sql.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.ServletException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.annotation.WebServlet;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.lxisoft.yasirhussain.amazon.product.model.*;

@WebServlet("/ProductServlet")
public class ProductController extends HttpServlet{
    private static final Logger logger = LogManager.getLogger(ProductController.class);
    ProductModel productModel ;

    public void doPost(HttpServletRequest request , HttpServletResponse response) throws IOException, ServletException{
        logger.info("doPost called");
        response.setContentType("text/html");
        List<String> products = (List<String>)request.getAttribute("validationErrors");

        productModel = new ProductModel(products.get(0), products.get(1), products.get(2),products.get(3));

        try{
            Properties properties = new Properties();
            InputStream inputStream = null;
            Connection connection = null;
            inputStream = this.getClass().getClassLoader().getResourceAsStream("application.properties");
            properties.load(inputStream);
            String dbUrl = properties.getProperty("db.url");
            String dbUsername = properties.getProperty("db.username");
            String dbPassword = properties.getProperty("db.password");
            String driverClassName = properties.getProperty("db.driverClassName");
            Class.forName(driverClassName);
            connection = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
            PreparedStatement statement = connection.prepareStatement("INSERT INTO product (product_name,product_category,product_price,product_id) VALUES (?,?,?,?)");
            statement.setString(1, productModel.getProductName());
            statement.setString(2, productModel.getProductCategory());
            statement.setString(3, productModel.getProductPrice());
            statement.executeUpdate();
            request.setAttribute("Success", productModel);
            request.getRequestDispatcher("/product/product.jsp").forward(request, response);
        }
        catch (Exception e){
            logger.error("An error occurred:" + e.getMessage());
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Set<ProductModel> productSet = new TreeSet<>();
        try {
            Properties properties = new Properties();
            InputStream inputStream = null;
            Connection connection = null;
            inputStream = this.getClass().getClassLoader().getResourceAsStream("application.properties");
            properties.load(inputStream);
            String dbUrl = properties.getProperty("db.url");
            String dbUsername = properties.getProperty("db.username");
            String dbPassword = properties.getProperty("db.password");
            String driverClassName = properties.getProperty("db.driverClassName");
            Class.forName(driverClassName);
            connection = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
            PreparedStatement statement = connection.prepareStatement("select * from product");
            ResultSet set = statement.executeQuery();
            while (set.next()) {
                ProductModel productModel = new ProductModel(set.getString("product_name"), set.getString("product_category"), set.getString("product_price"), set.getString("product_id"));
                productSet.add(productModel);
            }
            request.setAttribute("set", productSet);
            request.getRequestDispatcher("/read/product/readProduct.jsp").forward(request, response);
        }
        catch(Exception e) {
            logger.error("e.getMessage()");
        }
    }
}
