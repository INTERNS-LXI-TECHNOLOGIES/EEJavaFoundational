package com.lxi.yadhu.wktwo.validation;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;
import jakarta.servlet.annotation.WebServlet;
import java.io.*;
import java.util.*;

import org.apache.commons.validator.GenericValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.lxi.yadhu.wktwo.employee.controller.EmployeeController;

@WebServlet("/productValidator")
public class ProductValidator extends HttpServlet{
     private static final Logger logger = LogManager.getLogger(ProductValidator.class);

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("doPost called");
        // TODO Auto-generated method stub
        List<String> validationErrors = validateProductData(req,resp);
        if (validationErrors.contains("Product Name is invalid.")) {
            logger.info("Checking list");
            // Validation failed, set error messages in request attribute
            req.setAttribute("validationErrors", validationErrors);
            // Forward back to the registration form
            req.getRequestDispatcher("/create/product/createProduct.jsp").forward(req, resp);
        } else {
            // Validation succeeded, proceed with product registration
            // ...
            logger.info("List else block executed");
             req.setAttribute("validationErrors", validationErrors);
            // Forward back to the registration form
            req.getRequestDispatcher("/ProductServlet").forward(req, resp);
        }
    }

    private List<String> validateProductData(HttpServletRequest request,HttpServletResponse resp)throws IOException {
        // Implement your validation logic and return a list of error messages
        logger.info("Get into validateProductData");
        resp.setContentType("text/html");
        List<String> errors = new ArrayList<>();

        String productName = request.getParameter("productName");
        boolean isProductName = productName.matches("^[a-zA-Z]+$");
        String productCategory = request.getParameter("productCategory");
        boolean isCategory = productCategory.matches("^[a-zA-Z]+$");
        String productPrice = request.getParameter("productPrice");
        boolean isPrice = productPrice.matches("^[0-9]+$");
        String productBrand = request.getParameter("productBrand");
        boolean isBrand = productBrand.matches("^[a-zA-Z]+$");
        String productManufacturer = request.getParameter("productManufacturer");
        boolean isManufacture = productManufacturer.matches("^[a-zA-Z]+$");
        String productReleaseDate = request.getParameter("productReleaseDate");
        boolean isDate = GenericValidator.isDate(productReleaseDate, "yyyy-MM-dd", true);
        String productAvailability = request.getParameter("productAvailability");
        boolean isAvailable = productAvailability.matches("^[0-9]+$");
        if (isProductName && isCategory && isPrice && isBrand && isManufacture && isDate && isAvailable) {
             errors.add(productName);             
             errors.add(productCategory);
             errors.add(productPrice);
             errors.add(productBrand);
             errors.add(productManufacturer);
             errors.add(productReleaseDate);
             errors.add(productAvailability);
            logger.info("if block executed");
        }
        else{
            logger.info("else block executed");
            errors.add("Product Name is invalid.");            
            errors.add("Product Category is invalid.");
            errors.add("Product Price is invalid.");
            errors.add("Product Brand is invalid.");
            errors.add("Product Manufacturer is invalid.");
            errors.add("Product Date is invalid.");
            errors.add("Product Available is invalid.");

        }
        // Add more validation checks for other fields
        logger.info("List returned");
        return errors;
    }
    

    
    
}
