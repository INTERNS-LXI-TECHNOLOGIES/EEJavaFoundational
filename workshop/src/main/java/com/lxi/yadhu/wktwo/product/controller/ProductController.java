package com.lxi.yadhu.wktwo.product.controller;
import java.io.*;
import java.sql.*;
import java.util.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.lxi.yadhu.wktwo.product.model.*;

@WebServlet("/ProductServlet") // Define the URL mapping for the servlet
public class ProductController extends HttpServlet {
     private static final Logger logger = LogManager.getLogger(ProductController.class);
     Product product ;

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        logger.info("doPost called");
        response.setContentType("text/html");
        List<String> products = (List<String>)request.getAttribute("validationErrors");
        
             product = new Product(products.get(0),products.get(1),products.get(2),products.get(3),products.get(4),products.get(5),products.get(6));
      
            try
            {
                Properties prop = new Properties();
                InputStream input = null;
                Connection connection = null;
                input = this.getClass().getClassLoader().getResourceAsStream("application.properties");
                prop.load(input);
                String dbUrl = prop.getProperty("db.url");
                String dbUsername = prop.getProperty("db.username");
                String dbPassword = prop.getProperty("db.password");
                String driverClassName = prop.getProperty("db.driverClassName");
                Class.forName(driverClassName);
                connection = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
                PreparedStatement statement = connection.prepareStatement("INSERT INTO products (product_name,product_category,product_price,product_brand,product_manufacturer,product_release_date,product_availability) VALUES (?,?,?,?,?,?,?)");
                statement.setString(1, product.getProductName());                
                statement.setString(2, product.getProductCategory());
                statement.setString(3, product.getProductPrice());
                statement.setString(4, product.getProductBrand());
                statement.setString(5, product.getProductManufacturer());
                statement.setString(6, product.getProductReleaseDate());
                statement.setString(7, product.getProductAvailability());
                statement.executeUpdate();
                request.setAttribute("success", product);
                request.getRequestDispatcher("/product/product.jsp").forward(request, response);
            }catch(Exception e){
                logger.info("An exception occurred: " + e.getMessage());
            }

        

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Set<Product> productSet = new TreeSet<>();
        // TODO Auto-generated method stub
         try
            {
                Properties prop = new Properties();
                InputStream input = null;
                Connection connection = null;
                input = this.getClass().getClassLoader().getResourceAsStream("application.properties");
                prop.load(input);
                String dbUrl = prop.getProperty("db.url");
                String dbUsername = prop.getProperty("db.username");
                String dbPassword = prop.getProperty("db.password");
                String driverClassName = prop.getProperty("db.driverClassName");
                Class.forName(driverClassName);
                connection = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
                PreparedStatement statement = connection.prepareStatement("select * from products");
                ResultSet set = statement.executeQuery();
                while(set.next()){
                    Product product = new Product(set.getString("product_name"), set.getString("product_category"), set.getString("product_price"), set.getString("product_brand"), set.getString("product_manufacturer"), set.getString("product_release_date"), set.getString("product_availability"), set.getString("product_id")) ;
                    productSet.add(product);
                }
                req.setAttribute("set", productSet);
                req.getRequestDispatcher("/read/product/readProduct.jsp").forward(req, resp);
            }  catch(Exception e){
                logger.info(e.getMessage());
            }
    }
    

}