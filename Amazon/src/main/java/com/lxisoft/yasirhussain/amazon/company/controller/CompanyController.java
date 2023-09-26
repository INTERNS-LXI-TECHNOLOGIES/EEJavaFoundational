package com.lxisoft.yasirhussain.amazon.company.controller;

import java.io.*;
import java.util.*;
import java.sql.*;

import com.lxisoft.yasirhussain.amazon.company.model.CompanyModel;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.ServletException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.annotation.WebServlet;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
@WebServlet("/companyServlet")
public class CompanyController extends HttpServlet{
    private static Logger logger = LogManager.getLogger(CompanyController.class);
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
        logger.info("dePost Called");

		RequestDispatcher requestDispatcher = null;
		PrintWriter out = response.getWriter();
        String create = request.getParameter("Create");
        String update = request.getParameter("Update");

        String company = (String) request.getAttribute("company");
        String industry = (String) request.getAttribute("industry");
        String ceoName = (String) request.getAttribute("ceoName");

        try {
            Connection connection = null;
            InputStream inputStream = null;
            PreparedStatement statement = null;
            Properties properties = new Properties();

            inputStream = this.getClass().getClassLoader().getResourceAsStream("application.properties");
            properties.load(inputStream);

            String dbUrl = properties.getProperty("db.url");
            String dbUsername = properties.getProperty("db.username");
            String dbPassword = properties.getProperty("db.password");
            String driverClassName = properties.getProperty("db.driverClassName");

            Class.forName(driverClassName);
            connection = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
            if (create == null) {
                String query = "insert into company(company_name, industry, ceo_name) values (?,?,?)";
                statement = connection.prepareStatement(query);
                statement.setString(1, company);
                statement.setString(2, industry);
                statement.setString(3, ceoName);
            } else {
                int id = Integer.parseInt((String) request.getAttribute("id"));
                String updateSql = "UPDATE company SET company_name = ?, industry = ?, ceo_name = ? WHERE company_id = ?";

                statement = connection.prepareStatement(updateSql);
                statement.setString(1, company);
                statement.setString(2, industry);
                statement.setString(3, ceoName);
                statement.setInt(4, id);
                statement.executeUpdate();
                request.setAttribute("Success", company + "Successfully Updated");
                request.getRequestDispatcher("/company/company.jsp").forward(request, response);
            }
        }catch(Exception e){
                logger.error("An error occurred while updating!" + e.getMessage());

            }
        }
        protected void doGet(HttpServletRequest request, HttpServletResponse response)  throws IOException, ServletException
            {
                logger.info("doGET Called");
                HttpSession session = request.getSession();

                Set<CompanyModel> companySet = new TreeSet<CompanyModel>();
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

                    if (request.getParameter("companyId != null") != null) {
                        int id = Integer.parseInt(request.getParameter("companyId"));
                        PreparedStatement statement = connection.prepareStatement("UPDATE company SET is_deleted = TRUE WHERE company_id = ?");
                        statement.setInt(1, id);
                        statement.executeUpdate();
                        request.getRequestDispatcher("/read/company/readCompany.jsp").forward(request, response);
                    } else {
                        PreparedStatement statement = connection.prepareStatement("select * from company WHERE is_deleted = FALSE");
                        ResultSet set = statement.executeQuery();
                        while (set.next()) {
                            CompanyModel company = new CompanyModel();
                            company.setCompanyId(set.getInt("company_id"));
                            company.setCompanyName(set.getString("company_name"));
                            company.setIndustry(set.getString("industry"));
                            company.setCeoName(set.getString("ceo_name"));
                            companySet.add(company);
                        }
                        session.setAttribute("companyset", companySet);
                        request.setAttribute("companyset", companySet);
                        request.getRequestDispatcher("/read/company/readCompany.jsp").forward(request, response);
                    }

                }
                catch(Exception e)
                {
                    logger.info(e.getMessage());
                }
            }
    }