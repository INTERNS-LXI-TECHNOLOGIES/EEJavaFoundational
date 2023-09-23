package com.lxi.yadhu.wktwo.company.listeners;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import java.io.*;
import java.sql.*;
import java.util.*;

import com.lxi.yadhu.wktwo.company.model.Company;
public class CompanyContextListener implements ServletContextListener {
    Properties prop = new Properties();
    InputStream input = null;
    Connection connection = null;
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent){
        // This method is called when the web application starts.
        // Perform initialization tasks here.
        System.out.println("context initialized");
        ServletContext context = servletContextEvent.getServletContext();
        Set<Company> companySet = new TreeSet<>();
        try{
                    
                    input = this.getClass().getClassLoader().getResourceAsStream("application.properties");
                    prop.load(input);
                    String dbUrl = prop.getProperty("db.url");
                    String dbUsername = prop.getProperty("db.username");
                    String dbPassword = prop.getProperty("db.password");
                    String driverClassName = prop.getProperty("db.driverClassName");
                    Class.forName(driverClassName);
                    connection = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
                     PreparedStatement preparedStatement = connection.prepareStatement("select * from company"); 
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
           context.setAttribute("companyset", companySet);
    }catch(Exception e){
        System.out.println(e.getMessage());
    }
    }
    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        // This method is called when the web application is about to shut down.
        // Perform cleanup tasks here.
        try {
            connection.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

