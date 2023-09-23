package com.lxi.yadhu.wktwo.validation;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import org.apache.commons.validator.GenericValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.lxi.yadhu.wktwo.employee.controller.EmployeeController;

@WebServlet("/companyValidator")
public class CompanyValidator extends HttpServlet {
    
private static final Logger logger = LogManager.getLogger(CompanyValidator.class);

     public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        logger.info("Entered in method");
        // Retrieve form parameters
        String create = request.getParameter("create");
        String update = request.getParameter("update");
        String company = request.getParameter("Company");
        boolean isCompany = company.matches("^[a-zA-Z]+$");
        String industry = request.getParameter("Industry");
        boolean isIndustry = industry.matches("^[a-zA-Z]+$");
        String count = request.getParameter("Count");
        boolean isCount = count.matches("^[0-9]+$");
        String date = request.getParameter("Date");
        boolean isDate = GenericValidator.isDate(date, "yyyy-MM-dd", true);
        String revenue = request.getParameter("Revenue");
        boolean isRevenue = revenue.matches("^[0-9]+$");
        String location = request.getParameter("Location");
        boolean isLocation = location.matches("^[a-zA-Z]+$");
        String ceoName = request.getParameter("First")+request.getParameter("Middle")+request.getParameter("Last");
        boolean isCeo = ceoName.matches("^[a-zA-Z\\\\s]+$");
        String phoneNumber = request.getParameter("Number");
        boolean isPhoneNumber = phoneNumber.matches("^\\d{10}$");
        String stock = request.getParameter("Stock");
        boolean isStock = stock.matches("^[a-zA-Z]+$");
        String customer = request.getParameter("Customer");
        boolean isCustomer = customer.matches("^[0-9]+$");
        // Validate the email address
        //boolean isEmailValid = GenericValidator.isEmail(email);
           //PrintWriter out = response.getWriter();
           //out.println(""+isCompany+isCeo+isCount+isCustomer+isDate+isIndustry+isLocation+isPhoneNumber+isRevenue+isStock);

        if (isCompany && isIndustry && isCount && isDate && isRevenue && isLocation && isCeo && isPhoneNumber && isStock && isCustomer) {
            // Email is valid, perform further actions
            // ...
            request.setAttribute("id",request.getParameter("id") );
           request.setAttribute("company", company);
           request.setAttribute("industry", industry);
           request.setAttribute("count", count);
           request.setAttribute("date", date);
           request.setAttribute("revenue", revenue);
           request.setAttribute("location", location);
           request.setAttribute("phoneNumber", phoneNumber);
           request.setAttribute("stock", stock);
           request.setAttribute("customer", customer);
           request.setAttribute("ceoName", ceoName);
           if(create != null){
            request.setAttribute("create", create);
            request.getRequestDispatcher("/companyServlet").forward(request, response);
           }if(update != null){
            request.setAttribute("update", update);
            request.getRequestDispatcher("/companyServlet").forward(request, response);
           }
        } else {
            // Email is not valid, handle the error
            // ...
            if(create != null){
                
                    request.setAttribute("invalid", "Invalid");
                    request.getRequestDispatcher("/create/company/createCompany.jsp").forward(request, response);
               
           }if(update != null){
                    request.setAttribute("invalid", "Invalid");
                    request.getRequestDispatcher("/update/company/updateCompany.jsp").forward(request, response);
               
           }
           logger.info("Something went wrong");
        } 
        logger.info("Exit the method");
     }
    }

