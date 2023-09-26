package com.lxisoft.yasirhussain.amazon.validation;

import java.io.*;
import java.util.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;
import jakarta.servlet.annotation.WebServlet;
import org.apache.commons.validator.GenericValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.lxisoft.yasirhussain.amazon.employee.controller.*;

public class ProductValidator extends HttpServlet{
    private static final Logger logger = LogManager.getLogger(ProductValidator.class);
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        logger.info("doPost called");

        List<String> validationErrors = validateProductData(request,response);
        if (validationErrors.contains("Product Name is invalid.")) {
            logger.info("Checking list");
            // Validation failed, set error messages in request attribute
            request.setAttribute("validationErrors", validationErrors);
            // Forward back to the registration form
            request.getRequestDispatcher("/create/product/createProduct.jsp").forward(request, response);
        } else {
            // Validation succeeded, proceed with product registration
            logger.info("List else block executed");
            request.setAttribute("validationErrors", validationErrors);
            // Forward back to the registration form
            request.getRequestDispatcher("/ProductServlet").forward(request, response);
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
        if (isProductName && isCategory && isPrice) {
            errors.add(productName);
            errors.add(productCategory);
            errors.add(productPrice);
            logger.info("if block executed");
        }
        else{
            logger.info("else block executed");
            errors.add("Product Name is invalid.");
            errors.add("Product Category is invalid.");
            errors.add("Product Price is invalid.");
        }
        logger.info("List returned");
        return errors;
    }
}