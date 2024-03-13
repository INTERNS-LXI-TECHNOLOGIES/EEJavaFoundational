package com.divisosoft.company;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;

import javax.naming.spi.DirStateFactory.Result;
import javax.sql.rowset.serial.SerialException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/companydetails")
public class CompanyServlet extends HttpServlet {

    PrintWriter out;

    String url = "jdbc:mysql://localhost:3306/company";
    String userName = "root";
    String passWord = "Cutepixal@2023";
    

    public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException
    {
        String action = request.getParameter("action");
        switch (action) {
            case "Create":
                Company company = this.companyDetails(request);
                response.getWriter().println("Created Successfully");
            break;
        
            case "Update":
                this.updateCompany(request);
                response.getWriter().println("Updated Successfully");
            break;

            case "Delete":
                this.deleteCompany(request);
                response.getWriter().println("Deleted Successfully");
            break;

            default:
                response.getWriter().println("Sorry... Something went wrong");
                break;
        }
    }

    public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
    {
        List<Company> com = this.printCompany(request);
        request.setAttribute("PrintCompany", com);

        RequestDispatcher dispatcher = request.getRequestDispatcher("printCompany.jsp");
        dispatcher.forward(request, response);
    }

    public Company companyDetails(HttpServletRequest request) {
        Company com = new Company();
    
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connect = DriverManager.getConnection(url, userName, passWord);
            Statement statement = connect.createStatement();
    
            try {
                com.setName(request.getParameter("comName"));
                com.setAddress(request.getParameter("address"));
                com.setLocation(request.getParameter("Location"));
                int phone = Integer.parseInt(request.getParameter("Phone"));
                com.setPhone(phone);
                com.setCeoName(request.getParameter("ceo"));
            } catch (Exception e) {
                e.printStackTrace();
            }
    
            String insertQuery = "INSERT INTO companyinfo VALUES('" + com.getName() + "','" + com.getAddress() + "','" +
                    com.getLocation() + "'," + com.getPhone() + ",'" + com.getCeoName() + "')";
    
            statement.executeUpdate(insertQuery);
    
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        return com;
    }

    public List<Company> printCompany(HttpServletRequest request)
    {
        List<Company> companies = new ArrayList<>();

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, userName, passWord);
            Statement statement = connection.createStatement();
            String viewQuery = "SELECT * FROM companyinfo";
            ResultSet rs = statement.executeQuery(viewQuery);

            while (rs.next()) {
                Company com = new Company();
                com.setName(rs.getString(1));
                com.setAddress(rs.getString(2));
                com.setLocation(rs.getString(3));
                com.setPhone(rs.getInt(4));
                com.setCeoName(rs.getString(5));
    
                companies.add(com);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return companies;
    }
    
    public void updateCompany(HttpServletRequest request) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection cnct = DriverManager.getConnection(url, userName, passWord);
    
            String updateQuery = "UPDATE companyinfo SET " +"comName='" + request.getParameter("comName") + "', " +
                                "address='" + request.getParameter("address") + "', " +"location='" + request.getParameter("Location") + "', " +
                                "phone='" + request.getParameter("Phone") + "', " +"ceo='" + request.getParameter("ceo") + "' " +
                                "WHERE comName='" + request.getParameter("updateName") + "'";
    
            try (Statement statement = cnct.createStatement()) {
                statement.executeUpdate(updateQuery);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteCompany(HttpServletRequest request) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection cnct = DriverManager.getConnection(url, userName, passWord);
    
            String deleteQuery ="DELETE FROM companyinfo WHERE comName='"+request.getParameter("updateName")+"'";
    
            try (Statement statement = cnct.createStatement()) {
                statement.executeUpdate(deleteQuery);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}       
