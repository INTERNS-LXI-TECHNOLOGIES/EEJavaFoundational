package com.lxisoft.ibrahim.workshoptwo.company.companycontroller.readcompanycontroller;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.List;
import java.util.ArrayList;
import java.io.PrintWriter;
import com.lxisoft.ibrahim.workshoptwo.company.companymodel.*;
@WebServlet("/ReadCompanyController")
public class ReadCompanyController extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Logger logger = LogManager.getLogger(ReadCompanyController.class); // Use the class name

        try {
            Connection con = null;

            Class.forName("com.mysql.cj.jdbc.Driver"); // Use the correct driver class
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/maven", "root", "root");

            if (con != null) {
                response.getWriter().write("- Connection created successfully"); // Use response.getWriter()
            } else {
                response.getWriter().write("- Connection not created successfully"); // Use response.getWriter()
            }

           // PreparedStatement preparedStatement = con.prepareStatement(sql);
            Statement statement = con.createStatement();

            ResultSet results = statement.executeQuery(" select * from company");

            List<CompanyModel> companyDetails = new ArrayList<CompanyModel>();


            while (results.next()) {
                // Replace this with the actual CompanyModel class
                CompanyModel cm = new CompanyModel();
                cm.setCompany_name(results.getString("company_name"));
                cm.setEmployee_count(results.getInt("employee_count"));
                cm.setLocation(results.getString("location"));
                cm.setCeo_name(results.getString("ceo_name"));
                cm.setPhone_number(results.getLong("phone_number"));
                companyDetails.add(cm);
                response.getWriter().write("Company_Name: " + cm.getCompany_name());
                response.getWriter().write("Location: " + cm.getLocation());
                response.getWriter().write("Employee_Count: " + cm.getEmployee_count());
                response.getWriter().write("Ceo_name: " + cm.getCeo_name());
                response.getWriter().write("PhoneNumber: " + cm.getPhone_number());
            }



            // Assuming companyDetail is your ArrayList containing CompanyModel objects
            request.setAttribute("companyDetails", companyDetails);




            con.close();
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        // Replace this with your actual business logic

        // Display a success message or redirect to a confirmation page


        request.getRequestDispatcher("read/company/readCompany.jsp").forward(request, response);
    }
}
