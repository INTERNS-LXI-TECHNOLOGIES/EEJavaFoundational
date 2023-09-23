package com.lxi.yadhu.wktwo.company.controller;
import java.io.*;
import java.sql.*;
import java.util.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.lxi.yadhu.wktwo.company.model.*;

@WebServlet("/companyServlet") // Define the URL mapping for the servlet
public class CompanyController extends HttpServlet {
    private static Logger logger = LogManager.getLogger(CompanyController.class);  

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                logger.info("doPost called");
                PrintWriter out = response.getWriter();
                String create = request.getParameter("create");
                String update = request.getParameter("update");
            //List<Company> companyList = new ArrayList<>();
            String company =(String)request.getAttribute("company");
            String industry = (String)request.getAttribute("industry");
            String count = (String)request.getAttribute("count");
            String date = (String)request.getAttribute("date");
            String revenue = (String)request.getAttribute("revenue");
            String location = (String)request.getAttribute("location");
            String phoneNumber = (String)request.getAttribute("phoneNumber");
            String stock = (String)request.getAttribute("stock");
            String customer = (String)request.getAttribute("customer");
            String ceoName = (String)request.getAttribute("ceoName");
            
                try{
                    Properties prop = new Properties();
                    PreparedStatement preparedStatement=null;
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
                    if(create != null){
                    String query = "insert into company(company_name, industry, employee_count, founded_date, revenue, location, ceo_name, phone_number, stock_symbol, customer_count) values(?,?,?,?,?,?,?,?,?,?)";
                    preparedStatement = connection.prepareStatement(query); 

                    preparedStatement.setString(1, company);
                    preparedStatement.setString(2, industry);
                    preparedStatement.setString(3, count);
                    preparedStatement.setString(4, date);
                    preparedStatement.setString(5, revenue);
                    preparedStatement.setString(6, location);
                    preparedStatement.setString(7, ceoName);
                    preparedStatement.setString(8, phoneNumber);
                    preparedStatement.setString(9, stock);
                    preparedStatement.setString(10, customer);
                    preparedStatement.executeUpdate();
                    request.setAttribute("Success", company+" Successfully Registered");
                    request.getRequestDispatcher("/company/company.jsp").forward(request, response);
                    }else{
                         int id = Integer.parseInt((String)request.getAttribute("id"));
                        //String query = "insert into company(company_name, industry, employee_count, founded_date, revenue, location, ceo_name, phone_number, stock_symbol, customer_count) values(?,?,?,?,?,?,?,?,?,?)";
                        String updateSql = "UPDATE company SET company_name = ?, industry = ?," +
                        " employee_count = ?, founded_date = ?, revenue = ?," +
                        " location = ?, ceo_name = ?, phone_number = ?, " + // Add space here
                        "stock_symbol = ?, customer_count = ? WHERE company_id = ?";

                        preparedStatement = connection.prepareStatement(updateSql); 
                    
                    preparedStatement.setString(1, company);
                    preparedStatement.setString(2, industry);
                    preparedStatement.setString(3, count);
                    preparedStatement.setString(4, date);
                    preparedStatement.setString(5, revenue);
                    preparedStatement.setString(6, location);
                    preparedStatement.setString(7, ceoName);
                    preparedStatement.setString(8, phoneNumber);
                    preparedStatement.setString(9, stock);
                    preparedStatement.setString(10, customer);
                    preparedStatement.setInt(11, id);
                    preparedStatement.executeUpdate();
                    request.setAttribute("Success", company+" Successfully Updated");
                    request.getRequestDispatcher("/company/company.jsp").forward(request, response);
                    }
                }catch(Exception e){
                    logger.info("An exception occurred: " + e.getMessage());
                }

            }
        
         protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                logger.info("doGet called");
                HttpSession session = request.getSession();

            Set<Company> companySet = new TreeSet<>();
                try{
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
                    if(request.getParameter("companyId") != null){
                        int id = Integer.parseInt(request.getParameter("companyId"));
                        PreparedStatement preparedStatement = connection.prepareStatement("UPDATE company SET is_deleted = TRUE WHERE company_id = ?"); 
                        preparedStatement.setInt(1, id);
                        preparedStatement.executeUpdate();
                        request.getRequestDispatcher("/read/company/readCompany.jsp").forward(request, response);
                    }else{
                     PreparedStatement preparedStatement = connection.prepareStatement("select * from company WHERE is_deleted = FALSE"); 
                    ResultSet set = preparedStatement.executeQuery();
                    while(set.next()){
                        Company company = new Company();
                        company.setCompanyId(set.getInt("company_id"));
                        company.setCompanyName(set.getString("company_name"));
                        company.setIndustry(set.getString("industry"));
                        company.setEmployeeCount(set.getString("employee_count"));
                        company.setRevenue(set.getString("revenue"));
                        company.setLocation(set.getString("location"));
                        company.setPhoneNumber(set.getString("phone_number"));
                        company.setStockSymbol(set.getString("stock_symbol"));
                        company.setFoundedDate(set.getString("founded_date"));
                        company.setCustomerCount(set.getString("customer_count"));
                        company.setCeoName(set.getString("ceo_name"));
                        companySet.add(company);
                    }
                    session.setAttribute("companyset",companySet);
                    request.setAttribute("companyset", companySet);
                    request.getRequestDispatcher("/read/company/readCompany.jsp").forward(request, response);
                }
                }catch(Exception e)
                {
                    logger.info(e.getMessage());
                }
               
            }
        
        }