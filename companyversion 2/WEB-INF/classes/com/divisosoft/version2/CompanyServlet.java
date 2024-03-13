package com.divisosoft.version2;

import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/companyDetails")
public class CompanyServlet extends HttpServlet
{
    Connection connection;

    public void init(ServletConfig servletConfig)throws ServletException
    {
        String url="jdbc:mysql://localhost:3306/companyv2";
        String userName="root";
        String passWord = "Cutepixal@2023";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, userName, passWord);
        }
        catch(ClassNotFoundException | SQLException e)
        {
            e.printStackTrace();
        }
    }

    public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
    {
        String action = request.getParameter("action");
        switch (action) {
            case "Add":
                this.CreateCompany(request, response);
            break;

            case "Enter":
                try{
                    List<Company> company = this.takeData(request);
                    request.setAttribute("companydate", company);

                    RequestDispatcher dispatcher = request.getRequestDispatcher("addUpdateValue.jsp");
                    dispatcher.forward(request, response);
                }
                catch(SQLException e)
                {
                    e.printStackTrace();
                }
            break;

            case "Update":
                try{
                    this.updateCompany(request,response);
                }
                catch(SQLException | IOException e)
                {
                    e.printStackTrace();
                }
            break;

            case "Delete":
                try {
                    this.deleteCompany(request, response);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            break;
        
            default:
                response.getWriter().println("Sorry... Something went wrong");
            break;
        }
    }

    public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
    {
            List<Company> company = this.readCompany(request);

            response.getWriter().println(company);
            request.setAttribute("printCompany", company);

            RequestDispatcher dispatcher = request.getRequestDispatcher("result.jsp");
            dispatcher.forward(request, response);
    }

    public void CreateCompany(HttpServletRequest request,HttpServletResponse response)throws IOException
    {
        String comName = request.getParameter("comName");
        try{
            Statement statement = connection.createStatement();
            String checkQuery = "SELECT * FROM company";
            ResultSet resultSet = statement.executeQuery(checkQuery);

            while (resultSet.next()) {
                if(resultSet.getString("name").equals(comName))
                {
                    response.getWriter().println("Company already Exist");
                }
                else{
                    String insertQuery = "INSERT INTO company (name, address, location, phone, ceo) VALUES (?, ?, ?, ?, ?)";
                    PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
                    preparedStatement.setString(1, comName);
                    preparedStatement.setString(2, request.getParameter("address"));
                    preparedStatement.setString(3, request.getParameter("Location"));
                    long phone = Long.parseLong(request.getParameter("Phone"));
                    preparedStatement.setLong(4, phone);
                    preparedStatement.setString(5, request.getParameter("ceo"));

                    preparedStatement.executeUpdate();

                    response.getWriter().println("Company Inserted Successfully");
                }
            }
        }
        catch(SQLException | IOException e)
        {
            e.printStackTrace();
        }
    }

    public List<Company> takeData(HttpServletRequest request)throws SQLException
    {
        List<Company> companies = new ArrayList<>();
        String name = request.getParameter("check");
        String checkQuery = "SELECT * FROM company WHERE name='"+name+"'";
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(checkQuery);
        while (rs.next()) {
            Company company = new Company();

            company.setName(rs.getString(1));
            company.setAddress(rs.getString(2));
            company.setLocation(rs.getString(3));
            long phone = rs.getLong(4);
            company.setPhone(phone);
            company.setCeoName(rs.getString(5));

            companies.add(company);
        }
        
        return companies;
    }

    public List<Company> readCompany(HttpServletRequest request)
    {
        List<Company> companies = new ArrayList<>();
        try{
        String checkQuery = "SELECT * FROM company";
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(checkQuery);
        while (rs.next()) {
            Company company = new Company();
            
            company.setName(rs.getString(1));
            company.setAddress(rs.getString(2));
            company.setLocation(rs.getString(3));
            long phone = rs.getLong(4);
            company.setPhone(phone);
            company.setCeoName(rs.getString(5));
            companies.add(company);
        }
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
    
        return companies;
    }

    public void updateCompany(HttpServletRequest request,HttpServletResponse response)throws SQLException ,IOException
    {
        String updateQuery = "UPDATE company SET name=?, address=?, location=?, phone=?, ceo=? WHERE name=?";

        PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);
        preparedStatement.setString(1, request.getParameter("companyName"));
        preparedStatement.setString(2, request.getParameter("companyaddress"));
        preparedStatement.setString(3, request.getParameter("companyLocation"));
        Long phone = Long.parseLong(request.getParameter("companyPhone"));
        preparedStatement.setLong(4, phone);
        preparedStatement.setString(5, request.getParameter("companyCeo"));
        preparedStatement.setString(6, request.getParameter("update"));

        preparedStatement.executeUpdate();

        response.getWriter().println("Values updated Successfully");
    }

    public void deleteCompany(HttpServletRequest request , HttpServletResponse response)throws SQLException,IOException
    {
        String deleteQuery ="DELETE FROM company WHERE  name = ?";

        PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery);

        preparedStatement.setString(1, request.getParameter("delete"));

        preparedStatement.executeUpdate();

        response.getWriter().println("Deleted Successfully");
    }
}