package com.lxisoft.ibrahim.workshoptwo.company.companycontroller.createcompanycontroller;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.PrintWriter;
import com.lxisoft.ibrahim.workshoptwo.company.companymodel.*;
@WebServlet("/CreateCompanyController")
public class CreateCompanyController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Logger logger = LogManager.getLogger(CreateCompanyController.class); // Use the class name

        try {
            Connection con = null;

            Class.forName("com.mysql.cj.jdbc.Driver"); // Use the correct driver class
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/maven", "root", "root");

            if (con != null) {
                response.getWriter().write("- Connection created successfully"); // Use response.getWriter()
            } else {
                response.getWriter().write("- Connection not created successfully"); // Use response.getWriter()
            }


            String companyName = request.getParameter("company_name");
            String employeeCount = request.getParameter("employee_count");
            String location = request.getParameter("location");
            String ceoName = request.getParameter("ceo_name");
            String phoneNumber = request.getParameter("phone_number");

            String sql = "INSERT INTO company (company_name, employee_count, location, ceo_name, phone_number) VALUES (?, ?, ?, ?, ?)";


                PreparedStatement preparedStatement = con.prepareStatement(sql);

                preparedStatement.setString(1, companyName);
                preparedStatement.setString(2, employeeCount);
                preparedStatement.setString(3, location);
                preparedStatement.setString(4, ceoName);
                preparedStatement.setString(5, phoneNumber);


                int rowsAffected = preparedStatement.executeUpdate();

                if (rowsAffected > 0) {
                    System.out.println("INSERT successful. Rows affected: " + rowsAffected);
                } else {
                    System.out.println("INSERT failed.");
                }


                preparedStatement.close();



            request.setAttribute("preparedStatement", preparedStatement);



            con.close();
        } catch (Exception e) {
            logger.error(e.getMessage());
        }

        // Replace this with your actual business logic

        // Display a success message or redirect to a confirmation page


        request.getRequestDispatcher("/SecureFile/company.jsp").forward(request, response);
    }
}
