package com.lxisoft.nimmy.workshoptwo.company.companycontroller;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import com.lxisoft.nimmy.workshoptwo.company.companymodel.CompanyModel;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@WebServlet("/company")
public class CompanyController extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Properties properties = new Properties();
        List<CompanyModel> names = new ArrayList<>();

        try (InputStream inputStream = getServletContext().getResourceAsStream("/WEB-INF/Configuration.properties")) {
            properties.load(inputStream);
            String dbUrl = properties.getProperty("db.url");
            String dbUsername = properties.getProperty("db.username");
            String dbPassword = properties.getProperty("db.password");

            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection connection = DriverManager.getConnection(dbUrl, dbUsername, dbPassword)) {
                PreparedStatement statement = connection.prepareStatement("SELECT * FROM company");
                ResultSet resultSet = statement.executeQuery();

                while (resultSet.next()) {
                    CompanyModel cm = new CompanyModel();
                    cm.setCompanyName(resultSet.getString("company_name"));
                    names.add(cm);
                }
            }
        } catch (Exception e) {
            // Handle the exception appropriately, e.g., log it
            e.printStackTrace();
            // You may want to set an error attribute and handle it in your JSP
            request.setAttribute("error", e.getMessage());
        }
        request.setAttribute("names", names);
        request.getRequestDispatcher("/secure/companyview.jsp").forward(request, response);
    }

    // You can implement doPost() for handling POST requests if needed
}

