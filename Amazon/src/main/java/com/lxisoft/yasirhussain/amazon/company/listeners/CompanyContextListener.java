package com.lxisoft.yasirhussain.amazon.company.listeners;

import java.io.*;
import java.sql.*;
import java.util.*;

import com.lxisoft.yasirhussain.amazon.company.model.CompanyModel;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
public class CompanyContextListener implements ServletContextListener {
    Properties properties = new Properties();
    InputStream inputStream = null;
    Connection connection = null;
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("contextInitialized");
        ServletContext context = servletContextEvent.getServletContext();
        Set<CompanyModel> companySet = new TreeSet<>();

        try {
            inputStream = this.getClass().getResourceAsStream("/application.properties");
            properties.load(inputStream);

            String dbUrl = properties.getProperty("db.url");
            String dbUsername = properties.getProperty("db.username");
            String dbPassword = properties.getProperty("db.password");
            String driverClassName = properties.getProperty("db.driverClassName");
            Class.forName(driverClassName);
            connection = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
            PreparedStatement preparedStatement = connection.prepareStatement("select * from company");
            ResultSet set = preparedStatement.executeQuery();
            while (set.next()) {
                CompanyModel company = new CompanyModel();
                company.setCompanyId(set.getInt("company_id"));
                company.setCompanyName(set.getString("company_name"));
                company.setIndustry(set.getString("industry"));
                company.setCeoName(set.getString("ceo_name"));
                companySet.add(company);
            }
            context.setAttribute("companyset", companySet);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        try {
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
